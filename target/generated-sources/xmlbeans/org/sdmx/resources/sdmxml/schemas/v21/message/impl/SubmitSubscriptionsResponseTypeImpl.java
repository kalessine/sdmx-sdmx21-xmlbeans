/*
 * XML Type:  SubmitSubscriptionsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SubmitSubscriptionsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsResponseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitSubscriptionsResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionsResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitSubscriptionsResponse");
    
    
    /**
     * Gets the "SubmitSubscriptionsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType getSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitSubscriptionsResponse" element
     */
    public boolean isSetSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSUBSCRIPTIONSRESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionsResponse" element
     */
    public void setSubmitSubscriptionsResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType submitSubscriptionsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0);
            }
            target.set(submitSubscriptionsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType addNewSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONSRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitSubscriptionsResponse" element
     */
    public void unsetSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSUBSCRIPTIONSRESPONSE$0, 0);
        }
    }
}
