/*
 * XML Type:  ComponentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ComponentType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ComponentTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTIDENTITY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptIdentity");
    private static final javax.xml.namespace.QName LOCALREPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "LocalRepresentation");
    
    
    /**
     * Gets the "ConceptIdentity" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType getConceptIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(CONCEPTIDENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConceptIdentity" element
     */
    public boolean isSetConceptIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTIDENTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "ConceptIdentity" element
     */
    public void setConceptIdentity(org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType conceptIdentity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(CONCEPTIDENTITY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().add_element_user(CONCEPTIDENTITY$0);
            }
            target.set(conceptIdentity);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptIdentity" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType addNewConceptIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().add_element_user(CONCEPTIDENTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ConceptIdentity" element
     */
    public void unsetConceptIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTIDENTITY$0, 0);
        }
    }
    
    /**
     * Gets the "LocalRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType getLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().find_element_user(LOCALREPRESENTATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocalRepresentation" element
     */
    public boolean isSetLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALREPRESENTATION$2) != 0;
        }
    }
    
    /**
     * Sets the "LocalRepresentation" element
     */
    public void setLocalRepresentation(org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType localRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().find_element_user(LOCALREPRESENTATION$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().add_element_user(LOCALREPRESENTATION$2);
            }
            target.set(localRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "LocalRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType addNewLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().add_element_user(LOCALREPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "LocalRepresentation" element
     */
    public void unsetLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALREPRESENTATION$2, 0);
        }
    }
}
