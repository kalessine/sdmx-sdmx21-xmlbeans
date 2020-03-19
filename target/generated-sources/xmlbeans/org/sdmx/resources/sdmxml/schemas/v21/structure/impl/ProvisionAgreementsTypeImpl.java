/*
 * XML Type:  ProvisionAgreementsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ProvisionAgreementsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ProvisionAgreementsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType
{
    private static final long serialVersionUID = 1L;
    
    public ProvisionAgreementsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ProvisionAgreement");
    
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType[] getProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType getProvisionAgreementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType)get_store().find_element_user(PROVISIONAGREEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    public int sizeOfProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENT$0);
        }
    }
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType[] provisionAgreementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$0);
        }
    }
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType)get_store().find_element_user(PROVISIONAGREEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType insertNewProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType)get_store().insert_element_user(PROVISIONAGREEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementType)get_store().add_element_user(PROVISIONAGREEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    public void removeProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENT$0, i);
        }
    }
}
