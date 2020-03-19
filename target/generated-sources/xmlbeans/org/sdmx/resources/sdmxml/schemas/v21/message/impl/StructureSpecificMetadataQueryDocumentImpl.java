/*
 * An XML document type.
 * Localname: StructureSpecificMetadataQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSpecificMetadataQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificMetadataQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificMetadataQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESPECIFICMETADATAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSpecificMetadataQuery");
    
    
    /**
     * Gets the "StructureSpecificMetadataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType getStructureSpecificMetadataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().find_element_user(STRUCTURESPECIFICMETADATAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSpecificMetadataQuery" element
     */
    public void setStructureSpecificMetadataQuery(org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType structureSpecificMetadataQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().find_element_user(STRUCTURESPECIFICMETADATAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().add_element_user(STRUCTURESPECIFICMETADATAQUERY$0);
            }
            target.set(structureSpecificMetadataQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSpecificMetadataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType addNewStructureSpecificMetadataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().add_element_user(STRUCTURESPECIFICMETADATAQUERY$0);
            return target;
        }
    }
}
