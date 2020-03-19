/*
 * XML Type:  MessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.MessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML MessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class MessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.MessageType
{
    private static final long serialVersionUID = 1L;
    
    public MessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Header");
    private static final javax.xml.namespace.QName FOOTER$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer", "Footer");
    
    
    /**
     * Gets the "Header" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Header" element
     */
    public void setHeader(org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "Header" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "Footer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType getFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().find_element_user(FOOTER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Footer" element
     */
    public boolean isSetFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTER$2) != 0;
        }
    }
    
    /**
     * Sets the "Footer" element
     */
    public void setFooter(org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType footer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().find_element_user(FOOTER$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().add_element_user(FOOTER$2);
            }
            target.set(footer);
        }
    }
    
    /**
     * Appends and returns a new empty "Footer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType addNewFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().add_element_user(FOOTER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Footer" element
     */
    public void unsetFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTER$2, 0);
        }
    }
}
