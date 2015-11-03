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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for tRelation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tRelation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.omg.org/spec/DMN/20130901}tExpression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="column" type="{http://www.omg.org/spec/DMN/20130901}tInformationItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="row" type="{http://www.omg.org/spec/DMN/20130901}tList" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "tRelation", propOrder = {
    "column",
    "row"
})
public class Relation
    extends Expression
    implements Serializable
{

    protected java.util.List<InformationItem> column;
    protected java.util.List<io.onedecision.engine.decisions.model.dmn.List> row;

    /**
     * Gets the value of the column property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the column property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationItem }
     * 
     * 
     */
    public java.util.List<InformationItem> getColumn() {
        if (column == null) {
            column = new ArrayList<InformationItem>();
        }
        return this.column;
    }

    /**
     * Gets the value of the row property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the row property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.onedecision.engine.decisions.model.dmn.List }
     * 
     * 
     */
    public java.util.List<io.onedecision.engine.decisions.model.dmn.List> getRow() {
        if (row == null) {
            row = new ArrayList<io.onedecision.engine.decisions.model.dmn.List>();
        }
        return this.row;
    }

    public Relation withColumn(InformationItem... values) {
        if (values!= null) {
            for (InformationItem value: values) {
                getColumn().add(value);
            }
        }
        return this;
    }

    public Relation withColumn(Collection<InformationItem> values) {
        if (values!= null) {
            getColumn().addAll(values);
        }
        return this;
    }

    public Relation withRow(io.onedecision.engine.decisions.model.dmn.List... values) {
        if (values!= null) {
            for (io.onedecision.engine.decisions.model.dmn.List value: values) {
                getRow().add(value);
            }
        }
        return this;
    }

    public Relation withRow(Collection<io.onedecision.engine.decisions.model.dmn.List> values) {
        if (values!= null) {
            getRow().addAll(values);
        }
        return this;
    }

    @Override
    public Relation withTypeRef(QName value) {
        setTypeRef(value);
        return this;
    }

    @Override
    public Relation withDescription(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public Relation withExtensionElements(io.onedecision.engine.decisions.model.dmn.DmnElement.ExtensionElements value) {
        setExtensionElements(value);
        return this;
    }

    @Override
    public Relation withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public Relation withLabel(String value) {
        setLabel(value);
        return this;
    }

}
