/*
 * XML Type:  StructureReturnDetailsBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureReturnDetailsBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureReturnDetailsBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ReturnDetailsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsBaseType
{
    private static final long serialVersionUID = 1L;
    
    public StructureReturnDetailsBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETAIL$0 = 
        new javax.xml.namespace.QName("", "detail");
    
    
    /**
     * Gets the "detail" attribute
     */
    public java.lang.String getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DETAIL$0);
            }
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAIL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(DETAIL$0);
            }
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
            return get_store().find_attribute_user(DETAIL$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAIL$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DETAIL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DETAIL$0);
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
            get_store().remove_attribute(DETAIL$0);
        }
    }
}
