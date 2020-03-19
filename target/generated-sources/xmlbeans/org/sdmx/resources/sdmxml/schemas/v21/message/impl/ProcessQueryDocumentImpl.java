/*
 * An XML document type.
 * Localname: ProcessQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one ProcessQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class ProcessQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProcessQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ProcessQuery");
    
    
    /**
     * Gets the "ProcessQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType getProcessQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType)get_store().find_element_user(PROCESSQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProcessQuery" element
     */
    public void setProcessQuery(org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType processQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType)get_store().find_element_user(PROCESSQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType)get_store().add_element_user(PROCESSQUERY$0);
            }
            target.set(processQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "ProcessQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType addNewProcessQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ProcessQueryType)get_store().add_element_user(PROCESSQUERY$0);
            return target;
        }
    }
}
