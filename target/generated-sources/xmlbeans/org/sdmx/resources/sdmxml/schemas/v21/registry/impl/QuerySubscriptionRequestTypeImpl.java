/*
 * XML Type:  QuerySubscriptionRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML QuerySubscriptionRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class QuerySubscriptionRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType
{
    private static final long serialVersionUID = 1L;
    
    public QuerySubscriptionRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Organisation");
    
    
    /**
     * Gets the "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().find_element_user(ORGANISATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organisation" element
     */
    public void setOrganisation(org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().find_element_user(ORGANISATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().add_element_user(ORGANISATION$0);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType)get_store().add_element_user(ORGANISATION$0);
            return target;
        }
    }
}
