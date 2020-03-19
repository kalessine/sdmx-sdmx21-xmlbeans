/*
 * XML Type:  MetadataAttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MetadataAttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MetadataAttributeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MetadataAttributeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATAATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataAttribute");
    private static final javax.xml.namespace.QName MINOCCURS$2 = 
        new javax.xml.namespace.QName("", "minOccurs");
    private static final javax.xml.namespace.QName MAXOCCURS$4 = 
        new javax.xml.namespace.QName("", "maxOccurs");
    private static final javax.xml.namespace.QName ISPRESENTATIONAL$6 = 
        new javax.xml.namespace.QName("", "isPresentational");
    
    
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
     * Gets the "minOccurs" attribute
     */
    public java.math.BigInteger getMinOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINOCCURS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINOCCURS$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MINOCCURS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(MINOCCURS$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "minOccurs" attribute
     */
    public boolean isSetMinOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINOCCURS$2) != null;
        }
    }
    
    /**
     * Sets the "minOccurs" attribute
     */
    public void setMinOccurs(java.math.BigInteger minOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINOCCURS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINOCCURS$2);
            }
            target.setBigIntegerValue(minOccurs);
        }
    }
    
    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    public void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(MINOCCURS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(MINOCCURS$2);
            }
            target.set(minOccurs);
        }
    }
    
    /**
     * Unsets the "minOccurs" attribute
     */
    public void unsetMinOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINOCCURS$2);
        }
    }
    
    /**
     * Gets the "maxOccurs" attribute
     */
    public java.lang.Object getMaxOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXOCCURS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MAXOCCURS$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType xgetMaxOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType)get_store().find_attribute_user(MAXOCCURS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType)get_default_attribute_value(MAXOCCURS$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "maxOccurs" attribute
     */
    public boolean isSetMaxOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXOCCURS$4) != null;
        }
    }
    
    /**
     * Sets the "maxOccurs" attribute
     */
    public void setMaxOccurs(java.lang.Object maxOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXOCCURS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXOCCURS$4);
            }
            target.setObjectValue(maxOccurs);
        }
    }
    
    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    public void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType maxOccurs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType)get_store().find_attribute_user(MAXOCCURS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType)get_store().add_attribute_user(MAXOCCURS$4);
            }
            target.set(maxOccurs);
        }
    }
    
    /**
     * Unsets the "maxOccurs" attribute
     */
    public void unsetMaxOccurs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXOCCURS$4);
        }
    }
    
    /**
     * Gets the "isPresentational" attribute
     */
    public boolean getIsPresentational()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPRESENTATIONAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISPRESENTATIONAL$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPresentational" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsPresentational()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPRESENTATIONAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISPRESENTATIONAL$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "isPresentational" attribute
     */
    public boolean isSetIsPresentational()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISPRESENTATIONAL$6) != null;
        }
    }
    
    /**
     * Sets the "isPresentational" attribute
     */
    public void setIsPresentational(boolean isPresentational)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISPRESENTATIONAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISPRESENTATIONAL$6);
            }
            target.setBooleanValue(isPresentational);
        }
    }
    
    /**
     * Sets (as xml) the "isPresentational" attribute
     */
    public void xsetIsPresentational(org.apache.xmlbeans.XmlBoolean isPresentational)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISPRESENTATIONAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISPRESENTATIONAL$6);
            }
            target.set(isPresentational);
        }
    }
    
    /**
     * Unsets the "isPresentational" attribute
     */
    public void unsetIsPresentational()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISPRESENTATIONAL$6);
        }
    }
}
