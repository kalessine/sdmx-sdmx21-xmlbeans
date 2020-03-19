/*
 * XML Type:  DataSchemaQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML DataSchemaQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class DataSchemaQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.DataSchemaQueryType
{
    private static final long serialVersionUID = 1L;
    
    public DataSchemaQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Query" element
     */
    public void setQuery(org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType)get_store().add_element_user(QUERY$0);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
}
