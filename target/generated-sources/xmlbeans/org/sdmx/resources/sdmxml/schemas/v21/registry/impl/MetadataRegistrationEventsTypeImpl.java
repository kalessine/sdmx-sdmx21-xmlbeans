/*
 * XML Type:  MetadataRegistrationEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML MetadataRegistrationEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class MetadataRegistrationEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataRegistrationEventsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLEVENTS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "AllEvents");
    private static final javax.xml.namespace.QName REGISTRATIONID$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "RegistrationID");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ProvisionAgreement");
    private static final javax.xml.namespace.QName DATAPROVIDER$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataProvider");
    private static final javax.xml.namespace.QName METADATAFLOWREFERENCE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataflowReference");
    private static final javax.xml.namespace.QName METADATASTRUCTUREDEFINITIONREFERENCE$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataStructureDefinitionReference");
    private static final javax.xml.namespace.QName CATEGORY$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Category");
    private static final javax.xml.namespace.QName TYPE$14 = 
        new javax.xml.namespace.QName("", "TYPE");
    
    
    /**
     * Gets the "AllEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAllEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALLEVENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AllEvents" element
     */
    public boolean isSetAllEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLEVENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "AllEvents" element
     */
    public void setAllEvents(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType allEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALLEVENTS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALLEVENTS$0);
            }
            target.set(allEvents);
        }
    }
    
    /**
     * Appends and returns a new empty "AllEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAllEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALLEVENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "AllEvents" element
     */
    public void unsetAllEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLEVENTS$0, 0);
        }
    }
    
    /**
     * Gets array of all "RegistrationID" elements
     */
    public java.lang.String[] getRegistrationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRATIONID$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "RegistrationID" element
     */
    public java.lang.String getRegistrationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "RegistrationID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] xgetRegistrationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRATIONID$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.IDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "RegistrationID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetRegistrationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(REGISTRATIONID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)target;
        }
    }
    
    /**
     * Returns number of "RegistrationID" element
     */
    public int sizeOfRegistrationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRATIONID$2);
        }
    }
    
    /**
     * Sets array of all "RegistrationID" element
     */
    public void setRegistrationIDArray(java.lang.String[] registrationIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(registrationIDArray, REGISTRATIONID$2);
        }
    }
    
    /**
     * Sets ith "RegistrationID" element
     */
    public void setRegistrationIDArray(int i, java.lang.String registrationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGISTRATIONID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(registrationID);
        }
    }
    
    /**
     * Sets (as xml) array of all "RegistrationID" element
     */
    public void xsetRegistrationIDArray(org.sdmx.resources.sdmxml.schemas.v21.common.IDType[]registrationIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(registrationIDArray, REGISTRATIONID$2);
        }
    }
    
    /**
     * Sets (as xml) ith "RegistrationID" element
     */
    public void xsetRegistrationIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.IDType registrationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(REGISTRATIONID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(registrationID);
        }
    }
    
    /**
     * Inserts the value as the ith "RegistrationID" element
     */
    public void insertRegistrationID(int i, java.lang.String registrationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(REGISTRATIONID$2, i);
            target.setStringValue(registrationID);
        }
    }
    
    /**
     * Appends the value as the last "RegistrationID" element
     */
    public void addRegistrationID(java.lang.String registrationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGISTRATIONID$2);
            target.setStringValue(registrationID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType insertNewRegistrationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().insert_element_user(REGISTRATIONID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType addNewRegistrationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(REGISTRATIONID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "RegistrationID" element
     */
    public void removeRegistrationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRATIONID$2, i);
        }
    }
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] getProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENT$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$4, i);
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
            return get_store().count_elements(PROVISIONAGREEMENT$4);
        }
    }
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] provisionAgreementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$4);
        }
    }
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$4, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().insert_element_user(PROVISIONAGREEMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$4);
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
            get_store().remove_element(PROVISIONAGREEMENT$4, i);
        }
    }
    
    /**
     * Gets array of all "DataProvider" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] getDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDER$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataProvider" element
     */
    public int sizeOfDataProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$6);
        }
    }
    
    /**
     * Sets array of all "DataProvider" element
     */
    public void setDataProviderArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] dataProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderArray, DATAPROVIDER$6);
        }
    }
    
    /**
     * Sets ith "DataProvider" element
     */
    public void setDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType insertNewDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().insert_element_user(DATAPROVIDER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataProvider" element
     */
    public void removeDataProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$6, i);
        }
    }
    
    /**
     * Gets array of all "MetadataflowReference" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] getMetadataflowReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOWREFERENCE$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataflowReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType getMetadataflowReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().find_element_user(METADATAFLOWREFERENCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataflowReference" element
     */
    public int sizeOfMetadataflowReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWREFERENCE$8);
        }
    }
    
    /**
     * Sets array of all "MetadataflowReference" element
     */
    public void setMetadataflowReferenceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] metadataflowReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowReferenceArray, METADATAFLOWREFERENCE$8);
        }
    }
    
    /**
     * Sets ith "MetadataflowReference" element
     */
    public void setMetadataflowReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType metadataflowReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().find_element_user(METADATAFLOWREFERENCE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflowReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType insertNewMetadataflowReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().insert_element_user(METADATAFLOWREFERENCE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType addNewMetadataflowReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().add_element_user(METADATAFLOWREFERENCE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataflowReference" element
     */
    public void removeMetadataflowReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWREFERENCE$8, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructureDefinitionReference" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] getMetadataStructureDefinitionReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREDEFINITIONREFERENCE$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureDefinitionReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType getMetadataStructureDefinitionReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().find_element_user(METADATASTRUCTUREDEFINITIONREFERENCE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructureDefinitionReference" element
     */
    public int sizeOfMetadataStructureDefinitionReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREDEFINITIONREFERENCE$10);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureDefinitionReference" element
     */
    public void setMetadataStructureDefinitionReferenceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] metadataStructureDefinitionReferenceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureDefinitionReferenceArray, METADATASTRUCTUREDEFINITIONREFERENCE$10);
        }
    }
    
    /**
     * Sets ith "MetadataStructureDefinitionReference" element
     */
    public void setMetadataStructureDefinitionReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType metadataStructureDefinitionReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().find_element_user(METADATASTRUCTUREDEFINITIONREFERENCE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructureDefinitionReference);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinitionReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType insertNewMetadataStructureDefinitionReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().insert_element_user(METADATASTRUCTUREDEFINITIONREFERENCE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinitionReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType addNewMetadataStructureDefinitionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType)get_store().add_element_user(METADATASTRUCTUREDEFINITIONREFERENCE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructureDefinitionReference" element
     */
    public void removeMetadataStructureDefinitionReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREDEFINITIONREFERENCE$10, i);
        }
    }
    
    /**
     * Gets array of all "Category" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(CATEGORY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$12);
        }
    }
    
    /**
     * Sets array of all "Category" element
     */
    public void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$12);
        }
    }
    
    /**
     * Sets ith "Category" element
     */
    public void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(CATEGORY$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().insert_element_user(CATEGORY$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(CATEGORY$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$12, i);
        }
    }
    
    /**
     * Gets the "TYPE" attribute
     */
    public java.lang.String getTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TYPE" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "TYPE" attribute
     */
    public boolean isSetTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$14) != null;
        }
    }
    
    /**
     * Sets the "TYPE" attribute
     */
    public void setTYPE(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$14);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "TYPE" attribute
     */
    public void xsetTYPE(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$14);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "TYPE" attribute
     */
    public void unsetTYPE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$14);
        }
    }
}
