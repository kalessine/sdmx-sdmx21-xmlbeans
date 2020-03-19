/*
 * An XML document type.
 * Localname: TimeValue
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TimeValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one TimeValue(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class TimeValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TimeValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEVALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeValue");
    
    
    /**
     * Gets the "TimeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType getTimeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().find_element_user(TIMEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeValue" element
     */
    public void setTimeValue(org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType timeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().find_element_user(TIMEVALUE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().add_element_user(TIMEVALUE$0);
            }
            target.set(timeValue);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType addNewTimeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType)get_store().add_element_user(TIMEVALUE$0);
            return target;
        }
    }
}
