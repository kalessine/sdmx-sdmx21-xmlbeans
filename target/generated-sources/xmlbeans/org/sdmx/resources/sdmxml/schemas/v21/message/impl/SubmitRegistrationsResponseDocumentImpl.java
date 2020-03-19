/*
 * An XML document type.
 * Localname: SubmitRegistrationsResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one SubmitRegistrationsResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class SubmitRegistrationsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitRegistrationsResponse");
    
    
    /**
     * Gets the "SubmitRegistrationsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType getSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType)get_store().find_element_user(SUBMITREGISTRATIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationsResponse" element
     */
    public void setSubmitRegistrationsResponse(org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType submitRegistrationsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType)get_store().find_element_user(SUBMITREGISTRATIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType)get_store().add_element_user(SUBMITREGISTRATIONSRESPONSE$0);
            }
            target.set(submitRegistrationsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType addNewSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType)get_store().add_element_user(SUBMITREGISTRATIONSRESPONSE$0);
            return target;
        }
    }
}
