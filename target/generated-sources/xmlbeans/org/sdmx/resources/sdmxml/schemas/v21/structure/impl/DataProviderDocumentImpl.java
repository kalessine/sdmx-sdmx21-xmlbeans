/*
 * An XML document type.
 * Localname: DataProvider
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one DataProvider(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class DataProviderDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataProviderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROVIDER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataProvider");
    
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().find_element_user(DATAPROVIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().find_element_user(DATAPROVIDER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().add_element_user(DATAPROVIDER$0);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderType)get_store().add_element_user(DATAPROVIDER$0);
            return target;
        }
    }
}
