/*
 * XML Type:  VersionableWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.VersionableWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML VersionableWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class VersionableWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.NameableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.VersionableWhereType
{
    private static final long serialVersionUID = 1L;
    
    public VersionableWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Version");
    private static final javax.xml.namespace.QName VERSIONTO$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "VersionTo");
    private static final javax.xml.namespace.QName VERSIONFROM$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "VersionFrom");
    private static final javax.xml.namespace.QName VERSIONACTIVE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "VersionActive");
    
    
    /**
     * Gets the "Version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Version" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType)get_store().find_element_user(VERSION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$0) != 0;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$0);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "Version" element
     */
    public void xsetVersion(org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType)get_store().add_element_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "Version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$0, 0);
        }
    }
    
    /**
     * Gets the "VersionTo" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getVersionTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(VERSIONTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VersionTo" element
     */
    public boolean isSetVersionTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONTO$2) != 0;
        }
    }
    
    /**
     * Sets the "VersionTo" element
     */
    public void setVersionTo(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType versionTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(VERSIONTO$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(VERSIONTO$2);
            }
            target.set(versionTo);
        }
    }
    
    /**
     * Appends and returns a new empty "VersionTo" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewVersionTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(VERSIONTO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "VersionTo" element
     */
    public void unsetVersionTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONTO$2, 0);
        }
    }
    
    /**
     * Gets the "VersionFrom" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getVersionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(VERSIONFROM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "VersionFrom" element
     */
    public boolean isSetVersionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONFROM$4) != 0;
        }
    }
    
    /**
     * Sets the "VersionFrom" element
     */
    public void setVersionFrom(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType versionFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(VERSIONFROM$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(VERSIONFROM$4);
            }
            target.set(versionFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "VersionFrom" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewVersionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(VERSIONFROM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "VersionFrom" element
     */
    public void unsetVersionFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONFROM$4, 0);
        }
    }
    
    /**
     * Gets the "VersionActive" element
     */
    public boolean getVersionActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONACTIVE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetVersionActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONACTIVE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "VersionActive" element
     */
    public boolean isSetVersionActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONACTIVE$6) != 0;
        }
    }
    
    /**
     * Sets the "VersionActive" element
     */
    public void setVersionActive(boolean versionActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONACTIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONACTIVE$6);
            }
            target.setBooleanValue(versionActive);
        }
    }
    
    /**
     * Sets (as xml) the "VersionActive" element
     */
    public void xsetVersionActive(org.apache.xmlbeans.XmlBoolean versionActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VERSIONACTIVE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VERSIONACTIVE$6);
            }
            target.set(versionActive);
        }
    }
    
    /**
     * Unsets the "VersionActive" element
     */
    public void unsetVersionActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONACTIVE$6, 0);
        }
    }
}
