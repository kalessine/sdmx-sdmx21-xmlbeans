/*
 * XML Type:  GroupWhereBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML GroupWhereBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class GroupWhereBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentListWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereBaseType
{
    private static final long serialVersionUID = 1L;
    
    public GroupWhereBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPDIMENSIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupDimensionWhere");
    
    
    /**
     * Gets array of all "GroupDimensionWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] getGroupDimensionWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUPDIMENSIONWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GroupDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType getGroupDimensionWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(GROUPDIMENSIONWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GroupDimensionWhere" element
     */
    public int sizeOfGroupDimensionWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPDIMENSIONWHERE$0);
        }
    }
    
    /**
     * Sets array of all "GroupDimensionWhere" element
     */
    public void setGroupDimensionWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] groupDimensionWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupDimensionWhereArray, GROUPDIMENSIONWHERE$0);
        }
    }
    
    /**
     * Sets ith "GroupDimensionWhere" element
     */
    public void setGroupDimensionWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType groupDimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(GROUPDIMENSIONWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groupDimensionWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroupDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType insertNewGroupDimensionWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().insert_element_user(GROUPDIMENSIONWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GroupDimensionWhere" element
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
    
    /**
     * Removes the ith "GroupDimensionWhere" element
     */
    public void removeGroupDimensionWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPDIMENSIONWHERE$0, i);
        }
    }
}
