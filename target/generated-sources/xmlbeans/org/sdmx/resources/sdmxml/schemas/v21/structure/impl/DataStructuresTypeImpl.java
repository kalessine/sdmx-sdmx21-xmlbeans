/*
 * XML Type:  DataStructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DataStructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DataStructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructuresTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataStructure");
    
    
    /**
     * Gets array of all "DataStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType[] getDataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASTRUCTURE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType getDataStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType)get_store().find_element_user(DATASTRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataStructure" element
     */
    public int sizeOfDataStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTRUCTURE$0);
        }
    }
    
    /**
     * Sets array of all "DataStructure" element
     */
    public void setDataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType[] dataStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataStructureArray, DATASTRUCTURE$0);
        }
    }
    
    /**
     * Sets ith "DataStructure" element
     */
    public void setDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType dataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType)get_store().find_element_user(DATASTRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType insertNewDataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType)get_store().insert_element_user(DATASTRUCTURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType addNewDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType)get_store().add_element_user(DATASTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataStructure" element
     */
    public void removeDataStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTRUCTURE$0, i);
        }
    }
}
