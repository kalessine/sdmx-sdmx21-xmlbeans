/*
 * XML Type:  TimeRangeValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML TimeRangeValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class TimeRangeValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType
{
    private static final long serialVersionUID = 1L;
    
    public TimeRangeValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEFOREPERIOD$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "BeforePeriod");
    private static final javax.xml.namespace.QName AFTERPERIOD$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AfterPeriod");
    private static final javax.xml.namespace.QName STARTPERIOD$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "StartPeriod");
    private static final javax.xml.namespace.QName ENDPERIOD$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "EndPeriod");
    
    
    /**
     * Gets the "BeforePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getBeforePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(BEFOREPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BeforePeriod" element
     */
    public boolean isSetBeforePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEFOREPERIOD$0) != 0;
        }
    }
    
    /**
     * Sets the "BeforePeriod" element
     */
    public void setBeforePeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType beforePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(BEFOREPERIOD$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(BEFOREPERIOD$0);
            }
            target.set(beforePeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "BeforePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewBeforePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(BEFOREPERIOD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BeforePeriod" element
     */
    public void unsetBeforePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEFOREPERIOD$0, 0);
        }
    }
    
    /**
     * Gets the "AfterPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getAfterPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(AFTERPERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AfterPeriod" element
     */
    public boolean isSetAfterPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFTERPERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "AfterPeriod" element
     */
    public void setAfterPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType afterPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(AFTERPERIOD$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(AFTERPERIOD$2);
            }
            target.set(afterPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "AfterPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewAfterPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(AFTERPERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "AfterPeriod" element
     */
    public void unsetAfterPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFTERPERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "StartPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getStartPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(STARTPERIOD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StartPeriod" element
     */
    public boolean isSetStartPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTPERIOD$4) != 0;
        }
    }
    
    /**
     * Sets the "StartPeriod" element
     */
    public void setStartPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType startPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(STARTPERIOD$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(STARTPERIOD$4);
            }
            target.set(startPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "StartPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewStartPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(STARTPERIOD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "StartPeriod" element
     */
    public void unsetStartPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTPERIOD$4, 0);
        }
    }
    
    /**
     * Gets the "EndPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getEndPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(ENDPERIOD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EndPeriod" element
     */
    public boolean isSetEndPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPERIOD$6) != 0;
        }
    }
    
    /**
     * Sets the "EndPeriod" element
     */
    public void setEndPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType endPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().find_element_user(ENDPERIOD$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(ENDPERIOD$6);
            }
            target.set(endPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "EndPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewEndPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType)get_store().add_element_user(ENDPERIOD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "EndPeriod" element
     */
    public void unsetEndPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPERIOD$6, 0);
        }
    }
}
