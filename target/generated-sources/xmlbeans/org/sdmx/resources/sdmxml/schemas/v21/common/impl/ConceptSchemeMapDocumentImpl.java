/*
 * An XML document type.
 * Localname: ConceptSchemeMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ConceptSchemeMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ConceptSchemeMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ConceptSchemeMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ConceptSchemeMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTSCHEMEMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ConceptSchemeMap");
    
    
    /**
     * Gets the "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEMEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptSchemeMap" element
     */
    public void setConceptSchemeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType conceptSchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEMEMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEMEMAP$0);
            }
            target.set(conceptSchemeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEMEMAP$0);
            return target;
        }
    }
}
