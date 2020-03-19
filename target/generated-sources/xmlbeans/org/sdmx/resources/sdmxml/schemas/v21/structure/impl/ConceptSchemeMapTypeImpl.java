/*
 * XML Type:  ConceptSchemeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConceptSchemeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConceptSchemeMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeMapTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptMap");
    
    
    /**
     * Gets array of all "ConceptMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType[] getConceptMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTMAP$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType getConceptMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().find_element_user(CONCEPTMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptMap" element
     */
    public int sizeOfConceptMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTMAP$0);
        }
    }
    
    /**
     * Sets array of all "ConceptMap" element
     */
    public void setConceptMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType[] conceptMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptMapArray, CONCEPTMAP$0);
        }
    }
    
    /**
     * Sets ith "ConceptMap" element
     */
    public void setConceptMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType conceptMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().find_element_user(CONCEPTMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType insertNewConceptMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptMapType)get_store().insert_element_user(CONCEPTMAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptMap" element
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
    
    /**
     * Removes the ith "ConceptMap" element
     */
    public void removeConceptMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTMAP$0, i);
        }
    }
}
