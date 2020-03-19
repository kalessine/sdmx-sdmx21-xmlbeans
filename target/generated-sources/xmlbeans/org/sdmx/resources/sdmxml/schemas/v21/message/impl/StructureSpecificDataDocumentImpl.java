/*
 * An XML document type.
 * Localname: StructureSpecificData
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one StructureSpecificData(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class StructureSpecificDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSpecificDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESPECIFICDATA$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "StructureSpecificData");
    
    
    /**
     * Gets the "StructureSpecificData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType getStructureSpecificData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType)get_store().find_element_user(STRUCTURESPECIFICDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSpecificData" element
     */
    public void setStructureSpecificData(org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType structureSpecificData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType)get_store().find_element_user(STRUCTURESPECIFICDATA$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType)get_store().add_element_user(STRUCTURESPECIFICDATA$0);
            }
            target.set(structureSpecificData);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSpecificData" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType addNewStructureSpecificData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.StructureSpecificDataType)get_store().add_element_user(STRUCTURESPECIFICDATA$0);
            return target;
        }
    }
}
