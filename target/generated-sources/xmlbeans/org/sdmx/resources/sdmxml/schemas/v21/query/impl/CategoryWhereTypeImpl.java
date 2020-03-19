/*
 * XML Type:  CategoryWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML CategoryWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class CategoryWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType
{
    private static final long serialVersionUID = 1L;
    
    public CategoryWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategoryWhere");
    
    
    /**
     * Gets array of all "CategoryWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType[] getCategoryWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType getCategoryWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().find_element_user(CATEGORYWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryWhere" element
     */
    public int sizeOfCategoryWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYWHERE$0);
        }
    }
    
    /**
     * Sets array of all "CategoryWhere" element
     */
    public void setCategoryWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType[] categoryWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryWhereArray, CATEGORYWHERE$0);
        }
    }
    
    /**
     * Sets ith "CategoryWhere" element
     */
    public void setCategoryWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType categoryWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().find_element_user(CATEGORYWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType insertNewCategoryWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategoryWhereType)get_store().insert_element_user(CATEGORYWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryWhere" element
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
    
    /**
     * Removes the ith "CategoryWhere" element
     */
    public void removeCategoryWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYWHERE$0, i);
        }
    }
}
