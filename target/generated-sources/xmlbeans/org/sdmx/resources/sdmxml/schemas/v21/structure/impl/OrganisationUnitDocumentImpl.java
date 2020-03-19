/*
 * An XML document type.
 * Localname: OrganisationUnit
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one OrganisationUnit(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationUnit");
    
    
    /**
     * Gets the "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType getOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().find_element_user(ORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationUnit" element
     */
    public void setOrganisationUnit(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType organisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().find_element_user(ORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().add_element_user(ORGANISATIONUNIT$0);
            }
            target.set(organisationUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType addNewOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().add_element_user(ORGANISATIONUNIT$0);
            return target;
        }
    }
}
