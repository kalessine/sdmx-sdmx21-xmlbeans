/*
 * XML Type:  TimeSeriesDataStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.TimeSeriesDataStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML TimeSeriesDataStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class TimeSeriesDataStructureRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.DataStructureRequestTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.TimeSeriesDataStructureRequestType
{
    private static final long serialVersionUID = 1L;
    
    public TimeSeriesDataStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONATOBSERVATION$0 = 
        new javax.xml.namespace.QName("", "dimensionAtObservation");
    
    
    /**
     * Gets the "dimensionAtObservation" attribute
     */
    public java.lang.String getDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONATOBSERVATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIMENSIONATOBSERVATION$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType xgetDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().find_attribute_user(DIMENSIONATOBSERVATION$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_default_attribute_value(DIMENSIONATOBSERVATION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "dimensionAtObservation" attribute
     */
    public boolean isSetDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSIONATOBSERVATION$0) != null;
        }
    }
    
    /**
     * Sets the "dimensionAtObservation" attribute
     */
    public void setDimensionAtObservation(java.lang.String dimensionAtObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONATOBSERVATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSIONATOBSERVATION$0);
            }
            target.setStringValue(dimensionAtObservation);
        }
    }
    
    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    public void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType dimensionAtObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().find_attribute_user(DIMENSIONATOBSERVATION$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().add_attribute_user(DIMENSIONATOBSERVATION$0);
            }
            target.set(dimensionAtObservation);
        }
    }
    
    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    public void unsetDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSIONATOBSERVATION$0);
        }
    }
}
