/*
 * XML Type:  ConceptSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConceptSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConceptSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Concept");
    
    
    /**
     * Gets array of all "Concept" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().find_element_user(CONCEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$0);
        }
    }
    
    /**
     * Sets array of all "Concept" element
     */
    public void setConceptArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType[] conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$0);
        }
    }
    
    /**
     * Sets ith "Concept" element
     */
    public void setConceptArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().find_element_user(CONCEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptType)get_store().insert_element_user(CONCEPT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Concept" element
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
    
    /**
     * Removes the ith "Concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$0, i);
        }
    }
}
