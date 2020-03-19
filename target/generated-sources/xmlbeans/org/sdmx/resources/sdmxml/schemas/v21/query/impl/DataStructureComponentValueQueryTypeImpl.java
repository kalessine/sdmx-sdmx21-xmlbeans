/*
 * XML Type:  DataStructureComponentValueQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataStructureComponentValueQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataStructureComponentValueQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureComponentValueQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ID");
    private static final javax.xml.namespace.QName NUMERICVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "NumericValue");
    private static final javax.xml.namespace.QName TEXTVALUE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TextValue");
    private static final javax.xml.namespace.QName TIMEVALUE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeValue");
    private static final javax.xml.namespace.QName VALUE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Value");
    
    
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
     * Gets array of all "NumericValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType[] getNumericValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NUMERICVALUE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NumericValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType getNumericValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().find_element_user(NUMERICVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NumericValue" element
     */
    public int sizeOfNumericValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMERICVALUE$2);
        }
    }
    
    /**
     * Sets array of all "NumericValue" element
     */
    public void setNumericValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType[] numericValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(numericValueArray, NUMERICVALUE$2);
        }
    }
    
    /**
     * Sets ith "NumericValue" element
     */
    public void setNumericValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType numericValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().find_element_user(NUMERICVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(numericValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NumericValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType insertNewNumericValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().insert_element_user(NUMERICVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NumericValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType addNewNumericValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().add_element_user(NUMERICVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "NumericValue" element
     */
    public void removeNumericValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMERICVALUE$2, i);
        }
    }
    
    /**
     * Gets array of all "TextValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] getTextValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTVALUE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getTextValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXTVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TextValue" element
     */
    public int sizeOfTextValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTVALUE$4);
        }
    }
    
    /**
     * Sets array of all "TextValue" element
     */
    public void setTextValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] textValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textValueArray, TEXTVALUE$4);
        }
    }
    
    /**
     * Sets ith "TextValue" element
     */
    public void setTextValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType textValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXTVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType insertNewTextValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().insert_element_user(TEXTVALUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewTextValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(TEXTVALUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "TextValue" element
     */
    public void removeTextValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTVALUE$4, i);
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
            get_store().find_all_element_users(TIMEVALUE$6, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().find_element_user(TIMEVALUE$6, i);
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
            return get_store().count_elements(TIMEVALUE$6);
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
            arraySetterHelper(timeValueArray, TIMEVALUE$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().find_element_user(TIMEVALUE$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().insert_element_user(TIMEVALUE$6, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().add_element_user(TIMEVALUE$6);
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
            get_store().remove_element(TIMEVALUE$6, i);
        }
    }
    
    /**
     * Gets the "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$8) != 0;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().add_element_user(VALUE$8);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().add_element_user(VALUE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$8, 0);
        }
    }
}
