/*
 * An XML document type.
 * Localname: MetadataflowWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one MetadataflowWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class MetadataflowWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataflowWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAFLOWWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataflowWhere");
    
    
    /**
     * Gets the "MetadataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType getMetadataflowWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType)get_store().find_element_user(METADATAFLOWWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataflowWhere" element
     */
    public void setMetadataflowWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType metadataflowWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType)get_store().find_element_user(METADATAFLOWWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType)get_store().add_element_user(METADATAFLOWWHERE$0);
            }
            target.set(metadataflowWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType addNewMetadataflowWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataflowWhereType)get_store().add_element_user(METADATAFLOWWHERE$0);
            return target;
        }
    }
}
