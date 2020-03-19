/*
 * An XML document type.
 * Localname: CodelistQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one CodelistQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class CodelistQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CodelistQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODELISTQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "CodelistQuery");
    
    
    /**
     * Gets the "CodelistQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType getCodelistQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType)get_store().find_element_user(CODELISTQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CodelistQuery" element
     */
    public void setCodelistQuery(org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType codelistQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType)get_store().find_element_user(CODELISTQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType)get_store().add_element_user(CODELISTQUERY$0);
            }
            target.set(codelistQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType addNewCodelistQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CodelistQueryType)get_store().add_element_user(CODELISTQUERY$0);
            return target;
        }
    }
}
