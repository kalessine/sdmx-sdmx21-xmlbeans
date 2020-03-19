/*
 * An XML document type.
 * Localname: ReportingCategoryWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ReportingCategoryWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ReportingCategoryWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingCategoryWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGCATEGORYWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportingCategoryWhere");
    
    
    /**
     * Gets the "ReportingCategoryWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType getReportingCategoryWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().find_element_user(REPORTINGCATEGORYWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingCategoryWhere" element
     */
    public void setReportingCategoryWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType reportingCategoryWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().find_element_user(REPORTINGCATEGORYWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType)get_store().add_element_user(REPORTINGCATEGORYWHERE$0);
            }
            target.set(reportingCategoryWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingCategoryWhere" element
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
}
