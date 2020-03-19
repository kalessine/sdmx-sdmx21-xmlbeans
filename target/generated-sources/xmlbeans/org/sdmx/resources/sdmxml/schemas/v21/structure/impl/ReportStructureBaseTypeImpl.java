/*
 * XML Type:  ReportStructureBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportStructureBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportStructureBaseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureBaseType
{
    private static final long serialVersionUID = 1L;
    
    public ReportStructureBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataAttribute");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "MetadataAttribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType[] getMetadataAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAATTRIBUTE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType getMetadataAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().find_element_user(METADATAATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataAttribute" element
     */
    public int sizeOfMetadataAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "MetadataAttribute" element
     */
    public void setMetadataAttributeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType[] metadataAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataAttributeArray, METADATAATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "MetadataAttribute" element
     */
    public void setMetadataAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType metadataAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().find_element_user(METADATAATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType insertNewMetadataAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().insert_element_user(METADATAATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType addNewMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType)get_store().add_element_user(METADATAATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataAttribute" element
     */
    public void removeMetadataAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAATTRIBUTE$0, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
