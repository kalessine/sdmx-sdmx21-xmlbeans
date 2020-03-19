/*
 * XML Type:  MetadataStructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MetadataStructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MetadataStructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructuresTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataStructure");
    
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType[] getMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType getMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType)get_store().find_element_user(METADATASTRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructure" element
     */
    public int sizeOfMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$0);
        }
    }
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    public void setMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType[] metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$0);
        }
    }
    
    /**
     * Sets ith "MetadataStructure" element
     */
    public void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType)get_store().find_element_user(METADATASTRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType insertNewMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType)get_store().insert_element_user(METADATASTRUCTURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType)get_store().add_element_user(METADATASTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    public void removeMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$0, i);
        }
    }
}
