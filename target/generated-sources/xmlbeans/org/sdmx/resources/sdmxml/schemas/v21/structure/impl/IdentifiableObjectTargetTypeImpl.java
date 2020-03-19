/*
 * XML Type:  IdentifiableObjectTargetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML IdentifiableObjectTargetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class IdentifiableObjectTargetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.IdentifiableObjectTargetBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiableObjectTargetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTTYPE$0 = 
        new javax.xml.namespace.QName("", "objectType");
    
    
    /**
     * Gets the "objectType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "objectType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(OBJECTTYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "objectType" attribute
     */
    public void setObjectType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$0);
            }
            target.setEnumValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "objectType" attribute
     */
    public void xsetObjectType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(OBJECTTYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_attribute_user(OBJECTTYPE$0);
            }
            target.set(objectType);
        }
    }
}
