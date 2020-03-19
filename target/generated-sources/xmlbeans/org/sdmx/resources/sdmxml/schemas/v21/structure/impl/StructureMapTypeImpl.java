/*
 * XML Type:  StructureMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML StructureMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class StructureMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.StructureMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType
{
    private static final long serialVersionUID = 1L;
    
    public StructureMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Target");
    private static final javax.xml.namespace.QName COMPONENTMAP$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ComponentMap");
    private static final javax.xml.namespace.QName ISEXTENSION$6 = 
        new javax.xml.namespace.QName("", "isExtension");
    
    
    /**
     * Gets the "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Gets the "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType getComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType)get_store().find_element_user(COMPONENTMAP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ComponentMap" element
     */
    public void setComponentMap(org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType componentMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType)get_store().find_element_user(COMPONENTMAP$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType)get_store().add_element_user(COMPONENTMAP$4);
            }
            target.set(componentMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType addNewComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType)get_store().add_element_user(COMPONENTMAP$4);
            return target;
        }
    }
    
    /**
     * Gets the "isExtension" attribute
     */
    public boolean getIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISEXTENSION$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExtension" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISEXTENSION$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "isExtension" attribute
     */
    public boolean isSetIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISEXTENSION$6) != null;
        }
    }
    
    /**
     * Sets the "isExtension" attribute
     */
    public void setIsExtension(boolean isExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISEXTENSION$6);
            }
            target.setBooleanValue(isExtension);
        }
    }
    
    /**
     * Sets (as xml) the "isExtension" attribute
     */
    public void xsetIsExtension(org.apache.xmlbeans.XmlBoolean isExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISEXTENSION$6);
            }
            target.set(isExtension);
        }
    }
    
    /**
     * Unsets the "isExtension" attribute
     */
    public void unsetIsExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISEXTENSION$6);
        }
    }
}
