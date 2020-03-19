/*
 * XML Type:  RegistrationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML RegistrationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class RegistrationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType
{
    private static final long serialVersionUID = 1L;
    
    public RegistrationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ProvisionAgreement");
    private static final javax.xml.namespace.QName DATASOURCE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Datasource");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName VALIDFROM$6 = 
        new javax.xml.namespace.QName("", "validFrom");
    private static final javax.xml.namespace.QName VALIDTO$8 = 
        new javax.xml.namespace.QName("", "validTo");
    private static final javax.xml.namespace.QName LASTUPDATED$10 = 
        new javax.xml.namespace.QName("", "lastUpdated");
    private static final javax.xml.namespace.QName INDEXTIMESERIES$12 = 
        new javax.xml.namespace.QName("", "indexTimeSeries");
    private static final javax.xml.namespace.QName INDEXDATASET$14 = 
        new javax.xml.namespace.QName("", "indexDataSet");
    private static final javax.xml.namespace.QName INDEXATTRIBUTES$16 = 
        new javax.xml.namespace.QName("", "indexAttributes");
    private static final javax.xml.namespace.QName INDEXREPORTINGPERIOD$18 = 
        new javax.xml.namespace.QName("", "indexReportingPeriod");
    
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREEMENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREEMENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "Datasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType getDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType)get_store().find_element_user(DATASOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Datasource" element
     */
    public void setDatasource(org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType datasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType)get_store().find_element_user(DATASOURCE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType)get_store().add_element_user(DATASOURCE$2);
            }
            target.set(datasource);
        }
    }
    
    /**
     * Appends and returns a new empty "Datasource" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType addNewDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType)get_store().add_element_user(DATASOURCE$2);
            return target;
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
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
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
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "validFrom" attribute
     */
    public java.util.Calendar getValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validFrom" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
            return target;
        }
    }
    
    /**
     * True if has "validFrom" attribute
     */
    public boolean isSetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROM$6) != null;
        }
    }
    
    /**
     * Sets the "validFrom" attribute
     */
    public void setValidFrom(java.util.Calendar validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
            }
            target.setCalendarValue(validFrom);
        }
    }
    
    /**
     * Sets (as xml) the "validFrom" attribute
     */
    public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
            }
            target.set(validFrom);
        }
    }
    
    /**
     * Unsets the "validFrom" attribute
     */
    public void unsetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROM$6);
        }
    }
    
    /**
     * Gets the "validTo" attribute
     */
    public java.util.Calendar getValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validTo" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
            return target;
        }
    }
    
    /**
     * True if has "validTo" attribute
     */
    public boolean isSetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTO$8) != null;
        }
    }
    
    /**
     * Sets the "validTo" attribute
     */
    public void setValidTo(java.util.Calendar validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
            }
            target.setCalendarValue(validTo);
        }
    }
    
    /**
     * Sets (as xml) the "validTo" attribute
     */
    public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
            }
            target.set(validTo);
        }
    }
    
    /**
     * Unsets the "validTo" attribute
     */
    public void unsetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTO$8);
        }
    }
    
    /**
     * Gets the "lastUpdated" attribute
     */
    public java.util.Calendar getLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTUPDATED$10);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastUpdated" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTUPDATED$10);
            return target;
        }
    }
    
    /**
     * True if has "lastUpdated" attribute
     */
    public boolean isSetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LASTUPDATED$10) != null;
        }
    }
    
    /**
     * Sets the "lastUpdated" attribute
     */
    public void setLastUpdated(java.util.Calendar lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LASTUPDATED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LASTUPDATED$10);
            }
            target.setCalendarValue(lastUpdated);
        }
    }
    
    /**
     * Sets (as xml) the "lastUpdated" attribute
     */
    public void xsetLastUpdated(org.apache.xmlbeans.XmlDateTime lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(LASTUPDATED$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(LASTUPDATED$10);
            }
            target.set(lastUpdated);
        }
    }
    
    /**
     * Unsets the "lastUpdated" attribute
     */
    public void unsetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LASTUPDATED$10);
        }
    }
    
    /**
     * Gets the "indexTimeSeries" attribute
     */
    public boolean getIndexTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXTIMESERIES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INDEXTIMESERIES$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "indexTimeSeries" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIndexTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXTIMESERIES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INDEXTIMESERIES$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "indexTimeSeries" attribute
     */
    public boolean isSetIndexTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDEXTIMESERIES$12) != null;
        }
    }
    
    /**
     * Sets the "indexTimeSeries" attribute
     */
    public void setIndexTimeSeries(boolean indexTimeSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXTIMESERIES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEXTIMESERIES$12);
            }
            target.setBooleanValue(indexTimeSeries);
        }
    }
    
    /**
     * Sets (as xml) the "indexTimeSeries" attribute
     */
    public void xsetIndexTimeSeries(org.apache.xmlbeans.XmlBoolean indexTimeSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXTIMESERIES$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INDEXTIMESERIES$12);
            }
            target.set(indexTimeSeries);
        }
    }
    
    /**
     * Unsets the "indexTimeSeries" attribute
     */
    public void unsetIndexTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDEXTIMESERIES$12);
        }
    }
    
    /**
     * Gets the "indexDataSet" attribute
     */
    public boolean getIndexDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXDATASET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INDEXDATASET$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "indexDataSet" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIndexDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXDATASET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INDEXDATASET$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "indexDataSet" attribute
     */
    public boolean isSetIndexDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDEXDATASET$14) != null;
        }
    }
    
    /**
     * Sets the "indexDataSet" attribute
     */
    public void setIndexDataSet(boolean indexDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXDATASET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEXDATASET$14);
            }
            target.setBooleanValue(indexDataSet);
        }
    }
    
    /**
     * Sets (as xml) the "indexDataSet" attribute
     */
    public void xsetIndexDataSet(org.apache.xmlbeans.XmlBoolean indexDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXDATASET$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INDEXDATASET$14);
            }
            target.set(indexDataSet);
        }
    }
    
    /**
     * Unsets the "indexDataSet" attribute
     */
    public void unsetIndexDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDEXDATASET$14);
        }
    }
    
    /**
     * Gets the "indexAttributes" attribute
     */
    public boolean getIndexAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXATTRIBUTES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INDEXATTRIBUTES$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "indexAttributes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIndexAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXATTRIBUTES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INDEXATTRIBUTES$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "indexAttributes" attribute
     */
    public boolean isSetIndexAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDEXATTRIBUTES$16) != null;
        }
    }
    
    /**
     * Sets the "indexAttributes" attribute
     */
    public void setIndexAttributes(boolean indexAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXATTRIBUTES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEXATTRIBUTES$16);
            }
            target.setBooleanValue(indexAttributes);
        }
    }
    
    /**
     * Sets (as xml) the "indexAttributes" attribute
     */
    public void xsetIndexAttributes(org.apache.xmlbeans.XmlBoolean indexAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXATTRIBUTES$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INDEXATTRIBUTES$16);
            }
            target.set(indexAttributes);
        }
    }
    
    /**
     * Unsets the "indexAttributes" attribute
     */
    public void unsetIndexAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDEXATTRIBUTES$16);
        }
    }
    
    /**
     * Gets the "indexReportingPeriod" attribute
     */
    public boolean getIndexReportingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXREPORTINGPERIOD$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INDEXREPORTINGPERIOD$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "indexReportingPeriod" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIndexReportingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXREPORTINGPERIOD$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INDEXREPORTINGPERIOD$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "indexReportingPeriod" attribute
     */
    public boolean isSetIndexReportingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDEXREPORTINGPERIOD$18) != null;
        }
    }
    
    /**
     * Sets the "indexReportingPeriod" attribute
     */
    public void setIndexReportingPeriod(boolean indexReportingPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDEXREPORTINGPERIOD$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDEXREPORTINGPERIOD$18);
            }
            target.setBooleanValue(indexReportingPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "indexReportingPeriod" attribute
     */
    public void xsetIndexReportingPeriod(org.apache.xmlbeans.XmlBoolean indexReportingPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INDEXREPORTINGPERIOD$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INDEXREPORTINGPERIOD$18);
            }
            target.set(indexReportingPeriod);
        }
    }
    
    /**
     * Unsets the "indexReportingPeriod" attribute
     */
    public void unsetIndexReportingPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDEXREPORTINGPERIOD$18);
        }
    }
}
