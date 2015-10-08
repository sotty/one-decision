package io.onedecision.engine.decisions.examples.dmn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import io.onedecision.engine.decisions.examples.ExamplesConstants;
import io.onedecision.engine.decisions.impl.DecisionService;
import io.onedecision.engine.decisions.impl.del.DelExpression;
import io.onedecision.engine.decisions.impl.del.DurationExpression;
import io.onedecision.engine.decisions.model.dmn.Decision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests the engine's ability to run a model defined using Java API rather than
 * pre-defined DMN file.
 * 
 * @author Tim Stephenson
 */
@RunWith(Parameterized.class)
public class EmailFollowUpTest implements ExamplesConstants {

	private static DecisionService svc;

	private static final long ONE_DAY = 24 * 60 * 60 * 1000;

	private String contactInstance;
	private String emailInstance;
	private Decision decision;
    private Map<String, Object> vars = new HashMap<String, Object>();

	@Parameters
	public static Collection<String[]> data() {
		return Arrays
				.asList(new String[][] { {
						"{\"timeSinceLogin\":" + (15 * ONE_DAY)
								+ ",\"timeSinceEmail\":" + (8 * ONE_DAY)
								+ ", \"doNotEmail\": false}",
                        "{\"template\":\"MissedYou\",\"subject\":\"We've missed you\"}" } });
	}

	@BeforeClass
	public static void setUpClass() {
		svc = new DecisionService();
		List<DelExpression> compilers = new ArrayList<DelExpression>();
		compilers.add(new DurationExpression());
		svc.setDelExpressions(compilers);
	}

	public EmailFollowUpTest(String contact, String email) {
		this.contactInstance = contact;
		this.emailInstance = email;
	}

	@Test
	public void testEmailFollowUp() {
		try {
			vars.clear();
			vars.put("contact", contactInstance);
            vars = svc.executeDecision(EFU_DEFINITION_ID, EFU_DECISION_ID,
                    vars, TENANT_ID);
			assertEquals(emailInstance, vars.get("email"));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getClass() + ":" + e.getMessage());
		}
	}

}
