/*
 * XML Type:  ContactType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ContactType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML ContactType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class ContactTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ContactType
{
    private static final long serialVersionUID = 1L;
    
    public ContactTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Name");
    private static final javax.xml.namespace.QName DEPARTMENT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Department");
    private static final javax.xml.namespace.QName ROLE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Role");
    private static final javax.xml.namespace.QName TELEPHONE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Telephone");
    private static final javax.xml.namespace.QName FAX$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Fax");
    private static final javax.xml.namespace.QName X400$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "X400");
    private static final javax.xml.namespace.QName URI$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "URI");
    private static final javax.xml.namespace.QName EMAIL$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Email");
    
    
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
     * Gets array of all "Department" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getDepartmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPARTMENT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Department" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getDepartmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(DEPARTMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Department" element
     */
    public int sizeOfDepartmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPARTMENT$2);
        }
    }
    
    /**
     * Sets array of all "Department" element
     */
    public void setDepartmentArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] departmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(departmentArray, DEPARTMENT$2);
        }
    }
    
    /**
     * Sets ith "Department" element
     */
    public void setDepartmentArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType department)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(DEPARTMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(department);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Department" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewDepartment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(DEPARTMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Department" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(DEPARTMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Department" element
     */
    public void removeDepartment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPARTMENT$2, i);
        }
    }
    
    /**
     * Gets array of all "Role" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Role" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(ROLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$4);
        }
    }
    
    /**
     * Sets array of all "Role" element
     */
    public void setRoleArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$4);
        }
    }
    
    /**
     * Sets ith "Role" element
     */
    public void setRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(ROLE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Role" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(ROLE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Role" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(ROLE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$4, i);
        }
    }
    
    /**
     * Gets array of all "Telephone" elements
     */
    public java.lang.String[] getTelephoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONE$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Telephone" element
     */
    public java.lang.String getTelephoneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Telephone" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetTelephoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONE$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Telephone" element
     */
    public org.apache.xmlbeans.XmlString xgetTelephoneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Telephone" element
     */
    public int sizeOfTelephoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONE$6);
        }
    }
    
    /**
     * Sets array of all "Telephone" element
     */
    public void setTelephoneArray(java.lang.String[] telephoneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneArray, TELEPHONE$6);
        }
    }
    
    /**
     * Sets ith "Telephone" element
     */
    public void setTelephoneArray(int i, java.lang.String telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEPHONE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(telephone);
        }
    }
    
    /**
     * Sets (as xml) array of all "Telephone" element
     */
    public void xsetTelephoneArray(org.apache.xmlbeans.XmlString[]telephoneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneArray, TELEPHONE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "Telephone" element
     */
    public void xsetTelephoneArray(int i, org.apache.xmlbeans.XmlString telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TELEPHONE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephone);
        }
    }
    
    /**
     * Inserts the value as the ith "Telephone" element
     */
    public void insertTelephone(int i, java.lang.String telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TELEPHONE$6, i);
            target.setStringValue(telephone);
        }
    }
    
    /**
     * Appends the value as the last "Telephone" element
     */
    public void addTelephone(java.lang.String telephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEPHONE$6);
            target.setStringValue(telephone);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Telephone" element
     */
    public org.apache.xmlbeans.XmlString insertNewTelephone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(TELEPHONE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Telephone" element
     */
    public org.apache.xmlbeans.XmlString addNewTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TELEPHONE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Telephone" element
     */
    public void removeTelephone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONE$6, i);
        }
    }
    
    /**
     * Gets array of all "Fax" elements
     */
    public java.lang.String[] getFaxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAX$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Fax" element
     */
    public java.lang.String getFaxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Fax" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetFaxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAX$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Fax" element
     */
    public org.apache.xmlbeans.XmlString xgetFaxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Fax" element
     */
    public int sizeOfFaxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAX$8);
        }
    }
    
    /**
     * Sets array of all "Fax" element
     */
    public void setFaxArray(java.lang.String[] faxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(faxArray, FAX$8);
        }
    }
    
    /**
     * Sets ith "Fax" element
     */
    public void setFaxArray(int i, java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(fax);
        }
    }
    
    /**
     * Sets (as xml) array of all "Fax" element
     */
    public void xsetFaxArray(org.apache.xmlbeans.XmlString[]faxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(faxArray, FAX$8);
        }
    }
    
    /**
     * Sets (as xml) ith "Fax" element
     */
    public void xsetFaxArray(int i, org.apache.xmlbeans.XmlString fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fax);
        }
    }
    
    /**
     * Inserts the value as the ith "Fax" element
     */
    public void insertFax(int i, java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FAX$8, i);
            target.setStringValue(fax);
        }
    }
    
    /**
     * Appends the value as the last "Fax" element
     */
    public void addFax(java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$8);
            target.setStringValue(fax);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Fax" element
     */
    public org.apache.xmlbeans.XmlString insertNewFax(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(FAX$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Fax" element
     */
    public org.apache.xmlbeans.XmlString addNewFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAX$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Fax" element
     */
    public void removeFax(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAX$8, i);
        }
    }
    
    /**
     * Gets array of all "X400" elements
     */
    public java.lang.String[] getX400Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X400$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "X400" element
     */
    public java.lang.String getX400Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X400$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "X400" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetX400Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(X400$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "X400" element
     */
    public org.apache.xmlbeans.XmlString xgetX400Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(X400$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "X400" element
     */
    public int sizeOfX400Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(X400$10);
        }
    }
    
    /**
     * Sets array of all "X400" element
     */
    public void setX400Array(java.lang.String[] x400Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(x400Array, X400$10);
        }
    }
    
    /**
     * Sets ith "X400" element
     */
    public void setX400Array(int i, java.lang.String x400)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X400$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(x400);
        }
    }
    
    /**
     * Sets (as xml) array of all "X400" element
     */
    public void xsetX400Array(org.apache.xmlbeans.XmlString[]x400Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(x400Array, X400$10);
        }
    }
    
    /**
     * Sets (as xml) ith "X400" element
     */
    public void xsetX400Array(int i, org.apache.xmlbeans.XmlString x400)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(X400$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(x400);
        }
    }
    
    /**
     * Inserts the value as the ith "X400" element
     */
    public void insertX400(int i, java.lang.String x400)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(X400$10, i);
            target.setStringValue(x400);
        }
    }
    
    /**
     * Appends the value as the last "X400" element
     */
    public void addX400(java.lang.String x400)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X400$10);
            target.setStringValue(x400);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "X400" element
     */
    public org.apache.xmlbeans.XmlString insertNewX400(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(X400$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "X400" element
     */
    public org.apache.xmlbeans.XmlString addNewX400()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(X400$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "X400" element
     */
    public void removeX400(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(X400$10, i);
        }
    }
    
    /**
     * Gets array of all "URI" elements
     */
    public java.lang.String[] getURIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(URI$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "URI" element
     */
    public java.lang.String getURIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "URI" elements
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetURIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(URI$12, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "URI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetURIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlAnyURI)target;
        }
    }
    
    /**
     * Returns number of "URI" element
     */
    public int sizeOfURIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URI$12);
        }
    }
    
    /**
     * Sets array of all "URI" element
     */
    public void setURIArray(java.lang.String[] uriArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uriArray, URI$12);
        }
    }
    
    /**
     * Sets ith "URI" element
     */
    public void setURIArray(int i, java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) array of all "URI" element
     */
    public void xsetURIArray(org.apache.xmlbeans.XmlAnyURI[]uriArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uriArray, URI$12);
        }
    }
    
    /**
     * Sets (as xml) ith "URI" element
     */
    public void xsetURIArray(int i, org.apache.xmlbeans.XmlAnyURI uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URI$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(uri);
        }
    }
    
    /**
     * Inserts the value as the ith "URI" element
     */
    public void insertURI(int i, java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(URI$12, i);
            target.setStringValue(uri);
        }
    }
    
    /**
     * Appends the value as the last "URI" element
     */
    public void addURI(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URI$12);
            target.setStringValue(uri);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "URI" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewURI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(URI$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "URI" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URI$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "URI" element
     */
    public void removeURI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URI$12, i);
        }
    }
    
    /**
     * Gets array of all "Email" elements
     */
    public java.lang.String[] getEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMAIL$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Email" element
     */
    public java.lang.String getEmailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Email" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMAIL$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Email" element
     */
    public int sizeOfEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$14);
        }
    }
    
    /**
     * Sets array of all "Email" element
     */
    public void setEmailArray(java.lang.String[] emailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emailArray, EMAIL$14);
        }
    }
    
    /**
     * Sets ith "Email" element
     */
    public void setEmailArray(int i, java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) array of all "Email" element
     */
    public void xsetEmailArray(org.apache.xmlbeans.XmlString[]emailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emailArray, EMAIL$14);
        }
    }
    
    /**
     * Sets (as xml) ith "Email" element
     */
    public void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(email);
        }
    }
    
    /**
     * Inserts the value as the ith "Email" element
     */
    public void insertEmail(int i, java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EMAIL$14, i);
            target.setStringValue(email);
        }
    }
    
    /**
     * Appends the value as the last "Email" element
     */
    public void addEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$14);
            target.setStringValue(email);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Email" element
     */
    public org.apache.xmlbeans.XmlString insertNewEmail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EMAIL$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Email" element
     */
    public org.apache.xmlbeans.XmlString addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Email" element
     */
    public void removeEmail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$14, i);
        }
    }
}
