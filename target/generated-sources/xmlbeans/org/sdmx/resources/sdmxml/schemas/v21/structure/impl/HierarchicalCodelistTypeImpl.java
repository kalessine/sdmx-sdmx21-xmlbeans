/*
 * XML Type:  HierarchicalCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML HierarchicalCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class HierarchicalCodelistTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.HierarchicalCodelistBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDEDCODELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "IncludedCodelist");
    private static final javax.xml.namespace.QName HIERARCHY$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Hierarchy");
    
    
    /**
     * Gets array of all "IncludedCodelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType[] getIncludedCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCLUDEDCODELIST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncludedCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType getIncludedCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType)get_store().find_element_user(INCLUDEDCODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IncludedCodelist" element
     */
    public int sizeOfIncludedCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDEDCODELIST$0);
        }
    }
    
    /**
     * Sets array of all "IncludedCodelist" element
     */
    public void setIncludedCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType[] includedCodelistArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(includedCodelistArray, INCLUDEDCODELIST$0);
        }
    }
    
    /**
     * Sets ith "IncludedCodelist" element
     */
    public void setIncludedCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType includedCodelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType)get_store().find_element_user(INCLUDEDCODELIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(includedCodelist);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncludedCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType insertNewIncludedCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType)get_store().insert_element_user(INCLUDEDCODELIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncludedCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType addNewIncludedCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType)get_store().add_element_user(INCLUDEDCODELIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "IncludedCodelist" element
     */
    public void removeIncludedCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDEDCODELIST$0, i);
        }
    }
    
    /**
     * Gets array of all "Hierarchy" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType[] getHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHY$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType getHierarchyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType)get_store().find_element_user(HIERARCHY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Hierarchy" element
     */
    public int sizeOfHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHY$2);
        }
    }
    
    /**
     * Sets array of all "Hierarchy" element
     */
    public void setHierarchyArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType[] hierarchyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchyArray, HIERARCHY$2);
        }
    }
    
    /**
     * Sets ith "Hierarchy" element
     */
    public void setHierarchyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType)get_store().find_element_user(HIERARCHY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType insertNewHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType)get_store().insert_element_user(HIERARCHY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType addNewHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType)get_store().add_element_user(HIERARCHY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Hierarchy" element
     */
    public void removeHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHY$2, i);
        }
    }
}
