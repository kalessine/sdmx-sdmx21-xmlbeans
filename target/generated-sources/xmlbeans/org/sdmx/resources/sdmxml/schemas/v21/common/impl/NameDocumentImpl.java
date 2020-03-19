/*
 * An XML document type.
 * Localname: Name
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.NameDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one Name(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Name");
    
    
    /**
     * Gets the "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(org.sdmx.resources.sdmxml.schemas.v21.common.TextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
}
