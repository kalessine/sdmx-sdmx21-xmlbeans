/*
 * XML Type:  ConceptSchemeWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ConceptSchemeWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ConceptSchemeWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemSchemeWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ConceptSchemeWhereType
{
    private static final long serialVersionUID = 1L;
    
    public ConceptSchemeWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptWhere");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "ConceptWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType[] getConceptWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType getConceptWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().find_element_user(CONCEPTWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptWhere" element
     */
    public int sizeOfConceptWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTWHERE$0);
        }
    }
    
    /**
     * Sets array of all "ConceptWhere" element
     */
    public void setConceptWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType[] conceptWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptWhereArray, CONCEPTWHERE$0);
        }
    }
    
    /**
     * Sets ith "ConceptWhere" element
     */
    public void setConceptWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType conceptWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().find_element_user(CONCEPTWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType insertNewConceptWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().insert_element_user(CONCEPTWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType addNewConceptWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConceptWhereType)get_store().add_element_user(CONCEPTWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptWhere" element
     */
    public void removeConceptWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTWHERE$0, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_default_attribute_value(TYPE$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$2) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().find_attribute_user(TYPE$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType)get_store().add_attribute_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$2);
        }
    }
}
