/*
 * An XML document type.
 * Localname: Dimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Dimension(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class DimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dimension");
    
    
    /**
     * Gets the "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().find_element_user(DIMENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Dimension" element
     */
    public void setDimension(org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().find_element_user(DIMENSION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().add_element_user(DIMENSION$0);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Appends and returns a new empty "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType)get_store().add_element_user(DIMENSION$0);
            return target;
        }
    }
}
