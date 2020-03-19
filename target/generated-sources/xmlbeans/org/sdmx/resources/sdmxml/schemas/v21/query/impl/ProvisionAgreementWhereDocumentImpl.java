/*
 * An XML document type.
 * Localname: ProvisionAgreementWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ProvisionAgreementWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ProvisionAgreementWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvisionAgreementWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProvisionAgreementWhere");
    
    
    /**
     * Gets the "ProvisionAgreementWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType getProvisionAgreementWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType)get_store().find_element_user(PROVISIONAGREEMENTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProvisionAgreementWhere" element
     */
    public void setProvisionAgreementWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType provisionAgreementWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType)get_store().find_element_user(PROVISIONAGREEMENTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType)get_store().add_element_user(PROVISIONAGREEMENTWHERE$0);
            }
            target.set(provisionAgreementWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreementWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType addNewProvisionAgreementWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType)get_store().add_element_user(PROVISIONAGREEMENTWHERE$0);
            return target;
        }
    }
}
