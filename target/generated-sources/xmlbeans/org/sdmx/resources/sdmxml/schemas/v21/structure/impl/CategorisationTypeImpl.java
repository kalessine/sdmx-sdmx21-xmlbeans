/*
 * XML Type:  CategorisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CategorisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CategorisationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType
{
    private static final long serialVersionUID = 1L;
    
    public CategorisationTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0) != 0;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, 0);
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Target" element
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$2) != 0;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Target" element
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$2, 0);
        }
    }
}
