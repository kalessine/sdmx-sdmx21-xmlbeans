/*
 * XML Type:  ReportingTaxonomyQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ReportingTaxonomyQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ReportingTaxonomyQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyQueryType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomyQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportingTaxonomyWhere");
    
    
    /**
     * Gets the "ReportingTaxonomyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType getReportingTaxonomyWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType)get_store().find_element_user(REPORTINGTAXONOMYWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomyWhere" element
     */
    public void setReportingTaxonomyWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType reportingTaxonomyWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType)get_store().find_element_user(REPORTINGTAXONOMYWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType)get_store().add_element_user(REPORTINGTAXONOMYWHERE$0);
            }
            target.set(reportingTaxonomyWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomyWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType addNewReportingTaxonomyWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingTaxonomyWhereType)get_store().add_element_user(REPORTINGTAXONOMYWHERE$0);
            return target;
        }
    }
}
