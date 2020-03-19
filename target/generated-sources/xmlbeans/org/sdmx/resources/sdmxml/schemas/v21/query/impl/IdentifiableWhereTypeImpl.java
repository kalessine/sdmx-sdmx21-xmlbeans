/*
 * XML Type:  IdentifiableWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.IdentifiableWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML IdentifiableWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class IdentifiableWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.AnnotableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.IdentifiableWhereType
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiableWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "URN");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ID");
    
    
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
     * Gets the "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(ID$2) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Appends and returns a new empty "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType addNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().add_element_user(ID$2);
            return target;
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
            get_store().remove_element(ID$2, 0);
        }
    }
}
