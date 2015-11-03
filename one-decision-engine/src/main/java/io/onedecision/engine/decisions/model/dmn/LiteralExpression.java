//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.30 at 01:30:38 PM GMT 
//


package io.onedecision.engine.decisions.model.dmn;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tLiteralExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tLiteralExpression"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tExpression"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="importedValues" type="{http://www.omg.org/spec/DMN/20130901}tImportedValues"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="expressionLanguage" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tLiteralExpression", propOrder = {
    "text",
    "importedValues"
})
public class LiteralExpression extends Expression implements Serializable {

    private static final long serialVersionUID = -7926225892033854880L;
    protected String text;
    protected ImportedValues importedValues;
    @XmlAttribute(name = "expressionLanguage")
    @XmlSchemaType(name = "anyURI")
    protected String expressionLanguage;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the importedValues property.
     * 
     * @return
     *     possible object is
     *     {@link ImportedValues }
     *     
     */
    public ImportedValues getImportedValues() {
        return importedValues;
    }

    /**
     * Sets the value of the importedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportedValues }
     *     
     */
    public void setImportedValues(ImportedValues value) {
        this.importedValues = value;
    }

    /**
     * Gets the value of the expressionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionLanguage() {
        return expressionLanguage;
    }

    /**
     * Sets the value of the expressionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionLanguage(String value) {
        this.expressionLanguage = value;
    }

    public LiteralExpression withText(String value) {
        setText(value);
        return this;
    }

    public LiteralExpression withImportedValues(ImportedValues value) {
        setImportedValues(value);
        return this;
    }

    public LiteralExpression withExpressionLanguage(String value) {
        setExpressionLanguage(value);
        return this;
    }

    @Override
    public LiteralExpression withTypeRef(QName value) {
        setTypeRef(value);
        return this;
    }

    @Override
    public LiteralExpression withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public LiteralExpression withExtensionElements(io.onedecision.engine.decisions.model.dmn.DmnElement.ExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public LiteralExpression withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public LiteralExpression withLabel(String value) {
        setLabel(value);
        return this;
    }

}
