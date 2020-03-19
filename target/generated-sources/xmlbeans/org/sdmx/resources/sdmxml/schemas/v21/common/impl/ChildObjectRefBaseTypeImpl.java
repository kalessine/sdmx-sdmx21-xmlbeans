/*
 * XML Type:  ChildObjectRefBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML ChildObjectRefBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class ChildObjectRefBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.RefBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType
{
    private static final long serialVersionUID = 1L;
    
    public ChildObjectRefBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("", "agencyID");
    private static final javax.xml.namespace.QName MAINTAINABLEPARENTID$2 = 
        new javax.xml.namespace.QName("", "maintainableParentID");
    private static final javax.xml.namespace.QName MAINTAINABLEPARENTVERSION$4 = 
        new javax.xml.namespace.QName("", "maintainableParentVersion");
    private static final javax.xml.namespace.QName LOCAL$6 = 
        new javax.xml.namespace.QName("", "local");
    
    
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
     * Gets the "maintainableParentID" attribute
     */
    public java.lang.String getMaintainableParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAINTAINABLEPARENTID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maintainableParentID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetMaintainableParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(MAINTAINABLEPARENTID$2);
            return target;
        }
    }
    
    /**
     * True if has "maintainableParentID" attribute
     */
    public boolean isSetMaintainableParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAINTAINABLEPARENTID$2) != null;
        }
    }
    
    /**
     * Sets the "maintainableParentID" attribute
     */
    public void setMaintainableParentID(java.lang.String maintainableParentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAINTAINABLEPARENTID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAINTAINABLEPARENTID$2);
            }
            target.setStringValue(maintainableParentID);
        }
    }
    
    /**
     * Sets (as xml) the "maintainableParentID" attribute
     */
    public void xsetMaintainableParentID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType maintainableParentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(MAINTAINABLEPARENTID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(MAINTAINABLEPARENTID$2);
            }
            target.set(maintainableParentID);
        }
    }
    
    /**
     * Unsets the "maintainableParentID" attribute
     */
    public void unsetMaintainableParentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAINTAINABLEPARENTID$2);
        }
    }
    
    /**
     * Gets the "maintainableParentVersion" attribute
     */
    public java.lang.String getMaintainableParentVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAINTAINABLEPARENTVERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAINTAINABLEPARENTVERSION$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maintainableParentVersion" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.VersionType xgetMaintainableParentVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(MAINTAINABLEPARENTVERSION$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_default_attribute_value(MAINTAINABLEPARENTVERSION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "maintainableParentVersion" attribute
     */
    public boolean isSetMaintainableParentVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAINTAINABLEPARENTVERSION$4) != null;
        }
    }
    
    /**
     * Sets the "maintainableParentVersion" attribute
     */
    public void setMaintainableParentVersion(java.lang.String maintainableParentVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAINTAINABLEPARENTVERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAINTAINABLEPARENTVERSION$4);
            }
            target.setStringValue(maintainableParentVersion);
        }
    }
    
    /**
     * Sets (as xml) the "maintainableParentVersion" attribute
     */
    public void xsetMaintainableParentVersion(org.sdmx.resources.sdmxml.schemas.v21.common.VersionType maintainableParentVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(MAINTAINABLEPARENTVERSION$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().add_attribute_user(MAINTAINABLEPARENTVERSION$4);
            }
            target.set(maintainableParentVersion);
        }
    }
    
    /**
     * Unsets the "maintainableParentVersion" attribute
     */
    public void unsetMaintainableParentVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAINTAINABLEPARENTVERSION$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LOCAL$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LOCAL$6);
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
            return get_store().find_attribute_user(LOCAL$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCAL$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCAL$6);
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
            get_store().remove_attribute(LOCAL$6);
        }
    }
}
