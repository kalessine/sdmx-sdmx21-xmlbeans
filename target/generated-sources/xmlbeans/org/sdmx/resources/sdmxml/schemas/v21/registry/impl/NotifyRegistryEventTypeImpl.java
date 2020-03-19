/*
 * XML Type:  NotifyRegistryEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML NotifyRegistryEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class NotifyRegistryEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType
{
    private static final long serialVersionUID = 1L;
    
    public NotifyRegistryEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTTIME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "EventTime");
    private static final javax.xml.namespace.QName OBJECTURN$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ObjectURN");
    private static final javax.xml.namespace.QName REGISTRATIONID$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "RegistrationID");
    private static final javax.xml.namespace.QName SUBSCRIPTIONURN$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubscriptionURN");
    private static final javax.xml.namespace.QName EVENTACTION$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "EventAction");
    private static final javax.xml.namespace.QName STRUCTURALEVENT$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StructuralEvent");
    private static final javax.xml.namespace.QName REGISTRATIONEVENT$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "RegistrationEvent");
    
    
    /**
     * Gets the "EventTime" element
     */
    public java.util.Calendar getEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEventTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EventTime" element
     */
    public void setEventTime(java.util.Calendar eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTIME$0);
            }
            target.setCalendarValue(eventTime);
        }
    }
    
    /**
     * Sets (as xml) the "EventTime" element
     */
    public void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTTIME$0);
            }
            target.set(eventTime);
        }
    }
    
    /**
     * Gets the "ObjectURN" element
     */
    public java.lang.String getObjectURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTURN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetObjectURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBJECTURN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectURN" element
     */
    public boolean isSetObjectURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTURN$2) != 0;
        }
    }
    
    /**
     * Sets the "ObjectURN" element
     */
    public void setObjectURN(java.lang.String objectURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTURN$2);
            }
            target.setStringValue(objectURN);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectURN" element
     */
    public void xsetObjectURN(org.apache.xmlbeans.XmlAnyURI objectURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(OBJECTURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(OBJECTURN$2);
            }
            target.set(objectURN);
        }
    }
    
    /**
     * Unsets the "ObjectURN" element
     */
    public void unsetObjectURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTURN$2, 0);
        }
    }
    
    /**
     * Gets the "RegistrationID" element
     */
    public java.lang.String getRegistrationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegistrationID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetRegistrationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(REGISTRATIONID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "RegistrationID" element
     */
    public boolean isSetRegistrationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONID$4) != 0;
        }
    }
    
    /**
     * Sets the "RegistrationID" element
     */
    public void setRegistrationID(java.lang.String registrationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATIONID$4);
            }
            target.setStringValue(registrationID);
        }
    }
    
    /**
     * Sets (as xml) the "RegistrationID" element
     */
    public void xsetRegistrationID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType registrationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(REGISTRATIONID$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(REGISTRATIONID$4);
            }
            target.set(registrationID);
        }
    }
    
    /**
     * Unsets the "RegistrationID" element
     */
    public void unsetRegistrationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONID$4, 0);
        }
    }
    
    /**
     * Gets the "SubscriptionURN" element
     */
    public java.lang.String getSubscriptionURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$6, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$6, 0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIPTIONURN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIPTIONURN$6);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(SUBSCRIPTIONURN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(SUBSCRIPTIONURN$6);
            }
            target.set(subscriptionURN);
        }
    }
    
    /**
     * Gets the "EventAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getEventAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTACTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetEventAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_element_user(EVENTACTION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EventAction" element
     */
    public void setEventAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum eventAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTACTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTACTION$8);
            }
            target.setEnumValue(eventAction);
        }
    }
    
    /**
     * Sets (as xml) the "EventAction" element
     */
    public void xsetEventAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType eventAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_element_user(EVENTACTION$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_element_user(EVENTACTION$8);
            }
            target.set(eventAction);
        }
    }
    
    /**
     * Gets the "StructuralEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType getStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType)get_store().find_element_user(STRUCTURALEVENT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructuralEvent" element
     */
    public boolean isSetStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURALEVENT$10) != 0;
        }
    }
    
    /**
     * Sets the "StructuralEvent" element
     */
    public void setStructuralEvent(org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType structuralEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType)get_store().find_element_user(STRUCTURALEVENT$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType)get_store().add_element_user(STRUCTURALEVENT$10);
            }
            target.set(structuralEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuralEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType addNewStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType)get_store().add_element_user(STRUCTURALEVENT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "StructuralEvent" element
     */
    public void unsetStructuralEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURALEVENT$10, 0);
        }
    }
    
    /**
     * Gets the "RegistrationEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType getRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType)get_store().find_element_user(REGISTRATIONEVENT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RegistrationEvent" element
     */
    public boolean isSetRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONEVENT$12) != 0;
        }
    }
    
    /**
     * Sets the "RegistrationEvent" element
     */
    public void setRegistrationEvent(org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType registrationEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType)get_store().find_element_user(REGISTRATIONEVENT$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType)get_store().add_element_user(REGISTRATIONEVENT$12);
            }
            target.set(registrationEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "RegistrationEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType addNewRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType)get_store().add_element_user(REGISTRATIONEVENT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "RegistrationEvent" element
     */
    public void unsetRegistrationEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONEVENT$12, 0);
        }
    }
}
