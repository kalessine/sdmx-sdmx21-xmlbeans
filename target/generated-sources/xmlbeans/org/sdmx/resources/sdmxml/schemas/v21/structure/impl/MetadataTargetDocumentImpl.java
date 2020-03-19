/*
 * An XML document type.
 * Localname: MetadataTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one MetadataTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class MetadataTargetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataTarget");
    
    
    /**
     * Gets the "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType getMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().find_element_user(METADATATARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataTarget" element
     */
    public void setMetadataTarget(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType metadataTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().find_element_user(METADATATARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().add_element_user(METADATATARGET$0);
            }
            target.set(metadataTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType addNewMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType)get_store().add_element_user(METADATATARGET$0);
            return target;
        }
    }
}
