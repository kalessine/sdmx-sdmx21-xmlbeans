/*
 * XML Type:  TimeDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML TimeDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class TimeDimensionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.BaseDimensionTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType
{
    private static final long serialVersionUID = 1L;
    
    public TimeDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "LocalRepresentation");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "LocalRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType getLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().find_element_user(LOCALREPRESENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LocalRepresentation" element
     */
    public boolean isSetLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALREPRESENTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "LocalRepresentation" element
     */
    public void setLocalRepresentation(org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType localRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().find_element_user(LOCALREPRESENTATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().add_element_user(LOCALREPRESENTATION$0);
            }
            target.set(localRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "LocalRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType addNewLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType)get_store().add_element_user(LOCALREPRESENTATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "LocalRepresentation" element
     */
    public void unsetLocalRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALREPRESENTATION$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ID$2);
            }
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
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_default_attribute_value(ID$2);
            }
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
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$4);
            }
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
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DimensionTypeType)get_default_attribute_value(TYPE$4);
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
