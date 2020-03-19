/*
 * XML Type:  OrganisationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML OrganisationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class OrganisationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.BaseOrganisationTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Contact");
    
    
    /**
     * Gets array of all "Contact" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Contact" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType)get_store().find_element_user(CONTACT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Contact" element
     */
    public int sizeOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACT$0);
        }
    }
    
    /**
     * Sets array of all "Contact" element
     */
    public void setContactArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType[] contactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactArray, CONTACT$0);
        }
    }
    
    /**
     * Sets ith "Contact" element
     */
    public void setContactArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType)get_store().find_element_user(CONTACT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Contact" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType)get_store().insert_element_user(CONTACT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Contact" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType)get_store().add_element_user(CONTACT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Contact" element
     */
    public void removeContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACT$0, i);
        }
    }
}
