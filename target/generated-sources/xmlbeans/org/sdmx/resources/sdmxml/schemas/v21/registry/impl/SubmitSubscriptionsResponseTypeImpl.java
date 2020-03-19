/*
 * XML Type:  SubmitSubscriptionsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmitSubscriptionsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmitSubscriptionsResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitSubscriptionsResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubscriptionStatus");
    
    
    /**
     * Gets array of all "SubscriptionStatus" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType[] getSubscriptionStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIPTIONSTATUS$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubscriptionStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType getSubscriptionStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType)get_store().find_element_user(SUBSCRIPTIONSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubscriptionStatus" element
     */
    public int sizeOfSubscriptionStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONSTATUS$0);
        }
    }
    
    /**
     * Sets array of all "SubscriptionStatus" element
     */
    public void setSubscriptionStatusArray(org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType[] subscriptionStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscriptionStatusArray, SUBSCRIPTIONSTATUS$0);
        }
    }
    
    /**
     * Sets ith "SubscriptionStatus" element
     */
    public void setSubscriptionStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType subscriptionStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType)get_store().find_element_user(SUBSCRIPTIONSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscriptionStatus);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriptionStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType insertNewSubscriptionStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType)get_store().insert_element_user(SUBSCRIPTIONSTATUS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriptionStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType addNewSubscriptionStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionStatusType)get_store().add_element_user(SUBSCRIPTIONSTATUS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubscriptionStatus" element
     */
    public void removeSubscriptionStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONSTATUS$0, i);
        }
    }
}
