/*
 * XML Type:  MetadataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MetadataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MetadataStructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.StructureTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * True if has "MetadataStructureComponents" element
     */
    public boolean isSetMetadataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURECOMPONENTS$0) != 0;
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
    
    /**
     * Unsets the "MetadataStructureComponents" element
     */
    public void unsetMetadataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURECOMPONENTS$0, 0);
        }
    }
}
