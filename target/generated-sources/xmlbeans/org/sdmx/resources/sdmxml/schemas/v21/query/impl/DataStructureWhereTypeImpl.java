/*
 * XML Type:  DataStructureWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataStructureWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataStructureWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.DataStructureWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttributeWhere");
    private static final javax.xml.namespace.QName DIMENSIONWHERE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DimensionWhere");
    private static final javax.xml.namespace.QName MEASUREDIMENSIONWHERE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MeasureDimensionWhere");
    private static final javax.xml.namespace.QName TIMEDIMENSIONWHERE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionWhere");
    private static final javax.xml.namespace.QName PRIMARYMEASUREWHERE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureWhere");
    
    
    /**
     * Gets array of all "AttributeWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType[] getAttributeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTEWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType getAttributeWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().find_element_user(ATTRIBUTEWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttributeWhere" element
     */
    public int sizeOfAttributeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEWHERE$0);
        }
    }
    
    /**
     * Sets array of all "AttributeWhere" element
     */
    public void setAttributeWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType[] attributeWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributeWhereArray, ATTRIBUTEWHERE$0);
        }
    }
    
    /**
     * Sets ith "AttributeWhere" element
     */
    public void setAttributeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType attributeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().find_element_user(ATTRIBUTEWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributeWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType insertNewAttributeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().insert_element_user(ATTRIBUTEWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType addNewAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().add_element_user(ATTRIBUTEWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttributeWhere" element
     */
    public void removeAttributeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEWHERE$0, i);
        }
    }
    
    /**
     * Gets array of all "DimensionWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] getDimensionWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSIONWHERE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType getDimensionWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(DIMENSIONWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DimensionWhere" element
     */
    public int sizeOfDimensionWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSIONWHERE$2);
        }
    }
    
    /**
     * Sets array of all "DimensionWhere" element
     */
    public void setDimensionWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] dimensionWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionWhereArray, DIMENSIONWHERE$2);
        }
    }
    
    /**
     * Sets ith "DimensionWhere" element
     */
    public void setDimensionWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType dimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(DIMENSIONWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimensionWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType insertNewDimensionWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().insert_element_user(DIMENSIONWHERE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType addNewDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().add_element_user(DIMENSIONWHERE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DimensionWhere" element
     */
    public void removeDimensionWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSIONWHERE$2, i);
        }
    }
    
    /**
     * Gets the "MeasureDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType getMeasureDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().find_element_user(MEASUREDIMENSIONWHERE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MeasureDimensionWhere" element
     */
    public boolean isSetMeasureDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDIMENSIONWHERE$4) != 0;
        }
    }
    
    /**
     * Sets the "MeasureDimensionWhere" element
     */
    public void setMeasureDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType measureDimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().find_element_user(MEASUREDIMENSIONWHERE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().add_element_user(MEASUREDIMENSIONWHERE$4);
            }
            target.set(measureDimensionWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType addNewMeasureDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().add_element_user(MEASUREDIMENSIONWHERE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "MeasureDimensionWhere" element
     */
    public void unsetMeasureDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDIMENSIONWHERE$4, 0);
        }
    }
    
    /**
     * Gets the "TimeDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType getTimeDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().find_element_user(TIMEDIMENSIONWHERE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeDimensionWhere" element
     */
    public boolean isSetTimeDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDIMENSIONWHERE$6) != 0;
        }
    }
    
    /**
     * Sets the "TimeDimensionWhere" element
     */
    public void setTimeDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType timeDimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().find_element_user(TIMEDIMENSIONWHERE$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().add_element_user(TIMEDIMENSIONWHERE$6);
            }
            target.set(timeDimensionWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType addNewTimeDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().add_element_user(TIMEDIMENSIONWHERE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeDimensionWhere" element
     */
    public void unsetTimeDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDIMENSIONWHERE$6, 0);
        }
    }
    
    /**
     * Gets the "PrimaryMeasureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType getPrimaryMeasureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().find_element_user(PRIMARYMEASUREWHERE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryMeasureWhere" element
     */
    public boolean isSetPrimaryMeasureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYMEASUREWHERE$8) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryMeasureWhere" element
     */
    public void setPrimaryMeasureWhere(org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType primaryMeasureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().find_element_user(PRIMARYMEASUREWHERE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().add_element_user(PRIMARYMEASUREWHERE$8);
            }
            target.set(primaryMeasureWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType addNewPrimaryMeasureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().add_element_user(PRIMARYMEASUREWHERE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryMeasureWhere" element
     */
    public void unsetPrimaryMeasureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYMEASUREWHERE$8, 0);
        }
    }
}
