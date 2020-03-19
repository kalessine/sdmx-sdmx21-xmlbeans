/*
 * XML Type:  IncludedCodelistReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML IncludedCodelistReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class IncludedCodelistReferenceTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.CodelistReferenceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public IncludedCodelistReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIAS$0 = 
        new javax.xml.namespace.QName("", "alias");
    
    
    /**
     * Gets the "alias" attribute
     */
    public java.lang.String getAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIAS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alias" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ALIAS$0);
            return target;
        }
    }
    
    /**
     * True if has "alias" attribute
     */
    public boolean isSetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIAS$0) != null;
        }
    }
    
    /**
     * Sets the "alias" attribute
     */
    public void setAlias(java.lang.String alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIAS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIAS$0);
            }
            target.setStringValue(alias);
        }
    }
    
    /**
     * Sets (as xml) the "alias" attribute
     */
    public void xsetAlias(org.sdmx.resources.sdmxml.schemas.v21.common.IDType alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ALIAS$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ALIAS$0);
            }
            target.set(alias);
        }
    }
    
    /**
     * Unsets the "alias" attribute
     */
    public void unsetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIAS$0);
        }
    }
}
