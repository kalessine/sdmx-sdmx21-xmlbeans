/*
 * An XML document type.
 * Localname: OrganisationWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one OrganisationWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class OrganisationWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "OrganisationWhere");
    
    
    /**
     * Gets the "OrganisationWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType getOrganisationWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType)get_store().find_element_user(ORGANISATIONWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationWhere" element
     */
    public void setOrganisationWhere(org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType organisationWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType)get_store().find_element_user(ORGANISATIONWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType)get_store().add_element_user(ORGANISATIONWHERE$0);
            }
            target.set(organisationWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType addNewOrganisationWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationWhereType)get_store().add_element_user(ORGANISATIONWHERE$0);
            return target;
        }
    }
}
