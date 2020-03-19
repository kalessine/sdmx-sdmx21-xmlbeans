/*
 * An XML document type.
 * Localname: MetadataAttribute
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.MetadataAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one MetadataAttribute(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class MetadataAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.MetadataAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MetadataAttribute");
    
    
    /**
     * Gets the "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAATTRIBUTE$0, 0);
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
    public void setMetadataAttribute(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAATTRIBUTE$0);
            }
            target.set(metadataAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAATTRIBUTE$0);
            return target;
        }
    }
}
