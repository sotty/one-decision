/*******************************************************************************
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package io.onedecision.engine.decisions.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import io.onedecision.engine.decisions.api.DecisionEngine;
import io.onedecision.engine.decisions.examples.ExamplesConstants;
import io.onedecision.engine.decisions.model.dmn.Decision;
import io.onedecision.engine.decisions.model.dmn.DecisionRule;
import io.onedecision.engine.decisions.model.dmn.DecisionTable;
import io.onedecision.engine.decisions.model.dmn.Definitions;
import io.onedecision.engine.decisions.model.dmn.DmnElementReference;
import io.onedecision.engine.decisions.model.dmn.DtInput;
import io.onedecision.engine.decisions.model.dmn.DtOutput;
import io.onedecision.engine.decisions.model.dmn.Expression;
import io.onedecision.engine.decisions.model.dmn.LiteralExpression;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

public class DecisionModelFactoryTest implements ExamplesConstants {

    private static DecisionEngine de;

    private static Validator validator;

    @BeforeClass
    public static void setUp() throws Exception {
        de = new InMemoryDecisionEngineImpl();

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testReadAndValidateApplicantRiskRating() throws IOException {
        DecisionModelFactory fact = (DecisionModelFactory) de
                .getRepositoryService();
        Definitions dm = fact.loadFromClassPath(ARR_DMN_RESOURCE);

        assertNotNull("Definitions element was null", dm);
        // applicantDef, policyDef
        assertEquals(2, dm.getItemDefinitions().size());
        assertEquals(1, dm.getDecisions().size());
        // applicant
        assertEquals(1, dm.getInformationItems().size());
        assertEquals("applicant", dm.getInformationItems().get(0).getId());

        for (Decision d : dm.getDecisions()) {
            assertEquals(ExamplesConstants.ARR_DECISION_ID, d.getId());

            DecisionTable dt = d.getDecisionTable();
            assertEquals("dt0", dt.getId());
            if (dt != null) {
                List<DtInput> inputs = dt.getInputs();
                // applicant's age and health
                assertEquals(2, inputs.size());
                for (int i = 0; i < 2; i++) {
                    DtInput input = inputs.get(i);
                    switch (i) {
                    case 0:
                        assertInputClause(input, "dt0_c0_ie", "applicant.age",
                                3, new String[] { "> 60" });
                        break;
                    case 1:
                        assertInputClause(input, "dt0_c1_ie",
                                "applicant.health", 2, new String[] {
                                        "\"Good\"", "\"Bad\"" });
                        break;
                    }
                }
                
                List<DtOutput> outputs = dt.getOutputs();
                // policy risk rating
                assertEquals(1, outputs.size());
                for (int i = 0; i < 1; i++) {
                    DtOutput output = outputs.get(i);
                    switch (i) {
                    case 0:
                        DmnElementReference outDef = output
                                .getOutputDefinition();
                        assertNotNull(outDef);
                        assertEquals("#policy.riskRating", outDef.getHref());
                        assertEquals(3, output.getOutputValues().size());

                        break;
                    }
                    for (LiteralExpression outputEntry : output
                            .getOutputValues()) {
                        System.out.println("in: " + outputEntry.getId());
                    }
                    List<DecisionRule> rules = dt.getRules();
                    for (DecisionRule rule : rules) {
                        System.out.println("rule: " + rule);
                        System.out.println("rule condition: "
                                + rule.getInputEntry());
                        System.out.println("rule conclusion: "
                                + rule.getOutputEntry());
                    }
                }
            }
        }

        Set<ConstraintViolation<Definitions>> constraintViolations = validator
                .validate(dm);
        for (ConstraintViolation<Definitions> violation : constraintViolations) {
            System.out.println("  "
                    + violation.getLeafBean().getClass().getName() + "."
                    + violation.getPropertyPath() + " "
                    + violation.getMessage());
        }
        assertEquals("Decision Table is not valid", 0,
                constraintViolations.size());

        File f = new File("target", dm.getName() + ".dmn");
        FileWriter writer = null;
        try {
            writer = new FileWriter(f);
            fact.write(dm, writer);
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
        assertTrue(f.exists());
        System.out.println("wrote dmn to :" + f.getAbsolutePath());
    }

    private void assertInputClause(DtInput input, String inExprId,
            String inExprText, int noInputValues, String[] inputValues) {
        LiteralExpression inExpr = input.getInputExpression();
        assertNotNull(inExpr);
        assertEquals(inExprId, inExpr.getId());
        assertEquals(inExprText, inExpr.getText());
        assertEquals(noInputValues, input.getInputValues().size());
        for (int j = 0; j < noInputValues; j++) {
            Expression inEntry = input.getInputValues().get(j);
            switch (j) {
            case 0:
                assertTrue(inEntry instanceof LiteralExpression);
                LiteralExpression le = (LiteralExpression) inEntry;
                assertEquals(inputValues[0], le.getText());
                break;
            }
        }
    }
}
