/*
 * An XML document type.
 * Localname: MetadataStructureWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one MetadataStructureWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class MetadataStructureWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASTRUCTUREWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataStructureWhere");
    
    
    /**
     * Gets the "MetadataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType getMetadataStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType)get_store().find_element_user(METADATASTRUCTUREWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataStructureWhere" element
     */
    public void setMetadataStructureWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType metadataStructureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType)get_store().find_element_user(METADATASTRUCTUREWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType)get_store().add_element_user(METADATASTRUCTUREWHERE$0);
            }
            target.set(metadataStructureWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType addNewMetadataStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType)get_store().add_element_user(METADATASTRUCTUREWHERE$0);
            return target;
        }
    }
}
