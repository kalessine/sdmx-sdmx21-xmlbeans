/*
 * XML Type:  MetadataAttributeWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataAttributeWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataAttributeWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.MetadataAttributeWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeWhere");
    
    
    /**
     * Gets array of all "MetadataAttributeWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[] getMetadataAttributeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAATTRIBUTEWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType getMetadataAttributeWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().find_element_user(METADATAATTRIBUTEWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataAttributeWhere" element
     */
    public int sizeOfMetadataAttributeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAATTRIBUTEWHERE$0);
        }
    }
    
    /**
     * Sets array of all "MetadataAttributeWhere" element
     */
    public void setMetadataAttributeWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[] metadataAttributeWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataAttributeWhereArray, METADATAATTRIBUTEWHERE$0);
        }
    }
    
    /**
     * Sets ith "MetadataAttributeWhere" element
     */
    public void setMetadataAttributeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType metadataAttributeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().find_element_user(METADATAATTRIBUTEWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataAttributeWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType insertNewMetadataAttributeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().insert_element_user(METADATAATTRIBUTEWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType addNewMetadataAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().add_element_user(METADATAATTRIBUTEWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataAttributeWhere" element
     */
    public void removeMetadataAttributeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAATTRIBUTEWHERE$0, i);
        }
    }
}
