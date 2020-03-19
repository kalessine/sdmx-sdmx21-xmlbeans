/*
 * XML Type:  DataStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataStructureRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.DataStructureRequestTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMESERIES$0 = 
        new javax.xml.namespace.QName("", "timeSeries");
    private static final javax.xml.namespace.QName PROCESSCONSTRAINTS$2 = 
        new javax.xml.namespace.QName("", "processConstraints");
    
    
    /**
     * Gets the "timeSeries" attribute
     */
    public boolean getTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESERIES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TIMESERIES$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeSeries" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESERIES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TIMESERIES$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "timeSeries" attribute
     */
    public boolean isSetTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMESERIES$0) != null;
        }
    }
    
    /**
     * Sets the "timeSeries" attribute
     */
    public void setTimeSeries(boolean timeSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESERIES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESERIES$0);
            }
            target.setBooleanValue(timeSeries);
        }
    }
    
    /**
     * Sets (as xml) the "timeSeries" attribute
     */
    public void xsetTimeSeries(org.apache.xmlbeans.XmlBoolean timeSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESERIES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TIMESERIES$0);
            }
            target.set(timeSeries);
        }
    }
    
    /**
     * Unsets the "timeSeries" attribute
     */
    public void unsetTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMESERIES$0);
        }
    }
    
    /**
     * Gets the "processConstraints" attribute
     */
    public boolean getProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSCONSTRAINTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROCESSCONSTRAINTS$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "processConstraints" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROCESSCONSTRAINTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROCESSCONSTRAINTS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "processConstraints" attribute
     */
    public boolean isSetProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROCESSCONSTRAINTS$2) != null;
        }
    }
    
    /**
     * Sets the "processConstraints" attribute
     */
    public void setProcessConstraints(boolean processConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSCONSTRAINTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESSCONSTRAINTS$2);
            }
            target.setBooleanValue(processConstraints);
        }
    }
    
    /**
     * Sets (as xml) the "processConstraints" attribute
     */
    public void xsetProcessConstraints(org.apache.xmlbeans.XmlBoolean processConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROCESSCONSTRAINTS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROCESSCONSTRAINTS$2);
            }
            target.set(processConstraints);
        }
    }
    
    /**
     * Unsets the "processConstraints" attribute
     */
    public void unsetProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROCESSCONSTRAINTS$2);
        }
    }
}
