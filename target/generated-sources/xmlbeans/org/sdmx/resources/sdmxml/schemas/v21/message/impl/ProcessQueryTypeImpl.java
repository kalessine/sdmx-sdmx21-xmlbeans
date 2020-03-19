/*
 * XML Type:  ProcessQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML ProcessQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class ProcessQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Query");
    
    
    /**
     * Gets the "Query" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType)get_store().find_element_user(QUERY$0, 0);
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
    public void setQuery(org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType)get_store().add_element_user(QUERY$0);
            }
            target.set(query);
        }
    }
    
    /**
     * Appends and returns a new empty "Query" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
}
