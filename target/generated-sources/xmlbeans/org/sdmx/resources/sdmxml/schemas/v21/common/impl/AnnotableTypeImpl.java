/*
 * XML Type:  AnnotableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AnnotableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML AnnotableType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class AnnotableTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AnnotableType
{
    private static final long serialVersionUID = 1L;
    
    public AnnotableTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * True if has "Annotations" element
     */
    public boolean isSetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONS$0) != 0;
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
    
    /**
     * Unsets the "Annotations" element
     */
    public void unsetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONS$0, 0);
        }
    }
}
