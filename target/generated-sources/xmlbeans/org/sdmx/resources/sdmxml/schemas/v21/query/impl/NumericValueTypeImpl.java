/*
 * XML Type:  NumericValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML NumericValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType.
 */
public class NumericValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType
{
    private static final long serialVersionUID = 1L;
    
    public NumericValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected NumericValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("", "operator");
    
    
    /**
     * Gets the "operator" attribute
     */
    public java.lang.String getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType)get_default_attribute_value(OPERATOR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$0) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(java.lang.String operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$0);
            }
            target.setStringValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrderedOperatorType)get_store().add_attribute_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$0);
        }
    }
}
