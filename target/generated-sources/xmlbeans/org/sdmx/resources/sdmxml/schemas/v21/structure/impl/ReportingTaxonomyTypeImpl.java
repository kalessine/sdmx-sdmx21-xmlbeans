/*
 * XML Type:  ReportingTaxonomyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportingTaxonomyType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportingTaxonomyTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGCATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingCategory");
    
    
    /**
     * Gets array of all "ReportingCategory" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType[] getReportingCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGCATEGORY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType getReportingCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().find_element_user(REPORTINGCATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingCategory" element
     */
    public int sizeOfReportingCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGCATEGORY$0);
        }
    }
    
    /**
     * Sets array of all "ReportingCategory" element
     */
    public void setReportingCategoryArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType[] reportingCategoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingCategoryArray, REPORTINGCATEGORY$0);
        }
    }
    
    /**
     * Sets ith "ReportingCategory" element
     */
    public void setReportingCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType reportingCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().find_element_user(REPORTINGCATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingCategory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType insertNewReportingCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().insert_element_user(REPORTINGCATEGORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType addNewReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().add_element_user(REPORTINGCATEGORY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingCategory" element
     */
    public void removeReportingCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGCATEGORY$0, i);
        }
    }
}
