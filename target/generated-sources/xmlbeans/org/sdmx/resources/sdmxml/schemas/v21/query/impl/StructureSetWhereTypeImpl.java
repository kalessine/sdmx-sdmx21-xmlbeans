/*
 * XML Type:  StructureSetWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureSetWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureSetWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructureSetWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDSTRUCTURES$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "RelatedStructures");
    private static final javax.xml.namespace.QName MAPPEDOBJECT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MappedObject");
    
    
    /**
     * Gets array of all "RelatedStructures" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] getRelatedStructuresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDSTRUCTURES$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelatedStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType getRelatedStructuresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(RELATEDSTRUCTURES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelatedStructures" element
     */
    public int sizeOfRelatedStructuresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDSTRUCTURES$0);
        }
    }
    
    /**
     * Sets array of all "RelatedStructures" element
     */
    public void setRelatedStructuresArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] relatedStructuresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relatedStructuresArray, RELATEDSTRUCTURES$0);
        }
    }
    
    /**
     * Sets ith "RelatedStructures" element
     */
    public void setRelatedStructuresArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType relatedStructures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(RELATEDSTRUCTURES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedStructures);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelatedStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType insertNewRelatedStructures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().insert_element_user(RELATEDSTRUCTURES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelatedStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType addNewRelatedStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().add_element_user(RELATEDSTRUCTURES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelatedStructures" element
     */
    public void removeRelatedStructures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDSTRUCTURES$0, i);
        }
    }
    
    /**
     * Gets array of all "MappedObject" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType[] getMappedObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MAPPEDOBJECT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MappedObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType getMappedObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType)get_store().find_element_user(MAPPEDOBJECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MappedObject" element
     */
    public int sizeOfMappedObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPEDOBJECT$2);
        }
    }
    
    /**
     * Sets array of all "MappedObject" element
     */
    public void setMappedObjectArray(org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType[] mappedObjectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mappedObjectArray, MAPPEDOBJECT$2);
        }
    }
    
    /**
     * Sets ith "MappedObject" element
     */
    public void setMappedObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType mappedObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType)get_store().find_element_user(MAPPEDOBJECT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mappedObject);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MappedObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType insertNewMappedObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType)get_store().insert_element_user(MAPPEDOBJECT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MappedObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType addNewMappedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType)get_store().add_element_user(MAPPEDOBJECT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MappedObject" element
     */
    public void removeMappedObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPEDOBJECT$2, i);
        }
    }
}
