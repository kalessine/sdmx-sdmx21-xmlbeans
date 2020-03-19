/*
 * XML Type:  OrganisationSchemeQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML OrganisationSchemeQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class OrganisationSchemeQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeQueryType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
