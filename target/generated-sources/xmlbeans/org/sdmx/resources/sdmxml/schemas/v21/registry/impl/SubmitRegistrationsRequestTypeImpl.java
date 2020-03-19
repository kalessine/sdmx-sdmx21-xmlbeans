/*
 * XML Type:  SubmitRegistrationsRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmitRegistrationsRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmitRegistrationsRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitRegistrationsRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "RegistrationRequest");
    
    
    /**
     * Gets array of all "RegistrationRequest" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType[] getRegistrationRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRATIONREQUEST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType getRegistrationRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType)get_store().find_element_user(REGISTRATIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RegistrationRequest" element
     */
    public int sizeOfRegistrationRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "RegistrationRequest" element
     */
    public void setRegistrationRequestArray(org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType[] registrationRequestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(registrationRequestArray, REGISTRATIONREQUEST$0);
        }
    }
    
    /**
     * Sets ith "RegistrationRequest" element
     */
    public void setRegistrationRequestArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType registrationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType)get_store().find_element_user(REGISTRATIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(registrationRequest);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType insertNewRegistrationRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType)get_store().insert_element_user(REGISTRATIONREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType addNewRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationRequestType)get_store().add_element_user(REGISTRATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RegistrationRequest" element
     */
    public void removeRegistrationRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONREQUEST$0, i);
        }
    }
}
