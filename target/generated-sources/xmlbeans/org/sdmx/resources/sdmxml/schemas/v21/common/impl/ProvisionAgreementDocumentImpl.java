/*
 * An XML document type.
 * Localname: ProvisionAgreement
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ProvisionAgreement(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ProvisionAgreementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvisionAgreementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ProvisionAgreement");
    
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROVISIONAGREEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProvisionAgreement" element
     */
    public void setProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROVISIONAGREEMENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROVISIONAGREEMENT$0);
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROVISIONAGREEMENT$0);
            return target;
        }
    }
}
