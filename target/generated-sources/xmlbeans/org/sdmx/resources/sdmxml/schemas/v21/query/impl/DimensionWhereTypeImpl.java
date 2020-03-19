/*
 * XML Type:  DimensionWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DimensionWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DimensionWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.DataStructureComponentWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType
{
    private static final long serialVersionUID = 1L;
    
    public DimensionWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Role");
    
    
    /**
     * Gets array of all "Role" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] getRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROLE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Role" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType getRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(ROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Role" element
     */
    public int sizeOfRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLE$0);
        }
    }
    
    /**
     * Sets array of all "Role" element
     */
    public void setRoleArray(org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] roleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleArray, ROLE$0);
        }
    }
    
    /**
     * Sets ith "Role" element
     */
    public void setRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType role)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(ROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(role);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Role" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType insertNewRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().insert_element_user(ROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Role" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType addNewRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().add_element_user(ROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Role" element
     */
    public void removeRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLE$0, i);
        }
    }
}
