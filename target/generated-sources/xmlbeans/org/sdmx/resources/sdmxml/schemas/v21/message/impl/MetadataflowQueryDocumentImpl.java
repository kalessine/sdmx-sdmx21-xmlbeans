/*
 * An XML document type.
 * Localname: MetadataflowQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one MetadataflowQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class MetadataflowQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataflowQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAFLOWQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "MetadataflowQuery");
    
    
    /**
     * Gets the "MetadataflowQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType getMetadataflowQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType)get_store().find_element_user(METADATAFLOWQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataflowQuery" element
     */
    public void setMetadataflowQuery(org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType metadataflowQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType)get_store().find_element_user(METADATAFLOWQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType)get_store().add_element_user(METADATAFLOWQUERY$0);
            }
            target.set(metadataflowQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataflowQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType addNewMetadataflowQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataflowQueryType)get_store().add_element_user(METADATAFLOWQUERY$0);
            return target;
        }
    }
}
