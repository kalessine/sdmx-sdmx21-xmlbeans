/*
 * XML Type:  DataProviderSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DataProviderSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DataProviderSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public DataProviderSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROVIDER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataProvider");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "DataProvider" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType[] getDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDER$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType getDataProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().find_element_user(DATAPROVIDER$0, i);
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
            return get_store().count_elements(DATAPROVIDER$0);
        }
    }
    
    /**
     * Sets array of all "DataProvider" element
     */
    public void setDataProviderArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType[] dataProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderArray, DATAPROVIDER$0);
        }
    }
    
    /**
     * Sets ith "DataProvider" element
     */
    public void setDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().find_element_user(DATAPROVIDER$0, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType insertNewDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().insert_element_user(DATAPROVIDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().add_element_user(DATAPROVIDER$0);
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
            get_store().remove_element(DATAPROVIDER$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ID$2);
            }
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_default_attribute_value(ID$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
