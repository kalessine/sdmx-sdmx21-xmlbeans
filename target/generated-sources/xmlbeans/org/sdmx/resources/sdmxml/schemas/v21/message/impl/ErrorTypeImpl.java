/*
 * XML Type:  ErrorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML ErrorType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class ErrorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ErrorType
{
    private static final long serialVersionUID = 1L;
    
    public ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ErrorMessage");
    
    
    /**
     * Gets array of all "ErrorMessage" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType[] getErrorMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRORMESSAGE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ErrorMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType getErrorMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType)get_store().find_element_user(ERRORMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ErrorMessage" element
     */
    public int sizeOfErrorMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORMESSAGE$0);
        }
    }
    
    /**
     * Sets array of all "ErrorMessage" element
     */
    public void setErrorMessageArray(org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType[] errorMessageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorMessageArray, ERRORMESSAGE$0);
        }
    }
    
    /**
     * Sets ith "ErrorMessage" element
     */
    public void setErrorMessageArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType errorMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType)get_store().find_element_user(ERRORMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errorMessage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ErrorMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType insertNewErrorMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType)get_store().insert_element_user(ERRORMESSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ErrorMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType addNewErrorMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodedStatusMessageType)get_store().add_element_user(ERRORMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ErrorMessage" element
     */
    public void removeErrorMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORMESSAGE$0, i);
        }
    }
}
