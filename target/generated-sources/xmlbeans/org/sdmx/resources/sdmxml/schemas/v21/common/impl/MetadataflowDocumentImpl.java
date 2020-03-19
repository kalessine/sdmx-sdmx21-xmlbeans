/*
 * An XML document type.
 * Localname: Metadataflow
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one Metadataflow(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class MetadataflowDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataflowDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAFLOW$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Metadataflow");
    
    
    /**
     * Gets the "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAFLOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Metadataflow" element
     */
    public void setMetadataflow(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAFLOW$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAFLOW$0);
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAFLOW$0);
            return target;
        }
    }
}
