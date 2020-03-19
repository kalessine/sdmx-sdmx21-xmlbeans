/*
 * XML Type:  FooterType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.footer.impl;
/**
 * An XML FooterType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer).
 *
 * This is a complex type.
 */
public class FooterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterType
{
    private static final long serialVersionUID = 1L;
    
    public FooterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message/footer", "Message");
    
    
    /**
     * Gets array of all "Message" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType[] getMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MESSAGE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType[] result = new org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Message" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType getMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType)get_store().find_element_user(MESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Message" element
     */
    public int sizeOfMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$0);
        }
    }
    
    /**
     * Sets array of all "Message" element
     */
    public void setMessageArray(org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType[] messageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageArray, MESSAGE$0);
        }
    }
    
    /**
     * Sets ith "Message" element
     */
    public void setMessageArray(int i, org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType)get_store().find_element_user(MESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(message);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Message" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType insertNewMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType)get_store().insert_element_user(MESSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Message" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.footer.FooterMessageType)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Message" element
     */
    public void removeMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$0, i);
        }
    }
}
