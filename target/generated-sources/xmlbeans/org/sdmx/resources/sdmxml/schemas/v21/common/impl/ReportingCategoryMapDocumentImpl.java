/*
 * An XML document type.
 * Localname: ReportingCategoryMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ReportingCategoryMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ReportingCategoryMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ReportingCategoryMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ReportingCategoryMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingCategoryMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGCATEGORYMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingCategoryMap");
    
    
    /**
     * Gets the "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGCATEGORYMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingCategoryMap" element
     */
    public void setReportingCategoryMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingCategoryMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGCATEGORYMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGCATEGORYMAP$0);
            }
            target.set(reportingCategoryMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGCATEGORYMAP$0);
            return target;
        }
    }
}
