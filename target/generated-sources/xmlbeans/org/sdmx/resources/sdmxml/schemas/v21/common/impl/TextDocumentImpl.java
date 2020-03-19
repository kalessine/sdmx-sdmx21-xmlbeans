/*
 * An XML document type.
 * Localname: Text
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.TextDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one Text(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Text");
    
    
    /**
     * Gets the "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(org.sdmx.resources.sdmxml.schemas.v21.common.TextType text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
}
