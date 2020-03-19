/*
 * An XML document type.
 * Localname: DataSchemaQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one DataSchemaQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class DataSchemaQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSchemaQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASCHEMAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataSchemaQuery");
    
    
    /**
     * Gets the "DataSchemaQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType getDataSchemaQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType)get_store().find_element_user(DATASCHEMAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSchemaQuery" element
     */
    public void setDataSchemaQuery(org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType dataSchemaQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType)get_store().find_element_user(DATASCHEMAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType)get_store().add_element_user(DATASCHEMAQUERY$0);
            }
            target.set(dataSchemaQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSchemaQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType addNewDataSchemaQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType)get_store().add_element_user(DATASCHEMAQUERY$0);
            return target;
        }
    }
}
