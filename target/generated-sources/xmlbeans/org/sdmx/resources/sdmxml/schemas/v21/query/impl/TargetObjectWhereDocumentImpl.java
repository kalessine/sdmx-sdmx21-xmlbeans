/*
 * An XML document type.
 * Localname: TargetObjectWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one TargetObjectWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class TargetObjectWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetObjectWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETOBJECTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectWhere");
    
    
    /**
     * Gets the "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType getTargetObjectWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().find_element_user(TARGETOBJECTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TargetObjectWhere" element
     */
    public void setTargetObjectWhere(org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType targetObjectWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().find_element_user(TARGETOBJECTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().add_element_user(TARGETOBJECTWHERE$0);
            }
            target.set(targetObjectWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType addNewTargetObjectWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().add_element_user(TARGETOBJECTWHERE$0);
            return target;
        }
    }
}
