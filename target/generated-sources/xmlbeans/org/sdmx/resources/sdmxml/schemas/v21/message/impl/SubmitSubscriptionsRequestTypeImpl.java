/*
 * XML Type:  SubmitSubscriptionsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SubmitSubscriptionsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitSubscriptionsRequest");
    
    
    /**
     * Gets the "SubmitSubscriptionsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType getSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitSubscriptionsRequest" element
     */
    public boolean isSetSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSUBSCRIPTIONSREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionsRequest" element
     */
    public void setSubmitSubscriptionsRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType submitSubscriptionsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONSREQUEST$0);
            }
            target.set(submitSubscriptionsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType addNewSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitSubscriptionsRequest" element
     */
    public void unsetSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSUBSCRIPTIONSREQUEST$0, 0);
        }
    }
}
