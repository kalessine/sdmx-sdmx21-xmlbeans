/*
 * XML Type:  GenericDataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML GenericDataType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class GenericDataTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataType
{
    private static final long serialVersionUID = 1L;
    
    public GenericDataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataSet");
    
    
    /**
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType[] getDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType getDataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType)get_store().find_element_user(DATASET$0, i);
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
            return get_store().count_elements(DATASET$0);
        }
    }
    
    /**
     * Sets array of all "DataSet" element
     */
    public void setDataSetArray(org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType[] dataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetArray, DATASET$0);
        }
    }
    
    /**
     * Sets ith "DataSet" element
     */
    public void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType)get_store().find_element_user(DATASET$0, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType insertNewDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType)get_store().insert_element_user(DATASET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType addNewDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType)get_store().add_element_user(DATASET$0);
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
            get_store().remove_element(DATASET$0, i);
        }
    }
}
