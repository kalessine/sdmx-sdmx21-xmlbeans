/*
 * XML Type:  CategorySchemeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CategorySchemeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CategorySchemeMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeMapTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType
{
    private static final long serialVersionUID = 1L;
    
    public CategorySchemeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategoryMap");
    
    
    /**
     * Gets array of all "CategoryMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType[] getCategoryMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYMAP$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType getCategoryMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().find_element_user(CATEGORYMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryMap" element
     */
    public int sizeOfCategoryMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYMAP$0);
        }
    }
    
    /**
     * Sets array of all "CategoryMap" element
     */
    public void setCategoryMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType[] categoryMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryMapArray, CATEGORYMAP$0);
        }
    }
    
    /**
     * Sets ith "CategoryMap" element
     */
    public void setCategoryMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType categoryMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().find_element_user(CATEGORYMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType insertNewCategoryMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryMapType)get_store().insert_element_user(CATEGORYMAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryMap" element
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
    
    /**
     * Removes the ith "CategoryMap" element
     */
    public void removeCategoryMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYMAP$0, i);
        }
    }
}
