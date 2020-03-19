/*
 * XML Type:  SubmitRegistrationsResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmitRegistrationsResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmitRegistrationsResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationsResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATIONSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "RegistrationStatus");
    
    
    /**
     * Gets array of all "RegistrationStatus" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType[] getRegistrationStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRATIONSTATUS$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RegistrationStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType getRegistrationStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType)get_store().find_element_user(REGISTRATIONSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RegistrationStatus" element
     */
    public int sizeOfRegistrationStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONSTATUS$0);
        }
    }
    
    /**
     * Sets array of all "RegistrationStatus" element
     */
    public void setRegistrationStatusArray(org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType[] registrationStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(registrationStatusArray, REGISTRATIONSTATUS$0);
        }
    }
    
    /**
     * Sets ith "RegistrationStatus" element
     */
    public void setRegistrationStatusArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType registrationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType)get_store().find_element_user(REGISTRATIONSTATUS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(registrationStatus);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType insertNewRegistrationStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType)get_store().insert_element_user(REGISTRATIONSTATUS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationStatus" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType addNewRegistrationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationStatusType)get_store().add_element_user(REGISTRATIONSTATUS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RegistrationStatus" element
     */
    public void removeRegistrationStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONSTATUS$0, i);
        }
    }
}
