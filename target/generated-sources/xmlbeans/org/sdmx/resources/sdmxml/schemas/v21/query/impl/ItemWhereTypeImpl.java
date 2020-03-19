/*
 * XML Type:  ItemWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ItemWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ItemWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.NameableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ItemWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Parent");
    private static final javax.xml.namespace.QName ITEMWHERE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ItemWhere");
    private static final org.apache.xmlbeans.QNameSet ITEMWHERE$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ItemWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategoryWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "OrganisationWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportingCategoryWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CodeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptWhere"),
    });
    
    
    /**
     * Gets the "Parent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType getParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Parent" element
     */
    public boolean isSetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENT$0) != 0;
        }
    }
    
    /**
     * Sets the "Parent" element
     */
    public void setParent(org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType)get_store().add_element_user(PARENT$0);
            }
            target.set(parent);
        }
    }
    
    /**
     * Appends and returns a new empty "Parent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType addNewParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalItemReferenceType)get_store().add_element_user(PARENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Parent" element
     */
    public void unsetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "ItemWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType[] getItemWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEMWHERE$3, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ItemWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType getItemWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().find_element_user(ITEMWHERE$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ItemWhere" element
     */
    public int sizeOfItemWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMWHERE$3);
        }
    }
    
    /**
     * Sets array of all "ItemWhere" element
     */
    public void setItemWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType[] itemWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemWhereArray, ITEMWHERE$2, ITEMWHERE$3);
        }
    }
    
    /**
     * Sets ith "ItemWhere" element
     */
    public void setItemWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType itemWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().find_element_user(ITEMWHERE$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(itemWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ItemWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType insertNewItemWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().insert_element_user(ITEMWHERE$3, ITEMWHERE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ItemWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType addNewItemWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ItemWhereType)get_store().add_element_user(ITEMWHERE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ItemWhere" element
     */
    public void removeItemWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMWHERE$3, i);
        }
    }
}
