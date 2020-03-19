/*
 * XML Type:  VersionableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.VersionableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML VersionableType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class VersionableTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.NameableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.VersionableType
{
    private static final long serialVersionUID = 1L;
    
    public VersionableTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName VALIDFROM$2 = 
        new javax.xml.namespace.QName("", "validFrom");
    private static final javax.xml.namespace.QName VALIDTO$4 = 
        new javax.xml.namespace.QName("", "validTo");
    
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.VersionType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_default_attribute_value(VERSION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$0) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$0);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.sdmx.resources.sdmxml.schemas.v21.common.VersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().add_attribute_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$0);
        }
    }
    
    /**
     * Gets the "validFrom" attribute
     */
    public java.util.Calendar getValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validFrom" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$2);
            return target;
        }
    }
    
    /**
     * True if has "validFrom" attribute
     */
    public boolean isSetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROM$2) != null;
        }
    }
    
    /**
     * Sets the "validFrom" attribute
     */
    public void setValidFrom(java.util.Calendar validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$2);
            }
            target.setCalendarValue(validFrom);
        }
    }
    
    /**
     * Sets (as xml) the "validFrom" attribute
     */
    public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$2);
            }
            target.set(validFrom);
        }
    }
    
    /**
     * Unsets the "validFrom" attribute
     */
    public void unsetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROM$2);
        }
    }
    
    /**
     * Gets the "validTo" attribute
     */
    public java.util.Calendar getValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validTo" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$4);
            return target;
        }
    }
    
    /**
     * True if has "validTo" attribute
     */
    public boolean isSetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTO$4) != null;
        }
    }
    
    /**
     * Sets the "validTo" attribute
     */
    public void setValidTo(java.util.Calendar validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$4);
            }
            target.setCalendarValue(validTo);
        }
    }
    
    /**
     * Sets (as xml) the "validTo" attribute
     */
    public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$4);
            }
            target.set(validTo);
        }
    }
    
    /**
     * Unsets the "validTo" attribute
     */
    public void unsetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTO$4);
        }
    }
}
