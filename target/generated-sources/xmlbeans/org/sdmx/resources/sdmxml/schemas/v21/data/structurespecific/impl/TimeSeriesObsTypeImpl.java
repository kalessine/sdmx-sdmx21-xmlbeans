/*
 * XML Type:  TimeSeriesObsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.TimeSeriesObsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.impl;
/**
 * An XML TimeSeriesObsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific).
 *
 * This is a complex type.
 */
public class TimeSeriesObsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.impl.ObsTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.TimeSeriesObsType
{
    private static final long serialVersionUID = 1L;
    
    public TimeSeriesObsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPERIOD$0 = 
        new javax.xml.namespace.QName("", "TIME_PERIOD");
    
    
    /**
     * Gets the "TIME_PERIOD" attribute
     */
    public java.lang.Object getTIMEPERIOD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPERIOD$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(TIMEPERIOD$0);
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
            return get_store().find_attribute_user(TIMEPERIOD$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEPERIOD$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEPERIOD$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(TIMEPERIOD$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_attribute_user(TIMEPERIOD$0);
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
            get_store().remove_attribute(TIMEPERIOD$0);
        }
    }
}
