/*
 * XML Type:  TimeDimensionValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML TimeDimensionValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class TimeDimensionValueTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.DataStructureComponentValueQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType
{
    private static final long serialVersionUID = 1L;
    
    public TimeDimensionValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ID");
    private static final javax.xml.namespace.QName TIMEVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeValue");
    
    
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
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
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
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets array of all "TimeValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType[] getTimeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEVALUE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TimeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType getTimeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().find_element_user(TIMEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TimeValue" element
     */
    public int sizeOfTimeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEVALUE$2);
        }
    }
    
    /**
     * Sets array of all "TimeValue" element
     */
    public void setTimeValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType[] timeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeValueArray, TIMEVALUE$2);
        }
    }
    
    /**
     * Sets ith "TimeValue" element
     */
    public void setTimeValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType timeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().find_element_user(TIMEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType insertNewTimeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().insert_element_user(TIMEVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType addNewTimeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().add_element_user(TIMEVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TimeValue" element
     */
    public void removeTimeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEVALUE$2, i);
        }
    }
}
