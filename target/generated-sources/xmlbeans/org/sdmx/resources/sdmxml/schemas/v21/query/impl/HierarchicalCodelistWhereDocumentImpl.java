/*
 * An XML document type.
 * Localname: HierarchicalCodelistWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one HierarchicalCodelistWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class HierarchicalCodelistWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "HierarchicalCodelistWhere");
    
    
    /**
     * Gets the "HierarchicalCodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType getHierarchicalCodelistWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType)get_store().find_element_user(HIERARCHICALCODELISTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelistWhere" element
     */
    public void setHierarchicalCodelistWhere(org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType hierarchicalCodelistWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType)get_store().find_element_user(HIERARCHICALCODELISTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType)get_store().add_element_user(HIERARCHICALCODELISTWHERE$0);
            }
            target.set(hierarchicalCodelistWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType addNewHierarchicalCodelistWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType)get_store().add_element_user(HIERARCHICALCODELISTWHERE$0);
            return target;
        }
    }
}
