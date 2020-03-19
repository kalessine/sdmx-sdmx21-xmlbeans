/*
 * An XML document type.
 * Localname: QueryRegistrationResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one QueryRegistrationResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class QueryRegistrationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYREGISTRATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QueryRegistrationResponse");
    
    
    /**
     * Gets the "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType getQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryRegistrationResponse" element
     */
    public void setQueryRegistrationResponse(org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType queryRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$0);
            }
            target.set(queryRegistrationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType addNewQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$0);
            return target;
        }
    }
}
