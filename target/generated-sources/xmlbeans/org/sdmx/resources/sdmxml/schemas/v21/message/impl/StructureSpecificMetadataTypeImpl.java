/*
 * XML Type:  StructureSpecificMetadataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML StructureSpecificMetadataType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class StructureSpecificMetadataTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "MetadataSet");
    
    
    /**
     * Gets array of all "MetadataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType[] getMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType getMetadataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType)get_store().find_element_user(METADATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataSet" element
     */
    public int sizeOfMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASET$0);
        }
    }
    
    /**
     * Sets array of all "MetadataSet" element
     */
    public void setMetadataSetArray(org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType[] metadataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSetArray, METADATASET$0);
        }
    }
    
    /**
     * Sets ith "MetadataSet" element
     */
    public void setMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType)get_store().find_element_user(METADATASET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType insertNewMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType)get_store().insert_element_user(METADATASET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType addNewMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType)get_store().add_element_user(METADATASET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataSet" element
     */
    public void removeMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASET$0, i);
        }
    }
}
