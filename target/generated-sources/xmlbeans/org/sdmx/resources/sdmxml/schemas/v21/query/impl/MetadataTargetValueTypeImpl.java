/*
 * XML Type:  MetadataTargetValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataTargetValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataTargetValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataTargetValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ID");
    private static final javax.xml.namespace.QName TARGETOBJECTVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectValue");
    
    
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
     * Gets array of all "TargetObjectValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType[] getTargetObjectValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGETOBJECTVALUE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TargetObjectValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType getTargetObjectValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType)get_store().find_element_user(TARGETOBJECTVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TargetObjectValue" element
     */
    public int sizeOfTargetObjectValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETOBJECTVALUE$2);
        }
    }
    
    /**
     * Sets array of all "TargetObjectValue" element
     */
    public void setTargetObjectValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType[] targetObjectValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetObjectValueArray, TARGETOBJECTVALUE$2);
        }
    }
    
    /**
     * Sets ith "TargetObjectValue" element
     */
    public void setTargetObjectValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType targetObjectValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType)get_store().find_element_user(TARGETOBJECTVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetObjectValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetObjectValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType insertNewTargetObjectValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType)get_store().insert_element_user(TARGETOBJECTVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TargetObjectValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType addNewTargetObjectValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType)get_store().add_element_user(TARGETOBJECTVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TargetObjectValue" element
     */
    public void removeTargetObjectValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETOBJECTVALUE$2, i);
        }
    }
}
