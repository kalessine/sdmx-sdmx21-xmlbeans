/*
 * XML Type:  QueryRegistrationRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML QueryRegistrationRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class QueryRegistrationRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYTYPE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "QueryType");
    private static final javax.xml.namespace.QName ALL$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "All");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ProvisionAgreement");
    private static final javax.xml.namespace.QName DATAPROVIDER$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataProvider");
    private static final javax.xml.namespace.QName DATAFLOW$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Dataflow");
    private static final javax.xml.namespace.QName METADATAFLOW$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Metadataflow");
    private static final javax.xml.namespace.QName REFERENCEPERIOD$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ReferencePeriod");
    private static final javax.xml.namespace.QName DATAKEYSET$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataKeySet");
    private static final javax.xml.namespace.QName METADATAKEYSET$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataKeySet");
    private static final javax.xml.namespace.QName CUBEREGION$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "CubeRegion");
    private static final javax.xml.namespace.QName METADATATARGETREGION$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataTargetRegion");
    private static final javax.xml.namespace.QName RETURNCONSTRAINTS$22 = 
        new javax.xml.namespace.QName("", "returnConstraints");
    
    
    /**
     * Gets the "QueryType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType.Enum getQueryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType xgetQueryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType)get_store().find_element_user(QUERYTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "QueryType" element
     */
    public void setQueryType(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType.Enum queryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYTYPE$0);
            }
            target.setEnumValue(queryType);
        }
    }
    
    /**
     * Sets (as xml) the "QueryType" element
     */
    public void xsetQueryType(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType queryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType)get_store().find_element_user(QUERYTYPE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType)get_store().add_element_user(QUERYTYPE$0);
            }
            target.set(queryType);
        }
    }
    
    /**
     * Gets the "All" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "All" element
     */
    public boolean isSetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALL$2) != 0;
        }
    }
    
    /**
     * Sets the "All" element
     */
    public void setAll(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALL$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALL$2);
            }
            target.set(all);
        }
    }
    
    /**
     * Appends and returns a new empty "All" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "All" element
     */
    public void unsetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALL$2, 0);
        }
    }
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisionAgreement" element
     */
    public boolean isSetProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgreement" element
     */
    public void setProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$4);
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreement" element
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
     * Unsets the "ProvisionAgreement" element
     */
    public void unsetProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENT$4, 0);
        }
    }
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProvider" element
     */
    public boolean isSetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$6) != 0;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$6);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProvider" element
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
     * Unsets the "DataProvider" element
     */
    public void unsetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$6, 0);
        }
    }
    
    /**
     * Gets the "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType getDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().find_element_user(DATAFLOW$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Dataflow" element
     */
    public boolean isSetDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOW$8) != 0;
        }
    }
    
    /**
     * Sets the "Dataflow" element
     */
    public void setDataflow(org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().find_element_user(DATAFLOW$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().add_element_user(DATAFLOW$8);
            }
            target.set(dataflow);
        }
    }
    
    /**
     * Appends and returns a new empty "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType addNewDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType)get_store().add_element_user(DATAFLOW$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Dataflow" element
     */
    public void unsetDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOW$8, 0);
        }
    }
    
    /**
     * Gets the "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType getMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().find_element_user(METADATAFLOW$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Metadataflow" element
     */
    public boolean isSetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOW$10) != 0;
        }
    }
    
    /**
     * Sets the "Metadataflow" element
     */
    public void setMetadataflow(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().find_element_user(METADATAFLOW$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().add_element_user(METADATAFLOW$10);
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().add_element_user(METADATAFLOW$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Metadataflow" element
     */
    public void unsetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOW$10, 0);
        }
    }
    
    /**
     * Gets the "ReferencePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType getReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().find_element_user(REFERENCEPERIOD$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferencePeriod" element
     */
    public boolean isSetReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEPERIOD$12) != 0;
        }
    }
    
    /**
     * Sets the "ReferencePeriod" element
     */
    public void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType referencePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().find_element_user(REFERENCEPERIOD$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().add_element_user(REFERENCEPERIOD$12);
            }
            target.set(referencePeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType addNewReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().add_element_user(REFERENCEPERIOD$12);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferencePeriod" element
     */
    public void unsetReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEPERIOD$12, 0);
        }
    }
    
    /**
     * Gets array of all "DataKeySet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] getDataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAKEYSET$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType getDataKeySetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().find_element_user(DATAKEYSET$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataKeySet" element
     */
    public int sizeOfDataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAKEYSET$14);
        }
    }
    
    /**
     * Sets array of all "DataKeySet" element
     */
    public void setDataKeySetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] dataKeySetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataKeySetArray, DATAKEYSET$14);
        }
    }
    
    /**
     * Sets ith "DataKeySet" element
     */
    public void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType dataKeySet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().find_element_user(DATAKEYSET$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataKeySet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType insertNewDataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().insert_element_user(DATAKEYSET$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType addNewDataKeySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().add_element_user(DATAKEYSET$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataKeySet" element
     */
    public void removeDataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAKEYSET$14, i);
        }
    }
    
    /**
     * Gets array of all "MetadataKeySet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] getMetadataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAKEYSET$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType getMetadataKeySetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().find_element_user(METADATAKEYSET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataKeySet" element
     */
    public int sizeOfMetadataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAKEYSET$16);
        }
    }
    
    /**
     * Sets array of all "MetadataKeySet" element
     */
    public void setMetadataKeySetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] metadataKeySetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataKeySetArray, METADATAKEYSET$16);
        }
    }
    
    /**
     * Sets ith "MetadataKeySet" element
     */
    public void setMetadataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType metadataKeySet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().find_element_user(METADATAKEYSET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataKeySet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType insertNewMetadataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().insert_element_user(METADATAKEYSET$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType addNewMetadataKeySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().add_element_user(METADATAKEYSET$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataKeySet" element
     */
    public void removeMetadataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAKEYSET$16, i);
        }
    }
    
    /**
     * Gets array of all "CubeRegion" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] getCubeRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUBEREGION$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType getCubeRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().find_element_user(CUBEREGION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CubeRegion" element
     */
    public int sizeOfCubeRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUBEREGION$18);
        }
    }
    
    /**
     * Sets array of all "CubeRegion" element
     */
    public void setCubeRegionArray(org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] cubeRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cubeRegionArray, CUBEREGION$18);
        }
    }
    
    /**
     * Sets ith "CubeRegion" element
     */
    public void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType cubeRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().find_element_user(CUBEREGION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cubeRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType insertNewCubeRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().insert_element_user(CUBEREGION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType addNewCubeRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().add_element_user(CUBEREGION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "CubeRegion" element
     */
    public void removeCubeRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUBEREGION$18, i);
        }
    }
    
    /**
     * Gets array of all "MetadataTargetRegion" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] getMetadataTargetRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATARGETREGION$20, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataTargetRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType getMetadataTargetRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().find_element_user(METADATATARGETREGION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataTargetRegion" element
     */
    public int sizeOfMetadataTargetRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATARGETREGION$20);
        }
    }
    
    /**
     * Sets array of all "MetadataTargetRegion" element
     */
    public void setMetadataTargetRegionArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] metadataTargetRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataTargetRegionArray, METADATATARGETREGION$20);
        }
    }
    
    /**
     * Sets ith "MetadataTargetRegion" element
     */
    public void setMetadataTargetRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType metadataTargetRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().find_element_user(METADATATARGETREGION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataTargetRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType insertNewMetadataTargetRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().insert_element_user(METADATATARGETREGION$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType addNewMetadataTargetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().add_element_user(METADATATARGETREGION$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataTargetRegion" element
     */
    public void removeMetadataTargetRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATARGETREGION$20, i);
        }
    }
    
    /**
     * Gets the "returnConstraints" attribute
     */
    public boolean getReturnConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNCONSTRAINTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RETURNCONSTRAINTS$22);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "returnConstraints" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNCONSTRAINTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RETURNCONSTRAINTS$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "returnConstraints" attribute
     */
    public boolean isSetReturnConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RETURNCONSTRAINTS$22) != null;
        }
    }
    
    /**
     * Sets the "returnConstraints" attribute
     */
    public void setReturnConstraints(boolean returnConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNCONSTRAINTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNCONSTRAINTS$22);
            }
            target.setBooleanValue(returnConstraints);
        }
    }
    
    /**
     * Sets (as xml) the "returnConstraints" attribute
     */
    public void xsetReturnConstraints(org.apache.xmlbeans.XmlBoolean returnConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNCONSTRAINTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNCONSTRAINTS$22);
            }
            target.set(returnConstraints);
        }
    }
    
    /**
     * Unsets the "returnConstraints" attribute
     */
    public void unsetReturnConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RETURNCONSTRAINTS$22);
        }
    }
}
