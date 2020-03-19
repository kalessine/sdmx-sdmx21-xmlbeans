/*
 * XML Type:  NotificationURLType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML NotificationURLType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType.
 */
public class NotificationURLTypeImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType
{
    private static final long serialVersionUID = 1L;
    
    public NotificationURLTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected NotificationURLTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ISSOAP$0 = 
        new javax.xml.namespace.QName("", "isSOAP");
    
    
    /**
     * Gets the "isSOAP" attribute
     */
    public boolean getIsSOAP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSOAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISSOAP$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSOAP" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsSOAP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSOAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISSOAP$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "isSOAP" attribute
     */
    public boolean isSetIsSOAP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISSOAP$0) != null;
        }
    }
    
    /**
     * Sets the "isSOAP" attribute
     */
    public void setIsSOAP(boolean isSOAP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSOAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSOAP$0);
            }
            target.setBooleanValue(isSOAP);
        }
    }
    
    /**
     * Sets (as xml) the "isSOAP" attribute
     */
    public void xsetIsSOAP(org.apache.xmlbeans.XmlBoolean isSOAP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSOAP$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISSOAP$0);
            }
            target.set(isSOAP);
        }
    }
    
    /**
     * Unsets the "isSOAP" attribute
     */
    public void unsetIsSOAP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISSOAP$0);
        }
    }
}
