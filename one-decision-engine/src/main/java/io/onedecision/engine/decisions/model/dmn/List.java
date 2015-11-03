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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tExpression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.omg.org/spec/DMN/20130901}expression" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "tList", propOrder = {
    "expression"
})
public class List
    extends Expression
    implements Serializable
{

    @XmlElementRef(name = "expression", namespace = "http://www.omg.org/spec/DMN/20130901", type = JAXBElement.class, required = false)
    protected java.util.List<JAXBElement<? extends Expression>> expression;

    /**
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FunctionDefinition }{@code >}
     * {@link JAXBElement }{@code <}{@link DecisionTable }{@code >}
     * {@link JAXBElement }{@code <}{@link Invocation }{@code >}
     * {@link JAXBElement }{@code <}{@link LiteralExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link List }{@code >}
     * {@link JAXBElement }{@code <}{@link Context }{@code >}
     * {@link JAXBElement }{@code <}{@link Expression }{@code >}
     * {@link JAXBElement }{@code <}{@link Relation }{@code >}
     * 
     * 
     */
    public java.util.List<JAXBElement<? extends Expression>> getExpression() {
        if (expression == null) {
            expression = new ArrayList<JAXBElement<? extends Expression>>();
        }
        return this.expression;
    }

    public List withExpression(JAXBElement<? extends Expression> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends Expression> value: values) {
                getExpression().add(value);
            }
        }
        return this;
    }

    public List withExpression(Collection<JAXBElement<? extends Expression>> values) {
        if (values!= null) {
            getExpression().addAll(values);
        }
        return this;
    }

    @Override
    public List withTypeRef(QName value) {
        setTypeRef(value);
        return this;
    }

    @Override
    public List withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public List withExtensionElements(io.onedecision.engine.decisions.model.dmn.DmnElement.ExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public List withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public List withLabel(String value) {
        setLabel(value);
        return this;
    }

}
