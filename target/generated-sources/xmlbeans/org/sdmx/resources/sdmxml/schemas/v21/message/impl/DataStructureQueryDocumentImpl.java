/*
 * An XML document type.
 * Localname: DataStructureQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one DataStructureQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class DataStructureQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTRUCTUREQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "DataStructureQuery");
    
    
    /**
     * Gets the "DataStructureQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType getDataStructureQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType)get_store().find_element_user(DATASTRUCTUREQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataStructureQuery" element
     */
    public void setDataStructureQuery(org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType dataStructureQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType)get_store().find_element_user(DATASTRUCTUREQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType)get_store().add_element_user(DATASTRUCTUREQUERY$0);
            }
            target.set(dataStructureQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "DataStructureQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType addNewDataStructureQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataStructureQueryType)get_store().add_element_user(DATASTRUCTUREQUERY$0);
            return target;
        }
    }
}
