/*
 * An XML document type.
 * Localname: CodelistMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.CodelistMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one CodelistMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class CodelistMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.CodelistMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public CodelistMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODELISTMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CodelistMap");
    
    
    /**
     * Gets the "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODELISTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CodelistMap" element
     */
    public void setCodelistMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType codelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODELISTMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODELISTMAP$0);
            }
            target.set(codelistMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODELISTMAP$0);
            return target;
        }
    }
}
