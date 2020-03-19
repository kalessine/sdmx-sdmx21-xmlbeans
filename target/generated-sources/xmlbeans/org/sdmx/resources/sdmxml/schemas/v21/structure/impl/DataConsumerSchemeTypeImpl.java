/*
 * XML Type:  DataConsumerSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DataConsumerSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DataConsumerSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public DataConsumerSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATACONSUMER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataConsumer");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "DataConsumer" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType[] getDataConsumerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACONSUMER$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType getDataConsumerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().find_element_user(DATACONSUMER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataConsumer" element
     */
    public int sizeOfDataConsumerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSUMER$0);
        }
    }
    
    /**
     * Sets array of all "DataConsumer" element
     */
    public void setDataConsumerArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType[] dataConsumerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataConsumerArray, DATACONSUMER$0);
        }
    }
    
    /**
     * Sets ith "DataConsumer" element
     */
    public void setDataConsumerArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType dataConsumer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().find_element_user(DATACONSUMER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataConsumer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType insertNewDataConsumer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().insert_element_user(DATACONSUMER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType addNewDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().add_element_user(DATACONSUMER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataConsumer" element
     */
    public void removeDataConsumer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSUMER$0, i);
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
