/*
 * An XML document type.
 * Localname: MetadataTargetWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one MetadataTargetWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class MetadataTargetWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentListWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataTargetWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATARGETWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataTargetWhere");
    
    
    /**
     * Gets the "MetadataTargetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType getMetadataTargetWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().find_element_user(METADATATARGETWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataTargetWhere" element
     */
    public void setMetadataTargetWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType metadataTargetWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().find_element_user(METADATATARGETWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().add_element_user(METADATATARGETWHERE$0);
            }
            target.set(metadataTargetWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataTargetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType addNewMetadataTargetWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().add_element_user(METADATATARGETWHERE$0);
            return target;
        }
    }
}
