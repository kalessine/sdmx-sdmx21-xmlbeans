/*
 * An XML document type.
 * Localname: AttributeDescriptor
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AttributeDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one AttributeDescriptor(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class AttributeDescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AttributeDescriptorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeDescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AttributeDescriptor");
    
    
    /**
     * Gets the "AttributeDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAttributeDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTRIBUTEDESCRIPTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttributeDescriptor" element
     */
    public void setAttributeDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType attributeDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTRIBUTEDESCRIPTOR$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTRIBUTEDESCRIPTOR$0);
            }
            target.set(attributeDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAttributeDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTRIBUTEDESCRIPTOR$0);
            return target;
        }
    }
}
