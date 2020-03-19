/*
 * XML Type:  PartyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.PartyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML PartyType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class PartyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.PartyType
{
    private static final long serialVersionUID = 1L;
    
    public PartyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Name");
    private static final javax.xml.namespace.QName CONTACT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Contact");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "Name" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0);
        }
    }
    
    /**
     * Sets array of all "Name" element
     */
    public void setNameArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
    }
    
    /**
     * Sets ith "Name" element
     */
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, i);
        }
    }
    
    /**
     * Gets array of all "Contact" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ContactType[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.message.ContactType[] result = new org.sdmx.resources.sdmxml.schemas.v21.message.ContactType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Contact" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ContactType getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ContactType)get_store().find_element_user(CONTACT$2, i);
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
            return get_store().count_elements(CONTACT$2);
        }
    }
    
    /**
     * Sets array of all "Contact" element
     */
    public void setContactArray(org.sdmx.resources.sdmxml.schemas.v21.message.ContactType[] contactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactArray, CONTACT$2);
        }
    }
    
    /**
     * Sets ith "Contact" element
     */
    public void setContactArray(int i, org.sdmx.resources.sdmxml.schemas.v21.message.ContactType contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ContactType)get_store().find_element_user(CONTACT$2, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.message.ContactType insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ContactType)get_store().insert_element_user(CONTACT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Contact" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ContactType addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ContactType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ContactType)get_store().add_element_user(CONTACT$2);
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
            get_store().remove_element(CONTACT$2, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
}
