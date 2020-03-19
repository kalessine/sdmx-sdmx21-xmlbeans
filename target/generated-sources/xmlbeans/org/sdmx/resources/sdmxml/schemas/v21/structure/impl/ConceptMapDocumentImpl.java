/*
 * An XML document type.
 * Localname: ConceptMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ConceptMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ConceptMapDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemAssociationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptMap");
    
    
    /**
     * Gets the "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType getConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().find_element_user(CONCEPTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptMap" element
     */
    public void setConceptMap(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType conceptMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().find_element_user(CONCEPTMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().add_element_user(CONCEPTMAP$0);
            }
            target.set(conceptMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType addNewConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().add_element_user(CONCEPTMAP$0);
            return target;
        }
    }
}
