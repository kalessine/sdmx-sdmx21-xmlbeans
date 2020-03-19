/*
 * XML Type:  CodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CodelistTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistType
{
    private static final long serialVersionUID = 1L;
    
    public CodelistTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Code");
    
    
    /**
     * Gets array of all "Code" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType[] getCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType getCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().find_element_user(CODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Code" element
     */
    public int sizeOfCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$0);
        }
    }
    
    /**
     * Sets array of all "Code" element
     */
    public void setCodeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType[] codeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeArray, CODE$0);
        }
    }
    
    /**
     * Sets ith "Code" element
     */
    public void setCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().find_element_user(CODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(code);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType insertNewCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().insert_element_user(CODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Code" element
     */
    public void removeCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$0, i);
        }
    }
}
