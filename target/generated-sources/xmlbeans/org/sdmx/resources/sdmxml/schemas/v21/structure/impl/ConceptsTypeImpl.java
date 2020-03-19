/*
 * XML Type:  ConceptsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConceptsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConceptsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptScheme");
    
    
    /**
     * Gets array of all "ConceptScheme" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType[] getConceptSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType getConceptSchemeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType)get_store().find_element_user(CONCEPTSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptScheme" element
     */
    public int sizeOfConceptSchemeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEME$0);
        }
    }
    
    /**
     * Sets array of all "ConceptScheme" element
     */
    public void setConceptSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType[] conceptSchemeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeArray, CONCEPTSCHEME$0);
        }
    }
    
    /**
     * Sets ith "ConceptScheme" element
     */
    public void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType conceptScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType)get_store().find_element_user(CONCEPTSCHEME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptScheme);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType insertNewConceptScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType)get_store().insert_element_user(CONCEPTSCHEME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType addNewConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeType)get_store().add_element_user(CONCEPTSCHEME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptScheme" element
     */
    public void removeConceptScheme(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEME$0, i);
        }
    }
}
