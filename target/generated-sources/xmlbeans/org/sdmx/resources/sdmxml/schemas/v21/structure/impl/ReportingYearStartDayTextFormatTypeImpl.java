/*
 * XML Type:  ReportingYearStartDayTextFormatType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayTextFormatType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ReportingYearStartDayTextFormatType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ReportingYearStartDayTextFormatTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.NonFacetedTextFormatTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingYearStartDayTextFormatType
{
    private static final long serialVersionUID = 1L;
    
    public ReportingYearStartDayTextFormatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTTYPE$0 = 
        new javax.xml.namespace.QName("", "textType");
    
    
    /**
     * Gets the "textType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum getTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEXTTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "textType" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataType xgetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_default_attribute_value(TEXTTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "textType" attribute
     */
    public boolean isSetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "textType" attribute
     */
    public void setTextType(org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum textType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTTYPE$0);
            }
            target.setEnumValue(textType);
        }
    }
    
    /**
     * Sets (as xml) the "textType" attribute
     */
    public void xsetTextType(org.sdmx.resources.sdmxml.schemas.v21.common.DataType textType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_store().find_attribute_user(TEXTTYPE$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataType)get_store().add_attribute_user(TEXTTYPE$0);
            }
            target.set(textType);
        }
    }
    
    /**
     * Unsets the "textType" attribute
     */
    public void unsetTextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTTYPE$0);
        }
    }
}
