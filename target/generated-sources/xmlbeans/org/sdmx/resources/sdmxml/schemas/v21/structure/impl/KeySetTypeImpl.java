/*
 * XML Type:  KeySetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.KeySetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML KeySetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class KeySetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.KeySetType
{
    private static final long serialVersionUID = 1L;
    
    public KeySetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Key");
    private static final javax.xml.namespace.QName ISINCLUDED$2 = 
        new javax.xml.namespace.QName("", "isIncluded");
    
    
    /**
     * Gets array of all "Key" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType[] getKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType getKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType)get_store().find_element_user(KEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Key" element
     */
    public int sizeOfKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEY$0);
        }
    }
    
    /**
     * Sets array of all "Key" element
     */
    public void setKeyArray(org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType[] keyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyArray, KEY$0);
        }
    }
    
    /**
     * Sets ith "Key" element
     */
    public void setKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType)get_store().find_element_user(KEY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(key);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType insertNewKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType)get_store().insert_element_user(KEY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Key" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType addNewKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DistinctKeyType)get_store().add_element_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Key" element
     */
    public void removeKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEY$0, i);
        }
    }
    
    /**
     * Gets the "isIncluded" attribute
     */
    public boolean getIsIncluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isIncluded" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsIncluded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$2);
            return target;
        }
    }
    
    /**
     * Sets the "isIncluded" attribute
     */
    public void setIsIncluded(boolean isIncluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINCLUDED$2);
            }
            target.setBooleanValue(isIncluded);
        }
    }
    
    /**
     * Sets (as xml) the "isIncluded" attribute
     */
    public void xsetIsIncluded(org.apache.xmlbeans.XmlBoolean isIncluded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUDED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINCLUDED$2);
            }
            target.set(isIncluded);
        }
    }
}
