/*
 * An XML document type.
 * Localname: CategorySchemeMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one CategorySchemeMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class CategorySchemeMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategorySchemeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYSCHEMEMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CategorySchemeMap");
    
    
    /**
     * Gets the "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEMEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategorySchemeMap" element
     */
    public void setCategorySchemeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType categorySchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEMEMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEMEMAP$0);
            }
            target.set(categorySchemeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEMEMAP$0);
            return target;
        }
    }
}
