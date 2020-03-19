/*
 * An XML document type.
 * Localname: GroupWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one GroupWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class GroupWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentListWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupWhere");
    
    
    /**
     * Gets the "GroupWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType getGroupWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().find_element_user(GROUPWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GroupWhere" element
     */
    public void setGroupWhere(org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType groupWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().find_element_user(GROUPWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().add_element_user(GROUPWHERE$0);
            }
            target.set(groupWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType addNewGroupWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().add_element_user(GROUPWHERE$0);
            return target;
        }
    }
}
