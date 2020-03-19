/*
 * XML Type:  IdentifiableObjectEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML IdentifiableObjectEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class IdentifiableObjectEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiableObjectEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALL$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "All");
    private static final javax.xml.namespace.QName URN$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "URN");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ID");
    
    
    /**
     * Gets the "All" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "All" element
     */
    public boolean isSetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALL$0) != 0;
        }
    }
    
    /**
     * Sets the "All" element
     */
    public void setAll(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALL$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALL$0);
            }
            target.set(all);
        }
    }
    
    /**
     * Appends and returns a new empty "All" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "All" element
     */
    public void unsetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALL$0, 0);
        }
    }
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$2, 0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$2, 0);
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
            return get_store().count_elements(URN$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$2);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URN$2);
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
            get_store().remove_element(URN$2, 0);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType)get_store().find_element_user(ID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$4) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IDQueryType)get_store().add_element_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$4, 0);
        }
    }
}
