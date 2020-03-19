/*
 * An XML document type.
 * Localname: TextValue
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TextValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one TextValue(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class TextValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TextValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTVALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TextValue");
    
    
    /**
     * Gets the "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getTextValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXTVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TextValue" element
     */
    public void setTextValue(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType textValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXTVALUE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(TEXTVALUE$0);
            }
            target.set(textValue);
        }
    }
    
    /**
     * Appends and returns a new empty "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewTextValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(TEXTVALUE$0);
            return target;
        }
    }
}
