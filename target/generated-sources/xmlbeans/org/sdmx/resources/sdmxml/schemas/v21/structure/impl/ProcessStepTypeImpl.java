/*
 * XML Type:  ProcessStepType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ProcessStepType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ProcessStepTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ProcessStepBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessStepTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Input");
    private static final javax.xml.namespace.QName OUTPUT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Output");
    private static final javax.xml.namespace.QName COMPUTATION$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Computation");
    private static final javax.xml.namespace.QName TRANSITION$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Transition");
    private static final javax.xml.namespace.QName PROCESSSTEP$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ProcessStep");
    
    
    /**
     * Gets array of all "Input" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] getInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType getInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().find_element_user(INPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Input" element
     */
    public int sizeOfInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUT$0);
        }
    }
    
    /**
     * Sets array of all "Input" element
     */
    public void setInputArray(org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] inputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputArray, INPUT$0);
        }
    }
    
    /**
     * Sets ith "Input" element
     */
    public void setInputArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType input)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().find_element_user(INPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(input);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType insertNewInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().insert_element_user(INPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Input" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType addNewInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().add_element_user(INPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Input" element
     */
    public void removeInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUT$0, i);
        }
    }
    
    /**
     * Gets array of all "Output" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] getOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType getOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().find_element_user(OUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Output" element
     */
    public int sizeOfOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUT$2);
        }
    }
    
    /**
     * Sets array of all "Output" element
     */
    public void setOutputArray(org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] outputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputArray, OUTPUT$2);
        }
    }
    
    /**
     * Sets ith "Output" element
     */
    public void setOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType output)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().find_element_user(OUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(output);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType insertNewOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().insert_element_user(OUTPUT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType addNewOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType)get_store().add_element_user(OUTPUT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Output" element
     */
    public void removeOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUT$2, i);
        }
    }
    
    /**
     * Gets the "Computation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType getComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType)get_store().find_element_user(COMPUTATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Computation" element
     */
    public boolean isSetComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPUTATION$4) != 0;
        }
    }
    
    /**
     * Sets the "Computation" element
     */
    public void setComputation(org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType computation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType)get_store().find_element_user(COMPUTATION$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType)get_store().add_element_user(COMPUTATION$4);
            }
            target.set(computation);
        }
    }
    
    /**
     * Appends and returns a new empty "Computation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType addNewComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType)get_store().add_element_user(COMPUTATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Computation" element
     */
    public void unsetComputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPUTATION$4, 0);
        }
    }
    
    /**
     * Gets array of all "Transition" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType[] getTransitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSITION$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType getTransitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType)get_store().find_element_user(TRANSITION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Transition" element
     */
    public int sizeOfTransitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSITION$6);
        }
    }
    
    /**
     * Sets array of all "Transition" element
     */
    public void setTransitionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType[] transitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(transitionArray, TRANSITION$6);
        }
    }
    
    /**
     * Sets ith "Transition" element
     */
    public void setTransitionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType transition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType)get_store().find_element_user(TRANSITION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(transition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType insertNewTransition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType)get_store().insert_element_user(TRANSITION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType addNewTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType)get_store().add_element_user(TRANSITION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Transition" element
     */
    public void removeTransition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSITION$6, i);
        }
    }
    
    /**
     * Gets array of all "ProcessStep" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[] getProcessStepArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSSTEP$8, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().find_element_user(PROCESSSTEP$8, i);
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
            return get_store().count_elements(PROCESSSTEP$8);
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
            arraySetterHelper(processStepArray, PROCESSSTEP$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().find_element_user(PROCESSSTEP$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().insert_element_user(PROCESSSTEP$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType)get_store().add_element_user(PROCESSSTEP$8);
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
            get_store().remove_element(PROCESSSTEP$8, i);
        }
    }
}
