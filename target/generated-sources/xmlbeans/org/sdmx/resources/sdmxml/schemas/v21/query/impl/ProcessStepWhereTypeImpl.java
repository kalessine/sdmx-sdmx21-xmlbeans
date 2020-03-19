/*
 * XML Type:  ProcessStepWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ProcessStepWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ProcessStepWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.IdentifiableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessStepWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTOROUTPUTOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "InputOrOutputObject");
    private static final javax.xml.namespace.QName PROCESSSTEPWHERE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProcessStepWhere");
    
    
    /**
     * Gets array of all "InputOrOutputObject" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType[] getInputOrOutputObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTOROUTPUTOBJECT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InputOrOutputObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType getInputOrOutputObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType)get_store().find_element_user(INPUTOROUTPUTOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InputOrOutputObject" element
     */
    public int sizeOfInputOrOutputObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTOROUTPUTOBJECT$0);
        }
    }
    
    /**
     * Sets array of all "InputOrOutputObject" element
     */
    public void setInputOrOutputObjectArray(org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType[] inputOrOutputObjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputOrOutputObjectArray, INPUTOROUTPUTOBJECT$0);
        }
    }
    
    /**
     * Sets ith "InputOrOutputObject" element
     */
    public void setInputOrOutputObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType inputOrOutputObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType)get_store().find_element_user(INPUTOROUTPUTOBJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inputOrOutputObject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InputOrOutputObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType insertNewInputOrOutputObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType)get_store().insert_element_user(INPUTOROUTPUTOBJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InputOrOutputObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType addNewInputOrOutputObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.InputOrOutputObjectType)get_store().add_element_user(INPUTOROUTPUTOBJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "InputOrOutputObject" element
     */
    public void removeInputOrOutputObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTOROUTPUTOBJECT$0, i);
        }
    }
    
    /**
     * Gets array of all "ProcessStepWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType[] getProcessStepWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSSTEPWHERE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProcessStepWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType getProcessStepWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().find_element_user(PROCESSSTEPWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProcessStepWhere" element
     */
    public int sizeOfProcessStepWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSSTEPWHERE$2);
        }
    }
    
    /**
     * Sets array of all "ProcessStepWhere" element
     */
    public void setProcessStepWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType[] processStepWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(processStepWhereArray, PROCESSSTEPWHERE$2);
        }
    }
    
    /**
     * Sets ith "ProcessStepWhere" element
     */
    public void setProcessStepWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType processStepWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().find_element_user(PROCESSSTEPWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(processStepWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStepWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType insertNewProcessStepWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().insert_element_user(PROCESSSTEPWHERE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStepWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType addNewProcessStepWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().add_element_user(PROCESSSTEPWHERE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProcessStepWhere" element
     */
    public void removeProcessStepWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSSTEPWHERE$2, i);
        }
    }
}
