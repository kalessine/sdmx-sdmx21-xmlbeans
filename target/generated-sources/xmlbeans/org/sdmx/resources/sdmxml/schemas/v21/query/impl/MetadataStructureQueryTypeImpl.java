/*
 * XML Type:  MetadataStructureQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataStructureQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataStructureQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureQueryType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
