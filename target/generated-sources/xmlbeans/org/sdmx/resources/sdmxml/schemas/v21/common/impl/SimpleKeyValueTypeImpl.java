/*
 * XML Type:  SimpleKeyValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.SimpleKeyValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML SimpleKeyValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.common.SimpleKeyValueType.
 */
public class SimpleKeyValueTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.sdmx.resources.sdmxml.schemas.v21.common.SimpleKeyValueType
{
    private static final long serialVersionUID = 1L;
    
    public SimpleKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SimpleKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CASCADEVALUES$0 = 
        new javax.xml.namespace.QName("", "cascadeValues");
    
    
    /**
     * Gets the "cascadeValues" attribute
     */
    public boolean getCascadeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASCADEVALUES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CASCADEVALUES$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cascadeValues" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCascadeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASCADEVALUES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CASCADEVALUES$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "cascadeValues" attribute
     */
    public boolean isSetCascadeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CASCADEVALUES$0) != null;
        }
    }
    
    /**
     * Sets the "cascadeValues" attribute
     */
    public void setCascadeValues(boolean cascadeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CASCADEVALUES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CASCADEVALUES$0);
            }
            target.setBooleanValue(cascadeValues);
        }
    }
    
    /**
     * Sets (as xml) the "cascadeValues" attribute
     */
    public void xsetCascadeValues(org.apache.xmlbeans.XmlBoolean cascadeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CASCADEVALUES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CASCADEVALUES$0);
            }
            target.set(cascadeValues);
        }
    }
    
    /**
     * Unsets the "cascadeValues" attribute
     */
    public void unsetCascadeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CASCADEVALUES$0);
        }
    }
}
