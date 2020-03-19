/*
 * XML Type:  QuerySubscriptionResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML QuerySubscriptionResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class QuerySubscriptionResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType
{
    private static final long serialVersionUID = 1L;
    
    public QuerySubscriptionResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StatusMessage");
    private static final javax.xml.namespace.QName SUBSCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Subscription");
    
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$0, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Subscription" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType[] getSubscriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIPTION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType getSubscriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().find_element_user(SUBSCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Subscription" element
     */
    public int sizeOfSubscriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTION$2);
        }
    }
    
    /**
     * Sets array of all "Subscription" element
     */
    public void setSubscriptionArray(org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType[] subscriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscriptionArray, SUBSCRIPTION$2);
        }
    }
    
    /**
     * Sets ith "Subscription" element
     */
    public void setSubscriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType subscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().find_element_user(SUBSCRIPTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType insertNewSubscription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().insert_element_user(SUBSCRIPTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType addNewSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().add_element_user(SUBSCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Subscription" element
     */
    public void removeSubscription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTION$2, i);
        }
    }
}
