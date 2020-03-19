/*
 * XML Type:  SenderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SenderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SenderType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SenderTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.PartyTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SenderType
{
    private static final long serialVersionUID = 1L;
    
    public SenderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEZONE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Timezone");
    
    
    /**
     * Gets the "Timezone" element
     */
    public java.lang.String getTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Timezone" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType xgetTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType)get_store().find_element_user(TIMEZONE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Timezone" element
     */
    public boolean isSetTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$0) != 0;
        }
    }
    
    /**
     * Sets the "Timezone" element
     */
    public void setTimezone(java.lang.String timezone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONE$0);
            }
            target.setStringValue(timezone);
        }
    }
    
    /**
     * Sets (as xml) the "Timezone" element
     */
    public void xsetTimezone(org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType timezone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType)get_store().find_element_user(TIMEZONE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimezoneType)get_store().add_element_user(TIMEZONE$0);
            }
            target.set(timezone);
        }
    }
    
    /**
     * Unsets the "Timezone" element
     */
    public void unsetTimezone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$0, 0);
        }
    }
}
