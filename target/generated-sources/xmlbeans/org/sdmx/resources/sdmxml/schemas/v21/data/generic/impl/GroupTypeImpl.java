/*
 * XML Type:  GroupType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.generic.impl;
/**
 * An XML GroupType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic).
 *
 * This is a complex type.
 */
public class GroupTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType
{
    private static final long serialVersionUID = 1L;
    
    public GroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPKEY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "GroupKey");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Attributes");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "GroupKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType getGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(GROUPKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GroupKey" element
     */
    public boolean isSetGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPKEY$0) != 0;
        }
    }
    
    /**
     * Sets the "GroupKey" element
     */
    public void setGroupKey(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType groupKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(GROUPKEY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(GROUPKEY$0);
            }
            target.set(groupKey);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType addNewGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(GROUPKEY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "GroupKey" element
     */
    public void unsetGroupKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPKEY$0, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$2);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$2);
            return target;
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.IDType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
}
