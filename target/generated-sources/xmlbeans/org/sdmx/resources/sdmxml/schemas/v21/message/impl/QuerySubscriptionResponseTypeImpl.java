/*
 * XML Type:  QuerySubscriptionResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML QuerySubscriptionResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class QuerySubscriptionResponseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType
{
    private static final long serialVersionUID = 1L;
    
    public QuerySubscriptionResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QuerySubscriptionResponse");
    
    
    /**
     * Gets the "QuerySubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType getQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().find_element_user(QUERYSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QuerySubscriptionResponse" element
     */
    public boolean isSetQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSUBSCRIPTIONRESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "QuerySubscriptionResponse" element
     */
    public void setQuerySubscriptionResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType querySubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().find_element_user(QUERYSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().add_element_user(QUERYSUBSCRIPTIONRESPONSE$0);
            }
            target.set(querySubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType addNewQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().add_element_user(QUERYSUBSCRIPTIONRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "QuerySubscriptionResponse" element
     */
    public void unsetQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSUBSCRIPTIONRESPONSE$0, 0);
        }
    }
}
