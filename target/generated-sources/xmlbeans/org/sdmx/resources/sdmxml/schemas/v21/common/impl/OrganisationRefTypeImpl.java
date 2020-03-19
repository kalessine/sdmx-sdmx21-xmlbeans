/*
 * XML Type:  OrganisationRefType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML OrganisationRefType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class OrganisationRefTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.OrganisationRefBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationRefType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASS1$0 = 
        new javax.xml.namespace.QName("", "class");
    
    
    /**
     * Gets the "class" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$0);
            return target;
        }
    }
    
    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$0) != null;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$0);
            }
            target.setEnumValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_attribute_user(CLASS1$0);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$0);
        }
    }
}
