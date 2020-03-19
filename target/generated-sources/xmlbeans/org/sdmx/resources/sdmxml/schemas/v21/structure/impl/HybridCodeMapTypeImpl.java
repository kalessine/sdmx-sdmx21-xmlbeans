/*
 * XML Type:  HybridCodeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML HybridCodeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class HybridCodeMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType
{
    private static final long serialVersionUID = 1L;
    
    public HybridCodeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Target");
    
    
    /**
     * Gets the "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().find_element_user(TARGET$2, 0);
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
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeReferenceType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
}
