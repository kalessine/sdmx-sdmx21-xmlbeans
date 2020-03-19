/*
 * An XML document type.
 * Localname: MetadataStructureComponents
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one MetadataStructureComponents(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class MetadataStructureComponentsDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.GroupingDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureComponentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASTRUCTURECOMPONENTS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataStructureComponents");
    
    
    /**
     * Gets the "MetadataStructureComponents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType getMetadataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType)get_store().find_element_user(METADATASTRUCTURECOMPONENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataStructureComponents" element
     */
    public void setMetadataStructureComponents(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType metadataStructureComponents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType)get_store().find_element_user(METADATASTRUCTURECOMPONENTS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType)get_store().add_element_user(METADATASTRUCTURECOMPONENTS$0);
            }
            target.set(metadataStructureComponents);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructureComponents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType addNewMetadataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType)get_store().add_element_user(METADATASTRUCTURECOMPONENTS$0);
            return target;
        }
    }
}
