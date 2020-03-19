/*
 * XML Type:  BaseDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.BaseDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML BaseDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class BaseDimensionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.BaseDimensionBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.BaseDimensionType
{
    private static final long serialVersionUID = 1L;
    
    public BaseDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTROLE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptRole");
    private static final javax.xml.namespace.QName POSITION$2 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "ConceptRole" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] getConceptRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTROLE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptRole" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType getConceptRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(CONCEPTROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptRole" element
     */
    public int sizeOfConceptRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTROLE$0);
        }
    }
    
    /**
     * Sets array of all "ConceptRole" element
     */
    public void setConceptRoleArray(org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] conceptRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptRoleArray, CONCEPTROLE$0);
        }
    }
    
    /**
     * Sets ith "ConceptRole" element
     */
    public void setConceptRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType conceptRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(CONCEPTROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRole" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType insertNewConceptRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().insert_element_user(CONCEPTROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRole" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType addNewConceptRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().add_element_user(CONCEPTROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptRole" element
     */
    public void removeConceptRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTROLE$0, i);
        }
    }
    
    /**
     * Gets the "position" attribute
     */
    public int getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(POSITION$2);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$2) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
    public void setPosition(int position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$2);
            }
            target.setIntValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
    public void xsetPosition(org.apache.xmlbeans.XmlInt position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(POSITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(POSITION$2);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$2);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType)get_store().find_attribute_user(TYPE$4);
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
            return get_store().find_attribute_user(TYPE$4) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType)get_store().add_attribute_user(TYPE$4);
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
            get_store().remove_attribute(TYPE$4);
        }
    }
}
