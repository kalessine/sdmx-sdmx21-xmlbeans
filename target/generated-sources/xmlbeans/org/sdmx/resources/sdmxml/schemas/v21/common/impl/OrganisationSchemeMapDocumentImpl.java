/*
 * An XML document type.
 * Localname: OrganisationSchemeMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationSchemeMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one OrganisationSchemeMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class OrganisationSchemeMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationSchemeMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationSchemeMap");
    
    
    /**
     * Gets the "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONSCHEMEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeMap" element
     */
    public void setOrganisationSchemeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationSchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONSCHEMEMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONSCHEMEMAP$0);
            }
            target.set(organisationSchemeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONSCHEMEMAP$0);
            return target;
        }
    }
}
