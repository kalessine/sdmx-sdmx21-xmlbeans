/*
 * XML Type:  ItemType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ItemType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ItemTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType
{
    private static final long serialVersionUID = 1L;
    
    public ItemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Parent");
    private static final javax.xml.namespace.QName ITEM$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Item");
    private static final org.apache.xmlbeans.QNameSet ITEM$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Code"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataConsumer"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Item"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationUnit"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Concept"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataProvider"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Category"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Agency"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingCategory"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Organisation"),
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
     * Gets array of all "Item" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$3, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Item" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().find_element_user(ITEM$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$3);
        }
    }
    
    /**
     * Sets array of all "Item" element
     */
    public void setItemArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$2, ITEM$3);
        }
    }
    
    /**
     * Sets ith "Item" element
     */
    public void setItemArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().find_element_user(ITEM$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().insert_element_user(ITEM$3, ITEM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().add_element_user(ITEM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$3, i);
        }
    }
}
