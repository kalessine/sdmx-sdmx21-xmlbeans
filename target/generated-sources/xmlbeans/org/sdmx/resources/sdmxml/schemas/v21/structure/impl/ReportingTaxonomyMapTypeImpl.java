/*
 * XML Type:  ReportingTaxonomyMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportingTaxonomyMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportingTaxonomyMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeMapTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomyMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGCATEGORYMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingCategoryMap");
    
    
    /**
     * Gets array of all "ReportingCategoryMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType[] getReportingCategoryMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGCATEGORYMAP$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType getReportingCategoryMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType)get_store().find_element_user(REPORTINGCATEGORYMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingCategoryMap" element
     */
    public int sizeOfReportingCategoryMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGCATEGORYMAP$0);
        }
    }
    
    /**
     * Sets array of all "ReportingCategoryMap" element
     */
    public void setReportingCategoryMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType[] reportingCategoryMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingCategoryMapArray, REPORTINGCATEGORYMAP$0);
        }
    }
    
    /**
     * Sets ith "ReportingCategoryMap" element
     */
    public void setReportingCategoryMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType reportingCategoryMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType)get_store().find_element_user(REPORTINGCATEGORYMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingCategoryMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType insertNewReportingCategoryMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType)get_store().insert_element_user(REPORTINGCATEGORYMAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType addNewReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryMapType)get_store().add_element_user(REPORTINGCATEGORYMAP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingCategoryMap" element
     */
    public void removeReportingCategoryMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGCATEGORYMAP$0, i);
        }
    }
}
