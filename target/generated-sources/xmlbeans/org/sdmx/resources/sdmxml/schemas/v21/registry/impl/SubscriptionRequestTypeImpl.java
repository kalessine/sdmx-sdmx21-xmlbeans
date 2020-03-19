/*
 * XML Type:  SubscriptionRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubscriptionRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubscriptionRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Subscription");
    private static final javax.xml.namespace.QName ACTION$2 = 
        new javax.xml.namespace.QName("", "action");
    
    
    /**
     * Gets the "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType getSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().find_element_user(SUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subscription" element
     */
    public void setSubscription(org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType subscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().find_element_user(SUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().add_element_user(SUBSCRIPTION$0);
            }
            target.set(subscription);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscription" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType addNewSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType)get_store().add_element_user(SUBSCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$2);
            return target;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$2);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_attribute_user(ACTION$2);
            }
            target.set(action);
        }
    }
}
