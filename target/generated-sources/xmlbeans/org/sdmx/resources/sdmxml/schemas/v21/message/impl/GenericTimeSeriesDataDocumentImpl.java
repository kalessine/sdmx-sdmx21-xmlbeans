/*
 * An XML document type.
 * Localname: GenericTimeSeriesData
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one GenericTimeSeriesData(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class GenericTimeSeriesDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericTimeSeriesDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICTIMESERIESDATA$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "GenericTimeSeriesData");
    
    
    /**
     * Gets the "GenericTimeSeriesData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType getGenericTimeSeriesData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType)get_store().find_element_user(GENERICTIMESERIESDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericTimeSeriesData" element
     */
    public void setGenericTimeSeriesData(org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType genericTimeSeriesData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType)get_store().find_element_user(GENERICTIMESERIESDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType)get_store().add_element_user(GENERICTIMESERIESDATA$0);
            }
            target.set(genericTimeSeriesData);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericTimeSeriesData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType addNewGenericTimeSeriesData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataType)get_store().add_element_user(GENERICTIMESERIESDATA$0);
            return target;
        }
    }
}
