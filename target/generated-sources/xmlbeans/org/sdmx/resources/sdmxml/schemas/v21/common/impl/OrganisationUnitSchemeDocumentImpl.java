/*
 * An XML document type.
 * Localname: OrganisationUnitScheme
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationUnitSchemeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one OrganisationUnitScheme(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitSchemeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationUnitSchemeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitSchemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationUnitScheme");
    
    
    /**
     * Gets the "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNITSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationUnitScheme" element
     */
    public void setOrganisationUnitScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationUnitScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNITSCHEME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNITSCHEME$0);
            }
            target.set(organisationUnitScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNITSCHEME$0);
            return target;
        }
    }
}
