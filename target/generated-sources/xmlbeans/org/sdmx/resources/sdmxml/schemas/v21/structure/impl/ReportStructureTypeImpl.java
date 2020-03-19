/*
 * XML Type:  ReportStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportStructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ReportStructureBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType
{
    private static final long serialVersionUID = 1L;
    
    public ReportStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataTarget");
    
    
    /**
     * Gets array of all "MetadataTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType[] getMetadataTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATARGET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType getMetadataTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType)get_store().find_element_user(METADATATARGET$0, i);
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
    public void setMetadataTargetArray(org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType[] metadataTargetArray)
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
    public void setMetadataTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType metadataTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType)get_store().find_element_user(METADATATARGET$0, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType insertNewMetadataTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType)get_store().insert_element_user(METADATATARGET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType addNewMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataTargetReferenceType)get_store().add_element_user(METADATATARGET$0);
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
}
