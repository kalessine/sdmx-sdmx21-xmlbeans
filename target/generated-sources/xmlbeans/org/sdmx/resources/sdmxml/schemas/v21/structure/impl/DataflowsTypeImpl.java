/*
 * XML Type:  DataflowsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DataflowsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DataflowsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType
{
    private static final long serialVersionUID = 1L;
    
    public DataflowsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFLOW$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dataflow");
    
    
    /**
     * Gets array of all "Dataflow" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType[] getDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAFLOW$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType getDataflowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType)get_store().find_element_user(DATAFLOW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dataflow" element
     */
    public int sizeOfDataflowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOW$0);
        }
    }
    
    /**
     * Sets array of all "Dataflow" element
     */
    public void setDataflowArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType[] dataflowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataflowArray, DATAFLOW$0);
        }
    }
    
    /**
     * Sets ith "Dataflow" element
     */
    public void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType)get_store().find_element_user(DATAFLOW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataflow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType insertNewDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType)get_store().insert_element_user(DATAFLOW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType addNewDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowType)get_store().add_element_user(DATAFLOW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dataflow" element
     */
    public void removeDataflow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOW$0, i);
        }
    }
}
