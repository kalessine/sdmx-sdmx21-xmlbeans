/*
 * An XML document type.
 * Localname: MeasureDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one MeasureDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class MeasureDimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREDIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureDimension");
    
    
    /**
     * Gets the "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType getMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().find_element_user(MEASUREDIMENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MeasureDimension" element
     */
    public void setMeasureDimension(org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType measureDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().find_element_user(MEASUREDIMENSION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().add_element_user(MEASUREDIMENSION$0);
            }
            target.set(measureDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType addNewMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType)get_store().add_element_user(MEASUREDIMENSION$0);
            return target;
        }
    }
}
