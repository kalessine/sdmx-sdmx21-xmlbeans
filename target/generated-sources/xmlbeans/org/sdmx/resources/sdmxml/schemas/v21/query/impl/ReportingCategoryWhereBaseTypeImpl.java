/*
 * XML Type:  ReportingCategoryWhereBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ReportingCategoryWhereBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ReportingCategoryWhereBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereBaseType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingCategoryWhereBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGCATEGORYWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportingCategoryWhere");
    
    
    /**
     * Gets array of all "ReportingCategoryWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType[] getReportingCategoryWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGCATEGORYWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingCategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType getReportingCategoryWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().find_element_user(REPORTINGCATEGORYWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingCategoryWhere" element
     */
    public int sizeOfReportingCategoryWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGCATEGORYWHERE$0);
        }
    }
    
    /**
     * Sets array of all "ReportingCategoryWhere" element
     */
    public void setReportingCategoryWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType[] reportingCategoryWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingCategoryWhereArray, REPORTINGCATEGORYWHERE$0);
        }
    }
    
    /**
     * Sets ith "ReportingCategoryWhere" element
     */
    public void setReportingCategoryWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType reportingCategoryWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().find_element_user(REPORTINGCATEGORYWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingCategoryWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingCategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType insertNewReportingCategoryWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().insert_element_user(REPORTINGCATEGORYWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingCategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType addNewReportingCategoryWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().add_element_user(REPORTINGCATEGORYWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingCategoryWhere" element
     */
    public void removeReportingCategoryWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGCATEGORYWHERE$0, i);
        }
    }
}
