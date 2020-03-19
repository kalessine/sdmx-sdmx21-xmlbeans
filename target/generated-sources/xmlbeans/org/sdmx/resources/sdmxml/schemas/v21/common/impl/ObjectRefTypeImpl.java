/*
 * XML Type:  ObjectRefType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ObjectRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML ObjectRefType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class ObjectRefTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.RefBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ObjectRefType
{
    private static final long serialVersionUID = 1L;
    
    public ObjectRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("", "agencyID");
    private static final javax.xml.namespace.QName LOCAL$2 = 
        new javax.xml.namespace.QName("", "local");
    private static final javax.xml.namespace.QName CLASS1$4 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName PACKAGE$6 = 
        new javax.xml.namespace.QName("", "package");
    
    
    /**
     * Gets the "agencyID" attribute
     */
    public java.lang.String getAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agencyID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType xgetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().find_attribute_user(AGENCYID$0);
            return target;
        }
    }
    
    /**
     * True if has "agencyID" attribute
     */
    public boolean isSetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGENCYID$0) != null;
        }
    }
    
    /**
     * Sets the "agencyID" attribute
     */
    public void setAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCYID$0);
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) the "agencyID" attribute
     */
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().add_attribute_user(AGENCYID$0);
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Unsets the "agencyID" attribute
     */
    public void unsetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGENCYID$0);
        }
    }
    
    /**
     * Gets the "local" attribute
     */
    public boolean getLocal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCAL$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCAL$2);
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
            return get_store().find_attribute_user(LOCAL$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCAL$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCAL$2);
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
            get_store().remove_attribute(LOCAL$2);
        }
    }
    
    /**
     * Gets the "class" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$4);
            return target;
        }
    }
    
    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$4) != null;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
            }
            target.setEnumValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_attribute_user(CLASS1$4);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$6);
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
            return get_store().find_attribute_user(PACKAGE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().add_attribute_user(PACKAGE$6);
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
            get_store().remove_attribute(PACKAGE$6);
        }
    }
}
