/*
 * XML Type:  StructureSetWhereBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureSetWhereBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureSetWhereBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.MaintainableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereBaseType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetWhereBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_default_attribute_value(TYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
}
