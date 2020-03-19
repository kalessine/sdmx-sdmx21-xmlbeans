/*
 * XML Type:  MetadataflowsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MetadataflowsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MetadataflowsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataflowsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAFLOW$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Metadataflow");
    
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType[] getMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOW$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType getMetadataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType)get_store().find_element_user(METADATAFLOW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Metadataflow" element
     */
    public int sizeOfMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOW$0);
        }
    }
    
    /**
     * Sets array of all "Metadataflow" element
     */
    public void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType[] metadataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowArray, METADATAFLOW$0);
        }
    }
    
    /**
     * Sets ith "Metadataflow" element
     */
    public void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType)get_store().find_element_user(METADATAFLOW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType insertNewMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType)get_store().insert_element_user(METADATAFLOW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowType)get_store().add_element_user(METADATAFLOW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Metadataflow" element
     */
    public void removeMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOW$0, i);
        }
    }
}
