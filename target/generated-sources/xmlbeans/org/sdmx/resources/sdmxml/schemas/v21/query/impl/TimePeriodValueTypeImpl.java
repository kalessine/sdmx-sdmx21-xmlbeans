/*
 * XML Type:  TimePeriodValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML TimePeriodValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlDateTime
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingYearType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingSemesterType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTrimesterType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingQuarterType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingMonthType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingWeekType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingDayType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeType
 */
public class TimePeriodValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType, org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeType
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TimePeriodValueTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("", "operator");
    private static final javax.xml.namespace.QName REPORTINGYEARSTARTDAY$2 = 
        new javax.xml.namespace.QName("", "reportingYearStartDay");
    
    
    /**
     * Gets the "operator" attribute
     */
    public java.lang.String getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType)get_default_attribute_value(OPERATOR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$0) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(java.lang.String operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$0);
            }
            target.setStringValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeOperatorType)get_store().add_attribute_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$0);
        }
    }
    
    /**
     * Gets the "reportingYearStartDay" attribute
     */
    public java.lang.Object getReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPORTINGYEARSTARTDAY$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingYearStartDay" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType xgetReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType)get_default_attribute_value(REPORTINGYEARSTARTDAY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "reportingYearStartDay" attribute
     */
    public boolean isSetReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTINGYEARSTARTDAY$2) != null;
        }
    }
    
    /**
     * Sets the "reportingYearStartDay" attribute
     */
    public void setReportingYearStartDay(java.lang.Object reportingYearStartDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGYEARSTARTDAY$2);
            }
            target.setObjectValue(reportingYearStartDay);
        }
    }
    
    /**
     * Sets (as xml) the "reportingYearStartDay" attribute
     */
    public void xsetReportingYearStartDay(org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType reportingYearStartDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType)get_store().find_attribute_user(REPORTINGYEARSTARTDAY$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingYearStartDayQueryType)get_store().add_attribute_user(REPORTINGYEARSTARTDAY$2);
            }
            target.set(reportingYearStartDay);
        }
    }
    
    /**
     * Unsets the "reportingYearStartDay" attribute
     */
    public void unsetReportingYearStartDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTINGYEARSTARTDAY$2);
        }
    }
}
