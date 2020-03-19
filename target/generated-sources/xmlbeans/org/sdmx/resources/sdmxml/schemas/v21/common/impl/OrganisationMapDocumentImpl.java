/*
 * An XML document type.
 * Localname: OrganisationMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one OrganisationMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class OrganisationMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationMap");
    
    
    /**
     * Gets the "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONMAP$0, 0);
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
    public void setOrganisationMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONMAP$0);
            }
            target.set(organisationMap);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONMAP$0);
            return target;
        }
    }
}
