/*
 * XML Type:  RegistrationStatusType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML RegistrationStatusType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class RegistrationStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType
{
    private static final long serialVersionUID = 1L;
    
    public RegistrationStatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Registration");
    private static final javax.xml.namespace.QName STATUSMESSAGE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StatusMessage");
    
    
    /**
     * Gets the "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType getRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().find_element_user(REGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Registration" element
     */
    public void setRegistration(org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType registration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().find_element_user(REGISTRATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().add_element_user(REGISTRATION$0);
            }
            target.set(registration);
        }
    }
    
    /**
     * Appends and returns a new empty "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType addNewRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().add_element_user(REGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$2);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType addNewStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$2);
            return target;
        }
    }
}
