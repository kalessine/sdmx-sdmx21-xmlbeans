/*
 * An XML document type.
 * Localname: QueryRegistrationRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one QueryRegistrationRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class QueryRegistrationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYREGISTRATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QueryRegistrationRequest");
    
    
    /**
     * Gets the "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType getQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryRegistrationRequest" element
     */
    public void setQueryRegistrationRequest(org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType queryRegistrationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$0);
            }
            target.set(queryRegistrationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType addNewQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$0);
            return target;
        }
    }
}
