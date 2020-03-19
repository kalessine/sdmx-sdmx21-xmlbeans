/*
 * An XML document type.
 * Localname: Concept
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Concept(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ConceptDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Concept");
    
    
    /**
     * Gets the "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType getConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().find_element_user(CONCEPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Concept" element
     */
    public void setConcept(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().find_element_user(CONCEPT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().add_element_user(CONCEPT$0);
            }
            target.set(concept);
        }
    }
    
    /**
     * Appends and returns a new empty "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().add_element_user(CONCEPT$0);
            return target;
        }
    }
}
