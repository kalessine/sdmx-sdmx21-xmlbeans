/*
 * XML Type:  DataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML DataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class DataSourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType
{
    private static final long serialVersionUID = 1L;
    
    public DataSourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEDATASOURCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SimpleDataSource");
    private static final javax.xml.namespace.QName QUERYABLEDATASOURCE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "QueryableDataSource");
    
    
    /**
     * Gets array of all "SimpleDataSource" elements
     */
    public java.lang.String[] getSimpleDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIMPLEDATASOURCE$0, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$0, i);
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
            get_store().find_all_element_users(SIMPLEDATASOURCE$0, targetList);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$0, i);
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
            return get_store().count_elements(SIMPLEDATASOURCE$0);
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
            arraySetterHelper(simpleDataSourceArray, SIMPLEDATASOURCE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEDATASOURCE$0, i);
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
            arraySetterHelper(simpleDataSourceArray, SIMPLEDATASOURCE$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SIMPLEDATASOURCE$0, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SIMPLEDATASOURCE$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEDATASOURCE$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(SIMPLEDATASOURCE$0, i);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SIMPLEDATASOURCE$0);
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
            get_store().remove_element(SIMPLEDATASOURCE$0, i);
        }
    }
    
    /**
     * Gets array of all "QueryableDataSource" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType[] getQueryableDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYABLEDATASOURCE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryableDataSource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType getQueryableDataSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType)get_store().find_element_user(QUERYABLEDATASOURCE$2, i);
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
            return get_store().count_elements(QUERYABLEDATASOURCE$2);
        }
    }
    
    /**
     * Sets array of all "QueryableDataSource" element
     */
    public void setQueryableDataSourceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType[] queryableDataSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryableDataSourceArray, QUERYABLEDATASOURCE$2);
        }
    }
    
    /**
     * Sets ith "QueryableDataSource" element
     */
    public void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType queryableDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType)get_store().find_element_user(QUERYABLEDATASOURCE$2, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType insertNewQueryableDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType)get_store().insert_element_user(QUERYABLEDATASOURCE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType addNewQueryableDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType)get_store().add_element_user(QUERYABLEDATASOURCE$2);
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
            get_store().remove_element(QUERYABLEDATASOURCE$2, i);
        }
    }
}
