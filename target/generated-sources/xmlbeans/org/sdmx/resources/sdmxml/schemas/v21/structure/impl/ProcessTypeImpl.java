/*
 * XML Type:  ProcessType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ProcessType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ProcessTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSSTEP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ProcessStep");
    
    
    /**
     * Gets array of all "ProcessStep" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[] getProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSSTEP$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType getProcessStepArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().find_element_user(PROCESSSTEP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProcessStep" element
     */
    public int sizeOfProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSSTEP$0);
        }
    }
    
    /**
     * Sets array of all "ProcessStep" element
     */
    public void setProcessStepArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[] processStepArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processStepArray, PROCESSSTEP$0);
        }
    }
    
    /**
     * Sets ith "ProcessStep" element
     */
    public void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType processStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().find_element_user(PROCESSSTEP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processStep);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType insertNewProcessStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().insert_element_user(PROCESSSTEP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType addNewProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().add_element_user(PROCESSSTEP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProcessStep" element
     */
    public void removeProcessStep(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSSTEP$0, i);
        }
    }
}
