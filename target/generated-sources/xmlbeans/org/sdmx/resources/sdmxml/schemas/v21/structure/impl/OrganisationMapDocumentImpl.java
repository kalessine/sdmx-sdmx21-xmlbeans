/*
 * An XML document type.
 * Localname: OrganisationMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one OrganisationMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class OrganisationMapDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemAssociationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationMap");
    
    
    /**
     * Gets the "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType getOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().find_element_user(ORGANISATIONMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationMap" element
     */
    public void setOrganisationMap(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType organisationMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().find_element_user(ORGANISATIONMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().add_element_user(ORGANISATIONMAP$0);
            }
            target.set(organisationMap);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType addNewOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().add_element_user(ORGANISATIONMAP$0);
            return target;
        }
    }
}
