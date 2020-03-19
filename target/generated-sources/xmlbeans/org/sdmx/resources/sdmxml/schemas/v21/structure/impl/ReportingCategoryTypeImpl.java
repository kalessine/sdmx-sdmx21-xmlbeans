/*
 * XML Type:  ReportingCategoryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportingCategoryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportingCategoryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ReportingCategoryBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingCategoryType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingCategoryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURALMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "StructuralMetadata");
    private static final javax.xml.namespace.QName PROVISIONINGMETADATA$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ProvisioningMetadata");
    
    
    /**
     * Gets array of all "StructuralMetadata" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType[] getStructuralMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURALMETADATA$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructuralMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType getStructuralMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType)get_store().find_element_user(STRUCTURALMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructuralMetadata" element
     */
    public int sizeOfStructuralMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURALMETADATA$0);
        }
    }
    
    /**
     * Sets array of all "StructuralMetadata" element
     */
    public void setStructuralMetadataArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType[] structuralMetadataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structuralMetadataArray, STRUCTURALMETADATA$0);
        }
    }
    
    /**
     * Sets ith "StructuralMetadata" element
     */
    public void setStructuralMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType structuralMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType)get_store().find_element_user(STRUCTURALMETADATA$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structuralMetadata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType insertNewStructuralMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType)get_store().insert_element_user(STRUCTURALMETADATA$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType addNewStructuralMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType)get_store().add_element_user(STRUCTURALMETADATA$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructuralMetadata" element
     */
    public void removeStructuralMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURALMETADATA$0, i);
        }
    }
    
    /**
     * Gets array of all "ProvisioningMetadata" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType[] getProvisioningMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONINGMETADATA$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisioningMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType getProvisioningMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().find_element_user(PROVISIONINGMETADATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProvisioningMetadata" element
     */
    public int sizeOfProvisioningMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONINGMETADATA$2);
        }
    }
    
    /**
     * Sets array of all "ProvisioningMetadata" element
     */
    public void setProvisioningMetadataArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType[] provisioningMetadataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisioningMetadataArray, PROVISIONINGMETADATA$2);
        }
    }
    
    /**
     * Sets ith "ProvisioningMetadata" element
     */
    public void setProvisioningMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType provisioningMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().find_element_user(PROVISIONINGMETADATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisioningMetadata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisioningMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType insertNewProvisioningMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().insert_element_user(PROVISIONINGMETADATA$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisioningMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType addNewProvisioningMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().add_element_user(PROVISIONINGMETADATA$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProvisioningMetadata" element
     */
    public void removeProvisioningMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONINGMETADATA$2, i);
        }
    }
}
