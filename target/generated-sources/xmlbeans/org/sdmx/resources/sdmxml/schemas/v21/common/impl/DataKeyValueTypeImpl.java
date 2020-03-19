/*
 * XML Type:  DataKeyValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML DataKeyValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class DataKeyValueTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.DinstinctKeyValueTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyValueType
{
    private static final long serialVersionUID = 1L;
    
    public DataKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Value");
    
    
    /**
     * Gets array of all "Value" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0);
        }
    }
    
    /**
     * Sets array of all "Value" element
     */
    public void setValueArray(org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$0);
        }
    }
    
    /**
     * Sets ith "Value" element
     */
    public void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType)get_store().find_element_user(VALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType)get_store().insert_element_user(VALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, i);
        }
    }
}
