/*
 * An XML document type.
 * Localname: StructuresWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one StructuresWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class StructuresWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructuresWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructuresWhere");
    
    
    /**
     * Gets the "StructuresWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType getStructuresWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType)get_store().find_element_user(STRUCTURESWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuresWhere" element
     */
    public void setStructuresWhere(org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType structuresWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType)get_store().find_element_user(STRUCTURESWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType)get_store().add_element_user(STRUCTURESWHERE$0);
            }
            target.set(structuresWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuresWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType addNewStructuresWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructuresWhereType)get_store().add_element_user(STRUCTURESWHERE$0);
            return target;
        }
    }
}
