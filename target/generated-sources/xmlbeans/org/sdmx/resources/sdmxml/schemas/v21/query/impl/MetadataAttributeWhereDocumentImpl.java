/*
 * An XML document type.
 * Localname: MetadataAttributeWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one MetadataAttributeWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class MetadataAttributeWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeWhere");
    
    
    /**
     * Gets the "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType getMetadataAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().find_element_user(METADATAATTRIBUTEWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataAttributeWhere" element
     */
    public void setMetadataAttributeWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType metadataAttributeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().find_element_user(METADATAATTRIBUTEWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().add_element_user(METADATAATTRIBUTEWHERE$0);
            }
            target.set(metadataAttributeWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType addNewMetadataAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().add_element_user(METADATAATTRIBUTEWHERE$0);
            return target;
        }
    }
}
