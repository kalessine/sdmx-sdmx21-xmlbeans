/*
 * XML Type:  DataParametersType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataParametersType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataParametersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersType
{
    private static final long serialVersionUID = 1L;
    
    public DataParametersTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CATEGORY$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Category");
    private static final javax.xml.namespace.QName UPDATED$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Updated");
    private static final javax.xml.namespace.QName CONCEPTVALUE$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptValue");
    private static final javax.xml.namespace.QName REPRESENTATIONVALUE$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "RepresentationValue");
    private static final javax.xml.namespace.QName DIMENSIONVALUE$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DimensionValue");
    private static final javax.xml.namespace.QName TIMEDIMENSIONVALUE$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionValue");
    private static final javax.xml.namespace.QName ATTRIBUTEVALUE$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttributeValue");
    private static final javax.xml.namespace.QName PRIMARYMEASUREVALUE$24 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureValue");
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$26 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachmentConstraint");
    private static final javax.xml.namespace.QName TIMEFORMAT$28 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeFormat");
    private static final javax.xml.namespace.QName OR$30 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Or");
    private static final javax.xml.namespace.QName AND$32 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "And");
    
    
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
     * Gets array of all "Category" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(CATEGORY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$10);
        }
    }
    
    /**
     * Sets array of all "Category" element
     */
    public void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$10);
        }
    }
    
    /**
     * Sets ith "Category" element
     */
    public void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(CATEGORY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().insert_element_user(CATEGORY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(CATEGORY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$10, i);
        }
    }
    
    /**
     * Gets array of all "Updated" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] getUpdatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATED$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Updated" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getUpdatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(UPDATED$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Updated" element
     */
    public int sizeOfUpdatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATED$12);
        }
    }
    
    /**
     * Sets array of all "Updated" element
     */
    public void setUpdatedArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] updatedArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(updatedArray, UPDATED$12);
        }
    }
    
    /**
     * Sets ith "Updated" element
     */
    public void setUpdatedArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(UPDATED$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(updated);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Updated" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType insertNewUpdated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().insert_element_user(UPDATED$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Updated" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(UPDATED$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Updated" element
     */
    public void removeUpdated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATED$12, i);
        }
    }
    
    /**
     * Gets array of all "ConceptValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] getConceptValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTVALUE$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType getConceptValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().find_element_user(CONCEPTVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptValue" element
     */
    public int sizeOfConceptValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTVALUE$14);
        }
    }
    
    /**
     * Sets array of all "ConceptValue" element
     */
    public void setConceptValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] conceptValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptValueArray, CONCEPTVALUE$14);
        }
    }
    
    /**
     * Sets ith "ConceptValue" element
     */
    public void setConceptValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType conceptValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().find_element_user(CONCEPTVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType insertNewConceptValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().insert_element_user(CONCEPTVALUE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType addNewConceptValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().add_element_user(CONCEPTVALUE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptValue" element
     */
    public void removeConceptValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTVALUE$14, i);
        }
    }
    
    /**
     * Gets array of all "RepresentationValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] getRepresentationValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPRESENTATIONVALUE$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RepresentationValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType getRepresentationValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().find_element_user(REPRESENTATIONVALUE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RepresentationValue" element
     */
    public int sizeOfRepresentationValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIONVALUE$16);
        }
    }
    
    /**
     * Sets array of all "RepresentationValue" element
     */
    public void setRepresentationValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] representationValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(representationValueArray, REPRESENTATIONVALUE$16);
        }
    }
    
    /**
     * Sets ith "RepresentationValue" element
     */
    public void setRepresentationValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType representationValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().find_element_user(REPRESENTATIONVALUE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representationValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType insertNewRepresentationValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().insert_element_user(REPRESENTATIONVALUE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType addNewRepresentationValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().add_element_user(REPRESENTATIONVALUE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "RepresentationValue" element
     */
    public void removeRepresentationValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIONVALUE$16, i);
        }
    }
    
    /**
     * Gets array of all "DimensionValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType[] getDimensionValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSIONVALUE$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DimensionValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType getDimensionValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType)get_store().find_element_user(DIMENSIONVALUE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DimensionValue" element
     */
    public int sizeOfDimensionValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSIONVALUE$18);
        }
    }
    
    /**
     * Sets array of all "DimensionValue" element
     */
    public void setDimensionValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType[] dimensionValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionValueArray, DIMENSIONVALUE$18);
        }
    }
    
    /**
     * Sets ith "DimensionValue" element
     */
    public void setDimensionValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType dimensionValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType)get_store().find_element_user(DIMENSIONVALUE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimensionValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType insertNewDimensionValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType)get_store().insert_element_user(DIMENSIONVALUE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType addNewDimensionValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionValueType)get_store().add_element_user(DIMENSIONVALUE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "DimensionValue" element
     */
    public void removeDimensionValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSIONVALUE$18, i);
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
            get_store().find_all_element_users(TIMEDIMENSIONVALUE$20, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().find_element_user(TIMEDIMENSIONVALUE$20, i);
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
            return get_store().count_elements(TIMEDIMENSIONVALUE$20);
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
            arraySetterHelper(timeDimensionValueArray, TIMEDIMENSIONVALUE$20);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().find_element_user(TIMEDIMENSIONVALUE$20, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().insert_element_user(TIMEDIMENSIONVALUE$20, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType)get_store().add_element_user(TIMEDIMENSIONVALUE$20);
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
            get_store().remove_element(TIMEDIMENSIONVALUE$20, i);
        }
    }
    
    /**
     * Gets array of all "AttributeValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType[] getAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEVALUE$22, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType getAttributeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType)get_store().find_element_user(ATTRIBUTEVALUE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttributeValue" element
     */
    public int sizeOfAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEVALUE$22);
        }
    }
    
    /**
     * Sets array of all "AttributeValue" element
     */
    public void setAttributeValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType[] attributeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeValueArray, ATTRIBUTEVALUE$22);
        }
    }
    
    /**
     * Sets ith "AttributeValue" element
     */
    public void setAttributeValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType)get_store().find_element_user(ATTRIBUTEVALUE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType insertNewAttributeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType)get_store().insert_element_user(ATTRIBUTEVALUE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType addNewAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeValueType)get_store().add_element_user(ATTRIBUTEVALUE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeValue" element
     */
    public void removeAttributeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEVALUE$22, i);
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
            get_store().find_all_element_users(PRIMARYMEASUREVALUE$24, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().find_element_user(PRIMARYMEASUREVALUE$24, i);
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
            return get_store().count_elements(PRIMARYMEASUREVALUE$24);
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
            arraySetterHelper(primaryMeasureValueArray, PRIMARYMEASUREVALUE$24);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().find_element_user(PRIMARYMEASUREVALUE$24, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().insert_element_user(PRIMARYMEASUREVALUE$24, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType)get_store().add_element_user(PRIMARYMEASUREVALUE$24);
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
            get_store().remove_element(PRIMARYMEASUREVALUE$24, i);
        }
    }
    
    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] getAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTCONSTRAINT$26, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getAttachmentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachmentConstraint" element
     */
    public int sizeOfAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTCONSTRAINT$26);
        }
    }
    
    /**
     * Sets array of all "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] attachmentConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentConstraintArray, ATTACHMENTCONSTRAINT$26);
        }
    }
    
    /**
     * Sets ith "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType insertNewAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().insert_element_user(ATTACHMENTCONSTRAINT$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(ATTACHMENTCONSTRAINT$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentConstraint" element
     */
    public void removeAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTCONSTRAINT$26, i);
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
            get_store().find_all_element_users(TIMEFORMAT$28, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMAT$28, i);
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
            get_store().find_all_element_users(TIMEFORMAT$28, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().find_element_user(TIMEFORMAT$28, i);
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
            return get_store().count_elements(TIMEFORMAT$28);
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
            arraySetterHelper(timeFormatArray, TIMEFORMAT$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEFORMAT$28, i);
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
            arraySetterHelper(timeFormatArray, TIMEFORMAT$28);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().find_element_user(TIMEFORMAT$28, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TIMEFORMAT$28, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEFORMAT$28);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().insert_element_user(TIMEFORMAT$28, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType)get_store().add_element_user(TIMEFORMAT$28);
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
            get_store().remove_element(TIMEFORMAT$28, i);
        }
    }
    
    /**
     * Gets array of all "Or" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType[] getOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OR$30, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType getOrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType)get_store().find_element_user(OR$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Or" element
     */
    public int sizeOfOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OR$30);
        }
    }
    
    /**
     * Sets array of all "Or" element
     */
    public void setOrArray(org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType[] orArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orArray, OR$30);
        }
    }
    
    /**
     * Sets ith "Or" element
     */
    public void setOrArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType or)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType)get_store().find_element_user(OR$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(or);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType insertNewOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType)get_store().insert_element_user(OR$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersOrType)get_store().add_element_user(OR$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "Or" element
     */
    public void removeOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OR$30, i);
        }
    }
    
    /**
     * Gets array of all "And" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType[] getAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AND$32, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType getAndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().find_element_user(AND$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "And" element
     */
    public int sizeOfAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AND$32);
        }
    }
    
    /**
     * Sets array of all "And" element
     */
    public void setAndArray(org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType[] andArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(andArray, AND$32);
        }
    }
    
    /**
     * Sets ith "And" element
     */
    public void setAndArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().find_element_user(AND$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(and);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType insertNewAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().insert_element_user(AND$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType addNewAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().add_element_user(AND$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "And" element
     */
    public void removeAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AND$32, i);
        }
    }
}
