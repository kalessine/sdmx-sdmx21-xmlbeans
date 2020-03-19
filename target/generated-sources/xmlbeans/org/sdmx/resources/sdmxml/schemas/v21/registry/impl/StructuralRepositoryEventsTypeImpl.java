/*
 * XML Type:  StructuralRepositoryEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML StructuralRepositoryEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class StructuralRepositoryEventsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType
{
    private static final long serialVersionUID = 1L;
    
    public StructuralRepositoryEventsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "AgencyID");
    private static final javax.xml.namespace.QName ALLEVENTS$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "AllEvents");
    private static final javax.xml.namespace.QName AGENCYSCHEME$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "AgencyScheme");
    private static final javax.xml.namespace.QName DATACONSMERSCHEME$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataConsmerScheme");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEME$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataProviderScheme");
    private static final javax.xml.namespace.QName ORGANISATIONUNITSCHEME$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "OrganisationUnitScheme");
    private static final javax.xml.namespace.QName DATAFLOW$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Dataflow");
    private static final javax.xml.namespace.QName METADATAFLOW$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Metadataflow");
    private static final javax.xml.namespace.QName CATEGORYSCHEME$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "CategoryScheme");
    private static final javax.xml.namespace.QName CATEGORISATION$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Categorisation");
    private static final javax.xml.namespace.QName CODELIST$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Codelist");
    private static final javax.xml.namespace.QName HIERARCHICALCODELIST$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "HierarchicalCodelist");
    private static final javax.xml.namespace.QName CONCEPTSCHEME$24 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ConceptScheme");
    private static final javax.xml.namespace.QName METADATASTRUCTUREDEFINITION$26 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataStructureDefinition");
    private static final javax.xml.namespace.QName KEYFAMILY$28 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "KeyFamily");
    private static final javax.xml.namespace.QName STRUCTURESET$30 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StructureSet");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMY$32 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ReportingTaxonomy");
    private static final javax.xml.namespace.QName PROCESS$34 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Process");
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$36 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "AttachmentConstraint");
    private static final javax.xml.namespace.QName CONTENTCONSTRAINT$38 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ContentConstraint");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$40 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ProvisionAgreement");
    private static final javax.xml.namespace.QName TYPE$42 = 
        new javax.xml.namespace.QName("", "TYPE");
    
    
    /**
     * Gets array of all "AgencyID" elements
     */
    public java.lang.String[] getAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyID" element
     */
    public java.lang.String getAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "AgencyID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType[] xgetAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYID$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType xgetAgencyIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)target;
        }
    }
    
    /**
     * Returns number of "AgencyID" element
     */
    public int sizeOfAgencyIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYID$0);
        }
    }
    
    /**
     * Sets array of all "AgencyID" element
     */
    public void setAgencyIDArray(java.lang.String[] agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$0);
        }
    }
    
    /**
     * Sets ith "AgencyID" element
     */
    public void setAgencyIDArray(int i, java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) array of all "AgencyID" element
     */
    public void xsetAgencyIDArray(org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType[]agencyIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencyIDArray, AGENCYID$0);
        }
    }
    
    /**
     * Sets (as xml) ith "AgencyID" element
     */
    public void xsetAgencyIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().find_element_user(AGENCYID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Inserts the value as the ith "AgencyID" element
     */
    public void insertAgencyID(int i, java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AGENCYID$0, i);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Appends the value as the last "AgencyID" element
     */
    public void addAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCYID$0);
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType insertNewAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().insert_element_user(AGENCYID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType addNewAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType)get_store().add_element_user(AGENCYID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AgencyID" element
     */
    public void removeAgencyID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYID$0, i);
        }
    }
    
    /**
     * Gets the "AllEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAllEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALLEVENTS$2, 0);
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
            return get_store().count_elements(ALLEVENTS$2) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALLEVENTS$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALLEVENTS$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALLEVENTS$2);
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
            get_store().remove_element(ALLEVENTS$2, 0);
        }
    }
    
    /**
     * Gets array of all "AgencyScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getAgencySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENCYSCHEME$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getAgencySchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(AGENCYSCHEME$4, i);
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
            return get_store().count_elements(AGENCYSCHEME$4);
        }
    }
    
    /**
     * Sets array of all "AgencyScheme" element
     */
    public void setAgencySchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] agencySchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agencySchemeArray, AGENCYSCHEME$4);
        }
    }
    
    /**
     * Sets ith "AgencyScheme" element
     */
    public void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType agencyScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(AGENCYSCHEME$4, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewAgencyScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(AGENCYSCHEME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewAgencyScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(AGENCYSCHEME$4);
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
            get_store().remove_element(AGENCYSCHEME$4, i);
        }
    }
    
    /**
     * Gets array of all "DataConsmerScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getDataConsmerSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACONSMERSCHEME$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataConsmerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getDataConsmerSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(DATACONSMERSCHEME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataConsmerScheme" element
     */
    public int sizeOfDataConsmerSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSMERSCHEME$6);
        }
    }
    
    /**
     * Sets array of all "DataConsmerScheme" element
     */
    public void setDataConsmerSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] dataConsmerSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataConsmerSchemeArray, DATACONSMERSCHEME$6);
        }
    }
    
    /**
     * Sets ith "DataConsmerScheme" element
     */
    public void setDataConsmerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType dataConsmerScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(DATACONSMERSCHEME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataConsmerScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsmerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewDataConsmerScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(DATACONSMERSCHEME$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsmerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewDataConsmerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(DATACONSMERSCHEME$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataConsmerScheme" element
     */
    public void removeDataConsmerScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSMERSCHEME$6, i);
        }
    }
    
    /**
     * Gets array of all "DataProviderScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getDataProviderSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAPROVIDERSCHEME$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getDataProviderSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(DATAPROVIDERSCHEME$8, i);
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
            return get_store().count_elements(DATAPROVIDERSCHEME$8);
        }
    }
    
    /**
     * Sets array of all "DataProviderScheme" element
     */
    public void setDataProviderSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] dataProviderSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataProviderSchemeArray, DATAPROVIDERSCHEME$8);
        }
    }
    
    /**
     * Sets ith "DataProviderScheme" element
     */
    public void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType dataProviderScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(DATAPROVIDERSCHEME$8, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewDataProviderScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(DATAPROVIDERSCHEME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(DATAPROVIDERSCHEME$8);
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
            get_store().remove_element(DATAPROVIDERSCHEME$8, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getOrganisationUnitSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONUNITSCHEME$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getOrganisationUnitSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(ORGANISATIONUNITSCHEME$10, i);
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
            return get_store().count_elements(ORGANISATIONUNITSCHEME$10);
        }
    }
    
    /**
     * Sets array of all "OrganisationUnitScheme" element
     */
    public void setOrganisationUnitSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] organisationUnitSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationUnitSchemeArray, ORGANISATIONUNITSCHEME$10);
        }
    }
    
    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    public void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType organisationUnitScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(ORGANISATIONUNITSCHEME$10, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewOrganisationUnitScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(ORGANISATIONUNITSCHEME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(ORGANISATIONUNITSCHEME$10);
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
            get_store().remove_element(ORGANISATIONUNITSCHEME$10, i);
        }
    }
    
    /**
     * Gets array of all "Dataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOW$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getDataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(DATAFLOW$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dataflow" element
     */
    public int sizeOfDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOW$12);
        }
    }
    
    /**
     * Sets array of all "Dataflow" element
     */
    public void setDataflowArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] dataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowArray, DATAFLOW$12);
        }
    }
    
    /**
     * Sets ith "Dataflow" element
     */
    public void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(DATAFLOW$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(DATAFLOW$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(DATAFLOW$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dataflow" element
     */
    public void removeDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOW$12, i);
        }
    }
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOW$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getMetadataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(METADATAFLOW$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Metadataflow" element
     */
    public int sizeOfMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOW$14);
        }
    }
    
    /**
     * Sets array of all "Metadataflow" element
     */
    public void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] metadataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowArray, METADATAFLOW$14);
        }
    }
    
    /**
     * Sets ith "Metadataflow" element
     */
    public void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(METADATAFLOW$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(METADATAFLOW$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(METADATAFLOW$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Metadataflow" element
     */
    public void removeMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOW$14, i);
        }
    }
    
    /**
     * Gets array of all "CategoryScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getCategorySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEME$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getCategorySchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CATEGORYSCHEME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryScheme" element
     */
    public int sizeOfCategorySchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEME$16);
        }
    }
    
    /**
     * Sets array of all "CategoryScheme" element
     */
    public void setCategorySchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] categorySchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeArray, CATEGORYSCHEME$16);
        }
    }
    
    /**
     * Sets ith "CategoryScheme" element
     */
    public void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType categoryScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CATEGORYSCHEME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewCategoryScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(CATEGORYSCHEME$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(CATEGORYSCHEME$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategoryScheme" element
     */
    public void removeCategoryScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEME$16, i);
        }
    }
    
    /**
     * Gets array of all "Categorisation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType[] getCategorisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORISATION$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType getCategorisationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType)get_store().find_element_user(CATEGORISATION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Categorisation" element
     */
    public int sizeOfCategorisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORISATION$18);
        }
    }
    
    /**
     * Sets array of all "Categorisation" element
     */
    public void setCategorisationArray(org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType[] categorisationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorisationArray, CATEGORISATION$18);
        }
    }
    
    /**
     * Sets ith "Categorisation" element
     */
    public void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType categorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType)get_store().find_element_user(CATEGORISATION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorisation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType insertNewCategorisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType)get_store().insert_element_user(CATEGORISATION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType addNewCategorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType)get_store().add_element_user(CATEGORISATION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "Categorisation" element
     */
    public void removeCategorisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORISATION$18, i);
        }
    }
    
    /**
     * Gets array of all "Codelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELIST$20, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CODELIST$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Codelist" element
     */
    public int sizeOfCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$20);
        }
    }
    
    /**
     * Sets array of all "Codelist" element
     */
    public void setCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] codelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistArray, CODELIST$20);
        }
    }
    
    /**
     * Sets ith "Codelist" element
     */
    public void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CODELIST$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(CODELIST$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(CODELIST$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "Codelist" element
     */
    public void removeCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$20, i);
        }
    }
    
    /**
     * Gets array of all "HierarchicalCodelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getHierarchicalCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELIST$22, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getHierarchicalCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(HIERARCHICALCODELIST$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCodelist" element
     */
    public int sizeOfHierarchicalCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELIST$22);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCodelist" element
     */
    public void setHierarchicalCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] hierarchicalCodelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistArray, HIERARCHICALCODELIST$22);
        }
    }
    
    /**
     * Sets ith "HierarchicalCodelist" element
     */
    public void setHierarchicalCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType hierarchicalCodelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(HIERARCHICALCODELIST$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCodelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewHierarchicalCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(HIERARCHICALCODELIST$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(HIERARCHICALCODELIST$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCodelist" element
     */
    public void removeHierarchicalCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELIST$22, i);
        }
    }
    
    /**
     * Gets array of all "ConceptScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getConceptSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEME$24, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getConceptSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CONCEPTSCHEME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptScheme" element
     */
    public int sizeOfConceptSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEME$24);
        }
    }
    
    /**
     * Sets array of all "ConceptScheme" element
     */
    public void setConceptSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] conceptSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeArray, CONCEPTSCHEME$24);
        }
    }
    
    /**
     * Sets ith "ConceptScheme" element
     */
    public void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType conceptScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CONCEPTSCHEME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewConceptScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(CONCEPTSCHEME$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(CONCEPTSCHEME$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptScheme" element
     */
    public void removeConceptScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEME$24, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructureDefinition" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getMetadataStructureDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTUREDEFINITION$26, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructureDefinition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getMetadataStructureDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(METADATASTRUCTUREDEFINITION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructureDefinition" element
     */
    public int sizeOfMetadataStructureDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTUREDEFINITION$26);
        }
    }
    
    /**
     * Sets array of all "MetadataStructureDefinition" element
     */
    public void setMetadataStructureDefinitionArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] metadataStructureDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureDefinitionArray, METADATASTRUCTUREDEFINITION$26);
        }
    }
    
    /**
     * Sets ith "MetadataStructureDefinition" element
     */
    public void setMetadataStructureDefinitionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType metadataStructureDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(METADATASTRUCTUREDEFINITION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructureDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewMetadataStructureDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(METADATASTRUCTUREDEFINITION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewMetadataStructureDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(METADATASTRUCTUREDEFINITION$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructureDefinition" element
     */
    public void removeMetadataStructureDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTUREDEFINITION$26, i);
        }
    }
    
    /**
     * Gets array of all "KeyFamily" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYFAMILY$28, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyFamily" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getKeyFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(KEYFAMILY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyFamily" element
     */
    public int sizeOfKeyFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYFAMILY$28);
        }
    }
    
    /**
     * Sets array of all "KeyFamily" element
     */
    public void setKeyFamilyArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] keyFamilyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyFamilyArray, KEYFAMILY$28);
        }
    }
    
    /**
     * Sets ith "KeyFamily" element
     */
    public void setKeyFamilyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType keyFamily)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(KEYFAMILY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyFamily);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(KEYFAMILY$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewKeyFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(KEYFAMILY$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyFamily" element
     */
    public void removeKeyFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYFAMILY$28, i);
        }
    }
    
    /**
     * Gets array of all "StructureSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESET$30, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getStructureSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(STRUCTURESET$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructureSet" element
     */
    public int sizeOfStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESET$30);
        }
    }
    
    /**
     * Sets array of all "StructureSet" element
     */
    public void setStructureSetArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] structureSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetArray, STRUCTURESET$30);
        }
    }
    
    /**
     * Sets ith "StructureSet" element
     */
    public void setStructureSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(STRUCTURESET$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewStructureSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(STRUCTURESET$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(STRUCTURESET$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureSet" element
     */
    public void removeStructureSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESET$30, i);
        }
    }
    
    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getReportingTaxonomyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMY$32, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getReportingTaxonomyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(REPORTINGTAXONOMY$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingTaxonomy" element
     */
    public int sizeOfReportingTaxonomyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMY$32);
        }
    }
    
    /**
     * Sets array of all "ReportingTaxonomy" element
     */
    public void setReportingTaxonomyArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] reportingTaxonomyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyArray, REPORTINGTAXONOMY$32);
        }
    }
    
    /**
     * Sets ith "ReportingTaxonomy" element
     */
    public void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType reportingTaxonomy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(REPORTINGTAXONOMY$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingTaxonomy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewReportingTaxonomy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(REPORTINGTAXONOMY$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(REPORTINGTAXONOMY$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    public void removeReportingTaxonomy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMY$32, i);
        }
    }
    
    /**
     * Gets array of all "Process" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESS$34, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getProcessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(PROCESS$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Process" element
     */
    public int sizeOfProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESS$34);
        }
    }
    
    /**
     * Sets array of all "Process" element
     */
    public void setProcessArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] processArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processArray, PROCESS$34);
        }
    }
    
    /**
     * Sets ith "Process" element
     */
    public void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(PROCESS$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(process);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(PROCESS$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(PROCESS$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "Process" element
     */
    public void removeProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESS$34, i);
        }
    }
    
    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTCONSTRAINT$36, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getAttachmentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(ATTACHMENTCONSTRAINT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachmentConstraint" element
     */
    public int sizeOfAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTCONSTRAINT$36);
        }
    }
    
    /**
     * Sets array of all "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] attachmentConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentConstraintArray, ATTACHMENTCONSTRAINT$36);
        }
    }
    
    /**
     * Sets ith "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(ATTACHMENTCONSTRAINT$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(ATTACHMENTCONSTRAINT$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(ATTACHMENTCONSTRAINT$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentConstraint" element
     */
    public void removeAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTCONSTRAINT$36, i);
        }
    }
    
    /**
     * Gets array of all "ContentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getContentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENTCONSTRAINT$38, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getContentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CONTENTCONSTRAINT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ContentConstraint" element
     */
    public int sizeOfContentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTCONSTRAINT$38);
        }
    }
    
    /**
     * Sets array of all "ContentConstraint" element
     */
    public void setContentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] contentConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contentConstraintArray, CONTENTCONSTRAINT$38);
        }
    }
    
    /**
     * Sets ith "ContentConstraint" element
     */
    public void setContentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType contentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(CONTENTCONSTRAINT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contentConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewContentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(CONTENTCONSTRAINT$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(CONTENTCONSTRAINT$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContentConstraint" element
     */
    public void removeContentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTCONSTRAINT$38, i);
        }
    }
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getProvisionAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROVISIONAGREEMENT$40, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getProvisionAgreementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(PROVISIONAGREEMENT$40, i);
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
            return get_store().count_elements(PROVISIONAGREEMENT$40);
        }
    }
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] provisionAgreementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$40);
        }
    }
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    public void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().find_element_user(PROVISIONAGREEMENT$40, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewProvisionAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().insert_element_user(PROVISIONAGREEMENT$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType)get_store().add_element_user(PROVISIONAGREEMENT$40);
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
            get_store().remove_element(PROVISIONAGREEMENT$40, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$42);
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
            return get_store().find_attribute_user(TYPE$42) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$42);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$42);
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
            get_store().remove_attribute(TYPE$42);
        }
    }
}
