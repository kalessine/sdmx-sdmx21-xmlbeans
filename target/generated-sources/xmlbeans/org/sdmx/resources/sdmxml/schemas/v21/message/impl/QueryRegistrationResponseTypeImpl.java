/*
 * XML Type:  QueryRegistrationResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML QueryRegistrationResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class QueryRegistrationResponseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYREGISTRATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QueryRegistrationResponse");
    
    
    /**
     * Gets the "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType getQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryRegistrationResponse" element
     */
    public boolean isSetQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYREGISTRATIONRESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "QueryRegistrationResponse" element
     */
    public void setQueryRegistrationResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType queryRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$0);
            }
            target.set(queryRegistrationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType addNewQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryRegistrationResponse" element
     */
    public void unsetQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYREGISTRATIONRESPONSE$0, 0);
        }
    }
}
