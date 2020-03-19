/*
 * XML Type:  StructureSpecificDataHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML StructureSpecificDataHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class StructureSpecificDataHeaderTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.BaseHeaderTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificDataHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Structure");
    
    
    /**
     * Gets array of all "Structure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] getStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType getStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().find_element_user(STRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Structure" element
     */
    public int sizeOfStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$0);
        }
    }
    
    /**
     * Sets array of all "Structure" element
     */
    public void setStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] structureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureArray, STRUCTURE$0);
        }
    }
    
    /**
     * Sets ith "Structure" element
     */
    public void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().find_element_user(STRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType insertNewStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().insert_element_user(STRUCTURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().add_element_user(STRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Structure" element
     */
    public void removeStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$0, i);
        }
    }
}
