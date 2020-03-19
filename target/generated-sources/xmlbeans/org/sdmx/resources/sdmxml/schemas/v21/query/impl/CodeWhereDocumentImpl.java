/*
 * An XML document type.
 * Localname: CodeWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one CodeWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class CodeWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ItemWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public CodeWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODEWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CodeWhere");
    
    
    /**
     * Gets the "CodeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType getCodeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType)get_store().find_element_user(CODEWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CodeWhere" element
     */
    public void setCodeWhere(org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType codeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType)get_store().find_element_user(CODEWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType)get_store().add_element_user(CODEWHERE$0);
            }
            target.set(codeWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "CodeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType addNewCodeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodeWhereType)get_store().add_element_user(CODEWHERE$0);
            return target;
        }
    }
}
