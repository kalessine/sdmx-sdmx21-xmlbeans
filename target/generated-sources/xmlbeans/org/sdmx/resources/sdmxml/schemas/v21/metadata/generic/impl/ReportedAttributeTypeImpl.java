/*
 * XML Type:  ReportedAttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.impl;
/**
 * An XML ReportedAttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic).
 *
 * This is a complex type.
 */
public class ReportedAttributeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType
{
    private static final long serialVersionUID = 1L;
    
    public ReportedAttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Text");
    private static final javax.xml.namespace.QName STRUCTUREDTEXT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "StructuredText");
    private static final javax.xml.namespace.QName ATTRIBUTESET$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "AttributeSet");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName VALUE$8 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets array of all "Text" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(TEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Text" element
     */
    public int sizeOfTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$0);
        }
    }
    
    /**
     * Sets array of all "Text" element
     */
    public void setTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] textArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textArray, TEXT$0);
        }
    }
    
    /**
     * Sets ith "Text" element
     */
    public void setTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(TEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(text);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(TEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Text" element
     */
    public void removeText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "StructuredText" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType[] getStructuredTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTUREDTEXT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructuredText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType getStructuredTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().find_element_user(STRUCTUREDTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructuredText" element
     */
    public int sizeOfStructuredTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTUREDTEXT$2);
        }
    }
    
    /**
     * Sets array of all "StructuredText" element
     */
    public void setStructuredTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType[] structuredTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structuredTextArray, STRUCTUREDTEXT$2);
        }
    }
    
    /**
     * Sets ith "StructuredText" element
     */
    public void setStructuredTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType structuredText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().find_element_user(STRUCTUREDTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structuredText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType insertNewStructuredText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().insert_element_user(STRUCTUREDTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredText" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType addNewStructuredText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType)get_store().add_element_user(STRUCTUREDTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructuredText" element
     */
    public void removeStructuredText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTUREDTEXT$2, i);
        }
    }
    
    /**
     * Gets the "AttributeSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType getAttributeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().find_element_user(ATTRIBUTESET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttributeSet" element
     */
    public boolean isSetAttributeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTESET$4) != 0;
        }
    }
    
    /**
     * Sets the "AttributeSet" element
     */
    public void setAttributeSet(org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType attributeSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().find_element_user(ATTRIBUTESET$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().add_element_user(ATTRIBUTESET$4);
            }
            target.set(attributeSet);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType addNewAttributeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType)get_store().add_element_user(ATTRIBUTESET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "AttributeSet" element
     */
    public void unsetAttributeSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTESET$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$6);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$8);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$8) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$8);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$8);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$8);
        }
    }
}
