/*
 * An XML document type.
 * Localname: DataflowWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one DataflowWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class DataflowWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataflowWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAFLOWWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataflowWhere");
    
    
    /**
     * Gets the "DataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType getDataflowWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType)get_store().find_element_user(DATAFLOWWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataflowWhere" element
     */
    public void setDataflowWhere(org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType dataflowWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType)get_store().find_element_user(DATAFLOWWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType)get_store().add_element_user(DATAFLOWWHERE$0);
            }
            target.set(dataflowWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "DataflowWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType addNewDataflowWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataflowWhereType)get_store().add_element_user(DATAFLOWWHERE$0);
            return target;
        }
    }
}
