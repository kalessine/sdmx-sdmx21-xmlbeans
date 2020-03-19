/*
 * An XML document type.
 * Localname: ReportStructureWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ReportStructureWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ReportStructureWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentListWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportStructureWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTSTRUCTUREWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportStructureWhere");
    
    
    /**
     * Gets the "ReportStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType getReportStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().find_element_user(REPORTSTRUCTUREWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportStructureWhere" element
     */
    public void setReportStructureWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType reportStructureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().find_element_user(REPORTSTRUCTUREWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().add_element_user(REPORTSTRUCTUREWHERE$0);
            }
            target.set(reportStructureWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType addNewReportStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().add_element_user(REPORTSTRUCTUREWHERE$0);
            return target;
        }
    }
}
