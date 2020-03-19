/*
 * XML Type:  AnnotationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML AnnotationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class AnnotationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONTITLE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AnnotationTitle");
    private static final javax.xml.namespace.QName ANNOTATIONTYPE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AnnotationType");
    private static final javax.xml.namespace.QName ANNOTATIONURL$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AnnotationURL");
    private static final javax.xml.namespace.QName ANNOTATIONTEXT$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AnnotationText");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "AnnotationTitle" element
     */
    public java.lang.String getAnnotationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTATIONTITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AnnotationTitle" element
     */
    public org.apache.xmlbeans.XmlString xgetAnnotationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNOTATIONTITLE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AnnotationTitle" element
     */
    public boolean isSetAnnotationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONTITLE$0) != 0;
        }
    }
    
    /**
     * Sets the "AnnotationTitle" element
     */
    public void setAnnotationTitle(java.lang.String annotationTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTATIONTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANNOTATIONTITLE$0);
            }
            target.setStringValue(annotationTitle);
        }
    }
    
    /**
     * Sets (as xml) the "AnnotationTitle" element
     */
    public void xsetAnnotationTitle(org.apache.xmlbeans.XmlString annotationTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNOTATIONTITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANNOTATIONTITLE$0);
            }
            target.set(annotationTitle);
        }
    }
    
    /**
     * Unsets the "AnnotationTitle" element
     */
    public void unsetAnnotationTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONTITLE$0, 0);
        }
    }
    
    /**
     * Gets the "AnnotationType" element
     */
    public java.lang.String getAnnotationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTATIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AnnotationType" element
     */
    public org.apache.xmlbeans.XmlString xgetAnnotationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNOTATIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AnnotationType" element
     */
    public boolean isSetAnnotationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "AnnotationType" element
     */
    public void setAnnotationType(java.lang.String annotationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANNOTATIONTYPE$2);
            }
            target.setStringValue(annotationType);
        }
    }
    
    /**
     * Sets (as xml) the "AnnotationType" element
     */
    public void xsetAnnotationType(org.apache.xmlbeans.XmlString annotationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNOTATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANNOTATIONTYPE$2);
            }
            target.set(annotationType);
        }
    }
    
    /**
     * Unsets the "AnnotationType" element
     */
    public void unsetAnnotationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "AnnotationURL" element
     */
    public java.lang.String getAnnotationURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTATIONURL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AnnotationURL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAnnotationURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ANNOTATIONURL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "AnnotationURL" element
     */
    public boolean isSetAnnotationURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONURL$4) != 0;
        }
    }
    
    /**
     * Sets the "AnnotationURL" element
     */
    public void setAnnotationURL(java.lang.String annotationURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTATIONURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANNOTATIONURL$4);
            }
            target.setStringValue(annotationURL);
        }
    }
    
    /**
     * Sets (as xml) the "AnnotationURL" element
     */
    public void xsetAnnotationURL(org.apache.xmlbeans.XmlAnyURI annotationURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ANNOTATIONURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ANNOTATIONURL$4);
            }
            target.set(annotationURL);
        }
    }
    
    /**
     * Unsets the "AnnotationURL" element
     */
    public void unsetAnnotationURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONURL$4, 0);
        }
    }
    
    /**
     * Gets array of all "AnnotationText" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getAnnotationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANNOTATIONTEXT$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AnnotationText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getAnnotationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(ANNOTATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AnnotationText" element
     */
    public int sizeOfAnnotationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONTEXT$6);
        }
    }
    
    /**
     * Sets array of all "AnnotationText" element
     */
    public void setAnnotationTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] annotationTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(annotationTextArray, ANNOTATIONTEXT$6);
        }
    }
    
    /**
     * Sets ith "AnnotationText" element
     */
    public void setAnnotationTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType annotationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(ANNOTATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(annotationText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnnotationText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewAnnotationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(ANNOTATIONTEXT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AnnotationText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewAnnotationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(ANNOTATIONTEXT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "AnnotationText" element
     */
    public void removeAnnotationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONTEXT$6, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$8) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$8);
        }
    }
}
