/*
 * XML Type:  MetadataSchemaQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataSchemaQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataSchemaQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataSchemaQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataSchemaQueryType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataSchemaQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataStructure");
    
    
    /**
     * Gets the "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType getMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType)get_store().find_element_user(METADATASTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataStructure" element
     */
    public void setMetadataStructure(org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType)get_store().find_element_user(METADATASTRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType)get_store().add_element_user(METADATASTRUCTURE$0);
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.GenericMetadataStructureType)get_store().add_element_user(METADATASTRUCTURE$0);
            return target;
        }
    }
}
