/*
 * An XML document type.
 * Localname: Group
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Group(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Group");
    
    
    /**
     * Gets the "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
