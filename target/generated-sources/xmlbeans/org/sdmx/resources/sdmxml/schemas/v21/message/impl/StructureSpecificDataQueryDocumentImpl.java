/*
 * An XML document type.
 * Localname: StructureSpecificDataQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSpecificDataQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificDataQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificDataQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESPECIFICDATAQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSpecificDataQuery");
    
    
    /**
     * Gets the "StructureSpecificDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType getStructureSpecificDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType)get_store().find_element_user(STRUCTURESPECIFICDATAQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSpecificDataQuery" element
     */
    public void setStructureSpecificDataQuery(org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType structureSpecificDataQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType)get_store().find_element_user(STRUCTURESPECIFICDATAQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType)get_store().add_element_user(STRUCTURESPECIFICDATAQUERY$0);
            }
            target.set(structureSpecificDataQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSpecificDataQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType addNewStructureSpecificDataQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.DataQueryType)get_store().add_element_user(STRUCTURESPECIFICDATAQUERY$0);
            return target;
        }
    }
}
