/*
 * XML Type:  RefBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML RefBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class RefBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType
{
    private static final long serialVersionUID = 1L;
    
    public RefBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("", "agencyID");
    private static final javax.xml.namespace.QName MAINTAINABLEPARENTID$2 = 
        new javax.xml.namespace.QName("", "maintainableParentID");
    private static final javax.xml.namespace.QName MAINTAINABLEPARENTVERSION$4 = 
        new javax.xml.namespace.QName("", "maintainableParentVersion");
    private static final javax.xml.namespace.QName CONTAINERID$6 = 
        new javax.xml.namespace.QName("", "containerID");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName VERSION$10 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName LOCAL$12 = 
        new javax.xml.namespace.QName("", "local");
    private static final javax.xml.namespace.QName CLASS1$14 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName PACKAGE$16 = 
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
     * Gets the "containerID" attribute
     */
    public java.lang.String getContainerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINERID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "containerID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType xgetContainerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().find_attribute_user(CONTAINERID$6);
            return target;
        }
    }
    
    /**
     * True if has "containerID" attribute
     */
    public boolean isSetContainerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTAINERID$6) != null;
        }
    }
    
    /**
     * Sets the "containerID" attribute
     */
    public void setContainerID(java.lang.String containerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINERID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINERID$6);
            }
            target.setStringValue(containerID);
        }
    }
    
    /**
     * Sets (as xml) the "containerID" attribute
     */
    public void xsetContainerID(org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType containerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().find_attribute_user(CONTAINERID$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().add_attribute_user(CONTAINERID$6);
            }
            target.set(containerID);
        }
    }
    
    /**
     * Unsets the "containerID" attribute
     */
    public void unsetContainerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTAINERID$6);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().find_attribute_user(ID$8);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(VERSION$10);
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
            return get_store().find_attribute_user(VERSION$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().add_attribute_user(VERSION$10);
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
            get_store().remove_attribute(VERSION$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$12);
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
            return get_store().find_attribute_user(LOCAL$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCAL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCAL$12);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LOCAL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LOCAL$12);
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
            get_store().remove_attribute(LOCAL$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$14);
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
            return get_store().find_attribute_user(CLASS1$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_attribute_user(CLASS1$14);
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
            get_store().remove_attribute(CLASS1$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$16);
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
            return get_store().find_attribute_user(PACKAGE$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().add_attribute_user(PACKAGE$16);
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
            get_store().remove_attribute(PACKAGE$16);
        }
    }
}
