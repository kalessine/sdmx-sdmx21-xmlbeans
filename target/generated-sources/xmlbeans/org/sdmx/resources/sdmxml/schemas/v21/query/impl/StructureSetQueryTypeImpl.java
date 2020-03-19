/*
 * XML Type:  StructureSetQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureSetQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureSetQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetQueryType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
