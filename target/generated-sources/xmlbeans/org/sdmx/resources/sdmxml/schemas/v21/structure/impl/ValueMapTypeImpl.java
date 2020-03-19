/*
 * XML Type:  ValueMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ValueMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ValueMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType
{
    private static final long serialVersionUID = 1L;
    
    public ValueMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUEMAPPING$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ValueMapping");
    
    
    /**
     * Gets array of all "ValueMapping" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType[] getValueMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUEMAPPING$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ValueMapping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType getValueMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType)get_store().find_element_user(VALUEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ValueMapping" element
     */
    public int sizeOfValueMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEMAPPING$0);
        }
    }
    
    /**
     * Sets array of all "ValueMapping" element
     */
    public void setValueMappingArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType[] valueMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueMappingArray, VALUEMAPPING$0);
        }
    }
    
    /**
     * Sets ith "ValueMapping" element
     */
    public void setValueMappingArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType valueMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType)get_store().find_element_user(VALUEMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valueMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ValueMapping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType insertNewValueMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType)get_store().insert_element_user(VALUEMAPPING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ValueMapping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType addNewValueMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMappingType)get_store().add_element_user(VALUEMAPPING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ValueMapping" element
     */
    public void removeValueMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEMAPPING$0, i);
        }
    }
}
