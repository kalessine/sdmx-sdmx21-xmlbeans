/*
 * XML Type:  NotifyRegistryEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML NotifyRegistryEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class NotifyRegistryEventTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType
{
    private static final long serialVersionUID = 1L;
    
    public NotifyRegistryEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYREGISTRYEVENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "NotifyRegistryEvent");
    
    
    /**
     * Gets the "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType getNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NotifyRegistryEvent" element
     */
    public boolean isSetNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFYREGISTRYEVENT$0) != 0;
        }
    }
    
    /**
     * Sets the "NotifyRegistryEvent" element
     */
    public void setNotifyRegistryEvent(org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType notifyRegistryEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$0);
            }
            target.set(notifyRegistryEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType addNewNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "NotifyRegistryEvent" element
     */
    public void unsetNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFYREGISTRYEVENT$0, 0);
        }
    }
}
