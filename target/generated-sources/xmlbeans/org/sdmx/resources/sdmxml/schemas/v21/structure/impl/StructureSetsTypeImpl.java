/*
 * XML Type:  StructureSetsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML StructureSetsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class StructureSetsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "StructureSet");
    
    
    /**
     * Gets array of all "StructureSet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType[] getStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURESET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType getStructureSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType)get_store().find_element_user(STRUCTURESET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructureSet" element
     */
    public int sizeOfStructureSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESET$0);
        }
    }
    
    /**
     * Sets array of all "StructureSet" element
     */
    public void setStructureSetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType[] structureSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureSetArray, STRUCTURESET$0);
        }
    }
    
    /**
     * Sets ith "StructureSet" element
     */
    public void setStructureSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType)get_store().find_element_user(STRUCTURESET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType insertNewStructureSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType)get_store().insert_element_user(STRUCTURESET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType addNewStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType)get_store().add_element_user(STRUCTURESET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureSet" element
     */
    public void removeStructureSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESET$0, i);
        }
    }
}
