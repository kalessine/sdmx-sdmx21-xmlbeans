/*
 * An XML document type.
 * Localname: Error
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ErrorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one Error(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class ErrorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Error");
    
    
    /**
     * Gets the "Error" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType getError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Error" element
     */
    public void setError(org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType)get_store().find_element_user(ERROR$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType)get_store().add_element_user(ERROR$0);
            }
            target.set(error);
        }
    }
    
    /**
     * Appends and returns a new empty "Error" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
}
