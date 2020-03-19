/*
 * XML Type:  DataStructureWhereBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataStructureWhereBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataStructureWhereBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructureWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereBaseType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureWhereBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupWhere");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "GroupWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType[] getGroupWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUPWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GroupWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType getGroupWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().find_element_user(GROUPWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GroupWhere" element
     */
    public int sizeOfGroupWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPWHERE$0);
        }
    }
    
    /**
     * Sets array of all "GroupWhere" element
     */
    public void setGroupWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType[] groupWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupWhereArray, GROUPWHERE$0);
        }
    }
    
    /**
     * Sets ith "GroupWhere" element
     */
    public void setGroupWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType groupWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().find_element_user(GROUPWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groupWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroupWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType insertNewGroupWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType)get_store().insert_element_user(GROUPWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GroupWhere" element
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
    
    /**
     * Removes the ith "GroupWhere" element
     */
    public void removeGroupWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPWHERE$0, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_default_attribute_value(TYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
}
