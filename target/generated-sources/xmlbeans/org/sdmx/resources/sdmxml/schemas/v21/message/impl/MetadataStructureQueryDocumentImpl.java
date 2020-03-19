/*
 * An XML document type.
 * Localname: MetadataStructureQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one MetadataStructureQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class MetadataStructureQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASTRUCTUREQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "MetadataStructureQuery");
    
    
    /**
     * Gets the "MetadataStructureQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType getMetadataStructureQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType)get_store().find_element_user(METADATASTRUCTUREQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataStructureQuery" element
     */
    public void setMetadataStructureQuery(org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType metadataStructureQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType)get_store().find_element_user(METADATASTRUCTUREQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType)get_store().add_element_user(METADATASTRUCTUREQUERY$0);
            }
            target.set(metadataStructureQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructureQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType addNewMetadataStructureQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataStructureQueryType)get_store().add_element_user(METADATASTRUCTUREQUERY$0);
            return target;
        }
    }
}
