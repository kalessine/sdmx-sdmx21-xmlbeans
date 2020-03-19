/*
 * XML Type:  QueryRegistrationRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML QueryRegistrationRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class QueryRegistrationRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.QueryRegistrationRequestType
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYREGISTRATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QueryRegistrationRequest");
    
    
    /**
     * Gets the "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType getQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryRegistrationRequest" element
     */
    public boolean isSetQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYREGISTRATIONREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "QueryRegistrationRequest" element
     */
    public void setQueryRegistrationRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType queryRegistrationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$0);
            }
            target.set(queryRegistrationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType addNewQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryRegistrationRequest" element
     */
    public void unsetQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYREGISTRATIONREQUEST$0, 0);
        }
    }
}
