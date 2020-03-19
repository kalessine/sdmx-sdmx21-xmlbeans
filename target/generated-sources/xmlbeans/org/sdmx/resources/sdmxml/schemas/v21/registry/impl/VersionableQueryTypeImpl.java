/*
 * XML Type:  VersionableQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML VersionableQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class VersionableQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.registry.impl.IdentifiableQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableQueryType
{
    private static final long serialVersionUID = 1L;
    
    public VersionableQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("", "version");
    
    
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType)get_default_attribute_value(VERSION$0);
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
    public void xsetVersion(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType)get_store().add_attribute_user(VERSION$0);
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
}
