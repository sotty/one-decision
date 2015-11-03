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
 * <p>Java class for tOrganizationUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tOrganizationUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tBusinessContextElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="decisionMade" type="{http://www.omg.org/spec/DMN/20130901}tDMNElementReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="decisionOwned" type="{http://www.omg.org/spec/DMN/20130901}tDMNElementReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "tOrganizationUnit", propOrder = {
    "decisionMade",
    "decisionOwned"
})
public class OrganizationUnit
    extends BusinessContextElement
    implements Serializable
{

    protected List<DmnElementReference> decisionMade;
    protected List<DmnElementReference> decisionOwned;

    /**
     * Gets the value of the decisionMade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionMade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisionMade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmnElementReference }
     * 
     * 
     */
    public List<DmnElementReference> getDecisionMade() {
        if (decisionMade == null) {
            decisionMade = new ArrayList<DmnElementReference>();
        }
        return this.decisionMade;
    }

    /**
     * Gets the value of the decisionOwned property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionOwned property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisionOwned().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmnElementReference }
     * 
     * 
     */
    public List<DmnElementReference> getDecisionOwned() {
        if (decisionOwned == null) {
            decisionOwned = new ArrayList<DmnElementReference>();
        }
        return this.decisionOwned;
    }

    public OrganizationUnit withDecisionMade(DmnElementReference... values) {
        if (values!= null) {
            for (DmnElementReference value: values) {
                getDecisionMade().add(value);
            }
        }
        return this;
    }

    public OrganizationUnit withDecisionMade(Collection<DmnElementReference> values) {
        if (values!= null) {
            getDecisionMade().addAll(values);
        }
        return this;
    }

    public OrganizationUnit withDecisionOwned(DmnElementReference... values) {
        if (values!= null) {
            for (DmnElementReference value: values) {
                getDecisionOwned().add(value);
            }
        }
        return this;
    }

    public OrganizationUnit withDecisionOwned(Collection<DmnElementReference> values) {
        if (values!= null) {
            getDecisionOwned().addAll(values);
        }
        return this;
    }

    @Override
    public OrganizationUnit withURI(String value) {
        setURI(value);
        return this;
    }

    @Override
    public OrganizationUnit withName(String value) {
        setName(value);
        return this;
    }

    @Override
    public OrganizationUnit withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public OrganizationUnit withExtensionElements(io.onedecision.engine.decisions.model.dmn.DmnElement.ExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public OrganizationUnit withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public OrganizationUnit withLabel(String value) {
        setLabel(value);
        return this;
    }

}
