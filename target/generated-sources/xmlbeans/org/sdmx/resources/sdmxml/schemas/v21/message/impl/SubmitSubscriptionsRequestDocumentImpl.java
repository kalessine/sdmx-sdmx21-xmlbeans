/*
 * An XML document type.
 * Localname: SubmitSubscriptionsRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one SubmitSubscriptionsRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitSubscriptionsRequest");
    
    
    /**
     * Gets the "SubmitSubscriptionsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType getSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionsRequest" element
     */
    public void setSubmitSubscriptionsRequest(org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType submitSubscriptionsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONSREQUEST$0);
            }
            target.set(submitSubscriptionsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType addNewSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONSREQUEST$0);
            return target;
        }
    }
}
