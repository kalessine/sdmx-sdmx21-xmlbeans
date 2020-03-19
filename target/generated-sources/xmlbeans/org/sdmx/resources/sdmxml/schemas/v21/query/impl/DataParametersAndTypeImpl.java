/*
 * XML Type:  DataParametersAndType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataParametersAndType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataParametersAndTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.DataParametersTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType
{
    private static final long serialVersionUID = 1L;
    
    public DataParametersAndTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASETID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataSetID");
    private static final javax.xml.namespace.QName DATAPROVIDER$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataProvider");
    private static final javax.xml.namespace.QName DATASTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataStructure");
    private static final javax.xml.namespace.QName DATAFLOW$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Dataflow");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProvisionAgreement");
    private static final javax.xml.namespace.QName TIMEDIMENSIONVALUE$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionValue");
    private static final javax.xml.namespace.QName PRIMARYMEASUREVALUE$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureValue");
    private static final javax.xml.namespace.QName TIMEFORMAT$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeFormat");
    
    
    /**
     * Gets array of all "DataSetID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] getDataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASETID$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType getDataSetIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().find_element_user(DATASETID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataSetID" element
     */
    public int sizeOfDataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETID$0);
        }
    }
    
    /**
     * Sets array of all "DataSetID" element
     */
    public void setDataSetIDArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] dataSetIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetIDArray, DATASETID$0);
        }
    }
    
    /**
     * Sets ith "DataSetID" element
     */
    public void setDataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().find_element_user(DATASETID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSetID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType insertNewDataSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().insert_element_user(DATASETID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType addNewDataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().add_element_user(DATASETID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSetID" element
     */
    public void removeDataSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETID$0, i);
        }
    }
    
    /**
     * Gets array of all "DataProvider" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] getDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDER$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataProvider" element
     */
    public int sizeOfDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$2);
        }
    }
    
    /**
     * Sets array of all "DataProvider" element
     */
    public void setDataProviderArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] dataProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderArray, DATAPROVIDER$2);
        }
    }
    
    /**
     * Sets ith "DataProvider" element
     */
    public void setDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType insertNewDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().insert_element_user(DATAPROVIDER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProvider" element
     */
    public void removeDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$2, i);
        }
    }
    
    /**
     * Gets array of all "DataStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType[] getDataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASTRUCTURE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType getDataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().find_element_user(DATASTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataStructure" element
     */
    public int sizeOfDataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTRUCTURE$4);
        }
    }
    
    /**
     * Sets array of all "DataStructure" element
     */
    public void setDataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType[] dataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataStructureArray, DATASTRUCTURE$4);
        }
    }
    
    /**
     * Sets ith "DataStructure" element
     */
    public void setDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType dataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().find_element_user(DATASTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType insertNewDataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().insert_element_user(DATASTRUCTURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType addNewDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().add_element_user(DATASTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataStructure" element
     */
    public void removeDataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTRUCTURE$4, i);
        }
    }
    
    /**
     * Gets array of all "Dataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType[] getDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOW$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType getDataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().find_element_user(DATAFLOW$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dataflow" element
     */
    public int sizeOfDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOW$6);
        }
    }
    
    /**
     * Sets array of all "Dataflow" element
     */
    public void setDataflowArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType[] dataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowArray, DATAFLOW$6);
        }
    }
    
    /**
     * Sets ith "Dataflow" element
     */
    public void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().find_element_user(DATAFLOW$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType insertNewDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().insert_element_user(DATAFLOW$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType addNewDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().add_element_user(DATAFLOW$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dataflow" element
     */
    public void removeDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOW$6, i);
        }
    }
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] getProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENT$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    public int sizeOfProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENT$8);
        }
    }
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] provisionAgreementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$8);
        }
    }
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().insert_element_user(PROVISIONAGREEMENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    public void removeProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENT$8, i);
        }
    }
    
    /**
     * Gets array of all "TimeDimensionValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType[] getTimeDimensionValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEDIMENSIONVALUE$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TimeDimensionValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType getTimeDimensionValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().find_element_user(TIMEDIMENSIONVALUE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TimeDimensionValue" element
     */
    public int sizeOfTimeDimensionValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDIMENSIONVALUE$10);
        }
    }
    
    /**
     * Sets array of all "TimeDimensionValue" element
     */
    public void setTimeDimensionValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType[] timeDimensionValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeDimensionValueArray, TIMEDIMENSIONVALUE$10);
        }
    }
    
    /**
     * Sets ith "TimeDimensionValue" element
     */
    public void setTimeDimensionValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType timeDimensionValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().find_element_user(TIMEDIMENSIONVALUE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeDimensionValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeDimensionValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType insertNewTimeDimensionValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().insert_element_user(TIMEDIMENSIONVALUE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeDimensionValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType addNewTimeDimensionValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().add_element_user(TIMEDIMENSIONVALUE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "TimeDimensionValue" element
     */
    public void removeTimeDimensionValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDIMENSIONVALUE$10, i);
        }
    }
    
    /**
     * Gets array of all "PrimaryMeasureValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType[] getPrimaryMeasureValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRIMARYMEASUREVALUE$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PrimaryMeasureValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType getPrimaryMeasureValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().find_element_user(PRIMARYMEASUREVALUE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PrimaryMeasureValue" element
     */
    public int sizeOfPrimaryMeasureValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYMEASUREVALUE$12);
        }
    }
    
    /**
     * Sets array of all "PrimaryMeasureValue" element
     */
    public void setPrimaryMeasureValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType[] primaryMeasureValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(primaryMeasureValueArray, PRIMARYMEASUREVALUE$12);
        }
    }
    
    /**
     * Sets ith "PrimaryMeasureValue" element
     */
    public void setPrimaryMeasureValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType primaryMeasureValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().find_element_user(PRIMARYMEASUREVALUE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(primaryMeasureValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryMeasureValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType insertNewPrimaryMeasureValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().insert_element_user(PRIMARYMEASUREVALUE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryMeasureValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType addNewPrimaryMeasureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().add_element_user(PRIMARYMEASUREVALUE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "PrimaryMeasureValue" element
     */
    public void removePrimaryMeasureValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYMEASUREVALUE$12, i);
        }
    }
    
    /**
     * Gets array of all "TimeFormat" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum[] getTimeFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEFORMAT$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "TimeFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum getTimeFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMAT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "TimeFormat" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType[] xgetTimeFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEFORMAT$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "TimeFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType xgetTimeFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().find_element_user(TIMEFORMAT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)target;
        }
    }
    
    /**
     * Returns number of "TimeFormat" element
     */
    public int sizeOfTimeFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEFORMAT$14);
        }
    }
    
    /**
     * Sets array of all "TimeFormat" element
     */
    public void setTimeFormatArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum[] timeFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeFormatArray, TIMEFORMAT$14);
        }
    }
    
    /**
     * Sets ith "TimeFormat" element
     */
    public void setTimeFormatArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum timeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMAT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(timeFormat);
        }
    }
    
    /**
     * Sets (as xml) array of all "TimeFormat" element
     */
    public void xsetTimeFormatArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType[]timeFormatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeFormatArray, TIMEFORMAT$14);
        }
    }
    
    /**
     * Sets (as xml) ith "TimeFormat" element
     */
    public void xsetTimeFormatArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType timeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().find_element_user(TIMEFORMAT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeFormat);
        }
    }
    
    /**
     * Inserts the value as the ith "TimeFormat" element
     */
    public void insertTimeFormat(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum timeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TIMEFORMAT$14, i);
            target.setEnumValue(timeFormat);
        }
    }
    
    /**
     * Appends the value as the last "TimeFormat" element
     */
    public void addTimeFormat(org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum timeFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEFORMAT$14);
            target.setEnumValue(timeFormat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType insertNewTimeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().insert_element_user(TIMEFORMAT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType addNewTimeFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().add_element_user(TIMEFORMAT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "TimeFormat" element
     */
    public void removeTimeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEFORMAT$14, i);
        }
    }
}
