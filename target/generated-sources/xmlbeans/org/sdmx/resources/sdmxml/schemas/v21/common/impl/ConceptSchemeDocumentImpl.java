/*
 * An XML document type.
 * Localname: ConceptScheme
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ConceptSchemeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ConceptScheme(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ConceptSchemeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ConceptSchemeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ConceptScheme");
    
    
    /**
     * Gets the "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptScheme" element
     */
    public void setConceptScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType conceptScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEME$0);
            }
            target.set(conceptScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEME$0);
            return target;
        }
    }
}
