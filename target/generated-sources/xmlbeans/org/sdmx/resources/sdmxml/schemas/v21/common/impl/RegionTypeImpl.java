/*
 * XML Type:  RegionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.RegionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML RegionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class RegionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.RegionType
{
    private static final long serialVersionUID = 1L;
    
    public RegionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYVALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "KeyValue");
    private static final javax.xml.namespace.QName ATTRIBUTE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Attribute");
    private static final javax.xml.namespace.QName INCLUDE$4 = 
        new javax.xml.namespace.QName("", "include");
    
    
    /**
     * Gets array of all "KeyValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] getKeyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYVALUE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType getKeyValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().find_element_user(KEYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyValue" element
     */
    public int sizeOfKeyValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYVALUE$0);
        }
    }
    
    /**
     * Sets array of all "KeyValue" element
     */
    public void setKeyValueArray(org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] keyValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyValueArray, KEYVALUE$0);
        }
    }
    
    /**
     * Sets ith "KeyValue" element
     */
    public void setKeyValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType keyValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().find_element_user(KEYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType insertNewKeyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().insert_element_user(KEYVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType addNewKeyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().add_element_user(KEYVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyValue" element
     */
    public void removeKeyValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYVALUE$0, i);
        }
    }
    
    /**
     * Gets array of all "Attribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] getAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType getAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().find_element_user(ATTRIBUTE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Attribute" element
     */
    public int sizeOfAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$2);
        }
    }
    
    /**
     * Sets array of all "Attribute" element
     */
    public void setAttributeArray(org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType[] attributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeArray, ATTRIBUTE$2);
        }
    }
    
    /**
     * Sets ith "Attribute" element
     */
    public void setAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().find_element_user(ATTRIBUTE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType insertNewAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().insert_element_user(ATTRIBUTE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType)get_store().add_element_user(ATTRIBUTE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attribute" element
     */
    public void removeAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$2, i);
        }
    }
    
    /**
     * Gets the "include" attribute
     */
    public boolean getInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "include" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INCLUDE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "include" attribute
     */
    public boolean isSetInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUDE$4) != null;
        }
    }
    
    /**
     * Sets the "include" attribute
     */
    public void setInclude(boolean include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDE$4);
            }
            target.setBooleanValue(include);
        }
    }
    
    /**
     * Sets (as xml) the "include" attribute
     */
    public void xsetInclude(org.apache.xmlbeans.XmlBoolean include)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INCLUDE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INCLUDE$4);
            }
            target.set(include);
        }
    }
    
    /**
     * Unsets the "include" attribute
     */
    public void unsetInclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUDE$4);
        }
    }
}
