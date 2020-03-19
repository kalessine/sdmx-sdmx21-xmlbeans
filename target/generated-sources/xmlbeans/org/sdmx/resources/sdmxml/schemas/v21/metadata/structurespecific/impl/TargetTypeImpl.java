/*
 * XML Type:  TargetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.TargetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.impl;
/**
 * An XML TargetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific).
 *
 * This is a complex type.
 */
public class TargetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.TargetType
{
    private static final long serialVersionUID = 1L;
    
    public TargetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCEVALUE$0 = 
        new javax.xml.namespace.QName("", "ReferenceValue");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "ReferenceValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType[] getReferenceValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCEVALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReferenceValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType getReferenceValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType)get_store().find_element_user(REFERENCEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReferenceValue" element
     */
    public int sizeOfReferenceValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEVALUE$0);
        }
    }
    
    /**
     * Sets array of all "ReferenceValue" element
     */
    public void setReferenceValueArray(org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType[] referenceValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(referenceValueArray, REFERENCEVALUE$0);
        }
    }
    
    /**
     * Sets ith "ReferenceValue" element
     */
    public void setReferenceValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType referenceValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType)get_store().find_element_user(REFERENCEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(referenceValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReferenceValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType insertNewReferenceValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType)get_store().insert_element_user(REFERENCEVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReferenceValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType addNewReferenceValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReferenceValueType)get_store().add_element_user(REFERENCEVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReferenceValue" element
     */
    public void removeReferenceValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEVALUE$0, i);
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
