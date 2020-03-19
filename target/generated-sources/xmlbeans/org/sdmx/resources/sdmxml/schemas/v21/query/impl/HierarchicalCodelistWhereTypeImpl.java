/*
 * XML Type:  HierarchicalCodelistWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML HierarchicalCodelistWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class HierarchicalCodelistWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.HierarchicalCodelistWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.HierarchicalCodelistWhereType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDEDCODELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "IncludedCodelist");
    
    
    /**
     * Gets array of all "IncludedCodelist" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType[] getIncludedCodelistArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCLUDEDCODELIST$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncludedCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType getIncludedCodelistArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().find_element_user(INCLUDEDCODELIST$0, i);
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
    public void setIncludedCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType[] includedCodelistArray)
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
    public void setIncludedCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType includedCodelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().find_element_user(INCLUDEDCODELIST$0, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType insertNewIncludedCodelist(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().insert_element_user(INCLUDEDCODELIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncludedCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType addNewIncludedCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodelistReferenceType)get_store().add_element_user(INCLUDEDCODELIST$0);
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
}
