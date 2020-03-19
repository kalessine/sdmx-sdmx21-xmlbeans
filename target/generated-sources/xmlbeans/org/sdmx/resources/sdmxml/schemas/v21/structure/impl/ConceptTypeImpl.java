/*
 * XML Type:  ConceptType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConceptType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConceptTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ConceptBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COREREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CoreRepresentation");
    private static final javax.xml.namespace.QName ISOCONCEPTREFERENCE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ISOConceptReference");
    
    
    /**
     * Gets the "CoreRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation getCoreRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation)get_store().find_element_user(COREREPRESENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CoreRepresentation" element
     */
    public boolean isSetCoreRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COREREPRESENTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "CoreRepresentation" element
     */
    public void setCoreRepresentation(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation coreRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation)get_store().find_element_user(COREREPRESENTATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation)get_store().add_element_user(COREREPRESENTATION$0);
            }
            target.set(coreRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "CoreRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation addNewCoreRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptRepresentation)get_store().add_element_user(COREREPRESENTATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CoreRepresentation" element
     */
    public void unsetCoreRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COREREPRESENTATION$0, 0);
        }
    }
    
    /**
     * Gets the "ISOConceptReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType getISOConceptReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType)get_store().find_element_user(ISOCONCEPTREFERENCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ISOConceptReference" element
     */
    public boolean isSetISOConceptReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISOCONCEPTREFERENCE$2) != 0;
        }
    }
    
    /**
     * Sets the "ISOConceptReference" element
     */
    public void setISOConceptReference(org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType isoConceptReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType)get_store().find_element_user(ISOCONCEPTREFERENCE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType)get_store().add_element_user(ISOCONCEPTREFERENCE$2);
            }
            target.set(isoConceptReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ISOConceptReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType addNewISOConceptReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType)get_store().add_element_user(ISOCONCEPTREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ISOConceptReference" element
     */
    public void unsetISOConceptReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISOCONCEPTREFERENCE$2, 0);
        }
    }
}
