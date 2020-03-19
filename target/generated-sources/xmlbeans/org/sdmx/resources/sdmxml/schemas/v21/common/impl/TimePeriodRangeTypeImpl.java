/*
 * XML Type:  TimePeriodRangeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML TimePeriodRangeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
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
public class TimePeriodRangeTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType, org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeType
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodRangeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TimePeriodRangeTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISINCLUSIVE$0 = 
        new javax.xml.namespace.QName("", "isInclusive");
    
    
    /**
     * Gets the "isInclusive" attribute
     */
    public boolean getIsInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUSIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISINCLUSIVE$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isInclusive" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUSIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISINCLUSIVE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "isInclusive" attribute
     */
    public boolean isSetIsInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISINCLUSIVE$0) != null;
        }
    }
    
    /**
     * Sets the "isInclusive" attribute
     */
    public void setIsInclusive(boolean isInclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISINCLUSIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISINCLUSIVE$0);
            }
            target.setBooleanValue(isInclusive);
        }
    }
    
    /**
     * Sets (as xml) the "isInclusive" attribute
     */
    public void xsetIsInclusive(org.apache.xmlbeans.XmlBoolean isInclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISINCLUSIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISINCLUSIVE$0);
            }
            target.set(isInclusive);
        }
    }
    
    /**
     * Unsets the "isInclusive" attribute
     */
    public void unsetIsInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISINCLUSIVE$0);
        }
    }
}
