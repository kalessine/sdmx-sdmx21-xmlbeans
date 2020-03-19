/*
 * An XML document type.
 * Localname: HierarchicalCode
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.HierarchicalCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one HierarchicalCode(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class HierarchicalCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.HierarchicalCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHICALCODE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HierarchicalCode");
    
    
    /**
     * Gets the "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HierarchicalCode" element
     */
    public void setHierarchicalCode(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hierarchicalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODE$0);
            }
            target.set(hierarchicalCode);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODE$0);
            return target;
        }
    }
}
