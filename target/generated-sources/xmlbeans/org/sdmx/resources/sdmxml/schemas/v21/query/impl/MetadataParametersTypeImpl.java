/*
 * XML Type:  MetadataParametersType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataParametersType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataParametersTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataParametersTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATASETID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataSetID");
    private static final javax.xml.namespace.QName DATAPROVIDER$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataProvider");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataStructure");
    private static final javax.xml.namespace.QName METADATAFLOW$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Metadataflow");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProvisionAgreement");
    private static final javax.xml.namespace.QName CATEGORY$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Category");
    private static final javax.xml.namespace.QName UPDATED$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Updated");
    private static final javax.xml.namespace.QName CONCEPTVALUE$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptValue");
    private static final javax.xml.namespace.QName REPRESENTATIONVALUE$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "RepresentationValue");
    private static final javax.xml.namespace.QName METADATATARGETVALUE$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataTargetValue");
    private static final javax.xml.namespace.QName REPORTSTRUCTUREVALUE$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportStructureValue");
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachmentConstraint");
    private static final javax.xml.namespace.QName ATTACHEDOBJECT$24 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachedObject");
    private static final javax.xml.namespace.QName ATTACHEDDATAKEY$26 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachedDataKey");
    private static final javax.xml.namespace.QName ATTACHEDDATASET$28 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachedDataSet");
    private static final javax.xml.namespace.QName ATTACHEDREPORTINGPERIOD$30 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachedReportingPeriod");
    private static final javax.xml.namespace.QName OR$32 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Or");
    private static final javax.xml.namespace.QName AND$34 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "And");
    
    
    /**
     * Gets array of all "MetadataSetID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] getMetadataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASETID$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType getMetadataSetIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().find_element_user(METADATASETID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataSetID" element
     */
    public int sizeOfMetadataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASETID$0);
        }
    }
    
    /**
     * Sets array of all "MetadataSetID" element
     */
    public void setMetadataSetIDArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] metadataSetIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataSetIDArray, METADATASETID$0);
        }
    }
    
    /**
     * Sets ith "MetadataSetID" element
     */
    public void setMetadataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType metadataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().find_element_user(METADATASETID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataSetID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType insertNewMetadataSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().insert_element_user(METADATASETID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType addNewMetadataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType)get_store().add_element_user(METADATASETID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataSetID" element
     */
    public void removeMetadataSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASETID$0, i);
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
            get_store().find_all_element_users(DATAPROVIDER$2, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, i);
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
            return get_store().count_elements(DATAPROVIDER$2);
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
            arraySetterHelper(dataProviderArray, DATAPROVIDER$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().insert_element_user(DATAPROVIDER$2, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$2);
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
            get_store().remove_element(DATAPROVIDER$2, i);
        }
    }
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] getMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATASTRUCTURE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType getMetadataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().find_element_user(METADATASTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataStructure" element
     */
    public int sizeOfMetadataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$4);
        }
    }
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    public void setMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] metadataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataStructureArray, METADATASTRUCTURE$4);
        }
    }
    
    /**
     * Sets ith "MetadataStructure" element
     */
    public void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().find_element_user(METADATASTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType insertNewMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().insert_element_user(METADATASTRUCTURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType)get_store().add_element_user(METADATASTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    public void removeMetadataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$4, i);
        }
    }
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] getMetadataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAFLOW$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType getMetadataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().find_element_user(METADATAFLOW$6, i);
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
            return get_store().count_elements(METADATAFLOW$6);
        }
    }
    
    /**
     * Sets array of all "Metadataflow" element
     */
    public void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] metadataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataflowArray, METADATAFLOW$6);
        }
    }
    
    /**
     * Sets ith "Metadataflow" element
     */
    public void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().find_element_user(METADATAFLOW$6, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType insertNewMetadataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().insert_element_user(METADATAFLOW$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType)get_store().add_element_user(METADATAFLOW$6);
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
            get_store().remove_element(METADATAFLOW$6, i);
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
            get_store().find_all_element_users(PROVISIONAGREEMENT$8, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$8, i);
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
            return get_store().count_elements(PROVISIONAGREEMENT$8);
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
            arraySetterHelper(provisionAgreementArray, PROVISIONAGREEMENT$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().insert_element_user(PROVISIONAGREEMENT$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$8);
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
            get_store().remove_element(PROVISIONAGREEMENT$8, i);
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
            get_store().find_all_element_users(CATEGORY$10, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(CATEGORY$10, i);
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
            return get_store().count_elements(CATEGORY$10);
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
            arraySetterHelper(categoryArray, CATEGORY$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(CATEGORY$10, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().insert_element_user(CATEGORY$10, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(CATEGORY$10);
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
            get_store().remove_element(CATEGORY$10, i);
        }
    }
    
    /**
     * Gets array of all "Updated" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] getUpdatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATED$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Updated" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getUpdatedArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(UPDATED$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Updated" element
     */
    public int sizeOfUpdatedArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATED$12);
        }
    }
    
    /**
     * Sets array of all "Updated" element
     */
    public void setUpdatedArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] updatedArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(updatedArray, UPDATED$12);
        }
    }
    
    /**
     * Sets ith "Updated" element
     */
    public void setUpdatedArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType updated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(UPDATED$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(updated);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Updated" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType insertNewUpdated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().insert_element_user(UPDATED$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Updated" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(UPDATED$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Updated" element
     */
    public void removeUpdated(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATED$12, i);
        }
    }
    
    /**
     * Gets array of all "ConceptValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] getConceptValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTVALUE$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType getConceptValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().find_element_user(CONCEPTVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptValue" element
     */
    public int sizeOfConceptValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTVALUE$14);
        }
    }
    
    /**
     * Sets array of all "ConceptValue" element
     */
    public void setConceptValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] conceptValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptValueArray, CONCEPTVALUE$14);
        }
    }
    
    /**
     * Sets ith "ConceptValue" element
     */
    public void setConceptValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType conceptValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().find_element_user(CONCEPTVALUE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType insertNewConceptValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().insert_element_user(CONCEPTVALUE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType addNewConceptValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType)get_store().add_element_user(CONCEPTVALUE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptValue" element
     */
    public void removeConceptValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTVALUE$14, i);
        }
    }
    
    /**
     * Gets array of all "RepresentationValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] getRepresentationValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPRESENTATIONVALUE$16, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RepresentationValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType getRepresentationValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().find_element_user(REPRESENTATIONVALUE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RepresentationValue" element
     */
    public int sizeOfRepresentationValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIONVALUE$16);
        }
    }
    
    /**
     * Sets array of all "RepresentationValue" element
     */
    public void setRepresentationValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] representationValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(representationValueArray, REPRESENTATIONVALUE$16);
        }
    }
    
    /**
     * Sets ith "RepresentationValue" element
     */
    public void setRepresentationValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType representationValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().find_element_user(REPRESENTATIONVALUE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representationValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType insertNewRepresentationValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().insert_element_user(REPRESENTATIONVALUE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType addNewRepresentationValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType)get_store().add_element_user(REPRESENTATIONVALUE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "RepresentationValue" element
     */
    public void removeRepresentationValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIONVALUE$16, i);
        }
    }
    
    /**
     * Gets array of all "MetadataTargetValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType[] getMetadataTargetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATARGETVALUE$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataTargetValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType getMetadataTargetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType)get_store().find_element_user(METADATATARGETVALUE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataTargetValue" element
     */
    public int sizeOfMetadataTargetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATARGETVALUE$18);
        }
    }
    
    /**
     * Sets array of all "MetadataTargetValue" element
     */
    public void setMetadataTargetValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType[] metadataTargetValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataTargetValueArray, METADATATARGETVALUE$18);
        }
    }
    
    /**
     * Sets ith "MetadataTargetValue" element
     */
    public void setMetadataTargetValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType metadataTargetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType)get_store().find_element_user(METADATATARGETVALUE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataTargetValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType insertNewMetadataTargetValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType)get_store().insert_element_user(METADATATARGETVALUE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType addNewMetadataTargetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType)get_store().add_element_user(METADATATARGETVALUE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataTargetValue" element
     */
    public void removeMetadataTargetValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATARGETVALUE$18, i);
        }
    }
    
    /**
     * Gets array of all "ReportStructureValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType[] getReportStructureValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTSTRUCTUREVALUE$20, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportStructureValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType getReportStructureValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType)get_store().find_element_user(REPORTSTRUCTUREVALUE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportStructureValue" element
     */
    public int sizeOfReportStructureValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSTRUCTUREVALUE$20);
        }
    }
    
    /**
     * Sets array of all "ReportStructureValue" element
     */
    public void setReportStructureValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType[] reportStructureValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportStructureValueArray, REPORTSTRUCTUREVALUE$20);
        }
    }
    
    /**
     * Sets ith "ReportStructureValue" element
     */
    public void setReportStructureValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType reportStructureValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType)get_store().find_element_user(REPORTSTRUCTUREVALUE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportStructureValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportStructureValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType insertNewReportStructureValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType)get_store().insert_element_user(REPORTSTRUCTUREVALUE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportStructureValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType addNewReportStructureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType)get_store().add_element_user(REPORTSTRUCTUREVALUE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportStructureValue" element
     */
    public void removeReportStructureValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSTRUCTUREVALUE$20, i);
        }
    }
    
    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] getAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTCONSTRAINT$22, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getAttachmentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$22, i);
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
            return get_store().count_elements(ATTACHMENTCONSTRAINT$22);
        }
    }
    
    /**
     * Sets array of all "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] attachmentConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentConstraintArray, ATTACHMENTCONSTRAINT$22);
        }
    }
    
    /**
     * Sets ith "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$22, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType insertNewAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().insert_element_user(ATTACHMENTCONSTRAINT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(ATTACHMENTCONSTRAINT$22);
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
            get_store().remove_element(ATTACHMENTCONSTRAINT$22, i);
        }
    }
    
    /**
     * Gets array of all "AttachedObject" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] getAttachedObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHEDOBJECT$24, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachedObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getAttachedObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(ATTACHEDOBJECT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachedObject" element
     */
    public int sizeOfAttachedObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHEDOBJECT$24);
        }
    }
    
    /**
     * Sets array of all "AttachedObject" element
     */
    public void setAttachedObjectArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] attachedObjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachedObjectArray, ATTACHEDOBJECT$24);
        }
    }
    
    /**
     * Sets ith "AttachedObject" element
     */
    public void setAttachedObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType attachedObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(ATTACHEDOBJECT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachedObject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType insertNewAttachedObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().insert_element_user(ATTACHEDOBJECT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewAttachedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(ATTACHEDOBJECT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachedObject" element
     */
    public void removeAttachedObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHEDOBJECT$24, i);
        }
    }
    
    /**
     * Gets array of all "AttachedDataKey" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] getAttachedDataKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHEDDATAKEY$26, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachedDataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getAttachedDataKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().find_element_user(ATTACHEDDATAKEY$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachedDataKey" element
     */
    public int sizeOfAttachedDataKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHEDDATAKEY$26);
        }
    }
    
    /**
     * Sets array of all "AttachedDataKey" element
     */
    public void setAttachedDataKeyArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] attachedDataKeyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachedDataKeyArray, ATTACHEDDATAKEY$26);
        }
    }
    
    /**
     * Sets ith "AttachedDataKey" element
     */
    public void setAttachedDataKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType attachedDataKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().find_element_user(ATTACHEDDATAKEY$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachedDataKey);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedDataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType insertNewAttachedDataKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().insert_element_user(ATTACHEDDATAKEY$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedDataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewAttachedDataKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().add_element_user(ATTACHEDDATAKEY$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachedDataKey" element
     */
    public void removeAttachedDataKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHEDDATAKEY$26, i);
        }
    }
    
    /**
     * Gets array of all "AttachedDataSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getAttachedDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHEDDATASET$28, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachedDataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getAttachedDataSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(ATTACHEDDATASET$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachedDataSet" element
     */
    public int sizeOfAttachedDataSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHEDDATASET$28);
        }
    }
    
    /**
     * Sets array of all "AttachedDataSet" element
     */
    public void setAttachedDataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] attachedDataSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachedDataSetArray, ATTACHEDDATASET$28);
        }
    }
    
    /**
     * Sets ith "AttachedDataSet" element
     */
    public void setAttachedDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType attachedDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(ATTACHEDDATASET$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachedDataSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedDataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType insertNewAttachedDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().insert_element_user(ATTACHEDDATASET$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedDataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewAttachedDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(ATTACHEDDATASET$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachedDataSet" element
     */
    public void removeAttachedDataSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHEDDATASET$28, i);
        }
    }
    
    /**
     * Gets array of all "AttachedReportingPeriod" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] getAttachedReportingPeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHEDREPORTINGPERIOD$30, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachedReportingPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getAttachedReportingPeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(ATTACHEDREPORTINGPERIOD$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachedReportingPeriod" element
     */
    public int sizeOfAttachedReportingPeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHEDREPORTINGPERIOD$30);
        }
    }
    
    /**
     * Sets array of all "AttachedReportingPeriod" element
     */
    public void setAttachedReportingPeriodArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] attachedReportingPeriodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachedReportingPeriodArray, ATTACHEDREPORTINGPERIOD$30);
        }
    }
    
    /**
     * Sets ith "AttachedReportingPeriod" element
     */
    public void setAttachedReportingPeriodArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType attachedReportingPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().find_element_user(ATTACHEDREPORTINGPERIOD$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachedReportingPeriod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedReportingPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType insertNewAttachedReportingPeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().insert_element_user(ATTACHEDREPORTINGPERIOD$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedReportingPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewAttachedReportingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType)get_store().add_element_user(ATTACHEDREPORTINGPERIOD$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachedReportingPeriod" element
     */
    public void removeAttachedReportingPeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHEDREPORTINGPERIOD$30, i);
        }
    }
    
    /**
     * Gets array of all "Or" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType[] getOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OR$32, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType getOrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType)get_store().find_element_user(OR$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Or" element
     */
    public int sizeOfOrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OR$32);
        }
    }
    
    /**
     * Sets array of all "Or" element
     */
    public void setOrArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType[] orArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(orArray, OR$32);
        }
    }
    
    /**
     * Sets ith "Or" element
     */
    public void setOrArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType or)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType)get_store().find_element_user(OR$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(or);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType insertNewOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType)get_store().insert_element_user(OR$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Or" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType)get_store().add_element_user(OR$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "Or" element
     */
    public void removeOr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OR$32, i);
        }
    }
    
    /**
     * Gets array of all "And" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType[] getAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AND$34, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType getAndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().find_element_user(AND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "And" element
     */
    public int sizeOfAndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AND$34);
        }
    }
    
    /**
     * Sets array of all "And" element
     */
    public void setAndArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType[] andArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(andArray, AND$34);
        }
    }
    
    /**
     * Sets ith "And" element
     */
    public void setAndArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType and)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().find_element_user(AND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(and);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType insertNewAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().insert_element_user(AND$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "And" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType addNewAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().add_element_user(AND$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "And" element
     */
    public void removeAnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AND$34, i);
        }
    }
}
