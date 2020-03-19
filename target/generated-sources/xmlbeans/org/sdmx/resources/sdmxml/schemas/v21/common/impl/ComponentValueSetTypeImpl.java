/*
 * XML Type:  ComponentValueSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML ComponentValueSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class ComponentValueSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentValueSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName TIMERANGE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "TimeRange");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName INCLUDE$12 = 
        new javax.xml.namespace.QName("", "include");
    
    
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
    
    /**
     * Gets the "TimeRange" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getTimeRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(TIMERANGE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeRange" element
     */
    public boolean isSetTimeRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMERANGE$8) != 0;
        }
    }
    
    /**
     * Sets the "TimeRange" element
     */
    public void setTimeRange(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType timeRange)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(TIMERANGE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(TIMERANGE$8);
            }
            target.set(timeRange);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeRange" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewTimeRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(TIMERANGE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeRange" element
     */
    public void unsetTimeRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMERANGE$8, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "include" attribute
     */
    public boolean getInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDE$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "include" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "include" attribute
     */
    public boolean isSetInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUDE$12) != null;
        }
    }
    
    /**
     * Sets the "include" attribute
     */
    public void setInclude(boolean include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDE$12);
            }
            target.setBooleanValue(include);
        }
    }
    
    /**
     * Sets (as xml) the "include" attribute
     */
    public void xsetInclude(org.apache.xmlbeans.XmlBoolean include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDE$12);
            }
            target.set(include);
        }
    }
    
    /**
     * Unsets the "include" attribute
     */
    public void unsetInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUDE$12);
        }
    }
}
