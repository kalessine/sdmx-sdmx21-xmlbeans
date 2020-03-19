/*
 * An XML document type.
 * Localname: ProvisionAgreementQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one ProvisionAgreementQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class ProvisionAgreementQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvisionAgreementQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ProvisionAgreementQuery");
    
    
    /**
     * Gets the "ProvisionAgreementQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType getProvisionAgreementQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType)get_store().find_element_user(PROVISIONAGREEMENTQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProvisionAgreementQuery" element
     */
    public void setProvisionAgreementQuery(org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType provisionAgreementQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType)get_store().find_element_user(PROVISIONAGREEMENTQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType)get_store().add_element_user(PROVISIONAGREEMENTQUERY$0);
            }
            target.set(provisionAgreementQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreementQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType addNewProvisionAgreementQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProvisionAgreementQueryType)get_store().add_element_user(PROVISIONAGREEMENTQUERY$0);
            return target;
        }
    }
}
