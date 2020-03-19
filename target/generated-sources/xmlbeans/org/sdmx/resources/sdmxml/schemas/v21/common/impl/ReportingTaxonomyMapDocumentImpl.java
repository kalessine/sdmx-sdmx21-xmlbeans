/*
 * An XML document type.
 * Localname: ReportingTaxonomyMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTaxonomyMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ReportingTaxonomyMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ReportingTaxonomyMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTaxonomyMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomyMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingTaxonomyMap");
    
    
    /**
     * Gets the "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMYMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomyMap" element
     */
    public void setReportingTaxonomyMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingTaxonomyMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMYMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMYMAP$0);
            }
            target.set(reportingTaxonomyMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMYMAP$0);
            return target;
        }
    }
}
