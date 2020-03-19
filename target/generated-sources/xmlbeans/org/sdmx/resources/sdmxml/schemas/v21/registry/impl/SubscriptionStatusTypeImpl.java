/*
 * XML Type:  SubscriptionStatusType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubscriptionStatusType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubscriptionStatusTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionStatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONURN$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubscriptionURN");
    private static final javax.xml.namespace.QName SUBSCRIBERASSIGNEDID$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubscriberAssignedID");
    private static final javax.xml.namespace.QName STATUSMESSAGE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StatusMessage");
    
    
    /**
     * Gets the "SubscriptionURN" element
     */
    public java.lang.String getSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriptionURN" element
     */
    public boolean isSetSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONURN$0) != 0;
        }
    }
    
    /**
     * Sets the "SubscriptionURN" element
     */
    public void setSubscriptionURN(java.lang.String subscriptionURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONURN$0);
            }
            target.setStringValue(subscriptionURN);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    public void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SUBSCRIPTIONURN$0);
            }
            target.set(subscriptionURN);
        }
    }
    
    /**
     * Unsets the "SubscriptionURN" element
     */
    public void unsetSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONURN$0, 0);
        }
    }
    
    /**
     * Gets the "SubscriberAssignedID" element
     */
    public java.lang.String getSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberAssignedID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberAssignedID" element
     */
    public boolean isSetSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERASSIGNEDID$2) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberAssignedID" element
     */
    public void setSubscriberAssignedID(java.lang.String subscriberAssignedID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERASSIGNEDID$2);
            }
            target.setStringValue(subscriberAssignedID);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberAssignedID" element
     */
    public void xsetSubscriberAssignedID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType subscriberAssignedID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(SUBSCRIBERASSIGNEDID$2);
            }
            target.set(subscriberAssignedID);
        }
    }
    
    /**
     * Unsets the "SubscriberAssignedID" element
     */
    public void unsetSubscriberAssignedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERASSIGNEDID$2, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$4, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$4);
            return target;
        }
    }
}
