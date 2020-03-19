/*
 * An XML document type.
 * Localname: MeasureDescriptor
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.MeasureDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one MeasureDescriptor(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class MeasureDescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.MeasureDescriptorDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasureDescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MeasureDescriptor");
    
    
    /**
     * Gets the "MeasureDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMeasureDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(MEASUREDESCRIPTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MeasureDescriptor" element
     */
    public void setMeasureDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType measureDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(MEASUREDESCRIPTOR$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(MEASUREDESCRIPTOR$0);
            }
            target.set(measureDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMeasureDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(MEASUREDESCRIPTOR$0);
            return target;
        }
    }
}
