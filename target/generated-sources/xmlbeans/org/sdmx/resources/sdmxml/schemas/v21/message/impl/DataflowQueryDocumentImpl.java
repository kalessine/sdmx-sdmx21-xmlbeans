/*
 * An XML document type.
 * Localname: DataflowQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one DataflowQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class DataflowQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataflowQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFLOWQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataflowQuery");
    
    
    /**
     * Gets the "DataflowQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType getDataflowQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType)get_store().find_element_user(DATAFLOWQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataflowQuery" element
     */
    public void setDataflowQuery(org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType dataflowQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType)get_store().find_element_user(DATAFLOWQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType)get_store().add_element_user(DATAFLOWQUERY$0);
            }
            target.set(dataflowQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "DataflowQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType addNewDataflowQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataflowQueryType)get_store().add_element_user(DATAFLOWQUERY$0);
            return target;
        }
    }
}
