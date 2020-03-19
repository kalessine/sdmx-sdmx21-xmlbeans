/*
 * An XML document type.
 * Localname: DimensionList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one DimensionList(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class DimensionListDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListDocument
{
    private static final long serialVersionUID = 1L;
    
    public DimensionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DimensionList");
    
    
    /**
     * Gets the "DimensionList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType getDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().find_element_user(DIMENSIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DimensionList" element
     */
    public void setDimensionList(org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType dimensionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().find_element_user(DIMENSIONLIST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().add_element_user(DIMENSIONLIST$0);
            }
            target.set(dimensionList);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType addNewDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType)get_store().add_element_user(DIMENSIONLIST$0);
            return target;
        }
    }
}
