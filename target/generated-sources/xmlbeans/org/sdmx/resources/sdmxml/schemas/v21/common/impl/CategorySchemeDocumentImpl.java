/*
 * An XML document type.
 * Localname: CategoryScheme
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one CategoryScheme(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class CategorySchemeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategorySchemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CategoryScheme");
    
    
    /**
     * Gets the "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryScheme" element
     */
    public void setCategoryScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType categoryScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEME$0);
            }
            target.set(categoryScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEME$0);
            return target;
        }
    }
}
