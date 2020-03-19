/*
 * An XML document type.
 * Localname: ItemWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ItemWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ItemWhereDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ItemWhere");
    private static final org.apache.xmlbeans.QNameSet ITEMWHERE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ItemWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategoryWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "OrganisationWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportingCategoryWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CodeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptWhere"),
    });
    
    
    /**
     * Gets the "ItemWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType getItemWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().find_element_user(ITEMWHERE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ItemWhere" element
     */
    public void setItemWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType itemWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().find_element_user(ITEMWHERE$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().add_element_user(ITEMWHERE$0);
            }
            target.set(itemWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ItemWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType addNewItemWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().add_element_user(ITEMWHERE$0);
            return target;
        }
    }
}
