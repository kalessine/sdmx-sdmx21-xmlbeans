/*
 * An XML document type.
 * Localname: StructureSetQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSetQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSetQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESETQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSetQuery");
    
    
    /**
     * Gets the "StructureSetQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType getStructureSetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType)get_store().find_element_user(STRUCTURESETQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSetQuery" element
     */
    public void setStructureSetQuery(org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType structureSetQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType)get_store().find_element_user(STRUCTURESETQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType)get_store().add_element_user(STRUCTURESETQUERY$0);
            }
            target.set(structureSetQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSetQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType addNewStructureSetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSetQueryType)get_store().add_element_user(STRUCTURESETQUERY$0);
            return target;
        }
    }
}
