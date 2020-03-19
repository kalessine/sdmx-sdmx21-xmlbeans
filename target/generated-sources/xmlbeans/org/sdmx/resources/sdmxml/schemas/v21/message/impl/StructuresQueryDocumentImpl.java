/*
 * An XML document type.
 * Localname: StructuresQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructuresQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructuresQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructuresQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructuresQuery");
    
    
    /**
     * Gets the "StructuresQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType getStructuresQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType)get_store().find_element_user(STRUCTURESQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuresQuery" element
     */
    public void setStructuresQuery(org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType structuresQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType)get_store().find_element_user(STRUCTURESQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType)get_store().add_element_user(STRUCTURESQUERY$0);
            }
            target.set(structuresQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuresQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType addNewStructuresQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructuresQueryType)get_store().add_element_user(STRUCTURESQUERY$0);
            return target;
        }
    }
}
