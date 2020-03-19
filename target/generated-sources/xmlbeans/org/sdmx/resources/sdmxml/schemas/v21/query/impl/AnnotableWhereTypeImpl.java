/*
 * XML Type:  AnnotableWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.AnnotableWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML AnnotableWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class AnnotableWhereTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.AnnotableWhereType
{
    private static final long serialVersionUID = 1L;
    
    public AnnotableWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Annotation");
    
    
    /**
     * Gets the "Annotation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Annotation" element
     */
    public boolean isSetAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Annotation" element
     */
    public void setAnnotation(org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType)get_store().add_element_user(ANNOTATION$0);
            }
            target.set(annotation);
        }
    }
    
    /**
     * Appends and returns a new empty "Annotation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType addNewAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType)get_store().add_element_user(ANNOTATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Annotation" element
     */
    public void unsetAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATION$0, 0);
        }
    }
}
