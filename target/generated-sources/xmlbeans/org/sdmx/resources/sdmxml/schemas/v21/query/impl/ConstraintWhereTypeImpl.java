/*
 * XML Type:  ConstraintWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ConstraintWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ConstraintWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ConstraintWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTATTACHMENTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConstraintAttachmentWhere");
    private static final javax.xml.namespace.QName ALLOWABLE$2 = 
        new javax.xml.namespace.QName("", "allowable");
    
    
    /**
     * Gets the "ConstraintAttachmentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType getConstraintAttachmentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType)get_store().find_element_user(CONSTRAINTATTACHMENTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConstraintAttachmentWhere" element
     */
    public boolean isSetConstraintAttachmentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTATTACHMENTWHERE$0) != 0;
        }
    }
    
    /**
     * Sets the "ConstraintAttachmentWhere" element
     */
    public void setConstraintAttachmentWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType constraintAttachmentWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType)get_store().find_element_user(CONSTRAINTATTACHMENTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType)get_store().add_element_user(CONSTRAINTATTACHMENTWHERE$0);
            }
            target.set(constraintAttachmentWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintAttachmentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType addNewConstraintAttachmentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintAttachmentWhereType)get_store().add_element_user(CONSTRAINTATTACHMENTWHERE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ConstraintAttachmentWhere" element
     */
    public void unsetConstraintAttachmentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTATTACHMENTWHERE$0, 0);
        }
    }
    
    /**
     * Gets the "allowable" attribute
     */
    public boolean getAllowable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWABLE$2);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "allowable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAllowable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWABLE$2);
            return target;
        }
    }
    
    /**
     * True if has "allowable" attribute
     */
    public boolean isSetAllowable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALLOWABLE$2) != null;
        }
    }
    
    /**
     * Sets the "allowable" attribute
     */
    public void setAllowable(boolean allowable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWABLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWABLE$2);
            }
            target.setBooleanValue(allowable);
        }
    }
    
    /**
     * Sets (as xml) the "allowable" attribute
     */
    public void xsetAllowable(org.apache.xmlbeans.XmlBoolean allowable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ALLOWABLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ALLOWABLE$2);
            }
            target.set(allowable);
        }
    }
    
    /**
     * Unsets the "allowable" attribute
     */
    public void unsetAllowable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALLOWABLE$2);
        }
    }
}
