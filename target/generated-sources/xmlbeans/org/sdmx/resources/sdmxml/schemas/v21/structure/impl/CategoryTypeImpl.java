/*
 * XML Type:  CategoryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CategoryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CategoryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType
{
    private static final long serialVersionUID = 1L;
    
    public CategoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Category");
    
    
    /**
     * Gets array of all "Category" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$0);
        }
    }
    
    /**
     * Sets array of all "Category" element
     */
    public void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$0);
        }
    }
    
    /**
     * Sets ith "Category" element
     */
    public void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategoryType)get_store().insert_element_user(CATEGORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
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
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$0, i);
        }
    }
}
