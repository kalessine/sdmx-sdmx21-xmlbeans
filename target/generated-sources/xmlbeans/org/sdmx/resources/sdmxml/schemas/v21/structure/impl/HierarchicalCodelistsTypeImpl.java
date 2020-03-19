/*
 * XML Type:  HierarchicalCodelistsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML HierarchicalCodelistsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class HierarchicalCodelistsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHICALCODELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "HierarchicalCodelist");
    
    
    /**
     * Gets array of all "HierarchicalCodelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType[] getHierarchicalCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODELIST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType getHierarchicalCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType)get_store().find_element_user(HIERARCHICALCODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCodelist" element
     */
    public int sizeOfHierarchicalCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELIST$0);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCodelist" element
     */
    public void setHierarchicalCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType[] hierarchicalCodelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodelistArray, HIERARCHICALCODELIST$0);
        }
    }
    
    /**
     * Sets ith "HierarchicalCodelist" element
     */
    public void setHierarchicalCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType hierarchicalCodelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType)get_store().find_element_user(HIERARCHICALCODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCodelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType insertNewHierarchicalCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType)get_store().insert_element_user(HIERARCHICALCODELIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType addNewHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType)get_store().add_element_user(HIERARCHICALCODELIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCodelist" element
     */
    public void removeHierarchicalCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELIST$0, i);
        }
    }
}
