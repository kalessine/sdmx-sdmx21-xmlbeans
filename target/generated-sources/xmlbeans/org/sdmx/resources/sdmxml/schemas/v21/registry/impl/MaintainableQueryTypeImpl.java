/*
 * XML Type:  MaintainableQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML MaintainableQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class MaintainableQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.registry.impl.VersionableQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType
{
    private static final long serialVersionUID = 1L;
    
    public MaintainableQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("", "agencyID");
    
    
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AGENCYID$0);
            }
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType xgetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_default_attribute_value(AGENCYID$0);
            }
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
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().add_attribute_user(AGENCYID$0);
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
}
