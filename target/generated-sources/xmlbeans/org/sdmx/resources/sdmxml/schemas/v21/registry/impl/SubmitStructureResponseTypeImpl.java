/*
 * XML Type:  SubmitStructureResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmitStructureResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmitStructureResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMISSIONRESULT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubmissionResult");
    
    
    /**
     * Gets array of all "SubmissionResult" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType[] getSubmissionResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBMISSIONRESULT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubmissionResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType getSubmissionResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType)get_store().find_element_user(SUBMISSIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubmissionResult" element
     */
    public int sizeOfSubmissionResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMISSIONRESULT$0);
        }
    }
    
    /**
     * Sets array of all "SubmissionResult" element
     */
    public void setSubmissionResultArray(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType[] submissionResultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(submissionResultArray, SUBMISSIONRESULT$0);
        }
    }
    
    /**
     * Sets ith "SubmissionResult" element
     */
    public void setSubmissionResultArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType submissionResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType)get_store().find_element_user(SUBMISSIONRESULT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(submissionResult);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmissionResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType insertNewSubmissionResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType)get_store().insert_element_user(SUBMISSIONRESULT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubmissionResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType addNewSubmissionResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType)get_store().add_element_user(SUBMISSIONRESULT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubmissionResult" element
     */
    public void removeSubmissionResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMISSIONRESULT$0, i);
        }
    }
}
