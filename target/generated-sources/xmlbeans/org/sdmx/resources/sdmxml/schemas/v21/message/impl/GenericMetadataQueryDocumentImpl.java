/*
 * An XML document type.
 * Localname: GenericMetadataQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.GenericMetadataQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one GenericMetadataQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class GenericMetadataQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.GenericMetadataQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericMetadataQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICMETADATAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "GenericMetadataQuery");
    
    
    /**
     * Gets the "GenericMetadataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType getGenericMetadataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().find_element_user(GENERICMETADATAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericMetadataQuery" element
     */
    public void setGenericMetadataQuery(org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType genericMetadataQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().find_element_user(GENERICMETADATAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().add_element_user(GENERICMETADATAQUERY$0);
            }
            target.set(genericMetadataQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericMetadataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType addNewGenericMetadataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.MetadataQueryType)get_store().add_element_user(GENERICMETADATAQUERY$0);
            return target;
        }
    }
}
