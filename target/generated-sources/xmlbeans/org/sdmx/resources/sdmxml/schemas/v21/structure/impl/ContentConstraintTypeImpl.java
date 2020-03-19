/*
 * XML Type:  ContentConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ContentConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ContentConstraintTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ContentConstraintBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType
{
    private static final long serialVersionUID = 1L;
    
    public ContentConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELEASECALENDAR$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReleaseCalendar");
    private static final javax.xml.namespace.QName REFERENCEPERIOD$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReferencePeriod");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "ReleaseCalendar" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType getReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType)get_store().find_element_user(RELEASECALENDAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReleaseCalendar" element
     */
    public boolean isSetReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELEASECALENDAR$0) != 0;
        }
    }
    
    /**
     * Sets the "ReleaseCalendar" element
     */
    public void setReleaseCalendar(org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType releaseCalendar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType)get_store().find_element_user(RELEASECALENDAR$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType)get_store().add_element_user(RELEASECALENDAR$0);
            }
            target.set(releaseCalendar);
        }
    }
    
    /**
     * Appends and returns a new empty "ReleaseCalendar" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType addNewReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReleaseCalendarType)get_store().add_element_user(RELEASECALENDAR$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ReleaseCalendar" element
     */
    public void unsetReleaseCalendar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELEASECALENDAR$0, 0);
        }
    }
    
    /**
     * Gets the "ReferencePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType getReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().find_element_user(REFERENCEPERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferencePeriod" element
     */
    public boolean isSetReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEPERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "ReferencePeriod" element
     */
    public void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType referencePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().find_element_user(REFERENCEPERIOD$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().add_element_user(REFERENCEPERIOD$2);
            }
            target.set(referencePeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType addNewReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType)get_store().add_element_user(REFERENCEPERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferencePeriod" element
     */
    public void unsetReferencePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEPERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType.Enum getType()
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
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType)get_default_attribute_value(TYPE$4);
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
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType.Enum type)
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
    public void xsetType(org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintTypeCodeType)get_store().add_attribute_user(TYPE$4);
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
