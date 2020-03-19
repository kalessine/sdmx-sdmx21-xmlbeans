/*
 * XML Type:  MetadataTargetWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataTargetWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataTargetWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentListWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataTargetWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETOBJECTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectWhere");
    
    
    /**
     * Gets array of all "TargetObjectWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[] getTargetObjectWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGETOBJECTWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType getTargetObjectWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().find_element_user(TARGETOBJECTWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TargetObjectWhere" element
     */
    public int sizeOfTargetObjectWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETOBJECTWHERE$0);
        }
    }
    
    /**
     * Sets array of all "TargetObjectWhere" element
     */
    public void setTargetObjectWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[] targetObjectWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetObjectWhereArray, TARGETOBJECTWHERE$0);
        }
    }
    
    /**
     * Sets ith "TargetObjectWhere" element
     */
    public void setTargetObjectWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType targetObjectWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().find_element_user(TARGETOBJECTWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetObjectWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType insertNewTargetObjectWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().insert_element_user(TARGETOBJECTWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType addNewTargetObjectWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().add_element_user(TARGETOBJECTWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TargetObjectWhere" element
     */
    public void removeTargetObjectWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETOBJECTWHERE$0, i);
        }
    }
}
