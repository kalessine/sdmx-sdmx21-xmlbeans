/*
 * An XML document type.
 * Localname: StructureSpecificTimeSeriesData
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSpecificTimeSeriesData(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificTimeSeriesDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificTimeSeriesDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESPECIFICTIMESERIESDATA$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSpecificTimeSeriesData");
    
    
    /**
     * Gets the "StructureSpecificTimeSeriesData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType getStructureSpecificTimeSeriesData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType)get_store().find_element_user(STRUCTURESPECIFICTIMESERIESDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSpecificTimeSeriesData" element
     */
    public void setStructureSpecificTimeSeriesData(org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType structureSpecificTimeSeriesData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType)get_store().find_element_user(STRUCTURESPECIFICTIMESERIESDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType)get_store().add_element_user(STRUCTURESPECIFICTIMESERIESDATA$0);
            }
            target.set(structureSpecificTimeSeriesData);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSpecificTimeSeriesData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType addNewStructureSpecificTimeSeriesData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataType)get_store().add_element_user(STRUCTURESPECIFICTIMESERIESDATA$0);
            return target;
        }
    }
}
