/*
 * An XML document type.
 * Localname: NotifyRegistryEvent
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one NotifyRegistryEvent(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class NotifyRegistryEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyRegistryEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYREGISTRYEVENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "NotifyRegistryEvent");
    
    
    /**
     * Gets the "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType getNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotifyRegistryEvent" element
     */
    public void setNotifyRegistryEvent(org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType notifyRegistryEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$0);
            }
            target.set(notifyRegistryEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType addNewNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$0);
            return target;
        }
    }
}
