/*
 * XML Type:  ConstraintAttachmentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConstraintAttachmentType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConstraintAttachmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintAttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROVIDER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataProvider");
    private static final javax.xml.namespace.QName DATASET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataSet");
    private static final javax.xml.namespace.QName METADATASET$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataSet");
    private static final javax.xml.namespace.QName SIMPLEDATASOURCE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "SimpleDataSource");
    private static final javax.xml.namespace.QName DATASTRUCTURE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataStructure");
    private static final javax.xml.namespace.QName QUERYABLEDATASOURCE$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "QueryableDataSource");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataStructure");
    private static final javax.xml.namespace.QName DATAFLOW$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dataflow");
    private static final javax.xml.namespace.QName METADATAFLOW$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Metadataflow");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ProvisionAgreement");
    
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProvider" element
     */
    public boolean isSetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$0) != 0;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$0);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataProvider" element
     */
    public void unsetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$0, 0);
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
     * Gets array of all "MetadataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getMetadataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(METADATASET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataSet" element
     */
    public int sizeOfMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASET$4);
        }
    }
    
    /**
     * Sets array of all "MetadataSet" element
     */
    public void setMetadataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] metadataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSetArray, METADATASET$4);
        }
    }
    
    /**
     * Sets ith "MetadataSet" element
     */
    public void setMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(METADATASET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType insertNewMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().insert_element_user(METADATASET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(METADATASET$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataSet" element
     */
    public void removeMetadataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASET$4, i);
        }
    }
    
    /**
     * Gets array of all "SimpleDataSource" elements
     */
    public java.lang.String[] getSimpleDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIMPLEDATASOURCE$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SimpleDataSource" element
     */
    public java.lang.String getSimpleDataSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SimpleDataSource" elements
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetSimpleDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIMPLEDATASOURCE$6, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SimpleDataSource" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSimpleDataSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlAnyURI)target;
        }
    }
    
    /**
     * Returns number of "SimpleDataSource" element
     */
    public int sizeOfSimpleDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIMPLEDATASOURCE$6);
        }
    }
    
    /**
     * Sets array of all "SimpleDataSource" element
     */
    public void setSimpleDataSourceArray(java.lang.String[] simpleDataSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(simpleDataSourceArray, SIMPLEDATASOURCE$6);
        }
    }
    
    /**
     * Sets ith "SimpleDataSource" element
     */
    public void setSimpleDataSourceArray(int i, java.lang.String simpleDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(simpleDataSource);
        }
    }
    
    /**
     * Sets (as xml) array of all "SimpleDataSource" element
     */
    public void xsetSimpleDataSourceArray(org.apache.xmlbeans.XmlAnyURI[]simpleDataSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(simpleDataSourceArray, SIMPLEDATASOURCE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "SimpleDataSource" element
     */
    public void xsetSimpleDataSourceArray(int i, org.apache.xmlbeans.XmlAnyURI simpleDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(simpleDataSource);
        }
    }
    
    /**
     * Inserts the value as the ith "SimpleDataSource" element
     */
    public void insertSimpleDataSource(int i, java.lang.String simpleDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SIMPLEDATASOURCE$6, i);
            target.setStringValue(simpleDataSource);
        }
    }
    
    /**
     * Appends the value as the last "SimpleDataSource" element
     */
    public void addSimpleDataSource(java.lang.String simpleDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEDATASOURCE$6);
            target.setStringValue(simpleDataSource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleDataSource" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewSimpleDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(SIMPLEDATASOURCE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleDataSource" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewSimpleDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SIMPLEDATASOURCE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "SimpleDataSource" element
     */
    public void removeSimpleDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIMPLEDATASOURCE$6, i);
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
            get_store().find_all_element_users(DATASTRUCTURE$8, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().find_element_user(DATASTRUCTURE$8, i);
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
            return get_store().count_elements(DATASTRUCTURE$8);
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
            arraySetterHelper(dataStructureArray, DATASTRUCTURE$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().find_element_user(DATASTRUCTURE$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().insert_element_user(DATASTRUCTURE$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType)get_store().add_element_user(DATASTRUCTURE$8);
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
            get_store().remove_element(DATASTRUCTURE$8, i);
        }
    }
    
    /**
     * Gets array of all "QueryableDataSource" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType[] getQueryableDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYABLEDATASOURCE$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryableDataSource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType getQueryableDataSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType)get_store().find_element_user(QUERYABLEDATASOURCE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QueryableDataSource" element
     */
    public int sizeOfQueryableDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYABLEDATASOURCE$10);
        }
    }
    
    /**
     * Sets array of all "QueryableDataSource" element
     */
    public void setQueryableDataSourceArray(org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType[] queryableDataSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryableDataSourceArray, QUERYABLEDATASOURCE$10);
        }
    }
    
    /**
     * Sets ith "QueryableDataSource" element
     */
    public void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType queryableDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType)get_store().find_element_user(QUERYABLEDATASOURCE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryableDataSource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType insertNewQueryableDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType)get_store().insert_element_user(QUERYABLEDATASOURCE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType addNewQueryableDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType)get_store().add_element_user(QUERYABLEDATASOURCE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "QueryableDataSource" element
     */
    public void removeQueryableDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYABLEDATASOURCE$10, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] getMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType getMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().find_element_user(METADATASTRUCTURE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructure" element
     */
    public int sizeOfMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$12);
        }
    }
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    public void setMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$12);
        }
    }
    
    /**
     * Sets ith "MetadataStructure" element
     */
    public void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().find_element_user(METADATASTRUCTURE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType insertNewMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().insert_element_user(METADATASTRUCTURE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().add_element_user(METADATASTRUCTURE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    public void removeMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$12, i);
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
            get_store().find_all_element_users(DATAFLOW$14, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().find_element_user(DATAFLOW$14, i);
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
            return get_store().count_elements(DATAFLOW$14);
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
            arraySetterHelper(dataflowArray, DATAFLOW$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().find_element_user(DATAFLOW$14, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().insert_element_user(DATAFLOW$14, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().add_element_user(DATAFLOW$14);
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
            get_store().remove_element(DATAFLOW$14, i);
        }
    }
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] getMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOW$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType getMetadataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().find_element_user(METADATAFLOW$16, i);
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
            return get_store().count_elements(METADATAFLOW$16);
        }
    }
    
    /**
     * Sets array of all "Metadataflow" element
     */
    public void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] metadataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowArray, METADATAFLOW$16);
        }
    }
    
    /**
     * Sets ith "Metadataflow" element
     */
    public void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().find_element_user(METADATAFLOW$16, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType insertNewMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().insert_element_user(METADATAFLOW$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().add_element_user(METADATAFLOW$16);
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
            get_store().remove_element(METADATAFLOW$16, i);
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
            get_store().find_all_element_users(PROVISIONAGREEMENT$18, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$18, i);
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
            return get_store().count_elements(PROVISIONAGREEMENT$18);
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
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$18, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().insert_element_user(PROVISIONAGREEMENT$18, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$18);
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
            get_store().remove_element(PROVISIONAGREEMENT$18, i);
        }
    }
}
