/*
 * An XML document type.
 * Localname: CategoryWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one CategoryWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class CategoryWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategoryWhere");
    
    
    /**
     * Gets the "CategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType getCategoryWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().find_element_user(CATEGORYWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryWhere" element
     */
    public void setCategoryWhere(org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType categoryWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().find_element_user(CATEGORYWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().add_element_user(CATEGORYWHERE$0);
            }
            target.set(categoryWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "CategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType addNewCategoryWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().add_element_user(CATEGORYWHERE$0);
            return target;
        }
    }
}
