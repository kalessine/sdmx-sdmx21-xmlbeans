/*
 * XML Type:  ComponentListWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ComponentListWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ComponentListWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.IdentifiableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ComponentListWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentWhere");
    private static final org.apache.xmlbeans.QNameSet COMPONENTWHERE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupDimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttributeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MeasureDimensionWhere"),
    });
    
    
    /**
     * Gets array of all "ComponentWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] getComponentWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTWHERE$1, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType getComponentWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().find_element_user(COMPONENTWHERE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComponentWhere" element
     */
    public int sizeOfComponentWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTWHERE$1);
        }
    }
    
    /**
     * Sets array of all "ComponentWhere" element
     */
    public void setComponentWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] componentWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentWhereArray, COMPONENTWHERE$0, COMPONENTWHERE$1);
        }
    }
    
    /**
     * Sets ith "ComponentWhere" element
     */
    public void setComponentWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType componentWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().find_element_user(COMPONENTWHERE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType insertNewComponentWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().insert_element_user(COMPONENTWHERE$1, COMPONENTWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType addNewComponentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().add_element_user(COMPONENTWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentWhere" element
     */
    public void removeComponentWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTWHERE$1, i);
        }
    }
}
