/*
 * An XML document type.
 * Localname: StructuredText
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.StructuredTextDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one StructuredText(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class StructuredTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.StructuredTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructuredTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDTEXT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "StructuredText");
    
    
    /**
     * Gets the "StructuredText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType getStructuredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().find_element_user(STRUCTUREDTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuredText" element
     */
    public void setStructuredText(org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType structuredText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().find_element_user(STRUCTUREDTEXT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().add_element_user(STRUCTUREDTEXT$0);
            }
            target.set(structuredText);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType addNewStructuredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().add_element_user(STRUCTUREDTEXT$0);
            return target;
        }
    }
}
