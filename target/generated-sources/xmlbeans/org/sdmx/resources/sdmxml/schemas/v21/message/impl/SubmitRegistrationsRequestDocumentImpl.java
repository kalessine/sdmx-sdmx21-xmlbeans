/*
 * An XML document type.
 * Localname: SubmitRegistrationsRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one SubmitRegistrationsRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class SubmitRegistrationsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitRegistrationsRequest");
    
    
    /**
     * Gets the "SubmitRegistrationsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType getSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType)get_store().find_element_user(SUBMITREGISTRATIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationsRequest" element
     */
    public void setSubmitRegistrationsRequest(org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType submitRegistrationsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType)get_store().find_element_user(SUBMITREGISTRATIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType)get_store().add_element_user(SUBMITREGISTRATIONSREQUEST$0);
            }
            target.set(submitRegistrationsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType addNewSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType)get_store().add_element_user(SUBMITREGISTRATIONSREQUEST$0);
            return target;
        }
    }
}
