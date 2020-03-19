/*
 * An XML document type.
 * Localname: HierarchicalCodelist
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.HierarchicalCodelistDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one HierarchicalCodelist(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class HierarchicalCodelistDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.HierarchicalCodelistDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHICALCODELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HierarchicalCodelist");
    
    
    /**
     * Gets the "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelist" element
     */
    public void setHierarchicalCodelist(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hierarchicalCodelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODELIST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODELIST$0);
            }
            target.set(hierarchicalCodelist);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODELIST$0);
            return target;
        }
    }
}
