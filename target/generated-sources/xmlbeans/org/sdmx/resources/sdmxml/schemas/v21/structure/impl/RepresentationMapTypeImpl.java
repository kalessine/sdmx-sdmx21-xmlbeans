/*
 * XML Type:  RepresentationMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML RepresentationMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class RepresentationMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType
{
    private static final long serialVersionUID = 1L;
    
    public RepresentationMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODELISTMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodelistMap");
    private static final javax.xml.namespace.QName TOTEXTFORMAT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ToTextFormat");
    private static final javax.xml.namespace.QName TOVALUETYPE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ToValueType");
    private static final javax.xml.namespace.QName VALUEMAP$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ValueMap");
    
    
    /**
     * Gets the "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType getCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType)get_store().find_element_user(CODELISTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodelistMap" element
     */
    public boolean isSetCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTMAP$0) != 0;
        }
    }
    
    /**
     * Sets the "CodelistMap" element
     */
    public void setCodelistMap(org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType codelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType)get_store().find_element_user(CODELISTMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType)get_store().add_element_user(CODELISTMAP$0);
            }
            target.set(codelistMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType addNewCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType)get_store().add_element_user(CODELISTMAP$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CodelistMap" element
     */
    public void unsetCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTMAP$0, 0);
        }
    }
    
    /**
     * Gets the "ToTextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType getToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().find_element_user(TOTEXTFORMAT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ToTextFormat" element
     */
    public boolean isSetToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTEXTFORMAT$2) != 0;
        }
    }
    
    /**
     * Sets the "ToTextFormat" element
     */
    public void setToTextFormat(org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType toTextFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().find_element_user(TOTEXTFORMAT$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().add_element_user(TOTEXTFORMAT$2);
            }
            target.set(toTextFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "ToTextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType addNewToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().add_element_user(TOTEXTFORMAT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ToTextFormat" element
     */
    public void unsetToTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTEXTFORMAT$2, 0);
        }
    }
    
    /**
     * Gets the "ToValueType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType.Enum getToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOVALUETYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ToValueType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType xgetToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType)get_store().find_element_user(TOVALUETYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ToValueType" element
     */
    public boolean isSetToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOVALUETYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ToValueType" element
     */
    public void setToValueType(org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType.Enum toValueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOVALUETYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOVALUETYPE$4);
            }
            target.setEnumValue(toValueType);
        }
    }
    
    /**
     * Sets (as xml) the "ToValueType" element
     */
    public void xsetToValueType(org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType toValueType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType)get_store().find_element_user(TOVALUETYPE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType)get_store().add_element_user(TOVALUETYPE$4);
            }
            target.set(toValueType);
        }
    }
    
    /**
     * Unsets the "ToValueType" element
     */
    public void unsetToValueType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOVALUETYPE$4, 0);
        }
    }
    
    /**
     * Gets the "ValueMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType getValueMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType)get_store().find_element_user(VALUEMAP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValueMap" element
     */
    public boolean isSetValueMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUEMAP$6) != 0;
        }
    }
    
    /**
     * Sets the "ValueMap" element
     */
    public void setValueMap(org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType valueMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType)get_store().find_element_user(VALUEMAP$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType)get_store().add_element_user(VALUEMAP$6);
            }
            target.set(valueMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ValueMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType addNewValueMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType)get_store().add_element_user(VALUEMAP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ValueMap" element
     */
    public void unsetValueMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUEMAP$6, 0);
        }
    }
}
