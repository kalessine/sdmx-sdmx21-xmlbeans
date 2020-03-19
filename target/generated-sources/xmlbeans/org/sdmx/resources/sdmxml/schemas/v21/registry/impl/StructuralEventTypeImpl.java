/*
 * XML Type:  StructuralEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML StructuralEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class StructuralEventTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType
{
    private static final long serialVersionUID = 1L;
    
    public StructuralEventTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURES$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Structures");
    
    
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
}
