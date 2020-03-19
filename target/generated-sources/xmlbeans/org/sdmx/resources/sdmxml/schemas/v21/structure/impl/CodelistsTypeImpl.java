/*
 * XML Type:  CodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CodelistsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType
{
    private static final long serialVersionUID = 1L;
    
    public CodelistsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Codelist");
    
    
    /**
     * Gets array of all "Codelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType[] getCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELIST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType getCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType)get_store().find_element_user(CODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Codelist" element
     */
    public int sizeOfCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$0);
        }
    }
    
    /**
     * Sets array of all "Codelist" element
     */
    public void setCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType[] codelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistArray, CODELIST$0);
        }
    }
    
    /**
     * Sets ith "Codelist" element
     */
    public void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType)get_store().find_element_user(CODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType insertNewCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType)get_store().insert_element_user(CODELIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType addNewCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType)get_store().add_element_user(CODELIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Codelist" element
     */
    public void removeCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$0, i);
        }
    }
}
