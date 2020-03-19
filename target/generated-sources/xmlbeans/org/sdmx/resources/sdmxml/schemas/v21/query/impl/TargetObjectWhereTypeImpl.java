/*
 * XML Type:  TargetObjectWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML TargetObjectWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class TargetObjectWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.TargetObjectWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType
{
    private static final long serialVersionUID = 1L;
    
    public TargetObjectWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName TARGETCLASS$2 = 
        new javax.xml.namespace.QName("", "targetClass");
    
    
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
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType)get_store().find_attribute_user(TYPE$0);
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
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TargetObjectTypeCodelistType)get_store().add_attribute_user(TYPE$0);
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
    
    /**
     * Gets the "targetClass" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getTargetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETCLASS$2);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetClass" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType xgetTargetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(TARGETCLASS$2);
            return target;
        }
    }
    
    /**
     * True if has "targetClass" attribute
     */
    public boolean isSetTargetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETCLASS$2) != null;
        }
    }
    
    /**
     * Sets the "targetClass" attribute
     */
    public void setTargetClass(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum targetClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETCLASS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETCLASS$2);
            }
            target.setEnumValue(targetClass);
        }
    }
    
    /**
     * Sets (as xml) the "targetClass" attribute
     */
    public void xsetTargetClass(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType targetClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(TARGETCLASS$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_attribute_user(TARGETCLASS$2);
            }
            target.set(targetClass);
        }
    }
    
    /**
     * Unsets the "targetClass" attribute
     */
    public void unsetTargetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETCLASS$2);
        }
    }
}
