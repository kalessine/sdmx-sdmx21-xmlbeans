/*
 * XML Type:  ProcessesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ProcessesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ProcessesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Process");
    
    
    /**
     * Gets array of all "Process" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType[] getProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESS$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType getProcessArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType)get_store().find_element_user(PROCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Process" element
     */
    public int sizeOfProcessArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESS$0);
        }
    }
    
    /**
     * Sets array of all "Process" element
     */
    public void setProcessArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType[] processArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processArray, PROCESS$0);
        }
    }
    
    /**
     * Sets ith "Process" element
     */
    public void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType)get_store().find_element_user(PROCESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(process);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType insertNewProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType)get_store().insert_element_user(PROCESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType)get_store().add_element_user(PROCESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Process" element
     */
    public void removeProcess(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESS$0, i);
        }
    }
}
