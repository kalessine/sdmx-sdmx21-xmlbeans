/*
 * XML Type:  SeriesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.impl;
/**
 * An XML SeriesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific).
 *
 * This is a complex type.
 */
public class SeriesTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType
{
    private static final long serialVersionUID = 1L;
    
    public SeriesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBS$0 = 
        new javax.xml.namespace.QName("", "Obs");
    private static final javax.xml.namespace.QName TIMEPERIOD$2 = 
        new javax.xml.namespace.QName("", "TIME_PERIOD");
    private static final javax.xml.namespace.QName REPORTINGYEARSTARTDAY$4 = 
        new javax.xml.namespace.QName("", "REPORTING_YEAR_START_DAY");
    
    
    /**
     * Gets array of all "Obs" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] getObsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBS$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] result = new org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType getObsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType)get_store().find_element_user(OBS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Obs" element
     */
    public int sizeOfObsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBS$0);
        }
    }
    
    /**
     * Sets array of all "Obs" element
     */
    public void setObsArray(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] obsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(obsArray, OBS$0);
        }
    }
    
    /**
     * Sets ith "Obs" element
     */
    public void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType obs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType)get_store().find_element_user(OBS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(obs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType insertNewObs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType)get_store().insert_element_user(OBS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType addNewObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType)get_store().add_element_user(OBS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Obs" element
     */
    public void removeObs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBS$0, i);
        }
    }
    
    /**
     * Gets the "TIME_PERIOD" attribute
     */
    public java.lang.Object getTIMEPERIOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPERIOD$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "TIME_PERIOD" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetTIMEPERIOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(TIMEPERIOD$2);
            return target;
        }
    }
    
    /**
     * True if has "TIME_PERIOD" attribute
     */
    public boolean isSetTIMEPERIOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMEPERIOD$2) != null;
        }
    }
    
    /**
     * Sets the "TIME_PERIOD" attribute
     */
    public void setTIMEPERIOD(java.lang.Object timeperiod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPERIOD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEPERIOD$2);
            }
            target.setObjectValue(timeperiod);
        }
    }
    
    /**
     * Sets (as xml) the "TIME_PERIOD" attribute
     */
    public void xsetTIMEPERIOD(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType timeperiod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(TIMEPERIOD$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_attribute_user(TIMEPERIOD$2);
            }
            target.set(timeperiod);
        }
    }
    
    /**
     * Unsets the "TIME_PERIOD" attribute
     */
    public void unsetTIMEPERIOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMEPERIOD$2);
        }
    }
    
    /**
     * Gets the "REPORTING_YEAR_START_DAY" attribute
     */
    public java.util.Calendar getREPORTINGYEARSTARTDAY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "REPORTING_YEAR_START_DAY" attribute
     */
    public org.apache.xmlbeans.XmlGMonthDay xgetREPORTINGYEARSTARTDAY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGMonthDay target = null;
            target = (org.apache.xmlbeans.XmlGMonthDay)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$4);
            return target;
        }
    }
    
    /**
     * True if has "REPORTING_YEAR_START_DAY" attribute
     */
    public boolean isSetREPORTINGYEARSTARTDAY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTINGYEARSTARTDAY$4) != null;
        }
    }
    
    /**
     * Sets the "REPORTING_YEAR_START_DAY" attribute
     */
    public void setREPORTINGYEARSTARTDAY(java.util.Calendar reportingyearstartday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGYEARSTARTDAY$4);
            }
            target.setCalendarValue(reportingyearstartday);
        }
    }
    
    /**
     * Sets (as xml) the "REPORTING_YEAR_START_DAY" attribute
     */
    public void xsetREPORTINGYEARSTARTDAY(org.apache.xmlbeans.XmlGMonthDay reportingyearstartday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGMonthDay target = null;
            target = (org.apache.xmlbeans.XmlGMonthDay)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGMonthDay)get_store().add_attribute_user(REPORTINGYEARSTARTDAY$4);
            }
            target.set(reportingyearstartday);
        }
    }
    
    /**
     * Unsets the "REPORTING_YEAR_START_DAY" attribute
     */
    public void unsetREPORTINGYEARSTARTDAY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTINGYEARSTARTDAY$4);
        }
    }
}
