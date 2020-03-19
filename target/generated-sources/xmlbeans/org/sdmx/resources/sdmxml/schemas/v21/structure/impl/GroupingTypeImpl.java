/*
 * XML Type:  GroupingType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML GroupingType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class GroupingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.GroupingType
{
    private static final long serialVersionUID = 1L;
    
    public GroupingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTLIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ComponentList");
    private static final org.apache.xmlbeans.QNameSet COMPONENTLIST$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DimensionList"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ComponentList"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportStructure"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Group"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureList"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataTarget"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttributeList"),
    });
    
    
    /**
     * Gets array of all "ComponentList" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType[] getComponentListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTLIST$1, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType getComponentListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().find_element_user(COMPONENTLIST$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComponentList" element
     */
    public int sizeOfComponentListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTLIST$1);
        }
    }
    
    /**
     * Sets array of all "ComponentList" element
     */
    public void setComponentListArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType[] componentListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentListArray, COMPONENTLIST$0, COMPONENTLIST$1);
        }
    }
    
    /**
     * Sets ith "ComponentList" element
     */
    public void setComponentListArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType componentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().find_element_user(COMPONENTLIST$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType insertNewComponentList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().insert_element_user(COMPONENTLIST$1, COMPONENTLIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType addNewComponentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().add_element_user(COMPONENTLIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentList" element
     */
    public void removeComponentList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTLIST$1, i);
        }
    }
}
