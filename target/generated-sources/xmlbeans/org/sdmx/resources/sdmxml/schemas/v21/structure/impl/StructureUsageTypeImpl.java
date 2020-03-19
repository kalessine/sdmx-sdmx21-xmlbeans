/*
 * XML Type:  StructureUsageType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.StructureUsageType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML StructureUsageType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class StructureUsageTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.StructureUsageType
{
    private static final long serialVersionUID = 1L;
    
    public StructureUsageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Structure");
    
    
    /**
     * Gets the "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType getStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().find_element_user(STRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Structure" element
     */
    public boolean isSetStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURE$0) != 0;
        }
    }
    
    /**
     * Sets the "Structure" element
     */
    public void setStructure(org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType structure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().find_element_user(STRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().add_element_user(STRUCTURE$0);
            }
            target.set(structure);
        }
    }
    
    /**
     * Appends and returns a new empty "Structure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType addNewStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType)get_store().add_element_user(STRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Structure" element
     */
    public void unsetStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURE$0, 0);
        }
    }
}
