/*
 * An XML document type.
 * Localname: DataConsumer
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one DataConsumer(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class DataConsumerDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataConsumerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATACONSUMER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataConsumer");
    
    
    /**
     * Gets the "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType getDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().find_element_user(DATACONSUMER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataConsumer" element
     */
    public void setDataConsumer(org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType dataConsumer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().find_element_user(DATACONSUMER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().add_element_user(DATACONSUMER$0);
            }
            target.set(dataConsumer);
        }
    }
    
    /**
     * Appends and returns a new empty "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType addNewDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerType)get_store().add_element_user(DATACONSUMER$0);
            return target;
        }
    }
}
