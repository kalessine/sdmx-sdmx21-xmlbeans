/*
 * An XML document type.
 * Localname: StructureSpecificTimeSeriesDataQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSpecificTimeSeriesDataQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificTimeSeriesDataQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificTimeSeriesDataQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESPECIFICTIMESERIESDATAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSpecificTimeSeriesDataQuery");
    
    
    /**
     * Gets the "StructureSpecificTimeSeriesDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType getStructureSpecificTimeSeriesDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType)get_store().find_element_user(STRUCTURESPECIFICTIMESERIESDATAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSpecificTimeSeriesDataQuery" element
     */
    public void setStructureSpecificTimeSeriesDataQuery(org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType structureSpecificTimeSeriesDataQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType)get_store().find_element_user(STRUCTURESPECIFICTIMESERIESDATAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType)get_store().add_element_user(STRUCTURESPECIFICTIMESERIESDATAQUERY$0);
            }
            target.set(structureSpecificTimeSeriesDataQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSpecificTimeSeriesDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType addNewStructureSpecificTimeSeriesDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificTimeSeriesDataQueryType)get_store().add_element_user(STRUCTURESPECIFICTIMESERIESDATAQUERY$0);
            return target;
        }
    }
}
