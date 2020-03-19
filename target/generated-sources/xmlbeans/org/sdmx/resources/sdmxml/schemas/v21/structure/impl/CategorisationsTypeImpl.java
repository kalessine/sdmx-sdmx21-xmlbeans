/*
 * XML Type:  CategorisationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CategorisationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CategorisationsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType
{
    private static final long serialVersionUID = 1L;
    
    public CategorisationsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORISATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Categorisation");
    
    
    /**
     * Gets array of all "Categorisation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType[] getCategorisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORISATION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType getCategorisationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType)get_store().find_element_user(CATEGORISATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Categorisation" element
     */
    public int sizeOfCategorisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORISATION$0);
        }
    }
    
    /**
     * Sets array of all "Categorisation" element
     */
    public void setCategorisationArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType[] categorisationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorisationArray, CATEGORISATION$0);
        }
    }
    
    /**
     * Sets ith "Categorisation" element
     */
    public void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType categorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType)get_store().find_element_user(CATEGORISATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorisation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType insertNewCategorisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType)get_store().insert_element_user(CATEGORISATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType addNewCategorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationType)get_store().add_element_user(CATEGORISATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Categorisation" element
     */
    public void removeCategorisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORISATION$0, i);
        }
    }
}
