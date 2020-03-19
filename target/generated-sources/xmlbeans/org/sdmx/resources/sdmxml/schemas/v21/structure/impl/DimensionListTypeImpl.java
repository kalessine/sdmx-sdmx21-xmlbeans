/*
 * XML Type:  DimensionListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DimensionListType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DimensionListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.DimensionListBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType
{
    private static final long serialVersionUID = 1L;
    
    public DimensionListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dimension");
    private static final javax.xml.namespace.QName MEASUREDIMENSION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureDimension");
    private static final javax.xml.namespace.QName TIMEDIMENSION$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "TimeDimension");
    
    
    /**
     * Gets array of all "Dimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$0);
        }
    }
    
    /**
     * Sets array of all "Dimension" element
     */
    public void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType[] dimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionArray, DIMENSION$0);
        }
    }
    
    /**
     * Sets ith "Dimension" element
     */
    public void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().insert_element_user(DIMENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().add_element_user(DIMENSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$0, i);
        }
    }
    
    /**
     * Gets array of all "MeasureDimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType[] getMeasureDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASUREDIMENSION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType getMeasureDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().find_element_user(MEASUREDIMENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MeasureDimension" element
     */
    public int sizeOfMeasureDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDIMENSION$2);
        }
    }
    
    /**
     * Sets array of all "MeasureDimension" element
     */
    public void setMeasureDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType[] measureDimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureDimensionArray, MEASUREDIMENSION$2);
        }
    }
    
    /**
     * Sets ith "MeasureDimension" element
     */
    public void setMeasureDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType measureDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().find_element_user(MEASUREDIMENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measureDimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType insertNewMeasureDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().insert_element_user(MEASUREDIMENSION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType addNewMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().add_element_user(MEASUREDIMENSION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MeasureDimension" element
     */
    public void removeMeasureDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDIMENSION$2, i);
        }
    }
    
    /**
     * Gets array of all "TimeDimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType[] getTimeDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEDIMENSION$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType getTimeDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().find_element_user(TIMEDIMENSION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TimeDimension" element
     */
    public int sizeOfTimeDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDIMENSION$4);
        }
    }
    
    /**
     * Sets array of all "TimeDimension" element
     */
    public void setTimeDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType[] timeDimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeDimensionArray, TIMEDIMENSION$4);
        }
    }
    
    /**
     * Sets ith "TimeDimension" element
     */
    public void setTimeDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType timeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().find_element_user(TIMEDIMENSION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeDimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType insertNewTimeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().insert_element_user(TIMEDIMENSION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType addNewTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().add_element_user(TIMEDIMENSION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "TimeDimension" element
     */
    public void removeTimeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDIMENSION$4, i);
        }
    }
}
