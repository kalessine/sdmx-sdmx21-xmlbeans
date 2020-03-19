/*
 * XML Type:  BasicHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.BasicHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML BasicHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class BasicHeaderTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.BaseHeaderTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.BasicHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public BasicHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEIVER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Receiver");
    
    
    /**
     * Gets array of all "Receiver" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[] getReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECEIVER$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Receiver" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.PartyType getReceiverArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().find_element_user(RECEIVER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Receiver" element
     */
    public int sizeOfReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVER$0);
        }
    }
    
    /**
     * Sets array of all "Receiver" element
     */
    public void setReceiverArray(org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[] receiverArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(receiverArray, RECEIVER$0);
        }
    }
    
    /**
     * Sets ith "Receiver" element
     */
    public void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v21.message.PartyType receiver)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().find_element_user(RECEIVER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(receiver);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.PartyType insertNewReceiver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().insert_element_user(RECEIVER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.PartyType addNewReceiver()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.PartyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().add_element_user(RECEIVER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Receiver" element
     */
    public void removeReceiver(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVER$0, i);
        }
    }
}
