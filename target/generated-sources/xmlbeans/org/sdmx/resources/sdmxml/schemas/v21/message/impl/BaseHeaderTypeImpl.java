/*
 * XML Type:  BaseHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML BaseHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class BaseHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public BaseHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ID");
    private static final javax.xml.namespace.QName TEST$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Test");
    private static final javax.xml.namespace.QName PREPARED$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Prepared");
    private static final javax.xml.namespace.QName SENDER$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Sender");
    private static final javax.xml.namespace.QName RECEIVER$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Receiver");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Name");
    private static final javax.xml.namespace.QName STRUCTURE$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Structure");
    private static final javax.xml.namespace.QName DATAPROVIDER$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataProvider");
    private static final javax.xml.namespace.QName DATASETACTION$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataSetAction");
    private static final javax.xml.namespace.QName DATASETID$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataSetID");
    private static final javax.xml.namespace.QName EXTRACTED$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Extracted");
    private static final javax.xml.namespace.QName REPORTINGBEGIN$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ReportingBegin");
    private static final javax.xml.namespace.QName REPORTINGEND$24 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ReportingEnd");
    private static final javax.xml.namespace.QName EMBARGODATE$26 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "EmbargoDate");
    private static final javax.xml.namespace.QName SOURCE$28 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Source");
    
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "Test" element
     */
    public boolean getTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEST$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Test" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Test" element
     */
    public void setTest(boolean test)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEST$2);
            }
            target.setBooleanValue(test);
        }
    }
    
    /**
     * Sets (as xml) the "Test" element
     */
    public void xsetTest(org.apache.xmlbeans.XmlBoolean test)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TEST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TEST$2);
            }
            target.set(test);
        }
    }
    
    /**
     * Gets the "Prepared" element
     */
    public java.util.Calendar getPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPARED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Prepared" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType xgetPrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType)get_store().find_element_user(PREPARED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Prepared" element
     */
    public void setPrepared(java.util.Calendar prepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPARED$4);
            }
            target.setCalendarValue(prepared);
        }
    }
    
    /**
     * Sets (as xml) the "Prepared" element
     */
    public void xsetPrepared(org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType prepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType)get_store().find_element_user(PREPARED$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType)get_store().add_element_user(PREPARED$4);
            }
            target.set(prepared);
        }
    }
    
    /**
     * Gets the "Sender" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SenderType getSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SenderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SenderType)get_store().find_element_user(SENDER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sender" element
     */
    public void setSender(org.sdmx.resources.sdmxml.schemas.v21.message.SenderType sender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SenderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SenderType)get_store().find_element_user(SENDER$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SenderType)get_store().add_element_user(SENDER$6);
            }
            target.set(sender);
        }
    }
    
    /**
     * Appends and returns a new empty "Sender" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SenderType addNewSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SenderType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SenderType)get_store().add_element_user(SENDER$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "Receiver" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[] getReceiverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECEIVER$8, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().find_element_user(RECEIVER$8, i);
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
            return get_store().count_elements(RECEIVER$8);
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
            arraySetterHelper(receiverArray, RECEIVER$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().find_element_user(RECEIVER$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().insert_element_user(RECEIVER$8, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.PartyType)get_store().add_element_user(RECEIVER$8);
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
            get_store().remove_element(RECEIVER$8, i);
        }
    }
    
    /**
     * Gets array of all "Name" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$10);
        }
    }
    
    /**
     * Sets array of all "Name" element
     */
    public void setNameArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$10);
        }
    }
    
    /**
     * Sets ith "Name" element
     */
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(NAME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(NAME$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$10, i);
        }
    }
    
    /**
     * Gets array of all "Structure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] getStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURE$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType getStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().find_element_user(STRUCTURE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Structure" element
     */
    public int sizeOfStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$12);
        }
    }
    
    /**
     * Sets array of all "Structure" element
     */
    public void setStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] structureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureArray, STRUCTURE$12);
        }
    }
    
    /**
     * Sets ith "Structure" element
     */
    public void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().find_element_user(STRUCTURE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType insertNewStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().insert_element_user(STRUCTURE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType)get_store().add_element_user(STRUCTURE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Structure" element
     */
    public void removeStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$12, i);
        }
    }
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProvider" element
     */
    public boolean isSetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$14) != 0;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$14);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "DataProvider" element
     */
    public void unsetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$14, 0);
        }
    }
    
    /**
     * Gets the "DataSetAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETACTION$16, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataSetAction" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_element_user(DATASETACTION$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataSetAction" element
     */
    public boolean isSetDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETACTION$16) != 0;
        }
    }
    
    /**
     * Sets the "DataSetAction" element
     */
    public void setDataSetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum dataSetAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETACTION$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASETACTION$16);
            }
            target.setEnumValue(dataSetAction);
        }
    }
    
    /**
     * Sets (as xml) the "DataSetAction" element
     */
    public void xsetDataSetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType dataSetAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_element_user(DATASETACTION$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_element_user(DATASETACTION$16);
            }
            target.set(dataSetAction);
        }
    }
    
    /**
     * Unsets the "DataSetAction" element
     */
    public void unsetDataSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETACTION$16, 0);
        }
    }
    
    /**
     * Gets array of all "DataSetID" elements
     */
    public java.lang.String[] getDataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASETID$18, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DataSetID" element
     */
    public java.lang.String getDataSetIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DataSetID" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] xgetDataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASETID$18, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.IDType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetDataSetIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(DATASETID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)target;
        }
    }
    
    /**
     * Returns number of "DataSetID" element
     */
    public int sizeOfDataSetIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETID$18);
        }
    }
    
    /**
     * Sets array of all "DataSetID" element
     */
    public void setDataSetIDArray(java.lang.String[] dataSetIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetIDArray, DATASETID$18);
        }
    }
    
    /**
     * Sets ith "DataSetID" element
     */
    public void setDataSetIDArray(int i, java.lang.String dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASETID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataSetID);
        }
    }
    
    /**
     * Sets (as xml) array of all "DataSetID" element
     */
    public void xsetDataSetIDArray(org.sdmx.resources.sdmxml.schemas.v21.common.IDType[]dataSetIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetIDArray, DATASETID$18);
        }
    }
    
    /**
     * Sets (as xml) ith "DataSetID" element
     */
    public void xsetDataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.IDType dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(DATASETID$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSetID);
        }
    }
    
    /**
     * Inserts the value as the ith "DataSetID" element
     */
    public void insertDataSetID(int i, java.lang.String dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATASETID$18, i);
            target.setStringValue(dataSetID);
        }
    }
    
    /**
     * Appends the value as the last "DataSetID" element
     */
    public void addDataSetID(java.lang.String dataSetID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASETID$18);
            target.setStringValue(dataSetID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType insertNewDataSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().insert_element_user(DATASETID$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType addNewDataSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(DATASETID$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSetID" element
     */
    public void removeDataSetID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETID$18, i);
        }
    }
    
    /**
     * Gets the "Extracted" element
     */
    public java.util.Calendar getExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACTED$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Extracted" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXTRACTED$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Extracted" element
     */
    public boolean isSetExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTRACTED$20) != 0;
        }
    }
    
    /**
     * Sets the "Extracted" element
     */
    public void setExtracted(java.util.Calendar extracted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTRACTED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTRACTED$20);
            }
            target.setCalendarValue(extracted);
        }
    }
    
    /**
     * Sets (as xml) the "Extracted" element
     */
    public void xsetExtracted(org.apache.xmlbeans.XmlDateTime extracted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXTRACTED$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXTRACTED$20);
            }
            target.set(extracted);
        }
    }
    
    /**
     * Unsets the "Extracted" element
     */
    public void unsetExtracted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTRACTED$20, 0);
        }
    }
    
    /**
     * Gets the "ReportingBegin" element
     */
    public java.lang.Object getReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGBEGIN$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingBegin" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_element_user(REPORTINGBEGIN$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingBegin" element
     */
    public boolean isSetReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGBEGIN$22) != 0;
        }
    }
    
    /**
     * Sets the "ReportingBegin" element
     */
    public void setReportingBegin(java.lang.Object reportingBegin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGBEGIN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGBEGIN$22);
            }
            target.setObjectValue(reportingBegin);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingBegin" element
     */
    public void xsetReportingBegin(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType reportingBegin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_element_user(REPORTINGBEGIN$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_element_user(REPORTINGBEGIN$22);
            }
            target.set(reportingBegin);
        }
    }
    
    /**
     * Unsets the "ReportingBegin" element
     */
    public void unsetReportingBegin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGBEGIN$22, 0);
        }
    }
    
    /**
     * Gets the "ReportingEnd" element
     */
    public java.lang.Object getReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGEND$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingEnd" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_element_user(REPORTINGEND$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingEnd" element
     */
    public boolean isSetReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGEND$24) != 0;
        }
    }
    
    /**
     * Sets the "ReportingEnd" element
     */
    public void setReportingEnd(java.lang.Object reportingEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGEND$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGEND$24);
            }
            target.setObjectValue(reportingEnd);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingEnd" element
     */
    public void xsetReportingEnd(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType reportingEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_element_user(REPORTINGEND$24, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_element_user(REPORTINGEND$24);
            }
            target.set(reportingEnd);
        }
    }
    
    /**
     * Unsets the "ReportingEnd" element
     */
    public void unsetReportingEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGEND$24, 0);
        }
    }
    
    /**
     * Gets the "EmbargoDate" element
     */
    public java.util.Calendar getEmbargoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMBARGODATE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmbargoDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEmbargoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EMBARGODATE$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmbargoDate" element
     */
    public boolean isSetEmbargoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBARGODATE$26) != 0;
        }
    }
    
    /**
     * Sets the "EmbargoDate" element
     */
    public void setEmbargoDate(java.util.Calendar embargoDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMBARGODATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMBARGODATE$26);
            }
            target.setCalendarValue(embargoDate);
        }
    }
    
    /**
     * Sets (as xml) the "EmbargoDate" element
     */
    public void xsetEmbargoDate(org.apache.xmlbeans.XmlDateTime embargoDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EMBARGODATE$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EMBARGODATE$26);
            }
            target.set(embargoDate);
        }
    }
    
    /**
     * Unsets the "EmbargoDate" element
     */
    public void unsetEmbargoDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBARGODATE$26, 0);
        }
    }
    
    /**
     * Gets array of all "Source" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$28, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(SOURCE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$28);
        }
    }
    
    /**
     * Sets array of all "Source" element
     */
    public void setSourceArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$28);
        }
    }
    
    /**
     * Sets ith "Source" element
     */
    public void setSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(SOURCE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(SOURCE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(SOURCE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "Source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$28, i);
        }
    }
}
