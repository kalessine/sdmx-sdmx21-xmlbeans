/*
 * XML Type:  ValuesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.generic.impl;
/**
 * An XML ValuesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic).
 *
 * This is a complex type.
 */
public class ValuesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType
{
    private static final long serialVersionUID = 1L;
    
    public ValuesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Value");
    
    
    /**
     * Gets array of all "Value" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType)get_store().find_element_user(VALUE$0, i);
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
    public void setValueArray(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType[] valueArray)
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
    public void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType)get_store().find_element_user(VALUE$0, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType)get_store().insert_element_user(VALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ComponentValueType)get_store().add_element_user(VALUE$0);
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
