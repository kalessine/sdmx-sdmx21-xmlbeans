/*
 * XML Type:  DistinctKeyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML DistinctKeyType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class DistinctKeyTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.RegionTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType
{
    private static final long serialVersionUID = 1L;
    
    public DistinctKeyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "KeyValue");
    
    
    /**
     * Gets array of all "KeyValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] getKeyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType getKeyValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().find_element_user(KEYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValue" element
     */
    public int sizeOfKeyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUE$0);
        }
    }
    
    /**
     * Sets array of all "KeyValue" element
     */
    public void setKeyValueArray(org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] keyValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyValueArray, KEYVALUE$0);
        }
    }
    
    /**
     * Sets ith "KeyValue" element
     */
    public void setKeyValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType keyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().find_element_user(KEYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType insertNewKeyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().insert_element_user(KEYVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType addNewKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().add_element_user(KEYVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValue" element
     */
    public void removeKeyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUE$0, i);
        }
    }
}
