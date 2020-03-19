/*
 * An XML document type.
 * Localname: Agency
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Agency(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class AgencyDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgencyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Agency");
    
    
    /**
     * Gets the "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType getAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().find_element_user(AGENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Agency" element
     */
    public void setAgency(org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType agency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().find_element_user(AGENCY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().add_element_user(AGENCY$0);
            }
            target.set(agency);
        }
    }
    
    /**
     * Appends and returns a new empty "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType addNewAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().add_element_user(AGENCY$0);
            return target;
        }
    }
}
