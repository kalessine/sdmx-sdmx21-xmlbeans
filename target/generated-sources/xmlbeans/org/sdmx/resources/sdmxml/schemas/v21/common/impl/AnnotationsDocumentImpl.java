/*
 * An XML document type.
 * Localname: Annotations
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one Annotations(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class AnnotationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Annotations");
    
    
    /**
     * Gets the "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Annotations" element
     */
    public void setAnnotations(org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType annotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType)get_store().find_element_user(ANNOTATIONS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$0);
            }
            target.set(annotations);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType addNewAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType)get_store().add_element_user(ANNOTATIONS$0);
            return target;
        }
    }
}
