/*
 * An XML document type.
 * Localname: MeasureDimensionWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one MeasureDimensionWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class MeasureDimensionWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDimensionWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREDIMENSIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MeasureDimensionWhere");
    
    
    /**
     * Gets the "MeasureDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType getMeasureDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().find_element_user(MEASUREDIMENSIONWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MeasureDimensionWhere" element
     */
    public void setMeasureDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType measureDimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().find_element_user(MEASUREDIMENSIONWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().add_element_user(MEASUREDIMENSIONWHERE$0);
            }
            target.set(measureDimensionWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType addNewMeasureDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType)get_store().add_element_user(MEASUREDIMENSIONWHERE$0);
            return target;
        }
    }
}
