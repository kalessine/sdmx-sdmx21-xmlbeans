/*
 * XML Type:  LocalMetadataStructureComponentRefType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataStructureComponentRefType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML LocalMetadataStructureComponentRefType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class LocalMetadataStructureComponentRefTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.LocalComponentListComponentRefBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.LocalMetadataStructureComponentRefType
{
    private static final long serialVersionUID = 1L;
    
    public LocalMetadataStructureComponentRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINERID$0 = 
        new javax.xml.namespace.QName("", "containerID");
    private static final javax.xml.namespace.QName CLASS1$2 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName PACKAGE$4 = 
        new javax.xml.namespace.QName("", "package");
    
    
    /**
     * Gets the "containerID" attribute
     */
    public java.lang.String getContainerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINERID$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().find_attribute_user(CONTAINERID$0);
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
            return get_store().find_attribute_user(CONTAINERID$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTAINERID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTAINERID$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().find_attribute_user(CONTAINERID$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedIDType)get_store().add_attribute_user(CONTAINERID$0);
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
            get_store().remove_attribute(CONTAINERID$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$2);
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
            return get_store().find_attribute_user(CLASS1$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_attribute_user(CLASS1$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_attribute_user(CLASS1$2);
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
            get_store().remove_attribute(CLASS1$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PACKAGE$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_default_attribute_value(PACKAGE$4);
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
            return get_store().find_attribute_user(PACKAGE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGE$4);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().find_attribute_user(PACKAGE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.PackageTypeCodelistType)get_store().add_attribute_user(PACKAGE$4);
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
            get_store().remove_attribute(PACKAGE$4);
        }
    }
}
