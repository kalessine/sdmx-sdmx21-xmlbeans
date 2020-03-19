/*
 * XML Type:  SubmitSubscriptionsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmitSubscriptionsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubscriptionRequest");
    
    
    /**
     * Gets array of all "SubscriptionRequest" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType[] getSubscriptionRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIPTIONREQUEST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType getSubscriptionRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType)get_store().find_element_user(SUBSCRIPTIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubscriptionRequest" element
     */
    public int sizeOfSubscriptionRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "SubscriptionRequest" element
     */
    public void setSubscriptionRequestArray(org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType[] subscriptionRequestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscriptionRequestArray, SUBSCRIPTIONREQUEST$0);
        }
    }
    
    /**
     * Sets ith "SubscriptionRequest" element
     */
    public void setSubscriptionRequestArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType subscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType)get_store().find_element_user(SUBSCRIPTIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscriptionRequest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType insertNewSubscriptionRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType)get_store().insert_element_user(SUBSCRIPTIONREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType addNewSubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType)get_store().add_element_user(SUBSCRIPTIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubscriptionRequest" element
     */
    public void removeSubscriptionRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONREQUEST$0, i);
        }
    }
}
