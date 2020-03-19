/*
 * XML Type:  PayloadStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML PayloadStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class PayloadStructureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType
{
    private static final long serialVersionUID = 1L;
    
    public PayloadStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVISIONAGREMENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ProvisionAgrement");
    private static final javax.xml.namespace.QName STRUCTUREUSAGE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "StructureUsage");
    private static final javax.xml.namespace.QName STRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Structure");
    private static final javax.xml.namespace.QName STRUCTUREID$6 = 
        new javax.xml.namespace.QName("", "structureID");
    private static final javax.xml.namespace.QName SCHEMAURL$8 = 
        new javax.xml.namespace.QName("", "schemaURL");
    private static final javax.xml.namespace.QName NAMESPACE$10 = 
        new javax.xml.namespace.QName("", "namespace");
    private static final javax.xml.namespace.QName DIMENSIONATOBSERVATION$12 = 
        new javax.xml.namespace.QName("", "dimensionAtObservation");
    private static final javax.xml.namespace.QName EXPLICITMEASURES$14 = 
        new javax.xml.namespace.QName("", "explicitMeasures");
    private static final javax.xml.namespace.QName SERVICEURL$16 = 
        new javax.xml.namespace.QName("", "serviceURL");
    private static final javax.xml.namespace.QName STRUCTUREURL$18 = 
        new javax.xml.namespace.QName("", "structureURL");
    
    
    /**
     * Gets the "ProvisionAgrement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisionAgrement" element
     */
    public boolean isSetProvisionAgrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgrement" element
     */
    public void setProvisionAgrement(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgrement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().find_element_user(PROVISIONAGREMENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREMENT$0);
            }
            target.set(provisionAgrement);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgrement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType)get_store().add_element_user(PROVISIONAGREMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisionAgrement" element
     */
    public void unsetProvisionAgrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREMENT$0, 0);
        }
    }
    
    /**
     * Gets the "StructureUsage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType getStructureUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType)get_store().find_element_user(STRUCTUREUSAGE$2, 0);
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
            return get_store().count_elements(STRUCTUREUSAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "StructureUsage" element
     */
    public void setStructureUsage(org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType structureUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType)get_store().find_element_user(STRUCTUREUSAGE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType)get_store().add_element_user(STRUCTUREUSAGE$2);
            }
            target.set(structureUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureUsage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType addNewStructureUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType)get_store().add_element_user(STRUCTUREUSAGE$2);
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
            get_store().remove_element(STRUCTUREUSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType getStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().find_element_user(STRUCTURE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Structure" element
     */
    public boolean isSetStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$4) != 0;
        }
    }
    
    /**
     * Sets the "Structure" element
     */
    public void setStructure(org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().find_element_user(STRUCTURE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().add_element_user(STRUCTURE$4);
            }
            target.set(structure);
        }
    }
    
    /**
     * Appends and returns a new empty "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().add_element_user(STRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Structure" element
     */
    public void unsetStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$4, 0);
        }
    }
    
    /**
     * Gets the "structureID" attribute
     */
    public java.lang.String getStructureID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "structureID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetStructureID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(STRUCTUREID$6);
            return target;
        }
    }
    
    /**
     * Sets the "structureID" attribute
     */
    public void setStructureID(java.lang.String structureID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREID$6);
            }
            target.setStringValue(structureID);
        }
    }
    
    /**
     * Sets (as xml) the "structureID" attribute
     */
    public void xsetStructureID(org.apache.xmlbeans.XmlID structureID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(STRUCTUREID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(STRUCTUREID$6);
            }
            target.set(structureID);
        }
    }
    
    /**
     * Gets the "schemaURL" attribute
     */
    public java.lang.String getSchemaURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAURL$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemaURL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSchemaURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMAURL$8);
            return target;
        }
    }
    
    /**
     * True if has "schemaURL" attribute
     */
    public boolean isSetSchemaURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMAURL$8) != null;
        }
    }
    
    /**
     * Sets the "schemaURL" attribute
     */
    public void setSchemaURL(java.lang.String schemaURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAURL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMAURL$8);
            }
            target.setStringValue(schemaURL);
        }
    }
    
    /**
     * Sets (as xml) the "schemaURL" attribute
     */
    public void xsetSchemaURL(org.apache.xmlbeans.XmlAnyURI schemaURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMAURL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SCHEMAURL$8);
            }
            target.set(schemaURL);
        }
    }
    
    /**
     * Unsets the "schemaURL" attribute
     */
    public void unsetSchemaURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMAURL$8);
        }
    }
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$10);
            return target;
        }
    }
    
    /**
     * True if has "namespace" attribute
     */
    public boolean isSetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMESPACE$10) != null;
        }
    }
    
    /**
     * Sets the "namespace" attribute
     */
    public void setNamespace(java.lang.String namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$10);
            }
            target.setStringValue(namespace);
        }
    }
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    public void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$10);
            }
            target.set(namespace);
        }
    }
    
    /**
     * Unsets the "namespace" attribute
     */
    public void unsetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMESPACE$10);
        }
    }
    
    /**
     * Gets the "dimensionAtObservation" attribute
     */
    public java.lang.String getDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONATOBSERVATION$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType xgetDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().find_attribute_user(DIMENSIONATOBSERVATION$12);
            return target;
        }
    }
    
    /**
     * True if has "dimensionAtObservation" attribute
     */
    public boolean isSetDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIMENSIONATOBSERVATION$12) != null;
        }
    }
    
    /**
     * Sets the "dimensionAtObservation" attribute
     */
    public void setDimensionAtObservation(java.lang.String dimensionAtObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONATOBSERVATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSIONATOBSERVATION$12);
            }
            target.setStringValue(dimensionAtObservation);
        }
    }
    
    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    public void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType dimensionAtObservation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().find_attribute_user(DIMENSIONATOBSERVATION$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().add_attribute_user(DIMENSIONATOBSERVATION$12);
            }
            target.set(dimensionAtObservation);
        }
    }
    
    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    public void unsetDimensionAtObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIMENSIONATOBSERVATION$12);
        }
    }
    
    /**
     * Gets the "explicitMeasures" attribute
     */
    public boolean getExplicitMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPLICITMEASURES$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "explicitMeasures" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetExplicitMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPLICITMEASURES$14);
            return target;
        }
    }
    
    /**
     * True if has "explicitMeasures" attribute
     */
    public boolean isSetExplicitMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPLICITMEASURES$14) != null;
        }
    }
    
    /**
     * Sets the "explicitMeasures" attribute
     */
    public void setExplicitMeasures(boolean explicitMeasures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPLICITMEASURES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPLICITMEASURES$14);
            }
            target.setBooleanValue(explicitMeasures);
        }
    }
    
    /**
     * Sets (as xml) the "explicitMeasures" attribute
     */
    public void xsetExplicitMeasures(org.apache.xmlbeans.XmlBoolean explicitMeasures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPLICITMEASURES$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPLICITMEASURES$14);
            }
            target.set(explicitMeasures);
        }
    }
    
    /**
     * Unsets the "explicitMeasures" attribute
     */
    public void unsetExplicitMeasures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPLICITMEASURES$14);
        }
    }
    
    /**
     * Gets the "serviceURL" attribute
     */
    public java.lang.String getServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICEURL$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SERVICEURL$16);
            return target;
        }
    }
    
    /**
     * True if has "serviceURL" attribute
     */
    public boolean isSetServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVICEURL$16) != null;
        }
    }
    
    /**
     * Sets the "serviceURL" attribute
     */
    public void setServiceURL(java.lang.String serviceURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICEURL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICEURL$16);
            }
            target.setStringValue(serviceURL);
        }
    }
    
    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    public void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SERVICEURL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SERVICEURL$16);
            }
            target.set(serviceURL);
        }
    }
    
    /**
     * Unsets the "serviceURL" attribute
     */
    public void unsetServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVICEURL$16);
        }
    }
    
    /**
     * Gets the "structureURL" attribute
     */
    public java.lang.String getStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREURL$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "structureURL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(STRUCTUREURL$18);
            return target;
        }
    }
    
    /**
     * True if has "structureURL" attribute
     */
    public boolean isSetStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRUCTUREURL$18) != null;
        }
    }
    
    /**
     * Sets the "structureURL" attribute
     */
    public void setStructureURL(java.lang.String structureURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREURL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREURL$18);
            }
            target.setStringValue(structureURL);
        }
    }
    
    /**
     * Sets (as xml) the "structureURL" attribute
     */
    public void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(STRUCTUREURL$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(STRUCTUREURL$18);
            }
            target.set(structureURL);
        }
    }
    
    /**
     * Unsets the "structureURL" attribute
     */
    public void unsetStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRUCTUREURL$18);
        }
    }
}
