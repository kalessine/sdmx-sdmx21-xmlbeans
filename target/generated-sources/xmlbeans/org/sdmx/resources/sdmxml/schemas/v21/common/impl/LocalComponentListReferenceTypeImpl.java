/*
 * XML Type:  LocalComponentListReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML LocalComponentListReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class LocalComponentListReferenceTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.ReferenceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public LocalComponentListReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REF$0 = 
        new javax.xml.namespace.QName("", "Ref");
    
    
    /**
     * Gets the "Ref" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType)get_store().find_element_user(REF$0, 0);
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
            return get_store().count_elements(REF$0) != 0;
        }
    }
    
    /**
     * Sets the "Ref" element
     */
    public void setRef(org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType)get_store().find_element_user(REF$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType)get_store().add_element_user(REF$0);
            }
            target.set(ref);
        }
    }
    
    /**
     * Appends and returns a new empty "Ref" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType addNewRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType)get_store().add_element_user(REF$0);
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
            get_store().remove_element(REF$0, 0);
        }
    }
}
