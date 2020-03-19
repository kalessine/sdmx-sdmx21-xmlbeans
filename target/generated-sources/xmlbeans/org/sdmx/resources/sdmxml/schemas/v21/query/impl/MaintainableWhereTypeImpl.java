/*
 * XML Type:  MaintainableWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MaintainableWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MaintainableWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.VersionableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType
{
    private static final long serialVersionUID = 1L;
    
    public MaintainableWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AgencyID");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType getAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType)get_store().find_element_user(AGENCYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AgencyID" element
     */
    public boolean isSetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYID$0) != 0;
        }
    }
    
    /**
     * Sets the "AgencyID" element
     */
    public void setAgencyID(org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType)get_store().find_element_user(AGENCYID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType)get_store().add_element_user(AGENCYID$0);
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Appends and returns a new empty "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType addNewAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryNestedIDType)get_store().add_element_user(AGENCYID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "AgencyID" element
     */
    public void unsetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYID$0, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
}
