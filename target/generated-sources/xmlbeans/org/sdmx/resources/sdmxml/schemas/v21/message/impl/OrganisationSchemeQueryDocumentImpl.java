/*
 * An XML document type.
 * Localname: OrganisationSchemeQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one OrganisationSchemeQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class OrganisationSchemeQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "OrganisationSchemeQuery");
    
    
    /**
     * Gets the "OrganisationSchemeQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType getOrganisationSchemeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType)get_store().find_element_user(ORGANISATIONSCHEMEQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeQuery" element
     */
    public void setOrganisationSchemeQuery(org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType organisationSchemeQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType)get_store().find_element_user(ORGANISATIONSCHEMEQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType)get_store().add_element_user(ORGANISATIONSCHEMEQUERY$0);
            }
            target.set(organisationSchemeQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemeQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType addNewOrganisationSchemeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.OrganisationSchemeQueryType)get_store().add_element_user(ORGANISATIONSCHEMEQUERY$0);
            return target;
        }
    }
}
