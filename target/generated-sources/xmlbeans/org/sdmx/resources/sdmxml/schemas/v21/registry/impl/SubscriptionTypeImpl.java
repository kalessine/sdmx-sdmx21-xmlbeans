/*
 * XML Type:  SubscriptionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubscriptionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubscriptionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Organisation");
    private static final javax.xml.namespace.QName REGISTRYURN$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "RegistryURN");
    private static final javax.xml.namespace.QName NOTIFICATIONMAILTO$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "NotificationMailTo");
    private static final javax.xml.namespace.QName NOTIFICATIONHTTP$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "NotificationHTTP");
    private static final javax.xml.namespace.QName SUBSCRIBERASSIGNEDID$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubscriberAssignedID");
    private static final javax.xml.namespace.QName VALIDITYPERIOD$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ValidityPeriod");
    private static final javax.xml.namespace.QName EVENTSELECTOR$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "EventSelector");
    
    
    /**
     * Gets the "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().find_element_user(ORGANISATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organisation" element
     */
    public void setOrganisation(org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().find_element_user(ORGANISATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().add_element_user(ORGANISATION$0);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().add_element_user(ORGANISATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "RegistryURN" element
     */
    public java.lang.String getRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYURN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegistryURN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REGISTRYURN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RegistryURN" element
     */
    public boolean isSetRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRYURN$2) != 0;
        }
    }
    
    /**
     * Sets the "RegistryURN" element
     */
    public void setRegistryURN(java.lang.String registryURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRYURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRYURN$2);
            }
            target.setStringValue(registryURN);
        }
    }
    
    /**
     * Sets (as xml) the "RegistryURN" element
     */
    public void xsetRegistryURN(org.apache.xmlbeans.XmlAnyURI registryURN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(REGISTRYURN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(REGISTRYURN$2);
            }
            target.set(registryURN);
        }
    }
    
    /**
     * Unsets the "RegistryURN" element
     */
    public void unsetRegistryURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRYURN$2, 0);
        }
    }
    
    /**
     * Gets array of all "NotificationMailTo" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] getNotificationMailToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOTIFICATIONMAILTO$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NotificationMailTo" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType getNotificationMailToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().find_element_user(NOTIFICATIONMAILTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NotificationMailTo" element
     */
    public int sizeOfNotificationMailToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONMAILTO$4);
        }
    }
    
    /**
     * Sets array of all "NotificationMailTo" element
     */
    public void setNotificationMailToArray(org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] notificationMailToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(notificationMailToArray, NOTIFICATIONMAILTO$4);
        }
    }
    
    /**
     * Sets ith "NotificationMailTo" element
     */
    public void setNotificationMailToArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType notificationMailTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().find_element_user(NOTIFICATIONMAILTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(notificationMailTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationMailTo" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType insertNewNotificationMailTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().insert_element_user(NOTIFICATIONMAILTO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationMailTo" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType addNewNotificationMailTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().add_element_user(NOTIFICATIONMAILTO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "NotificationMailTo" element
     */
    public void removeNotificationMailTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONMAILTO$4, i);
        }
    }
    
    /**
     * Gets array of all "NotificationHTTP" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] getNotificationHTTPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOTIFICATIONHTTP$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "NotificationHTTP" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType getNotificationHTTPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().find_element_user(NOTIFICATIONHTTP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "NotificationHTTP" element
     */
    public int sizeOfNotificationHTTPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFICATIONHTTP$6);
        }
    }
    
    /**
     * Sets array of all "NotificationHTTP" element
     */
    public void setNotificationHTTPArray(org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] notificationHTTPArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(notificationHTTPArray, NOTIFICATIONHTTP$6);
        }
    }
    
    /**
     * Sets ith "NotificationHTTP" element
     */
    public void setNotificationHTTPArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType notificationHTTP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().find_element_user(NOTIFICATIONHTTP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(notificationHTTP);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationHTTP" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType insertNewNotificationHTTP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().insert_element_user(NOTIFICATIONHTTP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationHTTP" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType addNewNotificationHTTP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType)get_store().add_element_user(NOTIFICATIONHTTP$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "NotificationHTTP" element
     */
    public void removeNotificationHTTP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFICATIONHTTP$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
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
            return get_store().count_elements(SUBSCRIBERASSIGNEDID$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERASSIGNEDID$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(SUBSCRIBERASSIGNEDID$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(SUBSCRIBERASSIGNEDID$8);
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
            get_store().remove_element(SUBSCRIBERASSIGNEDID$8, 0);
        }
    }
    
    /**
     * Gets the "ValidityPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType getValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType)get_store().find_element_user(VALIDITYPERIOD$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValidityPeriod" element
     */
    public void setValidityPeriod(org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType validityPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType)get_store().find_element_user(VALIDITYPERIOD$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType)get_store().add_element_user(VALIDITYPERIOD$10);
            }
            target.set(validityPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType addNewValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType)get_store().add_element_user(VALIDITYPERIOD$10);
            return target;
        }
    }
    
    /**
     * Gets the "EventSelector" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType getEventSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType)get_store().find_element_user(EVENTSELECTOR$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventSelector" element
     */
    public void setEventSelector(org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType eventSelector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType)get_store().find_element_user(EVENTSELECTOR$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType)get_store().add_element_user(EVENTSELECTOR$12);
            }
            target.set(eventSelector);
        }
    }
    
    /**
     * Appends and returns a new empty "EventSelector" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType addNewEventSelector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType)get_store().add_element_user(EVENTSELECTOR$12);
            return target;
        }
    }
}
