/*
 * XML Type:  StructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.StructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML StructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class StructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.StructureType
{
    private static final long serialVersionUID = 1L;
    
    public StructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPING$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Grouping");
    private static final org.apache.xmlbeans.QNameSet GROUPING$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Grouping"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataStructureComponents"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataStructureComponents"),
    });
    
    
    /**
     * Gets the "Grouping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType getGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType)get_store().find_element_user(GROUPING$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Grouping" element
     */
    public boolean isSetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPING$1) != 0;
        }
    }
    
    /**
     * Sets the "Grouping" element
     */
    public void setGrouping(org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType grouping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType)get_store().find_element_user(GROUPING$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType)get_store().add_element_user(GROUPING$0);
            }
            target.set(grouping);
        }
    }
    
    /**
     * Appends and returns a new empty "Grouping" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType addNewGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType)get_store().add_element_user(GROUPING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Grouping" element
     */
    public void unsetGrouping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPING$1, 0);
        }
    }
}
