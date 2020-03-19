/*
 * An XML document type.
 * Localname: Footer
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.footer.impl;
/**
 * A document containing one Footer(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer) element.
 *
 * This is a complex type.
 */
public class FooterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterDocument
{
    private static final long serialVersionUID = 1L;
    
    public FooterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FOOTER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer", "Footer");
    
    
    /**
     * Gets the "Footer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType getFooter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().find_element_user(FOOTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().find_element_user(FOOTER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().add_element_user(FOOTER$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType)get_store().add_element_user(FOOTER$0);
            return target;
        }
    }
}
