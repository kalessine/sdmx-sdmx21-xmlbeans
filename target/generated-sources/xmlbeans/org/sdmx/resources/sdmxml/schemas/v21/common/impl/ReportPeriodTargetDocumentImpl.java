/*
 * An XML document type.
 * Localname: ReportPeriodTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ReportPeriodTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ReportPeriodTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ReportPeriodTargetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ReportPeriodTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportPeriodTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTPERIODTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportPeriodTarget");
    
    
    /**
     * Gets the "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTPERIODTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportPeriodTarget" element
     */
    public void setReportPeriodTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportPeriodTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTPERIODTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTPERIODTARGET$0);
            }
            target.set(reportPeriodTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTPERIODTARGET$0);
            return target;
        }
    }
}
