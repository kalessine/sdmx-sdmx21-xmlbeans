/*
 * XML Type:  ComponentMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ComponentMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ComponentMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentMapType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Target");
    private static final javax.xml.namespace.QName REPRESENTATIONMAPPING$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "RepresentationMapping");
    
    
    /**
     * Gets the "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().find_element_user(SOURCE$0, 0);
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
    public void setSource(org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().find_element_user(TARGET$2, 0);
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
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalComponentListComponentReferenceType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Gets the "RepresentationMapping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType getRepresentationMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType)get_store().find_element_user(REPRESENTATIONMAPPING$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RepresentationMapping" element
     */
    public boolean isSetRepresentationMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATIONMAPPING$4) != 0;
        }
    }
    
    /**
     * Sets the "RepresentationMapping" element
     */
    public void setRepresentationMapping(org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType representationMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType)get_store().find_element_user(REPRESENTATIONMAPPING$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType)get_store().add_element_user(REPRESENTATIONMAPPING$4);
            }
            target.set(representationMapping);
        }
    }
    
    /**
     * Appends and returns a new empty "RepresentationMapping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType addNewRepresentationMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType)get_store().add_element_user(REPRESENTATIONMAPPING$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RepresentationMapping" element
     */
    public void unsetRepresentationMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATIONMAPPING$4, 0);
        }
    }
}
