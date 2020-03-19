/*
 * XML Type:  ComponentListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ComponentListType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ComponentListTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.IdentifiableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Component");
    private static final org.apache.xmlbeans.QNameSet COMPONENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "TimeDimension"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "PrimaryMeasure"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Component"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "GroupDimension"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConstraintContentTarget"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportPeriodTarget"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataAttribute"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dimension"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "KeyDescriptorValuesTarget"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureDimension"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "IdentifiableObjectTarget"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingYearStartDay"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Attribute"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataSetTarget"),
    });
    
    
    /**
     * Gets array of all "Component" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$1, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Component" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType)get_store().find_element_user(COMPONENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$1);
        }
    }
    
    /**
     * Sets array of all "Component" element
     */
    public void setComponentArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$0, COMPONENT$1);
        }
    }
    
    /**
     * Sets ith "Component" element
     */
    public void setComponentArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType)get_store().find_element_user(COMPONENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Component" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType)get_store().insert_element_user(COMPONENT$1, COMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Component" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentType)get_store().add_element_user(COMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$1, i);
        }
    }
}
