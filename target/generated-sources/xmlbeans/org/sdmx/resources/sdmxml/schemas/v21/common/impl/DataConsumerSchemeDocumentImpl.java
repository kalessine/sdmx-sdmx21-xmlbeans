/*
 * An XML document type.
 * Localname: DataConsumerScheme
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DataConsumerSchemeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one DataConsumerScheme(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class DataConsumerSchemeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DataConsumerSchemeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataConsumerSchemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATACONSUMERSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataConsumerScheme");
    
    
    /**
     * Gets the "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATACONSUMERSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataConsumerScheme" element
     */
    public void setDataConsumerScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataConsumerScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATACONSUMERSCHEME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATACONSUMERSCHEME$0);
            }
            target.set(dataConsumerScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATACONSUMERSCHEME$0);
            return target;
        }
    }
}
