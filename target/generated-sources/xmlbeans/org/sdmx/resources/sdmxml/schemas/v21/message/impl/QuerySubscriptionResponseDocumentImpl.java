/*
 * An XML document type.
 * Localname: QuerySubscriptionResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one QuerySubscriptionResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class QuerySubscriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QuerySubscriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QuerySubscriptionResponse");
    
    
    /**
     * Gets the "QuerySubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType getQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType)get_store().find_element_user(QUERYSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QuerySubscriptionResponse" element
     */
    public void setQuerySubscriptionResponse(org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType querySubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType)get_store().find_element_user(QUERYSUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType)get_store().add_element_user(QUERYSUBSCRIPTIONRESPONSE$0);
            }
            target.set(querySubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType addNewQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QuerySubscriptionResponseType)get_store().add_element_user(QUERYSUBSCRIPTIONRESPONSE$0);
            return target;
        }
    }
}
