/*
 * An XML document type.
 * Localname: DimensionDescriptor
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DimensionDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one DimensionDescriptor(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class DimensionDescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DimensionDescriptorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DimensionDescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DimensionDescriptor");
    
    
    /**
     * Gets the "DimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DimensionDescriptor" element
     */
    public void setDimensionDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dimensionDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTOR$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTOR$0);
            }
            target.set(dimensionDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTOR$0);
            return target;
        }
    }
}
