/*
 * An XML document type.
 * Localname: OrganisationUnit
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one OrganisationUnit(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationUnit");
    
    
    /**
     * Gets the "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNIT$0, 0);
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
    public void setOrganisationUnit(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNIT$0);
            }
            target.set(organisationUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNIT$0);
            return target;
        }
    }
}
