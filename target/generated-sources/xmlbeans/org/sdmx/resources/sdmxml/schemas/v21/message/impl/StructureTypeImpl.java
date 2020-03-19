/*
 * XML Type:  StructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.StructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML StructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class StructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.StructureType
{
    private static final long serialVersionUID = 1L;
    
    public StructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURES$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "Structures");
    
    
    /**
     * Gets the "Structures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType getStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().find_element_user(STRUCTURES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Structures" element
     */
    public boolean isSetStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURES$0) != 0;
        }
    }
    
    /**
     * Sets the "Structures" element
     */
    public void setStructures(org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType structures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().find_element_user(STRUCTURES$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().add_element_user(STRUCTURES$0);
            }
            target.set(structures);
        }
    }
    
    /**
     * Appends and returns a new empty "Structures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType addNewStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().add_element_user(STRUCTURES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Structures" element
     */
    public void unsetStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURES$0, 0);
        }
    }
}
