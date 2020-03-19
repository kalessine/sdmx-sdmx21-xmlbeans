/*
 * XML Type:  ReturnDetailsBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReturnDetailsBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ReturnDetailsBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ReturnDetailsBaseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReturnDetailsBaseType
{
    private static final long serialVersionUID = 1L;
    
    public ReturnDetailsBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFAULTLIMIT$0 = 
        new javax.xml.namespace.QName("", "defaultLimit");
    private static final javax.xml.namespace.QName DETAIL$2 = 
        new javax.xml.namespace.QName("", "detail");
    
    
    /**
     * Gets the "defaultLimit" attribute
     */
    public java.math.BigInteger getDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTLIMIT$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "defaultLimit" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DEFAULTLIMIT$0);
            return target;
        }
    }
    
    /**
     * True if has "defaultLimit" attribute
     */
    public boolean isSetDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULTLIMIT$0) != null;
        }
    }
    
    /**
     * Sets the "defaultLimit" attribute
     */
    public void setDefaultLimit(java.math.BigInteger defaultLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTLIMIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTLIMIT$0);
            }
            target.setBigIntegerValue(defaultLimit);
        }
    }
    
    /**
     * Sets (as xml) the "defaultLimit" attribute
     */
    public void xsetDefaultLimit(org.apache.xmlbeans.XmlInteger defaultLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(DEFAULTLIMIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(DEFAULTLIMIT$0);
            }
            target.set(defaultLimit);
        }
    }
    
    /**
     * Unsets the "defaultLimit" attribute
     */
    public void unsetDefaultLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULTLIMIT$0);
        }
    }
    
    /**
     * Gets the "detail" attribute
     */
    public java.lang.String getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "detail" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAIL$2);
            return target;
        }
    }
    
    /**
     * True if has "detail" attribute
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETAIL$2) != null;
        }
    }
    
    /**
     * Sets the "detail" attribute
     */
    public void setDetail(java.lang.String detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAIL$2);
            }
            target.setStringValue(detail);
        }
    }
    
    /**
     * Sets (as xml) the "detail" attribute
     */
    public void xsetDetail(org.apache.xmlbeans.XmlString detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAIL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETAIL$2);
            }
            target.set(detail);
        }
    }
    
    /**
     * Unsets the "detail" attribute
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETAIL$2);
        }
    }
}
