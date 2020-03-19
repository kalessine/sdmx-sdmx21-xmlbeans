/*
 * An XML document type.
 * Localname: MeasureList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one MeasureList(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class MeasureListDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASURELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureList");
    
    
    /**
     * Gets the "MeasureList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType getMeasureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().find_element_user(MEASURELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MeasureList" element
     */
    public void setMeasureList(org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType measureList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().find_element_user(MEASURELIST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().add_element_user(MEASURELIST$0);
            }
            target.set(measureList);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType addNewMeasureList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType)get_store().add_element_user(MEASURELIST$0);
            return target;
        }
    }
}
