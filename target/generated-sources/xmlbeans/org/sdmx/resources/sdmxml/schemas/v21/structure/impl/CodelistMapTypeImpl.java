/*
 * XML Type:  CodelistMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML CodelistMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class CodelistMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeMapTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType
{
    private static final long serialVersionUID = 1L;
    
    public CodelistMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODEMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodeMap");
    
    
    /**
     * Gets array of all "CodeMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType[] getCodeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODEMAP$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType getCodeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().find_element_user(CODEMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodeMap" element
     */
    public int sizeOfCodeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEMAP$0);
        }
    }
    
    /**
     * Sets array of all "CodeMap" element
     */
    public void setCodeMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType[] codeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codeMapArray, CODEMAP$0);
        }
    }
    
    /**
     * Sets ith "CodeMap" element
     */
    public void setCodeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType codeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().find_element_user(CODEMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType insertNewCodeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().insert_element_user(CODEMAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType addNewCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().add_element_user(CODEMAP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodeMap" element
     */
    public void removeCodeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEMAP$0, i);
        }
    }
}
