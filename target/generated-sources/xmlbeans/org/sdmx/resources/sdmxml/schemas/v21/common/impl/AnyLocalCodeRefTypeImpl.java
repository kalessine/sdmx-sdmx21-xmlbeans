/*
 * XML Type:  AnyLocalCodeRefType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML AnyLocalCodeRefType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class AnyLocalCodeRefTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.RefBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AnyLocalCodeRefType
{
    private static final long serialVersionUID = 1L;
    
    public AnyLocalCodeRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCAL$0 = 
        new javax.xml.namespace.QName("", "local");
    private static final javax.xml.namespace.QName PACKAGE$2 = 
        new javax.xml.namespace.QName("", "package");
    
    
    /**
     * Gets the "local" attribute
     */
    public boolean getLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCAL$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "local" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCAL$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "local" attribute
     */
    public boolean isSetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCAL$0) != null;
        }
    }
    
    /**
     * Sets the "local" attribute
     */
    public void setLocal(boolean local)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCAL$0);
            }
            target.setBooleanValue(local);
        }
    }
    
    /**
     * Sets (as xml) the "local" attribute
     */
    public void xsetLocal(org.apache.xmlbeans.XmlBoolean local)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCAL$0);
            }
            target.set(local);
        }
    }
    
    /**
     * Unsets the "local" attribute
     */
    public void unsetLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCAL$0);
        }
    }
    
    /**
     * Gets the "package" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType.Enum getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PACKAGE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "package" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType xgetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_default_attribute_value(PACKAGE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "package" attribute
     */
    public boolean isSetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PACKAGE$2) != null;
        }
    }
    
    /**
     * Sets the "package" attribute
     */
    public void setPackage(org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType.Enum xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$2);
            }
            target.setEnumValue(xpackage);
        }
    }
    
    /**
     * Sets (as xml) the "package" attribute
     */
    public void xsetPackage(org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().add_attribute_user(PACKAGE$2);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Unsets the "package" attribute
     */
    public void unsetPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PACKAGE$2);
        }
    }
}
