/*
 * XML Type:  AttributeListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML AttributeListType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class AttributeListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.AttributeListBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Attribute");
    private static final javax.xml.namespace.QName REPORTINGYEARSTARTDAY$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingYearStartDay");
    
    
    /**
     * Gets array of all "Attribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "Attribute" element
     */
    public void setAttributeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "Attribute" element
     */
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().find_element_user(ATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().insert_element_user(ATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$0, i);
        }
    }
    
    /**
     * Gets array of all "ReportingYearStartDay" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType[] getReportingYearStartDayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGYEARSTARTDAY$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingYearStartDay" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType getReportingYearStartDayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().find_element_user(REPORTINGYEARSTARTDAY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingYearStartDay" element
     */
    public int sizeOfReportingYearStartDayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGYEARSTARTDAY$2);
        }
    }
    
    /**
     * Sets array of all "ReportingYearStartDay" element
     */
    public void setReportingYearStartDayArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType[] reportingYearStartDayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingYearStartDayArray, REPORTINGYEARSTARTDAY$2);
        }
    }
    
    /**
     * Sets ith "ReportingYearStartDay" element
     */
    public void setReportingYearStartDayArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType reportingYearStartDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().find_element_user(REPORTINGYEARSTARTDAY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingYearStartDay);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingYearStartDay" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType insertNewReportingYearStartDay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().insert_element_user(REPORTINGYEARSTARTDAY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingYearStartDay" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType addNewReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().add_element_user(REPORTINGYEARSTARTDAY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingYearStartDay" element
     */
    public void removeReportingYearStartDay(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGYEARSTARTDAY$2, i);
        }
    }
}
