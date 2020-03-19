/*
 * An XML document type.
 * Localname: MetadataSchemaQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one MetadataSchemaQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class MetadataSchemaQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataSchemaQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASCHEMAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "MetadataSchemaQuery");
    
    
    /**
     * Gets the "MetadataSchemaQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType getMetadataSchemaQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType)get_store().find_element_user(METADATASCHEMAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataSchemaQuery" element
     */
    public void setMetadataSchemaQuery(org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType metadataSchemaQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType)get_store().find_element_user(METADATASCHEMAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType)get_store().add_element_user(METADATASCHEMAQUERY$0);
            }
            target.set(metadataSchemaQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataSchemaQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType addNewMetadataSchemaQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataSchemaQueryType)get_store().add_element_user(METADATASCHEMAQUERY$0);
            return target;
        }
    }
}
