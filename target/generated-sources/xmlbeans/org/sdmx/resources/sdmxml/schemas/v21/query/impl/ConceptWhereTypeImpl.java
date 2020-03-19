/*
 * XML Type:  ConceptWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ConceptWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ConceptWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ConceptWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENUMERATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Enumeration");
    
    
    /**
     * Gets the "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType getEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().find_element_user(ENUMERATION$0, 0);
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
            return get_store().count_elements(ENUMERATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Enumeration" element
     */
    public void setEnumeration(org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType enumeration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().find_element_user(ENUMERATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().add_element_user(ENUMERATION$0);
            }
            target.set(enumeration);
        }
    }
    
    /**
     * Appends and returns a new empty "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType addNewEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().add_element_user(ENUMERATION$0);
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
            get_store().remove_element(ENUMERATION$0, 0);
        }
    }
}
