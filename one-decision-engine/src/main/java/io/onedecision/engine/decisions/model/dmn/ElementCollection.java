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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tElementCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tElementCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tNamedElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="drgElement" type="{http://www.omg.org/spec/DMN/20130901}tDMNElementReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "tElementCollection", propOrder = {
    "drgElement"
})
public class ElementCollection
    extends NamedElement
    implements Serializable
{

    protected List<DmnElementReference> drgElement;

    /**
     * Gets the value of the drgElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drgElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrgElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmnElementReference }
     * 
     * 
     */
    public List<DmnElementReference> getDrgElement() {
        if (drgElement == null) {
            drgElement = new ArrayList<DmnElementReference>();
        }
        return this.drgElement;
    }

    public ElementCollection withDrgElement(DmnElementReference... values) {
        if (values!= null) {
            for (DmnElementReference value: values) {
                getDrgElement().add(value);
            }
        }
        return this;
    }

    public ElementCollection withDrgElement(Collection<DmnElementReference> values) {
        if (values!= null) {
            getDrgElement().addAll(values);
        }
        return this;
    }

    @Override
    public ElementCollection withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public ElementCollection withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ElementCollection withExtensionElements(io.onedecision.engine.decisions.model.dmn.DmnElement.ExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public ElementCollection withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public ElementCollection withLabel(String value) {
        setLabel(value);
        return this;
    }

}
