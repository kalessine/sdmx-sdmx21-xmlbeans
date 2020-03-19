/*
 * XML Type:  ObsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.impl;
/**
 * An XML ObsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific).
 *
 * This is a complex type.
 */
public class ObsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType
{
    private static final long serialVersionUID = 1L;
    
    public ObsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName TIMEPERIOD$2 = 
        new javax.xml.namespace.QName("", "TIME_PERIOD");
    private static final javax.xml.namespace.QName REPORTINGYEARSTARTDAY$4 = 
        new javax.xml.namespace.QName("", "REPORTING_YEAR_START_DAY");
    private static final javax.xml.namespace.QName OBSVALUE$6 = 
        new javax.xml.namespace.QName("", "OBS_VALUE");
    
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.IDType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
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
    
    /**
     * Gets the "OBS_VALUE" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getOBSVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(OBSVALUE$6);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OBS_VALUE" attribute
     */
    public boolean isSetOBSVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OBSVALUE$6) != null;
        }
    }
    
    /**
     * Sets the "OBS_VALUE" attribute
     */
    public void setOBSVALUE(org.apache.xmlbeans.XmlAnySimpleType obsvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(OBSVALUE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(OBSVALUE$6);
            }
            target.set(obsvalue);
        }
    }
    
    /**
     * Appends and returns a new empty "OBS_VALUE" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewOBSVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(OBSVALUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "OBS_VALUE" attribute
     */
    public void unsetOBSVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OBSVALUE$6);
        }
    }
}
