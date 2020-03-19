/*
 * XML Type:  OrganisationSchemesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML OrganisationSchemesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class OrganisationSchemesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AgencyScheme");
    private static final javax.xml.namespace.QName DATACONSUMERSCHEME$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataConsumerScheme");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEME$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataProviderScheme");
    private static final javax.xml.namespace.QName ORGANISATIONUNITSCHEME$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationUnitScheme");
    
    
    /**
     * Gets array of all "AgencyScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType[] getAgencySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYSCHEME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType getAgencySchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType)get_store().find_element_user(AGENCYSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AgencyScheme" element
     */
    public int sizeOfAgencySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYSCHEME$0);
        }
    }
    
    /**
     * Sets array of all "AgencyScheme" element
     */
    public void setAgencySchemeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType[] agencySchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencySchemeArray, AGENCYSCHEME$0);
        }
    }
    
    /**
     * Sets ith "AgencyScheme" element
     */
    public void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType agencyScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType)get_store().find_element_user(AGENCYSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType insertNewAgencyScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType)get_store().insert_element_user(AGENCYSCHEME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType addNewAgencyScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AgencySchemeType)get_store().add_element_user(AGENCYSCHEME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AgencyScheme" element
     */
    public void removeAgencyScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYSCHEME$0, i);
        }
    }
    
    /**
     * Gets array of all "DataConsumerScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType[] getDataConsumerSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACONSUMERSCHEME$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType getDataConsumerSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType)get_store().find_element_user(DATACONSUMERSCHEME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataConsumerScheme" element
     */
    public int sizeOfDataConsumerSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSUMERSCHEME$2);
        }
    }
    
    /**
     * Sets array of all "DataConsumerScheme" element
     */
    public void setDataConsumerSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType[] dataConsumerSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataConsumerSchemeArray, DATACONSUMERSCHEME$2);
        }
    }
    
    /**
     * Sets ith "DataConsumerScheme" element
     */
    public void setDataConsumerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType dataConsumerScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType)get_store().find_element_user(DATACONSUMERSCHEME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataConsumerScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType insertNewDataConsumerScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType)get_store().insert_element_user(DATACONSUMERSCHEME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType addNewDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataConsumerSchemeType)get_store().add_element_user(DATACONSUMERSCHEME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataConsumerScheme" element
     */
    public void removeDataConsumerScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSUMERSCHEME$2, i);
        }
    }
    
    /**
     * Gets array of all "DataProviderScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType[] getDataProviderSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERSCHEME$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType getDataProviderSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType)get_store().find_element_user(DATAPROVIDERSCHEME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataProviderScheme" element
     */
    public int sizeOfDataProviderSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERSCHEME$4);
        }
    }
    
    /**
     * Sets array of all "DataProviderScheme" element
     */
    public void setDataProviderSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType[] dataProviderSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderSchemeArray, DATAPROVIDERSCHEME$4);
        }
    }
    
    /**
     * Sets ith "DataProviderScheme" element
     */
    public void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType dataProviderScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType)get_store().find_element_user(DATAPROVIDERSCHEME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProviderScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType insertNewDataProviderScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType)get_store().insert_element_user(DATAPROVIDERSCHEME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType addNewDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataProviderSchemeType)get_store().add_element_user(DATAPROVIDERSCHEME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProviderScheme" element
     */
    public void removeDataProviderScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERSCHEME$4, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType[] getOrganisationUnitSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONUNITSCHEME$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType getOrganisationUnitSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType)get_store().find_element_user(ORGANISATIONUNITSCHEME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationUnitScheme" element
     */
    public int sizeOfOrganisationUnitSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONUNITSCHEME$6);
        }
    }
    
    /**
     * Sets array of all "OrganisationUnitScheme" element
     */
    public void setOrganisationUnitSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType[] organisationUnitSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationUnitSchemeArray, ORGANISATIONUNITSCHEME$6);
        }
    }
    
    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    public void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType organisationUnitScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType)get_store().find_element_user(ORGANISATIONUNITSCHEME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationUnitScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType insertNewOrganisationUnitScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType)get_store().insert_element_user(ORGANISATIONUNITSCHEME$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType addNewOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType)get_store().add_element_user(ORGANISATIONUNITSCHEME$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationUnitScheme" element
     */
    public void removeOrganisationUnitScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONUNITSCHEME$6, i);
        }
    }
}
