/*
 * An XML document type.
 * Localname: CategorySchemeQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one CategorySchemeQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class CategorySchemeQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategorySchemeQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYSCHEMEQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "CategorySchemeQuery");
    
    
    /**
     * Gets the "CategorySchemeQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType getCategorySchemeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType)get_store().find_element_user(CATEGORYSCHEMEQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategorySchemeQuery" element
     */
    public void setCategorySchemeQuery(org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType categorySchemeQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType)get_store().find_element_user(CATEGORYSCHEMEQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType)get_store().add_element_user(CATEGORYSCHEMEQUERY$0);
            }
            target.set(categorySchemeQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemeQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType addNewCategorySchemeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorySchemeQueryType)get_store().add_element_user(CATEGORYSCHEMEQUERY$0);
            return target;
        }
    }
}
