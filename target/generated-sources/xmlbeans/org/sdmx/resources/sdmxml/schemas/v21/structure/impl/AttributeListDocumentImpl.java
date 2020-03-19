/*
 * An XML document type.
 * Localname: AttributeList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one AttributeList(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class AttributeListDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentListDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributeListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTELIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttributeList");
    
    
    /**
     * Gets the "AttributeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType getAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().find_element_user(ATTRIBUTELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttributeList" element
     */
    public void setAttributeList(org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType attributeList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().find_element_user(ATTRIBUTELIST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().add_element_user(ATTRIBUTELIST$0);
            }
            target.set(attributeList);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType addNewAttributeList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType)get_store().add_element_user(ATTRIBUTELIST$0);
            return target;
        }
    }
}
