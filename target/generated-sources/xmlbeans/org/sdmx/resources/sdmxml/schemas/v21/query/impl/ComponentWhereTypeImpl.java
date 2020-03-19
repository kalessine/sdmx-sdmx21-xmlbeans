/*
 * XML Type:  ComponentWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ComponentWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ComponentWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.IdentifiableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTIDENTITY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptIdentity");
    private static final javax.xml.namespace.QName ENUMERATION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Enumeration");
    
    
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
     * Gets the "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(ENUMERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Enumeration" element
     */
    public boolean isSetEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENUMERATION$2) != 0;
        }
    }
    
    /**
     * Sets the "Enumeration" element
     */
    public void setEnumeration(org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType enumeration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(ENUMERATION$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(ENUMERATION$2);
            }
            target.set(enumeration);
        }
    }
    
    /**
     * Appends and returns a new empty "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType addNewEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(ENUMERATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Enumeration" element
     */
    public void unsetEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENUMERATION$2, 0);
        }
    }
}
