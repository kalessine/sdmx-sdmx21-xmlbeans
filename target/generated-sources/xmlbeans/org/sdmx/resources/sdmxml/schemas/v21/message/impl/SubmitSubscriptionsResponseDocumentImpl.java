/*
 * An XML document type.
 * Localname: SubmitSubscriptionsResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one SubmitSubscriptionsResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitSubscriptionsResponse");
    
    
    /**
     * Gets the "SubmitSubscriptionsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType getSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionsResponse" element
     */
    public void setSubmitSubscriptionsResponse(org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType submitSubscriptionsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0);
            }
            target.set(submitSubscriptionsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType addNewSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0);
            return target;
        }
    }
}
