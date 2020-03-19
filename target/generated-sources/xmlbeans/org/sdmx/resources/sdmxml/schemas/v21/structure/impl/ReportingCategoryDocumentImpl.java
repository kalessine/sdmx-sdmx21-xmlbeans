/*
 * An XML document type.
 * Localname: ReportingCategory
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ReportingCategory(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ReportingCategoryDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGCATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingCategory");
    
    
    /**
     * Gets the "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType getReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().find_element_user(REPORTINGCATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportingCategory" element
     */
    public void setReportingCategory(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType reportingCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().find_element_user(REPORTINGCATEGORY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().add_element_user(REPORTINGCATEGORY$0);
            }
            target.set(reportingCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType addNewReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType)get_store().add_element_user(REPORTINGCATEGORY$0);
            return target;
        }
    }
}
