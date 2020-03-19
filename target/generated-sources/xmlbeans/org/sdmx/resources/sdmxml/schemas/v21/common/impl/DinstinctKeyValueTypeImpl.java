/*
 * XML Type:  DinstinctKeyValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DinstinctKeyValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML DinstinctKeyValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class DinstinctKeyValueTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.ComponentValueSetTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DinstinctKeyValueType
{
    private static final long serialVersionUID = 1L;
    
    public DinstinctKeyValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Value");
    private static final javax.xml.namespace.QName DATASET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataSet");
    private static final javax.xml.namespace.QName DATAKEY$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataKey");
    private static final javax.xml.namespace.QName OBJECT$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Object");
    
    
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
    
    /**
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getDataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(DATASET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataSet" element
     */
    public int sizeOfDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASET$2);
        }
    }
    
    /**
     * Sets array of all "DataSet" element
     */
    public void setDataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] dataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetArray, DATASET$2);
        }
    }
    
    /**
     * Sets ith "DataSet" element
     */
    public void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(DATASET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType insertNewDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().insert_element_user(DATASET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(DATASET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSet" element
     */
    public void removeDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASET$2, i);
        }
    }
    
    /**
     * Gets array of all "DataKey" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] getDataKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAKEY$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getDataKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().find_element_user(DATAKEY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataKey" element
     */
    public int sizeOfDataKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAKEY$4);
        }
    }
    
    /**
     * Sets array of all "DataKey" element
     */
    public void setDataKeyArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] dataKeyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataKeyArray, DATAKEY$4);
        }
    }
    
    /**
     * Sets ith "DataKey" element
     */
    public void setDataKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType dataKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().find_element_user(DATAKEY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType insertNewDataKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().insert_element_user(DATAKEY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewDataKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().add_element_user(DATAKEY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataKey" element
     */
    public void removeDataKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAKEY$4, i);
        }
    }
    
    /**
     * Gets array of all "Object" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] getObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECT$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Object" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(OBJECT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Object" element
     */
    public int sizeOfObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$6);
        }
    }
    
    /**
     * Sets array of all "Object" element
     */
    public void setObjectArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] objectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectArray, OBJECT$6);
        }
    }
    
    /**
     * Sets ith "Object" element
     */
    public void setObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(OBJECT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(object);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Object" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType insertNewObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().insert_element_user(OBJECT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Object" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(OBJECT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Object" element
     */
    public void removeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$6, i);
        }
    }
}
