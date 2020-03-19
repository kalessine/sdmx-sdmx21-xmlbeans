/*
 * An XML document type.
 * Localname: GroupDimensionWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.GroupDimensionWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one GroupDimensionWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class GroupDimensionWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.GroupDimensionWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDimensionWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPDIMENSIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupDimensionWhere");
    
    
    /**
     * Gets the "GroupDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType getGroupDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(GROUPDIMENSIONWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GroupDimensionWhere" element
     */
    public void setGroupDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType groupDimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(GROUPDIMENSIONWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().add_element_user(GROUPDIMENSIONWHERE$0);
            }
            target.set(groupDimensionWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType addNewGroupDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().add_element_user(GROUPDIMENSIONWHERE$0);
            return target;
        }
    }
}
