/*
 * An XML document type.
 * Localname: ReportingYearStartDay
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ReportingYearStartDay(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ReportingYearStartDayDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingYearStartDayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGYEARSTARTDAY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingYearStartDay");
    
    
    /**
     * Gets the "ReportingYearStartDay" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType getReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().find_element_user(REPORTINGYEARSTARTDAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingYearStartDay" element
     */
    public void setReportingYearStartDay(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType reportingYearStartDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().find_element_user(REPORTINGYEARSTARTDAY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().add_element_user(REPORTINGYEARSTARTDAY$0);
            }
            target.set(reportingYearStartDay);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingYearStartDay" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType addNewReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayType)get_store().add_element_user(REPORTINGYEARSTARTDAY$0);
            return target;
        }
    }
}
