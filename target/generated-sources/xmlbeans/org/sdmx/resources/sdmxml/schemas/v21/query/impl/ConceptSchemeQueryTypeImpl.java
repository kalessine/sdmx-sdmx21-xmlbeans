/*
 * XML Type:  ConceptSchemeQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ConceptSchemeQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ConceptSchemeQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeQueryType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTSCHEMEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptSchemeWhere");
    
    
    /**
     * Gets the "ConceptSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType getConceptSchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType)get_store().find_element_user(CONCEPTSCHEMEWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConceptSchemeWhere" element
     */
    public void setConceptSchemeWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType conceptSchemeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType)get_store().find_element_user(CONCEPTSCHEMEWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType)get_store().add_element_user(CONCEPTSCHEMEWHERE$0);
            }
            target.set(conceptSchemeWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptSchemeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType addNewConceptSchemeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType)get_store().add_element_user(CONCEPTSCHEMEWHERE$0);
            return target;
        }
    }
}
