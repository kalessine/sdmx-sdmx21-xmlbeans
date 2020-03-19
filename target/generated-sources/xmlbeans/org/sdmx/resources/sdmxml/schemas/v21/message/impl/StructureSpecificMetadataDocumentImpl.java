/*
 * An XML document type.
 * Localname: StructureSpecificMetadata
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSpecificMetadata(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESPECIFICMETADATA$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSpecificMetadata");
    
    
    /**
     * Gets the "StructureSpecificMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType getStructureSpecificMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType)get_store().find_element_user(STRUCTURESPECIFICMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSpecificMetadata" element
     */
    public void setStructureSpecificMetadata(org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType structureSpecificMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType)get_store().find_element_user(STRUCTURESPECIFICMETADATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType)get_store().add_element_user(STRUCTURESPECIFICMETADATA$0);
            }
            target.set(structureSpecificMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSpecificMetadata" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType addNewStructureSpecificMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificMetadataType)get_store().add_element_user(STRUCTURESPECIFICMETADATA$0);
            return target;
        }
    }
}
