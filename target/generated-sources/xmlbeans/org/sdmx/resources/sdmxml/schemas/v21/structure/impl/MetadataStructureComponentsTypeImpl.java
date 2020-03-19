/*
 * XML Type:  MetadataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MetadataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MetadataStructureComponentsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MetadataStructureComponentsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureComponentsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataTarget");
    private static final javax.xml.namespace.QName REPORTSTRUCTURE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportStructure");
    
    
    /**
     * Gets array of all "MetadataTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType[] getMetadataTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATARGET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType getMetadataTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().find_element_user(METADATATARGET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataTarget" element
     */
    public int sizeOfMetadataTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATARGET$0);
        }
    }
    
    /**
     * Sets array of all "MetadataTarget" element
     */
    public void setMetadataTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType[] metadataTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataTargetArray, METADATATARGET$0);
        }
    }
    
    /**
     * Sets ith "MetadataTarget" element
     */
    public void setMetadataTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType metadataTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().find_element_user(METADATATARGET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType insertNewMetadataTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().insert_element_user(METADATATARGET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType addNewMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().add_element_user(METADATATARGET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataTarget" element
     */
    public void removeMetadataTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATARGET$0, i);
        }
    }
    
    /**
     * Gets array of all "ReportStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType[] getReportStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTSTRUCTURE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType getReportStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().find_element_user(REPORTSTRUCTURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportStructure" element
     */
    public int sizeOfReportStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSTRUCTURE$2);
        }
    }
    
    /**
     * Sets array of all "ReportStructure" element
     */
    public void setReportStructureArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType[] reportStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportStructureArray, REPORTSTRUCTURE$2);
        }
    }
    
    /**
     * Sets ith "ReportStructure" element
     */
    public void setReportStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType reportStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().find_element_user(REPORTSTRUCTURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType insertNewReportStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().insert_element_user(REPORTSTRUCTURE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType addNewReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType)get_store().add_element_user(REPORTSTRUCTURE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportStructure" element
     */
    public void removeReportStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSTRUCTURE$2, i);
        }
    }
}
