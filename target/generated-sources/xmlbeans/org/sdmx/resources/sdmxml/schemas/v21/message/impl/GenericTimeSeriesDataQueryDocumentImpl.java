/*
 * An XML document type.
 * Localname: GenericTimeSeriesDataQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one GenericTimeSeriesDataQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class GenericTimeSeriesDataQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericTimeSeriesDataQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICTIMESERIESDATAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "GenericTimeSeriesDataQuery");
    
    
    /**
     * Gets the "GenericTimeSeriesDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType getGenericTimeSeriesDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType)get_store().find_element_user(GENERICTIMESERIESDATAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericTimeSeriesDataQuery" element
     */
    public void setGenericTimeSeriesDataQuery(org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType genericTimeSeriesDataQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType)get_store().find_element_user(GENERICTIMESERIESDATAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType)get_store().add_element_user(GENERICTIMESERIESDATAQUERY$0);
            }
            target.set(genericTimeSeriesDataQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericTimeSeriesDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType addNewGenericTimeSeriesDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataQueryType)get_store().add_element_user(GENERICTIMESERIESDATAQUERY$0);
            return target;
        }
    }
}
