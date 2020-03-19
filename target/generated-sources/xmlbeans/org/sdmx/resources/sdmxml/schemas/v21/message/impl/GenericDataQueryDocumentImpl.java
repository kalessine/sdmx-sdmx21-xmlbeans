/*
 * An XML document type.
 * Localname: GenericDataQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one GenericDataQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class GenericDataQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public GenericDataQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERICDATAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "GenericDataQuery");
    
    
    /**
     * Gets the "GenericDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType getGenericDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType)get_store().find_element_user(GENERICDATAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GenericDataQuery" element
     */
    public void setGenericDataQuery(org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType genericDataQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType)get_store().find_element_user(GENERICDATAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType)get_store().add_element_user(GENERICDATAQUERY$0);
            }
            target.set(genericDataQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "GenericDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType addNewGenericDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataQueryType)get_store().add_element_user(GENERICDATAQUERY$0);
            return target;
        }
    }
}
