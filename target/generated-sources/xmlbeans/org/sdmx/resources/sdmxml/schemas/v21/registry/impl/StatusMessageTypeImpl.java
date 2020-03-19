/*
 * XML Type:  StatusMessageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML StatusMessageType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class StatusMessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType
{
    private static final long serialVersionUID = 1L;
    
    public StatusMessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETEXT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MessageText");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets array of all "MessageText" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType[] getMessageTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGETEXT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MessageText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType getMessageTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType)get_store().find_element_user(MESSAGETEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MessageText" element
     */
    public int sizeOfMessageTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGETEXT$0);
        }
    }
    
    /**
     * Sets array of all "MessageText" element
     */
    public void setMessageTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType[] messageTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageTextArray, MESSAGETEXT$0);
        }
    }
    
    /**
     * Sets ith "MessageText" element
     */
    public void setMessageTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType messageText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType)get_store().find_element_user(MESSAGETEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MessageText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType insertNewMessageText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType)get_store().insert_element_user(MESSAGETEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MessageText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType addNewMessageText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StatusMessageType)get_store().add_element_user(MESSAGETEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MessageText" element
     */
    public void removeMessageText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGETEXT$0, i);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType)get_store().find_attribute_user(STATUS$2);
            return target;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusType)get_store().add_attribute_user(STATUS$2);
            }
            target.set(status);
        }
    }
}
