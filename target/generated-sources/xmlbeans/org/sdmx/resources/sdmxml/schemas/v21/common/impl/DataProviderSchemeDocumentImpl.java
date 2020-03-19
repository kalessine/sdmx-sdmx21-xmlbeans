/*
 * An XML document type.
 * Localname: DataProviderScheme
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderSchemeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one DataProviderScheme(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class DataProviderSchemeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderSchemeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataProviderSchemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataProviderScheme");
    
    
    /**
     * Gets the "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAPROVIDERSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataProviderScheme" element
     */
    public void setDataProviderScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataProviderScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAPROVIDERSCHEME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAPROVIDERSCHEME$0);
            }
            target.set(dataProviderScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAPROVIDERSCHEME$0);
            return target;
        }
    }
}
