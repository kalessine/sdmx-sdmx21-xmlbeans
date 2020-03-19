/*
 * An XML document type.
 * Localname: NumericValue
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one NumericValue(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class NumericValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumericValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERICVALUE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "NumericValue");
    
    
    /**
     * Gets the "NumericValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType getNumericValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().find_element_user(NUMERICVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NumericValue" element
     */
    public void setNumericValue(org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType numericValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().find_element_user(NUMERICVALUE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().add_element_user(NUMERICVALUE$0);
            }
            target.set(numericValue);
        }
    }
    
    /**
     * Appends and returns a new empty "NumericValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType addNewNumericValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType)get_store().add_element_user(NUMERICVALUE$0);
            return target;
        }
    }
}
