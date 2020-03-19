/*
 * XML Type:  MaintainableEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML MaintainableEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class MaintainableEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType
{
    private static final long serialVersionUID = 1L;
    
    public MaintainableEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "URN");
    private static final javax.xml.namespace.QName REF$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Ref");
    
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URN" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "URN" element
     */
    public boolean isSetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URN$0) != 0;
        }
    }
    
    /**
     * Sets the "URN" element
     */
    public void setURN(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$0);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "URN" element
     */
    public void xsetURN(org.apache.xmlbeans.XmlAnyURI urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URN$0);
            }
            target.set(urn);
        }
    }
    
    /**
     * Unsets the "URN" element
     */
    public void unsetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URN$0, 0);
        }
    }
    
    /**
     * Gets the "Ref" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Ref" element
     */
    public boolean isSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REF$2) != 0;
        }
    }
    
    /**
     * Sets the "Ref" element
     */
    public void setRef(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType)get_store().add_element_user(REF$2);
            }
            target.set(ref);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType addNewRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableQueryType)get_store().add_element_user(REF$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Ref" element
     */
    public void unsetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REF$2, 0);
        }
    }
}
