/*
 * XML Type:  CategorySchemeQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML CategorySchemeQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class CategorySchemeQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeQueryType
{
    private static final long serialVersionUID = 1L;
    
    public CategorySchemeQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYSCHEMEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategorySchemeWhere");
    
    
    /**
     * Gets the "CategorySchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType getCategorySchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType)get_store().find_element_user(CATEGORYSCHEMEWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategorySchemeWhere" element
     */
    public void setCategorySchemeWhere(org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType categorySchemeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType)get_store().find_element_user(CATEGORYSCHEMEWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType)get_store().add_element_user(CATEGORYSCHEMEWHERE$0);
            }
            target.set(categorySchemeWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType addNewCategorySchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorySchemeWhereType)get_store().add_element_user(CATEGORYSCHEMEWHERE$0);
            return target;
        }
    }
}
