/*
 * An XML document type.
 * Localname: StructureSetWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one StructureSetWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class StructureSetWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURESETWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructureSetWhere");
    
    
    /**
     * Gets the "StructureSetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType getStructureSetWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType)get_store().find_element_user(STRUCTURESETWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructureSetWhere" element
     */
    public void setStructureSetWhere(org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType structureSetWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType)get_store().find_element_user(STRUCTURESETWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType)get_store().add_element_user(STRUCTURESETWHERE$0);
            }
            target.set(structureSetWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType addNewStructureSetWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType)get_store().add_element_user(STRUCTURESETWHERE$0);
            return target;
        }
    }
}
