/*
 * XML Type:  ContentConstraintAttachmentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ContentConstraintAttachmentType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ContentConstraintAttachmentTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ConstraintAttachmentTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType
{
    private static final long serialVersionUID = 1L;
    
    public ContentConstraintAttachmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataSet");
    private static final javax.xml.namespace.QName METADATASET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataSet");
    private static final javax.xml.namespace.QName SIMPLEDATASOURCE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "SimpleDataSource");
    
    
    /**
     * Gets array of all "DataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASET$0, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(DATASET$0, i);
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
    public void setDataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] dataSetArray)
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
    public void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType dataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(DATASET$0, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().insert_element_user(DATASET$0, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(DATASET$0);
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
    
    /**
     * Gets array of all "MetadataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getMetadataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASET$2, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(METADATASET$2, i);
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
            return get_store().count_elements(METADATASET$2);
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
            arraySetterHelper(metadataSetArray, METADATASET$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(METADATASET$2, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().insert_element_user(METADATASET$2, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(METADATASET$2);
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
            get_store().remove_element(METADATASET$2, i);
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
            get_store().find_all_element_users(SIMPLEDATASOURCE$4, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$4, i);
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
            get_store().find_all_element_users(SIMPLEDATASOURCE$4, targetList);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$4, i);
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
            return get_store().count_elements(SIMPLEDATASOURCE$4);
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
            arraySetterHelper(simpleDataSourceArray, SIMPLEDATASOURCE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$4, i);
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
            arraySetterHelper(simpleDataSourceArray, SIMPLEDATASOURCE$4);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$4, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SIMPLEDATASOURCE$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEDATASOURCE$4);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(SIMPLEDATASOURCE$4, i);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SIMPLEDATASOURCE$4);
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
            get_store().remove_element(SIMPLEDATASOURCE$4, i);
        }
    }
}
