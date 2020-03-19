/*
 * An XML document type.
 * Localname: ReportingTaxonomyQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one ReportingTaxonomyQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class ReportingTaxonomyQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomyQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ReportingTaxonomyQuery");
    
    
    /**
     * Gets the "ReportingTaxonomyQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType getReportingTaxonomyQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType)get_store().find_element_user(REPORTINGTAXONOMYQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomyQuery" element
     */
    public void setReportingTaxonomyQuery(org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType reportingTaxonomyQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType)get_store().find_element_user(REPORTINGTAXONOMYQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType)get_store().add_element_user(REPORTINGTAXONOMYQUERY$0);
            }
            target.set(reportingTaxonomyQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomyQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType addNewReportingTaxonomyQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ReportingTaxonomyQueryType)get_store().add_element_user(REPORTINGTAXONOMYQUERY$0);
            return target;
        }
    }
}
