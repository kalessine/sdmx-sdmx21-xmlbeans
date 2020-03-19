/*
 * XML Type:  StructureUsageWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureUsageWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureUsageWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureUsageWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.MaintainableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureUsageWhereType
{
    private static final long serialVersionUID = 1L;
    
    public StructureUsageWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Structure");
    
    
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
