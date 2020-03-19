/*
 * XML Type:  KeyDescriptorValuesRepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML KeyDescriptorValuesRepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class KeyDescriptorValuesRepresentationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.RepresentationTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesRepresentationType
{
    private static final long serialVersionUID = 1L;
    
    public KeyDescriptorValuesRepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "TextFormat");
    
    
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
}
