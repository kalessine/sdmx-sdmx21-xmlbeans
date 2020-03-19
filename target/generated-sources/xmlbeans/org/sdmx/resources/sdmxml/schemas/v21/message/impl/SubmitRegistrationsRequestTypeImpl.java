/*
 * XML Type:  SubmitRegistrationsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SubmitRegistrationsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SubmitRegistrationsRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitRegistrationsRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitRegistrationsRequest");
    
    
    /**
     * Gets the "SubmitRegistrationsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType getSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().find_element_user(SUBMITREGISTRATIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitRegistrationsRequest" element
     */
    public boolean isSetSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITREGISTRATIONSREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationsRequest" element
     */
    public void setSubmitRegistrationsRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType submitRegistrationsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().find_element_user(SUBMITREGISTRATIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().add_element_user(SUBMITREGISTRATIONSREQUEST$0);
            }
            target.set(submitRegistrationsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType addNewSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().add_element_user(SUBMITREGISTRATIONSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitRegistrationsRequest" element
     */
    public void unsetSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITREGISTRATIONSREQUEST$0, 0);
        }
    }
}
