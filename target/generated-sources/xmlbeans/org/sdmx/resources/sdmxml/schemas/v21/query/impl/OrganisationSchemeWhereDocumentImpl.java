/*
 * An XML document type.
 * Localname: OrganisationSchemeWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one OrganisationSchemeWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class OrganisationSchemeWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "OrganisationSchemeWhere");
    
    
    /**
     * Gets the "OrganisationSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType getOrganisationSchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType)get_store().find_element_user(ORGANISATIONSCHEMEWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeWhere" element
     */
    public void setOrganisationSchemeWhere(org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType organisationSchemeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType)get_store().find_element_user(ORGANISATIONSCHEMEWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType)get_store().add_element_user(ORGANISATIONSCHEMEWHERE$0);
            }
            target.set(organisationSchemeWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType addNewOrganisationSchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeWhereType)get_store().add_element_user(ORGANISATIONSCHEMEWHERE$0);
            return target;
        }
    }
}
