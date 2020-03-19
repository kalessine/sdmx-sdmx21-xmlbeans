/*
 * XML Type:  ReportingTaxonomiesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportingTaxonomiesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportingTaxonomiesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingTaxonomiesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGTAXONOMY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingTaxonomy");
    
    
    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType[] getReportingTaxonomyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType getReportingTaxonomyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType)get_store().find_element_user(REPORTINGTAXONOMY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingTaxonomy" element
     */
    public int sizeOfReportingTaxonomyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMY$0);
        }
    }
    
    /**
     * Sets array of all "ReportingTaxonomy" element
     */
    public void setReportingTaxonomyArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType[] reportingTaxonomyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyArray, REPORTINGTAXONOMY$0);
        }
    }
    
    /**
     * Sets ith "ReportingTaxonomy" element
     */
    public void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType reportingTaxonomy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType)get_store().find_element_user(REPORTINGTAXONOMY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingTaxonomy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType insertNewReportingTaxonomy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType)get_store().insert_element_user(REPORTINGTAXONOMY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType addNewReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyType)get_store().add_element_user(REPORTINGTAXONOMY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    public void removeReportingTaxonomy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMY$0, i);
        }
    }
}
