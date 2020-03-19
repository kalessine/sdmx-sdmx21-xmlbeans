/*
 * An XML document type.
 * Localname: Code
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.CodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Code(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class CodeDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.CodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Code");
    
    
    /**
     * Gets the "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Appends and returns a new empty "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodeType)get_store().add_element_user(CODE$0);
            return target;
        }
    }
}
