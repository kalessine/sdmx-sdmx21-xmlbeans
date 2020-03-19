/*
 * XML Type:  HierarchyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML HierarchyType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class HierarchyTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.HierarchyBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHICALCODE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "HierarchicalCode");
    private static final javax.xml.namespace.QName LEVEL$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Level");
    private static final javax.xml.namespace.QName LEVELED$4 = 
        new javax.xml.namespace.QName("", "leveled");
    
    
    /**
     * Gets array of all "HierarchicalCode" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] getHierarchicalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType getHierarchicalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().find_element_user(HIERARCHICALCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCode" element
     */
    public int sizeOfHierarchicalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODE$0);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCode" element
     */
    public void setHierarchicalCodeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] hierarchicalCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodeArray, HIERARCHICALCODE$0);
        }
    }
    
    /**
     * Sets ith "HierarchicalCode" element
     */
    public void setHierarchicalCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType hierarchicalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().find_element_user(HIERARCHICALCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType insertNewHierarchicalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().insert_element_user(HIERARCHICALCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType addNewHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().add_element_user(HIERARCHICALCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCode" element
     */
    public void removeHierarchicalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODE$0, i);
        }
    }
    
    /**
     * Gets the "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Level" element
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEVEL$2) != 0;
        }
    }
    
    /**
     * Sets the "Level" element
     */
    public void setLevel(org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().add_element_user(LEVEL$2);
            }
            target.set(level);
        }
    }
    
    /**
     * Appends and returns a new empty "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType addNewLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().add_element_user(LEVEL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Level" element
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEVEL$2, 0);
        }
    }
    
    /**
     * Gets the "leveled" attribute
     */
    public boolean getLeveled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LEVELED$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "leveled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetLeveled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LEVELED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(LEVELED$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "leveled" attribute
     */
    public boolean isSetLeveled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVELED$4) != null;
        }
    }
    
    /**
     * Sets the "leveled" attribute
     */
    public void setLeveled(boolean leveled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVELED$4);
            }
            target.setBooleanValue(leveled);
        }
    }
    
    /**
     * Sets (as xml) the "leveled" attribute
     */
    public void xsetLeveled(org.apache.xmlbeans.XmlBoolean leveled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(LEVELED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(LEVELED$4);
            }
            target.set(leveled);
        }
    }
    
    /**
     * Unsets the "leveled" attribute
     */
    public void unsetLeveled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVELED$4);
        }
    }
}
