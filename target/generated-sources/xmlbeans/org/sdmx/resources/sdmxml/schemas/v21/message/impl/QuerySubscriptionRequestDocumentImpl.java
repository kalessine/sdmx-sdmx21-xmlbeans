/*
 * An XML document type.
 * Localname: QuerySubscriptionRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one QuerySubscriptionRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class QuerySubscriptionRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuerySubscriptionRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QuerySubscriptionRequest");
    
    
    /**
     * Gets the "QuerySubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType getQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType)get_store().find_element_user(QUERYSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuerySubscriptionRequest" element
     */
    public void setQuerySubscriptionRequest(org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType querySubscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType)get_store().find_element_user(QUERYSUBSCRIPTIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType)get_store().add_element_user(QUERYSUBSCRIPTIONREQUEST$0);
            }
            target.set(querySubscriptionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType addNewQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionRequestType)get_store().add_element_user(QUERYSUBSCRIPTIONREQUEST$0);
            return target;
        }
    }
}
