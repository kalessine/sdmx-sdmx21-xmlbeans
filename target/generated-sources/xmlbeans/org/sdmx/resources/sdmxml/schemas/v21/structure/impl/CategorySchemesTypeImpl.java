/*
 * XML Type:  CategorySchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CategorySchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CategorySchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType
{
    private static final long serialVersionUID = 1L;
    
    public CategorySchemesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategoryScheme");
    
    
    /**
     * Gets array of all "CategoryScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType[] getCategorySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType getCategorySchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType)get_store().find_element_user(CATEGORYSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryScheme" element
     */
    public int sizeOfCategorySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEME$0);
        }
    }
    
    /**
     * Sets array of all "CategoryScheme" element
     */
    public void setCategorySchemeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType[] categorySchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeArray, CATEGORYSCHEME$0);
        }
    }
    
    /**
     * Sets ith "CategoryScheme" element
     */
    public void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType categoryScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType)get_store().find_element_user(CATEGORYSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType insertNewCategoryScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType)get_store().insert_element_user(CATEGORYSCHEME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType addNewCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeType)get_store().add_element_user(CATEGORYSCHEME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategoryScheme" element
     */
    public void removeCategoryScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEME$0, i);
        }
    }
}
