/*
 * XML Type:  DataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DataStructureComponentsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.DataStructureComponentsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureComponentsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DimensionList");
    private static final javax.xml.namespace.QName GROUP$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Group");
    private static final javax.xml.namespace.QName ATTRIBUTELIST$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttributeList");
    private static final javax.xml.namespace.QName MEASURELIST$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureList");
    
    
    /**
     * Gets the "DimensionList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType getDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().find_element_user(DIMENSIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DimensionList" element
     */
    public void setDimensionList(org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType dimensionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().find_element_user(DIMENSIONLIST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().add_element_user(DIMENSIONLIST$0);
            }
            target.set(dimensionList);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType addNewDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().add_element_user(DIMENSIONLIST$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Group" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().find_element_user(GROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$2);
        }
    }
    
    /**
     * Sets array of all "Group" element
     */
    public void setGroupArray(org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$2);
        }
    }
    
    /**
     * Sets ith "Group" element
     */
    public void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().find_element_user(GROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().insert_element_user(GROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType)get_store().add_element_user(GROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$2, i);
        }
    }
    
    /**
     * Gets the "AttributeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType getAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().find_element_user(ATTRIBUTELIST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttributeList" element
     */
    public boolean isSetAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTELIST$4) != 0;
        }
    }
    
    /**
     * Sets the "AttributeList" element
     */
    public void setAttributeList(org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType attributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().find_element_user(ATTRIBUTELIST$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().add_element_user(ATTRIBUTELIST$4);
            }
            target.set(attributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType addNewAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().add_element_user(ATTRIBUTELIST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "AttributeList" element
     */
    public void unsetAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTELIST$4, 0);
        }
    }
    
    /**
     * Gets the "MeasureList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType getMeasureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().find_element_user(MEASURELIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MeasureList" element
     */
    public void setMeasureList(org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType measureList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().find_element_user(MEASURELIST$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().add_element_user(MEASURELIST$6);
            }
            target.set(measureList);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType addNewMeasureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().add_element_user(MEASURELIST$6);
            return target;
        }
    }
}
