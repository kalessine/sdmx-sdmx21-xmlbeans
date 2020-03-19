/*
 * An XML document type.
 * Localname: Structure
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one Structure(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Structure");
    
    
    /**
     * Gets the "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureType getStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureType)get_store().find_element_user(STRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Structure" element
     */
    public void setStructure(org.sdmx.resources.sdmxml.schemas.v21.message.StructureType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureType)get_store().find_element_user(STRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureType)get_store().add_element_user(STRUCTURE$0);
            }
            target.set(structure);
        }
    }
    
    /**
     * Appends and returns a new empty "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureType)get_store().add_element_user(STRUCTURE$0);
            return target;
        }
    }
}
