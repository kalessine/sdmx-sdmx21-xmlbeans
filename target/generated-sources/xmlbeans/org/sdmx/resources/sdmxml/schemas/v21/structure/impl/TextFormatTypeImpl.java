/*
 * XML Type:  TextFormatType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML TextFormatType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class TextFormatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType
{
    private static final long serialVersionUID = 1L;
    
    public TextFormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTTYPE$0 = 
        new javax.xml.namespace.QName("", "textType");
    private static final javax.xml.namespace.QName ISSEQUENCE$2 = 
        new javax.xml.namespace.QName("", "isSequence");
    private static final javax.xml.namespace.QName INTERVAL$4 = 
        new javax.xml.namespace.QName("", "interval");
    private static final javax.xml.namespace.QName STARTVALUE$6 = 
        new javax.xml.namespace.QName("", "startValue");
    private static final javax.xml.namespace.QName ENDVALUE$8 = 
        new javax.xml.namespace.QName("", "endValue");
    private static final javax.xml.namespace.QName TIMEINTERVAL$10 = 
        new javax.xml.namespace.QName("", "timeInterval");
    private static final javax.xml.namespace.QName STARTTIME$12 = 
        new javax.xml.namespace.QName("", "startTime");
    private static final javax.xml.namespace.QName ENDTIME$14 = 
        new javax.xml.namespace.QName("", "endTime");
    private static final javax.xml.namespace.QName MINLENGTH$16 = 
        new javax.xml.namespace.QName("", "minLength");
    private static final javax.xml.namespace.QName MAXLENGTH$18 = 
        new javax.xml.namespace.QName("", "maxLength");
    private static final javax.xml.namespace.QName MINVALUE$20 = 
        new javax.xml.namespace.QName("", "minValue");
    private static final javax.xml.namespace.QName MAXVALUE$22 = 
        new javax.xml.namespace.QName("", "maxValue");
    private static final javax.xml.namespace.QName DECIMALS$24 = 
        new javax.xml.namespace.QName("", "decimals");
    private static final javax.xml.namespace.QName PATTERN$26 = 
        new javax.xml.namespace.QName("", "pattern");
    private static final javax.xml.namespace.QName ISMULTILINGUAL$28 = 
        new javax.xml.namespace.QName("", "isMultiLingual");
    
    
    /**
     * Gets the "textType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum getTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEXTTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "textType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataType xgetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_default_attribute_value(TEXTTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "textType" attribute
     */
    public boolean isSetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "textType" attribute
     */
    public void setTextType(org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum textType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTTYPE$0);
            }
            target.setEnumValue(textType);
        }
    }
    
    /**
     * Sets (as xml) the "textType" attribute
     */
    public void xsetTextType(org.sdmx.resources.sdmxml.schemas.v21.common.DataType textType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_store().add_attribute_user(TEXTTYPE$0);
            }
            target.set(textType);
        }
    }
    
    /**
     * Unsets the "textType" attribute
     */
    public void unsetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTTYPE$0);
        }
    }
    
    /**
     * Gets the "isSequence" attribute
     */
    public boolean getIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSEQUENCE$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSequence" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSEQUENCE$2);
            return target;
        }
    }
    
    /**
     * True if has "isSequence" attribute
     */
    public boolean isSetIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSEQUENCE$2) != null;
        }
    }
    
    /**
     * Sets the "isSequence" attribute
     */
    public void setIsSequence(boolean isSequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSEQUENCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSEQUENCE$2);
            }
            target.setBooleanValue(isSequence);
        }
    }
    
    /**
     * Sets (as xml) the "isSequence" attribute
     */
    public void xsetIsSequence(org.apache.xmlbeans.XmlBoolean isSequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSEQUENCE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISSEQUENCE$2);
            }
            target.set(isSequence);
        }
    }
    
    /**
     * Unsets the "isSequence" attribute
     */
    public void unsetIsSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSEQUENCE$2);
        }
    }
    
    /**
     * Gets the "interval" attribute
     */
    public java.math.BigDecimal getInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERVAL$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "interval" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(INTERVAL$4);
            return target;
        }
    }
    
    /**
     * True if has "interval" attribute
     */
    public boolean isSetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERVAL$4) != null;
        }
    }
    
    /**
     * Sets the "interval" attribute
     */
    public void setInterval(java.math.BigDecimal interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERVAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERVAL$4);
            }
            target.setBigDecimalValue(interval);
        }
    }
    
    /**
     * Sets (as xml) the "interval" attribute
     */
    public void xsetInterval(org.apache.xmlbeans.XmlDecimal interval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(INTERVAL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(INTERVAL$4);
            }
            target.set(interval);
        }
    }
    
    /**
     * Unsets the "interval" attribute
     */
    public void unsetInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERVAL$4);
        }
    }
    
    /**
     * Gets the "startValue" attribute
     */
    public java.math.BigDecimal getStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVALUE$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "startValue" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(STARTVALUE$6);
            return target;
        }
    }
    
    /**
     * True if has "startValue" attribute
     */
    public boolean isSetStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTVALUE$6) != null;
        }
    }
    
    /**
     * Sets the "startValue" attribute
     */
    public void setStartValue(java.math.BigDecimal startValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTVALUE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTVALUE$6);
            }
            target.setBigDecimalValue(startValue);
        }
    }
    
    /**
     * Sets (as xml) the "startValue" attribute
     */
    public void xsetStartValue(org.apache.xmlbeans.XmlDecimal startValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(STARTVALUE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(STARTVALUE$6);
            }
            target.set(startValue);
        }
    }
    
    /**
     * Unsets the "startValue" attribute
     */
    public void unsetStartValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTVALUE$6);
        }
    }
    
    /**
     * Gets the "endValue" attribute
     */
    public java.math.BigDecimal getEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVALUE$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "endValue" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ENDVALUE$8);
            return target;
        }
    }
    
    /**
     * True if has "endValue" attribute
     */
    public boolean isSetEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDVALUE$8) != null;
        }
    }
    
    /**
     * Sets the "endValue" attribute
     */
    public void setEndValue(java.math.BigDecimal endValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDVALUE$8);
            }
            target.setBigDecimalValue(endValue);
        }
    }
    
    /**
     * Sets (as xml) the "endValue" attribute
     */
    public void xsetEndValue(org.apache.xmlbeans.XmlDecimal endValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(ENDVALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(ENDVALUE$8);
            }
            target.set(endValue);
        }
    }
    
    /**
     * Unsets the "endValue" attribute
     */
    public void unsetEndValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDVALUE$8);
        }
    }
    
    /**
     * Gets the "timeInterval" attribute
     */
    public org.apache.xmlbeans.GDuration getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEINTERVAL$10);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeInterval" attribute
     */
    public org.apache.xmlbeans.XmlDuration xgetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(TIMEINTERVAL$10);
            return target;
        }
    }
    
    /**
     * True if has "timeInterval" attribute
     */
    public boolean isSetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMEINTERVAL$10) != null;
        }
    }
    
    /**
     * Sets the "timeInterval" attribute
     */
    public void setTimeInterval(org.apache.xmlbeans.GDuration timeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEINTERVAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEINTERVAL$10);
            }
            target.setGDurationValue(timeInterval);
        }
    }
    
    /**
     * Sets (as xml) the "timeInterval" attribute
     */
    public void xsetTimeInterval(org.apache.xmlbeans.XmlDuration timeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_attribute_user(TIMEINTERVAL$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_attribute_user(TIMEINTERVAL$10);
            }
            target.set(timeInterval);
        }
    }
    
    /**
     * Unsets the "timeInterval" attribute
     */
    public void unsetTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMEINTERVAL$10);
        }
    }
    
    /**
     * Gets the "startTime" attribute
     */
    public java.lang.Object getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$12);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "startTime" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType)get_store().find_attribute_user(STARTTIME$12);
            return target;
        }
    }
    
    /**
     * True if has "startTime" attribute
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTTIME$12) != null;
        }
    }
    
    /**
     * Sets the "startTime" attribute
     */
    public void setStartTime(java.lang.Object startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTTIME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTTIME$12);
            }
            target.setObjectValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "startTime" attribute
     */
    public void xsetStartTime(org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType)get_store().find_attribute_user(STARTTIME$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType)get_store().add_attribute_user(STARTTIME$12);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Unsets the "startTime" attribute
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTTIME$12);
        }
    }
    
    /**
     * Gets the "endTime" attribute
     */
    public java.lang.Object getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$14);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "endTime" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType xgetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType)get_store().find_attribute_user(ENDTIME$14);
            return target;
        }
    }
    
    /**
     * True if has "endTime" attribute
     */
    public boolean isSetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDTIME$14) != null;
        }
    }
    
    /**
     * Sets the "endTime" attribute
     */
    public void setEndTime(java.lang.Object endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDTIME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDTIME$14);
            }
            target.setObjectValue(endTime);
        }
    }
    
    /**
     * Sets (as xml) the "endTime" attribute
     */
    public void xsetEndTime(org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType)get_store().find_attribute_user(ENDTIME$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType)get_store().add_attribute_user(ENDTIME$14);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Unsets the "endTime" attribute
     */
    public void unsetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDTIME$14);
        }
    }
    
    /**
     * Gets the "minLength" attribute
     */
    public java.math.BigInteger getMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINLENGTH$16);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "minLength" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MINLENGTH$16);
            return target;
        }
    }
    
    /**
     * True if has "minLength" attribute
     */
    public boolean isSetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINLENGTH$16) != null;
        }
    }
    
    /**
     * Sets the "minLength" attribute
     */
    public void setMinLength(java.math.BigInteger minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINLENGTH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINLENGTH$16);
            }
            target.setBigIntegerValue(minLength);
        }
    }
    
    /**
     * Sets (as xml) the "minLength" attribute
     */
    public void xsetMinLength(org.apache.xmlbeans.XmlPositiveInteger minLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MINLENGTH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(MINLENGTH$16);
            }
            target.set(minLength);
        }
    }
    
    /**
     * Unsets the "minLength" attribute
     */
    public void unsetMinLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINLENGTH$16);
        }
    }
    
    /**
     * Gets the "maxLength" attribute
     */
    public java.math.BigInteger getMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$18);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxLength" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MAXLENGTH$18);
            return target;
        }
    }
    
    /**
     * True if has "maxLength" attribute
     */
    public boolean isSetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXLENGTH$18) != null;
        }
    }
    
    /**
     * Sets the "maxLength" attribute
     */
    public void setMaxLength(java.math.BigInteger maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXLENGTH$18);
            }
            target.setBigIntegerValue(maxLength);
        }
    }
    
    /**
     * Sets (as xml) the "maxLength" attribute
     */
    public void xsetMaxLength(org.apache.xmlbeans.XmlPositiveInteger maxLength)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MAXLENGTH$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(MAXLENGTH$18);
            }
            target.set(maxLength);
        }
    }
    
    /**
     * Unsets the "maxLength" attribute
     */
    public void unsetMaxLength()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXLENGTH$18);
        }
    }
    
    /**
     * Gets the "minValue" attribute
     */
    public java.math.BigDecimal getMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVALUE$20);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "minValue" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MINVALUE$20);
            return target;
        }
    }
    
    /**
     * True if has "minValue" attribute
     */
    public boolean isSetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINVALUE$20) != null;
        }
    }
    
    /**
     * Sets the "minValue" attribute
     */
    public void setMinValue(java.math.BigDecimal minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINVALUE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINVALUE$20);
            }
            target.setBigDecimalValue(minValue);
        }
    }
    
    /**
     * Sets (as xml) the "minValue" attribute
     */
    public void xsetMinValue(org.apache.xmlbeans.XmlDecimal minValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MINVALUE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MINVALUE$20);
            }
            target.set(minValue);
        }
    }
    
    /**
     * Unsets the "minValue" attribute
     */
    public void unsetMinValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINVALUE$20);
        }
    }
    
    /**
     * Gets the "maxValue" attribute
     */
    public java.math.BigDecimal getMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXVALUE$22);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxValue" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MAXVALUE$22);
            return target;
        }
    }
    
    /**
     * True if has "maxValue" attribute
     */
    public boolean isSetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXVALUE$22) != null;
        }
    }
    
    /**
     * Sets the "maxValue" attribute
     */
    public void setMaxValue(java.math.BigDecimal maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXVALUE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXVALUE$22);
            }
            target.setBigDecimalValue(maxValue);
        }
    }
    
    /**
     * Sets (as xml) the "maxValue" attribute
     */
    public void xsetMaxValue(org.apache.xmlbeans.XmlDecimal maxValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MAXVALUE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MAXVALUE$22);
            }
            target.set(maxValue);
        }
    }
    
    /**
     * Unsets the "maxValue" attribute
     */
    public void unsetMaxValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXVALUE$22);
        }
    }
    
    /**
     * Gets the "decimals" attribute
     */
    public java.math.BigInteger getDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALS$24);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimals" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DECIMALS$24);
            return target;
        }
    }
    
    /**
     * True if has "decimals" attribute
     */
    public boolean isSetDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMALS$24) != null;
        }
    }
    
    /**
     * Sets the "decimals" attribute
     */
    public void setDecimals(java.math.BigInteger decimals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMALS$24);
            }
            target.setBigIntegerValue(decimals);
        }
    }
    
    /**
     * Sets (as xml) the "decimals" attribute
     */
    public void xsetDecimals(org.apache.xmlbeans.XmlPositiveInteger decimals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DECIMALS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(DECIMALS$24);
            }
            target.set(decimals);
        }
    }
    
    /**
     * Unsets the "decimals" attribute
     */
    public void unsetDecimals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMALS$24);
        }
    }
    
    /**
     * Gets the "pattern" attribute
     */
    public java.lang.String getPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pattern" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATTERN$26);
            return target;
        }
    }
    
    /**
     * True if has "pattern" attribute
     */
    public boolean isSetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PATTERN$26) != null;
        }
    }
    
    /**
     * Sets the "pattern" attribute
     */
    public void setPattern(java.lang.String pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATTERN$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATTERN$26);
            }
            target.setStringValue(pattern);
        }
    }
    
    /**
     * Sets (as xml) the "pattern" attribute
     */
    public void xsetPattern(org.apache.xmlbeans.XmlString pattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATTERN$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATTERN$26);
            }
            target.set(pattern);
        }
    }
    
    /**
     * Unsets the "pattern" attribute
     */
    public void unsetPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PATTERN$26);
        }
    }
    
    /**
     * Gets the "isMultiLingual" attribute
     */
    public boolean getIsMultiLingual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMULTILINGUAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISMULTILINGUAL$28);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isMultiLingual" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsMultiLingual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMULTILINGUAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISMULTILINGUAL$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "isMultiLingual" attribute
     */
    public boolean isSetIsMultiLingual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISMULTILINGUAL$28) != null;
        }
    }
    
    /**
     * Sets the "isMultiLingual" attribute
     */
    public void setIsMultiLingual(boolean isMultiLingual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISMULTILINGUAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISMULTILINGUAL$28);
            }
            target.setBooleanValue(isMultiLingual);
        }
    }
    
    /**
     * Sets (as xml) the "isMultiLingual" attribute
     */
    public void xsetIsMultiLingual(org.apache.xmlbeans.XmlBoolean isMultiLingual)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISMULTILINGUAL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISMULTILINGUAL$28);
            }
            target.set(isMultiLingual);
        }
    }
    
    /**
     * Unsets the "isMultiLingual" attribute
     */
    public void unsetIsMultiLingual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISMULTILINGUAL$28);
        }
    }
}
