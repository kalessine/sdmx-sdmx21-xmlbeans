/*
 * An XML document type.
 * Localname: ReportPeriodTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ReportPeriodTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ReportPeriodTargetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportPeriodTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTPERIODTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportPeriodTarget");
    
    
    /**
     * Gets the "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType getReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().find_element_user(REPORTPERIODTARGET$0, 0);
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
    public void setReportPeriodTarget(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType reportPeriodTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().find_element_user(REPORTPERIODTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().add_element_user(REPORTPERIODTARGET$0);
            }
            target.set(reportPeriodTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType addNewReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().add_element_user(REPORTPERIODTARGET$0);
            return target;
        }
    }
}
