/*
 * XML Type:  CodelistQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CodelistQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML CodelistQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class CodelistQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CodelistQueryType
{
    private static final long serialVersionUID = 1L;
    
    public CodelistQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODELISTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CodelistWhere");
    
    
    /**
     * Gets the "CodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType getCodelistWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType)get_store().find_element_user(CODELISTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CodelistWhere" element
     */
    public void setCodelistWhere(org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType codelistWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType)get_store().find_element_user(CODELISTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType)get_store().add_element_user(CODELISTWHERE$0);
            }
            target.set(codelistWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType addNewCodelistWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CodelistWhereType)get_store().add_element_user(CODELISTWHERE$0);
            return target;
        }
    }
}
