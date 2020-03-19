/*
 * An XML document type.
 * Localname: ReportStructure
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ReportStructure(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ReportStructureDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportStructure");
    
    
    /**
     * Gets the "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType getReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().find_element_user(REPORTSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReportStructure" element
     */
    public void setReportStructure(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType reportStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().find_element_user(REPORTSTRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().add_element_user(REPORTSTRUCTURE$0);
            }
            target.set(reportStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType addNewReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().add_element_user(REPORTSTRUCTURE$0);
            return target;
        }
    }
}
