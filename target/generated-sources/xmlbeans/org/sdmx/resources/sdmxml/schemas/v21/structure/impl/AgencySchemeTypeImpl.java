/*
 * XML Type:  AgencySchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML AgencySchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class AgencySchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType
{
    private static final long serialVersionUID = 1L;
    
    public AgencySchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Agency");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "Agency" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType[] getAgencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCY$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType getAgencyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().find_element_user(AGENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Agency" element
     */
    public int sizeOfAgencyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCY$0);
        }
    }
    
    /**
     * Sets array of all "Agency" element
     */
    public void setAgencyArray(org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType[] agencyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyArray, AGENCY$0);
        }
    }
    
    /**
     * Sets ith "Agency" element
     */
    public void setAgencyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType agency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().find_element_user(AGENCY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agency);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType insertNewAgency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().insert_element_user(AGENCY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType addNewAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencyType)get_store().add_element_user(AGENCY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Agency" element
     */
    public void removeAgency(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCY$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ID$2);
            }
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_default_attribute_value(ID$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
