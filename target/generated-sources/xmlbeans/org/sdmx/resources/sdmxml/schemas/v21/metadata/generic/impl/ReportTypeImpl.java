/*
 * XML Type:  ReportType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.impl;
/**
 * An XML ReportType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic).
 *
 * This is a complex type.
 */
public class ReportTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportType
{
    private static final long serialVersionUID = 1L;
    
    public ReportTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "Target");
    private static final javax.xml.namespace.QName ATTRIBUTESET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "AttributeSet");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType)get_store().find_element_user(TARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType)get_store().add_element_user(TARGET$0);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.TargetType)get_store().add_element_user(TARGET$0);
            return target;
        }
    }
    
    /**
     * Gets the "AttributeSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType getAttributeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().find_element_user(ATTRIBUTESET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttributeSet" element
     */
    public void setAttributeSet(org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType attributeSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().find_element_user(ATTRIBUTESET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().add_element_user(ATTRIBUTESET$2);
            }
            target.set(attributeSet);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType addNewAttributeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().add_element_user(ATTRIBUTESET$2);
            return target;
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
}
