/*
 * An XML document type.
 * Localname: ConceptWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ConceptWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ConceptWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptWhere");
    
    
    /**
     * Gets the "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType getConceptWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().find_element_user(CONCEPTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptWhere" element
     */
    public void setConceptWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType conceptWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().find_element_user(CONCEPTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().add_element_user(CONCEPTWHERE$0);
            }
            target.set(conceptWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType addNewConceptWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().add_element_user(CONCEPTWHERE$0);
            return target;
        }
    }
}
