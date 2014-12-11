//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.02 at 12:08:24 PM GMT 
//


package link.omny.decisions.model;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.knowprocess.decisions.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InformationItem_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "InformationItem");
    private final static QName _LiteralExpression_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "LiteralExpression");
    private final static QName _InputData_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "InputData");
    private final static QName _Invocation_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "Invocation");
    private final static QName _Import_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "Import");
    private final static QName _BusinessKnowledgeModel_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "BusinessKnowledgeModel");
    private final static QName _DRGElement_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "DRGElement");
    private final static QName _DMNElement_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "DMNElement");
    private final static QName _KnowledgeSource_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "KnowledgeSource");
    private final static QName _Expression_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "Expression");
    private final static QName _OrganizationUnit_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "OrganizationUnit");
    private final static QName _Definitions_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "Definitions");
    private final static QName _ItemDefinition_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "ItemDefinition");
    private final static QName _BusinessContextElement_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "BusinessContextElement");
    private final static QName _ElementCollection_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "ElementCollection");
    private final static QName _Decision_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "Decision");
    private final static QName _DecisionTable_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "DecisionTable");
    private final static QName _PerformanceIndicator_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "PerformanceIndicator");
    private final static QName _TExpressionInputVariable_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "inputVariable");
    private final static QName _TDecisionRuleConclusion_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "conclusion");
    private final static QName _TDecisionRuleCondition_QNAME = new QName("http://www.omg.org/spec/DMN/20130901", "condition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.knowprocess.decisions.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemDefinition }
     * 
     */
    public ItemDefinition createTItemDefinition() {
        return new ItemDefinition();
    }

    /**
     * Create an instance of {@link LiteralExpression }
     * 
     */
    public LiteralExpression createTLiteralExpression() {
        return new LiteralExpression();
    }

    /**
     * Create an instance of {@link DecisionModelImport }
     * 
     */
    public DecisionModelImport createTImport() {
        return new DecisionModelImport();
    }

    /**
     * Create an instance of {@link BusinessKnowledgeModel }
     * 
     */
    public BusinessKnowledgeModel createTBusinessKnowledgeModel() {
        return new BusinessKnowledgeModel();
    }

    /**
     * Create an instance of {@link DrgElement }
     * 
     */
    public DrgElement createTDRGElement() {
        return new DrgElement();
    }

    /**
     * Create an instance of {@link DmnElement }
     * 
     */
    public DmnElement createTDMNElement() {
        return new DmnElement();
    }

    /**
     * Create an instance of {@link KnowledgeSource }
     * 
     */
    public KnowledgeSource createTKnowledgeSource() {
        return new KnowledgeSource();
    }

    /**
     * Create an instance of {@link InputData }
     * 
     */
    public InputData createTInputData() {
        return new InputData();
    }

    /**
     * Create an instance of {@link Expression }
     * 
     */
    public Expression createTExpression() {
        return new Expression();
    }

    /**
     * Create an instance of {@link InformationItem }
     * 
     */
    public InformationItem createTInformationItem() {
        return new InformationItem();
    }

    /**
     * Create an instance of {@link Invocation }
     * 
     */
    public Invocation createTInvocation() {
        return new Invocation();
    }

    /**
     * Create an instance of {@link ElementCollection }
     * 
     */
    public ElementCollection createTElementCollection() {
        return new ElementCollection();
    }

    /**
     * Create an instance of {@link BusinessContextElement }
     * 
     */
    public BusinessContextElement createTBusinessContextElement() {
        return new BusinessContextElement();
    }

    /**
     * Create an instance of {@link PerformanceIndicator }
     * 
     */
    public PerformanceIndicator createTPerformanceIndicator() {
        return new PerformanceIndicator();
    }

    /**
     * Create an instance of {@link DecisionTable }
     * 
     */
    public DecisionTable createTDecisionTable() {
        return new DecisionTable();
    }

    /**
     * Create an instance of {@link Decision }
     * 
     */
    public Decision createTDecision() {
        return new Decision();
    }

    /**
     * Create an instance of {@link Definitions }
     * 
     */
    public Definitions createTDefinitions() {
        return new Definitions();
    }

    /**
     * Create an instance of {@link OrganizationUnit }
     * 
     */
    public OrganizationUnit createTOrganizationUnit() {
        return new OrganizationUnit();
    }

    /**
     * Create an instance of {@link AuthorityRequirement }
     * 
     */
    public AuthorityRequirement createTAuthorityRequirement() {
        return new AuthorityRequirement();
    }

    /**
     * Create an instance of {@link Clause }
     * 
     */
    public Clause createTClause() {
        return new Clause();
    }

    /**
     * Create an instance of {@link InformationRequirement }
     * 
     */
    public InformationRequirement createTInformationRequirement() {
        return new InformationRequirement();
    }

    /**
     * Create an instance of {@link NamedDmnElement }
     * 
     */
    public NamedDmnElement createTNamedDMNElement() {
        return new NamedDmnElement();
    }

    /**
     * Create an instance of {@link DecisionRule }
     * 
     */
    public DecisionRule createTDecisionRule() {
        return new DecisionRule();
    }

    /**
     * Create an instance of {@link Binding }
     * 
     */
    public Binding createTBinding() {
        return new Binding();
    }

    /**
     * Create an instance of {@link KnowledgeRequirement }
     * 
     */
    public KnowledgeRequirement createTKnowledgeRequirement() {
        return new KnowledgeRequirement();
    }

    /**
     * Create an instance of {@link ItemDefinition.TypeDefinition }
     * 
     */
    public ItemDefinition.TypeDefinition createTItemDefinitionTypeDefinition() {
        return new ItemDefinition.TypeDefinition();
    }

    /**
     * Create an instance of {@link LiteralExpression.Text }
     * 
     */
    public LiteralExpression.Text createTLiteralExpressionText() {
        return new LiteralExpression.Text();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "InformationItem")
    public JAXBElement<InformationItem> createInformationItem(InformationItem value) {
        return new JAXBElement<InformationItem>(_InformationItem_QNAME, InformationItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiteralExpression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "LiteralExpression", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "Expression")
    public JAXBElement<LiteralExpression> createLiteralExpression(LiteralExpression value) {
        return new JAXBElement<LiteralExpression>(_LiteralExpression_QNAME, LiteralExpression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "InputData", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "DRGElement")
    public JAXBElement<InputData> createInputData(InputData value) {
        return new JAXBElement<InputData>(_InputData_QNAME, InputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Invocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "Invocation", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "Expression")
    public JAXBElement<Invocation> createInvocation(Invocation value) {
        return new JAXBElement<Invocation>(_Invocation_QNAME, Invocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisionModelImport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "Import")
    public JAXBElement<DecisionModelImport> createImport(DecisionModelImport value) {
        return new JAXBElement<DecisionModelImport>(_Import_QNAME, DecisionModelImport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessKnowledgeModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "BusinessKnowledgeModel", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "DRGElement")
    public JAXBElement<BusinessKnowledgeModel> createBusinessKnowledgeModel(BusinessKnowledgeModel value) {
        return new JAXBElement<BusinessKnowledgeModel>(_BusinessKnowledgeModel_QNAME, BusinessKnowledgeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrgElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "DRGElement")
    public JAXBElement<DrgElement> createDRGElement(DrgElement value) {
        return new JAXBElement<DrgElement>(_DRGElement_QNAME, DrgElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DmnElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "DMNElement")
    public JAXBElement<DmnElement> createDMNElement(DmnElement value) {
        return new JAXBElement<DmnElement>(_DMNElement_QNAME, DmnElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KnowledgeSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "KnowledgeSource", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "DRGElement")
    public JAXBElement<KnowledgeSource> createKnowledgeSource(KnowledgeSource value) {
        return new JAXBElement<KnowledgeSource>(_KnowledgeSource_QNAME, KnowledgeSource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Expression }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "Expression")
    public JAXBElement<Expression> createExpression(Expression value) {
        return new JAXBElement<Expression>(_Expression_QNAME, Expression.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "OrganizationUnit", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "BusinessContextElement")
    public JAXBElement<OrganizationUnit> createOrganizationUnit(OrganizationUnit value) {
        return new JAXBElement<OrganizationUnit>(_OrganizationUnit_QNAME, OrganizationUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Definitions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "Definitions")
    public JAXBElement<Definitions> createDefinitions(Definitions value) {
        return new JAXBElement<Definitions>(_Definitions_QNAME, Definitions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "ItemDefinition")
    public JAXBElement<ItemDefinition> createItemDefinition(ItemDefinition value) {
        return new JAXBElement<ItemDefinition>(_ItemDefinition_QNAME, ItemDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessContextElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "BusinessContextElement")
    public JAXBElement<BusinessContextElement> createBusinessContextElement(BusinessContextElement value) {
        return new JAXBElement<BusinessContextElement>(_BusinessContextElement_QNAME, BusinessContextElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElementCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "ElementCollection")
    public JAXBElement<ElementCollection> createElementCollection(ElementCollection value) {
        return new JAXBElement<ElementCollection>(_ElementCollection_QNAME, ElementCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "Decision", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "DRGElement")
    public JAXBElement<Decision> createDecision(Decision value) {
        return new JAXBElement<Decision>(_Decision_QNAME, Decision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisionTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "DecisionTable", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "Expression")
    public JAXBElement<DecisionTable> createDecisionTable(DecisionTable value) {
        return new JAXBElement<DecisionTable>(_DecisionTable_QNAME, DecisionTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformanceIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "PerformanceIndicator", substitutionHeadNamespace = "http://www.omg.org/spec/DMN/20130901", substitutionHeadName = "BusinessContextElement")
    public JAXBElement<PerformanceIndicator> createPerformanceIndicator(PerformanceIndicator value) {
        return new JAXBElement<PerformanceIndicator>(_PerformanceIndicator_QNAME, PerformanceIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "inputVariable", scope = Expression.class)
    @XmlIDREF
    public JAXBElement<Object> createTExpressionInputVariable(Object value) {
        return new JAXBElement<Object>(_TExpressionInputVariable_QNAME, Object.class, Expression.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "conclusion", scope = DecisionRule.class)
    @XmlIDREF
    public JAXBElement<List<Object>> createTDecisionRuleConclusion(List<Object> value) {
        return new JAXBElement<List<Object>>(_TDecisionRuleConclusion_QNAME, ((Class) List.class), DecisionRule.class, ((List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.omg.org/spec/DMN/20130901", name = "condition", scope = DecisionRule.class)
    @XmlIDREF
    public JAXBElement<List<Object>> createTDecisionRuleCondition(List<Object> value) {
        return new JAXBElement<List<Object>>(_TDecisionRuleCondition_QNAME, ((Class) List.class), DecisionRule.class, ((List<Object> ) value));
    }

}
