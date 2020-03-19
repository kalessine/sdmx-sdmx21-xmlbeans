/*
 * XML Type:  ItemSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ItemSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ItemSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ItemSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MaintainableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ItemSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public ItemSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Item");
    private static final org.apache.xmlbeans.QNameSet ITEM$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    private static final javax.xml.namespace.QName ISPARTIAL$2 = 
        new javax.xml.namespace.QName("", "isPartial");
    
    
    /**
     * Gets array of all "Item" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$1, targetList);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().find_element_user(ITEM$1, i);
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
            return get_store().count_elements(ITEM$1);
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
            arraySetterHelper(itemArray, ITEM$0, ITEM$1);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().find_element_user(ITEM$1, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().insert_element_user(ITEM$1, ITEM$0, i);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemType)get_store().add_element_user(ITEM$0);
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
            get_store().remove_element(ITEM$1, i);
        }
    }
    
    /**
     * Gets the "isPartial" attribute
     */
    public boolean getIsPartial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPARTIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISPARTIAL$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPartial" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPartial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPARTIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISPARTIAL$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "isPartial" attribute
     */
    public boolean isSetIsPartial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISPARTIAL$2) != null;
        }
    }
    
    /**
     * Sets the "isPartial" attribute
     */
    public void setIsPartial(boolean isPartial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPARTIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPARTIAL$2);
            }
            target.setBooleanValue(isPartial);
        }
    }
    
    /**
     * Sets (as xml) the "isPartial" attribute
     */
    public void xsetIsPartial(org.apache.xmlbeans.XmlBoolean isPartial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPARTIAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPARTIAL$2);
            }
            target.set(isPartial);
        }
    }
    
    /**
     * Unsets the "isPartial" attribute
     */
    public void unsetIsPartial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISPARTIAL$2);
        }
    }
}
