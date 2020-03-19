/*
 * XML Type:  ProvisionAgreementWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ProvisionAgreementWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ProvisionAgreementWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ProvisionAgreementWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ProvisionAgreementWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ProvisionAgreementWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREUSAGE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructureUsage");
    private static final javax.xml.namespace.QName DATAPROVIDER$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataProvider");
    
    
    /**
     * Gets the "StructureUsage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType getStructureUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().find_element_user(STRUCTUREUSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureUsage" element
     */
    public boolean isSetStructureUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTUREUSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "StructureUsage" element
     */
    public void setStructureUsage(org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType structureUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().find_element_user(STRUCTUREUSAGE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().add_element_user(STRUCTUREUSAGE$0);
            }
            target.set(structureUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureUsage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType addNewStructureUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType)get_store().add_element_user(STRUCTUREUSAGE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureUsage" element
     */
    public void unsetStructureUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTUREUSAGE$0, 0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, 0);
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
            return get_store().count_elements(DATAPROVIDER$2) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$2);
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
            get_store().remove_element(DATAPROVIDER$2, 0);
        }
    }
}
