//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.30 at 01:30:38 PM GMT 
//


package io.onedecision.engine.decisions.model.dmn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tDecisionRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tDecisionRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tDMNElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inputEntry" type="{http://www.omg.org/spec/DMN/20130901}tUnaryTests" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="outputEntry" type="{http://www.omg.org/spec/DMN/20130901}tLiteralExpression" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tDecisionRule", propOrder = {
    "inputEntry",
    "outputEntry"
})
public class DecisionRule
    extends DmnElement
    implements Serializable
{

    protected List<UnaryTests> inputEntry;
    @XmlElement(required = true)
    protected List<LiteralExpression> outputEntry;

    /**
     * Gets the value of the inputEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnaryTests }
     * 
     * 
     */
    public List<UnaryTests> getInputEntry() {
        if (inputEntry == null) {
            inputEntry = new ArrayList<UnaryTests>();
        }
        return this.inputEntry;
    }

    /**
     * Gets the value of the outputEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiteralExpression }
     * 
     * 
     */
    public List<LiteralExpression> getOutputEntry() {
        if (outputEntry == null) {
            outputEntry = new ArrayList<LiteralExpression>();
        }
        return this.outputEntry;
    }

    public DecisionRule withInputEntry(UnaryTests... values) {
        if (values!= null) {
            for (UnaryTests value: values) {
                getInputEntry().add(value);
            }
        }
        return this;
    }

    public DecisionRule withInputEntry(Collection<UnaryTests> values) {
        if (values!= null) {
            getInputEntry().addAll(values);
        }
        return this;
    }

    public DecisionRule withOutputEntry(LiteralExpression... values) {
        if (values!= null) {
            for (LiteralExpression value: values) {
                getOutputEntry().add(value);
            }
        }
        return this;
    }

    public DecisionRule withOutputEntry(Collection<LiteralExpression> values) {
        if (values!= null) {
            getOutputEntry().addAll(values);
        }
        return this;
    }

    @Override
    public DecisionRule withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public DecisionRule withExtensionElements(DmnElement.ExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public DecisionRule withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public DecisionRule withLabel(String value) {
        setLabel(value);
        return this;
    }

}
