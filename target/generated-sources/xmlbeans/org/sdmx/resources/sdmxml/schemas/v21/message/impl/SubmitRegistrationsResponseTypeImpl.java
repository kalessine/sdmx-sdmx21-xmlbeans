/*
 * XML Type:  SubmitRegistrationsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SubmitRegistrationsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SubmitRegistrationsResponseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationsResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitRegistrationsResponse");
    
    
    /**
     * Gets the "SubmitRegistrationsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType getSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().find_element_user(SUBMITREGISTRATIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitRegistrationsResponse" element
     */
    public boolean isSetSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITREGISTRATIONSRESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationsResponse" element
     */
    public void setSubmitRegistrationsResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType submitRegistrationsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().find_element_user(SUBMITREGISTRATIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().add_element_user(SUBMITREGISTRATIONSRESPONSE$0);
            }
            target.set(submitRegistrationsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType addNewSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().add_element_user(SUBMITREGISTRATIONSRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitRegistrationsResponse" element
     */
    public void unsetSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITREGISTRATIONSRESPONSE$0, 0);
        }
    }
}
