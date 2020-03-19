/*
 * XML Type:  QuerySubscriptionRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML QuerySubscriptionRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class QuerySubscriptionRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType
{
    private static final long serialVersionUID = 1L;
    
    public QuerySubscriptionRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QuerySubscriptionRequest");
    
    
    /**
     * Gets the "QuerySubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType getQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().find_element_user(QUERYSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QuerySubscriptionRequest" element
     */
    public boolean isSetQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSUBSCRIPTIONREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "QuerySubscriptionRequest" element
     */
    public void setQuerySubscriptionRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType querySubscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().find_element_user(QUERYSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().add_element_user(QUERYSUBSCRIPTIONREQUEST$0);
            }
            target.set(querySubscriptionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType addNewQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().add_element_user(QUERYSUBSCRIPTIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "QuerySubscriptionRequest" element
     */
    public void unsetQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSUBSCRIPTIONREQUEST$0, 0);
        }
    }
}
