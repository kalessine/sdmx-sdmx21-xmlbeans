/*
 * XML Type:  ReportStructureValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ReportStructureValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ReportStructureValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType
{
    private static final long serialVersionUID = 1L;
    
    public ReportStructureValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ID");
    private static final javax.xml.namespace.QName METADATAATTRIBUTEVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeValue");
    
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets array of all "MetadataAttributeValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType[] getMetadataAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAATTRIBUTEVALUE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataAttributeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType getMetadataAttributeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType)get_store().find_element_user(METADATAATTRIBUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataAttributeValue" element
     */
    public int sizeOfMetadataAttributeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAATTRIBUTEVALUE$2);
        }
    }
    
    /**
     * Sets array of all "MetadataAttributeValue" element
     */
    public void setMetadataAttributeValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType[] metadataAttributeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataAttributeValueArray, METADATAATTRIBUTEVALUE$2);
        }
    }
    
    /**
     * Sets ith "MetadataAttributeValue" element
     */
    public void setMetadataAttributeValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType metadataAttributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType)get_store().find_element_user(METADATAATTRIBUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataAttributeValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttributeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType insertNewMetadataAttributeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType)get_store().insert_element_user(METADATAATTRIBUTEVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttributeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType addNewMetadataAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeValueType)get_store().add_element_user(METADATAATTRIBUTEVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataAttributeValue" element
     */
    public void removeMetadataAttributeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAATTRIBUTEVALUE$2, i);
        }
    }
}
