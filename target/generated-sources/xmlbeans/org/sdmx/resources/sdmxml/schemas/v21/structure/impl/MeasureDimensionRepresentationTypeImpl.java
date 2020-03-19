/*
 * XML Type:  MeasureDimensionRepresentationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionRepresentationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MeasureDimensionRepresentationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MeasureDimensionRepresentationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.DataStructureRepresentationTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionRepresentationType
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDimensionRepresentationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENUMERATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Enumeration");
    
    
    /**
     * Gets the "Enumeration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getEnumeration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(ENUMERATION$0, 0);
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
            return get_store().count_elements(ENUMERATION$0) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(ENUMERATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(ENUMERATION$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(ENUMERATION$0);
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
            get_store().remove_element(ENUMERATION$0, 0);
        }
    }
}
