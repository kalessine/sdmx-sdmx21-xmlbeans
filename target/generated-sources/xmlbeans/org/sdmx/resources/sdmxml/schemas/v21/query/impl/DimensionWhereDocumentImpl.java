/*
 * An XML document type.
 * Localname: DimensionWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one DimensionWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class DimensionWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public DimensionWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DimensionWhere");
    
    
    /**
     * Gets the "DimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType getDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(DIMENSIONWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DimensionWhere" element
     */
    public void setDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType dimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().find_element_user(DIMENSIONWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().add_element_user(DIMENSIONWHERE$0);
            }
            target.set(dimensionWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType addNewDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType)get_store().add_element_user(DIMENSIONWHERE$0);
            return target;
        }
    }
}
