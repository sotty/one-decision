//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.02 at 12:08:24 PM GMT 
//


package link.omny.decisions.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tDecisionTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDecisionTable">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tExpression">
 *       &lt;sequence>
 *         &lt;element name="clause" type="{http://www.omg.org/spec/DMN/20130901}tClause" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rule" type="{http://www.omg.org/spec/DMN/20130901}tDecisionRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hitPolicy" type="{http://www.omg.org/spec/DMN/20130901}HitPolicy" default="UNIQUE" />
 *       &lt;attribute name="aggregation" type="{http://www.omg.org/spec/DMN/20130901}BuiltinAggregator" default="COLLECT" />
 *       &lt;attribute name="preferedOrientation" type="{http://www.omg.org/spec/DMN/20130901}DecisionTableOrientation" default="Rule-as-Row" />
 *       &lt;attribute name="isComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isConsistent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DecisionTable")
@XmlType(name = "tDecisionTable", propOrder = {
    "clause",
    "rule"
})
public class DecisionTable extends Expression {

    protected List<Clause> clause;
    protected List<DecisionRule> rule;

    @XmlAttribute(name = "hitPolicy")
    protected HitPolicy hitPolicy;

    @XmlAttribute(name = "aggregation")
    protected BuiltinAggregator aggregation;

    @XmlAttribute(name = "preferedOrientation")
    @NotNull
    protected DecisionTableOrientation preferedOrientation;

    @XmlAttribute(name = "isComplete")
    protected Boolean isComplete;

    @XmlAttribute(name = "isConsistent")
    protected Boolean isConsistent;

    @Override
    public DecisionTable setItemDefinition(QName value) {
        return (DecisionTable) super.setItemDefinition(value);
    }

    @Override
    public DecisionTable setDescription(String value) {
        return (DecisionTable) super.setDescription(value);
    }

    @Override
    public DecisionTable setId(String value) {
        return (DecisionTable) super.setId(value);
    }

    @Override
    public DecisionTable setName(String value) {
        return (DecisionTable) super.setName(value);
    }

    /**
     * Gets the value of the clause property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clause property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClause().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clause }
     * 
     * 
     */
    public List<Clause> getClause() {
        if (clause == null) {
            clause = new ArrayList<Clause>();
        }
        return this.clause;
    }

    /**
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DecisionRule }
     * 
     * 
     */
    public List<DecisionRule> getRule() {
        if (rule == null) {
            rule = new ArrayList<DecisionRule>();
        }
        return this.rule;
    }

    /**
     * Gets the value of the hitPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link HitPolicy }
     *     
     */
    public HitPolicy getHitPolicy() {
        // p75 Section 8.2.11: "The hit policy MUST default to Unique."
        if (hitPolicy == null) {
            return HitPolicy.UNIQUE;
        } else {
            return hitPolicy;
        }
    }

    /**
     * Sets the value of the hitPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HitPolicy }
     *     
     */
    public DecisionTable setHitPolicy(HitPolicy value) {
        this.hitPolicy = value;
        return this;
    }

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link BuiltinAggregator }
     *     
     */
    public BuiltinAggregator getAggregation() {
        // p77 8.2.13 Aggregation "The default is collect".
        if (aggregation == null) {
            return BuiltinAggregator.COLLECT;
        } else {
            return aggregation;
        }
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuiltinAggregator }
     *     
     */
    public DecisionTable setAggregation(BuiltinAggregator value) {
        this.aggregation = value;
        return this;
    }

    /**
     * Gets the value of the preferedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionTableOrientation }
     *     
     */
    public DecisionTableOrientation getPreferedOrientation() {
        // No default expressed by the spec, so we have chosen row.
        if (preferedOrientation == null) {
            return DecisionTableOrientation.RULE_AS_ROW;
        } else {
            return preferedOrientation;
        }
    }

    /**
     * Sets the value of the preferedOrientation property.
     * 
     * @param value
     *            allowed object is {@link DecisionTableOrientation }
     * @return
     * 
     */
    public DecisionTable setPreferedOrientation(DecisionTableOrientation value) {
        this.preferedOrientation = value;
        return this;
    }

    /**
     * Gets the value of the isComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsComplete() {
        if (isComplete == null) {
            return false;
        } else {
            return isComplete;
        }
    }

    /**
     * Sets the value of the isComplete property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * @return
     * 
     */
    public DecisionTable setIsComplete(Boolean value) {
        this.isComplete = value;
        return this;
    }

    /**
     * Gets the value of the isConsistent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsConsistent() {
        if (isConsistent == null) {
            return false;
        } else {
            return isConsistent;
        }
    }

    /**
     * Sets the value of the isConsistent property.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * @return
     * 
     */
    public DecisionTable setIsConsistent(Boolean value) {
        this.isConsistent = value;
        return this;
    }

}
