/*
 * An XML document type.
 * Localname: Attribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Attribute(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class AttributeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Attribute");
    
    
    /**
     * Gets the "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().find_element_user(ATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Attribute" element
     */
    public void setAttribute(org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().find_element_user(ATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().add_element_user(ATTRIBUTE$0);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Appends and returns a new empty "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType)get_store().add_element_user(ATTRIBUTE$0);
            return target;
        }
    }
}
