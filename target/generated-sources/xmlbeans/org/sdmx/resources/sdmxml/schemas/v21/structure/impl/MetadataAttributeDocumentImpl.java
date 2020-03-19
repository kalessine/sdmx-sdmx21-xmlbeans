/*
 * An XML document type.
 * Localname: MetadataAttribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one MetadataAttribute(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class MetadataAttributeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataAttribute");
    
    
    /**
     * Gets the "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType getMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().find_element_user(METADATAATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataAttribute" element
     */
    public void setMetadataAttribute(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType metadataAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().find_element_user(METADATAATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().add_element_user(METADATAATTRIBUTE$0);
            }
            target.set(metadataAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType addNewMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().add_element_user(METADATAATTRIBUTE$0);
            return target;
        }
    }
}
