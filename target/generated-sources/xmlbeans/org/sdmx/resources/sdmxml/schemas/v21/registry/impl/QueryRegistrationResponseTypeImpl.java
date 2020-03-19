/*
 * XML Type:  QueryRegistrationResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML QueryRegistrationResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class QueryRegistrationResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType
{
    private static final long serialVersionUID = 1L;
    
    public QueryRegistrationResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSMESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StatusMessage");
    private static final javax.xml.namespace.QName QUERYRESULT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "QueryResult");
    
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$0);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType addNewStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "QueryResult" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType[] getQueryResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUERYRESULT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QueryResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType getQueryResultArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType)get_store().find_element_user(QUERYRESULT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QueryResult" element
     */
    public int sizeOfQueryResultArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYRESULT$2);
        }
    }
    
    /**
     * Sets array of all "QueryResult" element
     */
    public void setQueryResultArray(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType[] queryResultArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(queryResultArray, QUERYRESULT$2);
        }
    }
    
    /**
     * Sets ith "QueryResult" element
     */
    public void setQueryResultArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType queryResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType)get_store().find_element_user(QUERYRESULT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(queryResult);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType insertNewQueryResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType)get_store().insert_element_user(QUERYRESULT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType addNewQueryResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType)get_store().add_element_user(QUERYRESULT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "QueryResult" element
     */
    public void removeQueryResult(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYRESULT$2, i);
        }
    }
}
