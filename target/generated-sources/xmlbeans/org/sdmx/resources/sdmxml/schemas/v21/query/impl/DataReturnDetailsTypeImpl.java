/*
 * XML Type:  DataReturnDetailsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataReturnDetailsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataReturnDetailsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.DataReturnDetailsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public DataReturnDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIRSTNOBSERVATIONS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "FirstNObservations");
    private static final javax.xml.namespace.QName LASTNOBSERVATIONS$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "LastNObservations");
    private static final javax.xml.namespace.QName STRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Structure");
    private static final javax.xml.namespace.QName OBSERVATIONACTION$6 = 
        new javax.xml.namespace.QName("", "observationAction");
    
    
    /**
     * Gets the "FirstNObservations" element
     */
    public int getFirstNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNOBSERVATIONS$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "FirstNObservations" element
     */
    public org.apache.xmlbeans.XmlInt xgetFirstNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FIRSTNOBSERVATIONS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "FirstNObservations" element
     */
    public boolean isSetFirstNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIRSTNOBSERVATIONS$0) != 0;
        }
    }
    
    /**
     * Sets the "FirstNObservations" element
     */
    public void setFirstNObservations(int firstNObservations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIRSTNOBSERVATIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIRSTNOBSERVATIONS$0);
            }
            target.setIntValue(firstNObservations);
        }
    }
    
    /**
     * Sets (as xml) the "FirstNObservations" element
     */
    public void xsetFirstNObservations(org.apache.xmlbeans.XmlInt firstNObservations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FIRSTNOBSERVATIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FIRSTNOBSERVATIONS$0);
            }
            target.set(firstNObservations);
        }
    }
    
    /**
     * Unsets the "FirstNObservations" element
     */
    public void unsetFirstNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIRSTNOBSERVATIONS$0, 0);
        }
    }
    
    /**
     * Gets the "LastNObservations" element
     */
    public int getLastNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNOBSERVATIONS$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastNObservations" element
     */
    public org.apache.xmlbeans.XmlInt xgetLastNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LASTNOBSERVATIONS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastNObservations" element
     */
    public boolean isSetLastNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTNOBSERVATIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "LastNObservations" element
     */
    public void setLastNObservations(int lastNObservations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTNOBSERVATIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTNOBSERVATIONS$2);
            }
            target.setIntValue(lastNObservations);
        }
    }
    
    /**
     * Sets (as xml) the "LastNObservations" element
     */
    public void xsetLastNObservations(org.apache.xmlbeans.XmlInt lastNObservations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(LASTNOBSERVATIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(LASTNOBSERVATIONS$2);
            }
            target.set(lastNObservations);
        }
    }
    
    /**
     * Unsets the "LastNObservations" element
     */
    public void unsetLastNObservations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTNOBSERVATIONS$2, 0);
        }
    }
    
    /**
     * Gets array of all "Structure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType[] getStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType getStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType)get_store().find_element_user(STRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Structure" element
     */
    public int sizeOfStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$4);
        }
    }
    
    /**
     * Sets array of all "Structure" element
     */
    public void setStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType[] structureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureArray, STRUCTURE$4);
        }
    }
    
    /**
     * Sets ith "Structure" element
     */
    public void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType)get_store().find_element_user(STRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType insertNewStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType)get_store().insert_element_user(STRUCTURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureRequestType)get_store().add_element_user(STRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Structure" element
     */
    public void removeStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$4, i);
        }
    }
    
    /**
     * Gets the "observationAction" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType.Enum getObservationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBSERVATIONACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OBSERVATIONACTION$6);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "observationAction" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType xgetObservationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType)get_store().find_attribute_user(OBSERVATIONACTION$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType)get_default_attribute_value(OBSERVATIONACTION$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "observationAction" attribute
     */
    public boolean isSetObservationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OBSERVATIONACTION$6) != null;
        }
    }
    
    /**
     * Sets the "observationAction" attribute
     */
    public void setObservationAction(org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType.Enum observationAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBSERVATIONACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBSERVATIONACTION$6);
            }
            target.setEnumValue(observationAction);
        }
    }
    
    /**
     * Sets (as xml) the "observationAction" attribute
     */
    public void xsetObservationAction(org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType observationAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType)get_store().find_attribute_user(OBSERVATIONACTION$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ObservationActionCodeType)get_store().add_attribute_user(OBSERVATIONACTION$6);
            }
            target.set(observationAction);
        }
    }
    
    /**
     * Unsets the "observationAction" attribute
     */
    public void unsetObservationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OBSERVATIONACTION$6);
        }
    }
}
