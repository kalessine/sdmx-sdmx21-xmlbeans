/*
 * An XML document type.
 * Localname: Value
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one Value(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Value");
    
    
    /**
     * Gets the "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "Value" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
}
