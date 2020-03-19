/*
 * An XML document type.
 * Localname: AttributeWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one AttributeWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class AttributeWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttributeWhere");
    
    
    /**
     * Gets the "AttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType getAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().find_element_user(ATTRIBUTEWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttributeWhere" element
     */
    public void setAttributeWhere(org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType attributeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().find_element_user(ATTRIBUTEWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().add_element_user(ATTRIBUTEWHERE$0);
            }
            target.set(attributeWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType addNewAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType)get_store().add_element_user(ATTRIBUTEWHERE$0);
            return target;
        }
    }
}
