/*
 * An XML document type.
 * Localname: Grouping
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Grouping(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class GroupingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}
