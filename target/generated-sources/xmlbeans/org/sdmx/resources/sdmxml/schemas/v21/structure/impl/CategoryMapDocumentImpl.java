/*
 * An XML document type.
 * Localname: CategoryMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one CategoryMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class CategoryMapDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemAssociationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategoryMap");
    
    
    /**
     * Gets the "CategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType getCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().find_element_user(CATEGORYMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategoryMap" element
     */
    public void setCategoryMap(org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType categoryMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().find_element_user(CATEGORYMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().add_element_user(CATEGORYMAP$0);
            }
            target.set(categoryMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType addNewCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().add_element_user(CATEGORYMAP$0);
            return target;
        }
    }
}
