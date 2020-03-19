/*
 * XML Type:  RepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML RepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class RepresentationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationType
{
    private static final long serialVersionUID = 1L;
    
    public RepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "TextFormat");
    private static final javax.xml.namespace.QName ENUMERATION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Enumeration");
    private static final javax.xml.namespace.QName ENUMERATIONFORMAT$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "EnumerationFormat");
    
    
    /**
     * Gets the "TextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType getTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().find_element_user(TEXTFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TextFormat" element
     */
    public boolean isSetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTFORMAT$0) != 0;
        }
    }
    
    /**
     * Sets the "TextFormat" element
     */
    public void setTextFormat(org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType textFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().find_element_user(TEXTFORMAT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().add_element_user(TEXTFORMAT$0);
            }
            target.set(textFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "TextFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType addNewTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType)get_store().add_element_user(TEXTFORMAT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "TextFormat" element
     */
    public void unsetTextFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTFORMAT$0, 0);
        }
    }
    
    /**
     * Gets the "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(ENUMERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Enumeration" element
     */
    public boolean isSetEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENUMERATION$2) != 0;
        }
    }
    
    /**
     * Sets the "Enumeration" element
     */
    public void setEnumeration(org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType enumeration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(ENUMERATION$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(ENUMERATION$2);
            }
            target.set(enumeration);
        }
    }
    
    /**
     * Appends and returns a new empty "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType addNewEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(ENUMERATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Enumeration" element
     */
    public void unsetEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENUMERATION$2, 0);
        }
    }
    
    /**
     * Gets the "EnumerationFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType getEnumerationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType)get_store().find_element_user(ENUMERATIONFORMAT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EnumerationFormat" element
     */
    public boolean isSetEnumerationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENUMERATIONFORMAT$4) != 0;
        }
    }
    
    /**
     * Sets the "EnumerationFormat" element
     */
    public void setEnumerationFormat(org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType enumerationFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType)get_store().find_element_user(ENUMERATIONFORMAT$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType)get_store().add_element_user(ENUMERATIONFORMAT$4);
            }
            target.set(enumerationFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "EnumerationFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType addNewEnumerationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodededTextFormatType)get_store().add_element_user(ENUMERATIONFORMAT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "EnumerationFormat" element
     */
    public void unsetEnumerationFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENUMERATIONFORMAT$4, 0);
        }
    }
}
