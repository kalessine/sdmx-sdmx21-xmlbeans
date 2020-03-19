/*
 * XML Type:  AnnotationsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML AnnotationsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class AnnotationsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationsType
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Annotation");
    
    
    /**
     * Gets array of all "Annotation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType[] getAnnotationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANNOTATION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Annotation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType getAnnotationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType)get_store().find_element_user(ANNOTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Annotation" element
     */
    public int sizeOfAnnotationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATION$0);
        }
    }
    
    /**
     * Sets array of all "Annotation" element
     */
    public void setAnnotationArray(org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType[] annotationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(annotationArray, ANNOTATION$0);
        }
    }
    
    /**
     * Sets ith "Annotation" element
     */
    public void setAnnotationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType)get_store().find_element_user(ANNOTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(annotation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Annotation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType insertNewAnnotation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType)get_store().insert_element_user(ANNOTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Annotation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType addNewAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType)get_store().add_element_user(ANNOTATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Annotation" element
     */
    public void removeAnnotation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATION$0, i);
        }
    }
}
