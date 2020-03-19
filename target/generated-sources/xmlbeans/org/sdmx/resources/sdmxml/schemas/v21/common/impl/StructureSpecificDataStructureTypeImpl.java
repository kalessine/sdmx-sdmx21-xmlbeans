/*
 * XML Type:  StructureSpecificDataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.StructureSpecificDataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML StructureSpecificDataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class StructureSpecificDataStructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.DataStructureTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.StructureSpecificDataStructureType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificDataStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMESPACE$0 = 
        new javax.xml.namespace.QName("", "namespace");
    private static final javax.xml.namespace.QName DIMENSIONATOBSERVATION$2 = 
        new javax.xml.namespace.QName("", "dimensionAtObservation");
    private static final javax.xml.namespace.QName EXPLICITMEASURES$4 = 
        new javax.xml.namespace.QName("", "explicitMeasures");
    
    
    /**
     * Gets the "namespace" attribute
     */
    public java.lang.String getNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$0);
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
            return get_store().find_attribute_user(NAMESPACE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMESPACE$0);
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
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(NAMESPACE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(NAMESPACE$0);
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
            get_store().remove_attribute(NAMESPACE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONATOBSERVATION$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().find_attribute_user(DIMENSIONATOBSERVATION$2);
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
            return get_store().find_attribute_user(DIMENSIONATOBSERVATION$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIMENSIONATOBSERVATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIMENSIONATOBSERVATION$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().find_attribute_user(DIMENSIONATOBSERVATION$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType)get_store().add_attribute_user(DIMENSIONATOBSERVATION$2);
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
            get_store().remove_attribute(DIMENSIONATOBSERVATION$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPLICITMEASURES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPLICITMEASURES$4);
            }
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPLICITMEASURES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXPLICITMEASURES$4);
            }
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
            return get_store().find_attribute_user(EXPLICITMEASURES$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPLICITMEASURES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPLICITMEASURES$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXPLICITMEASURES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXPLICITMEASURES$4);
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
            get_store().remove_attribute(EXPLICITMEASURES$4);
        }
    }
}
