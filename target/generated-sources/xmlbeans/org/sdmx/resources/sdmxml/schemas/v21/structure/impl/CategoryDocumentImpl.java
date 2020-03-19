/*
 * An XML document type.
 * Localname: Category
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Category(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Category");
    
    
    /**
     * Gets the "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    public void setCategory(org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
}
