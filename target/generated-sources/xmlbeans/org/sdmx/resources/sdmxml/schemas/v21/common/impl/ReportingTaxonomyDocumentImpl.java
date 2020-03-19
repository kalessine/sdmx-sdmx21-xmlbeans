/*
 * An XML document type.
 * Localname: ReportingTaxonomy
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTaxonomyDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ReportingTaxonomy(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ReportingTaxonomyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTaxonomyDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGTAXONOMY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingTaxonomy");
    
    
    /**
     * Gets the "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomy" element
     */
    public void setReportingTaxonomy(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingTaxonomy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMY$0);
            }
            target.set(reportingTaxonomy);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMY$0);
            return target;
        }
    }
}
