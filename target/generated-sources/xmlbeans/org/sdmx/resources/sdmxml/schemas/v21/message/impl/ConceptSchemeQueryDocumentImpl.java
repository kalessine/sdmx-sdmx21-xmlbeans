/*
 * An XML document type.
 * Localname: ConceptSchemeQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one ConceptSchemeQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class ConceptSchemeQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTSCHEMEQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ConceptSchemeQuery");
    
    
    /**
     * Gets the "ConceptSchemeQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType getConceptSchemeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType)get_store().find_element_user(CONCEPTSCHEMEQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptSchemeQuery" element
     */
    public void setConceptSchemeQuery(org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType conceptSchemeQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType)get_store().find_element_user(CONCEPTSCHEMEQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType)get_store().add_element_user(CONCEPTSCHEMEQUERY$0);
            }
            target.set(conceptSchemeQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptSchemeQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType addNewConceptSchemeQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConceptSchemeQueryType)get_store().add_element_user(CONCEPTSCHEMEQUERY$0);
            return target;
        }
    }
}
