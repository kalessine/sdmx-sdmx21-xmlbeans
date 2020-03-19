/*
 * XML Type:  ProcessWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ProcessWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ProcessWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ProcessWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSSTEPWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProcessStepWhere");
    
    
    /**
     * Gets array of all "ProcessStepWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType[] getProcessStepWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROCESSSTEPWHERE$0, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().find_element_user(PROCESSSTEPWHERE$0, i);
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
            return get_store().count_elements(PROCESSSTEPWHERE$0);
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
            arraySetterHelper(processStepWhereArray, PROCESSSTEPWHERE$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().find_element_user(PROCESSSTEPWHERE$0, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().insert_element_user(PROCESSSTEPWHERE$0, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessStepWhereType)get_store().add_element_user(PROCESSSTEPWHERE$0);
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
            get_store().remove_element(PROCESSSTEPWHERE$0, i);
        }
    }
}
