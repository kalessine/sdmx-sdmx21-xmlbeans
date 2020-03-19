/*
 * An XML document type.
 * Localname: CodeMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one CodeMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class CodeMapDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemAssociationDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public CodeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODEMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodeMap");
    
    
    /**
     * Gets the "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType getCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().find_element_user(CODEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CodeMap" element
     */
    public void setCodeMap(org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType codeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().find_element_user(CODEMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().add_element_user(CODEMAP$0);
            }
            target.set(codeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType addNewCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeMapType)get_store().add_element_user(CODEMAP$0);
            return target;
        }
    }
}
