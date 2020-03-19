/*
 * An XML document type.
 * Localname: PrimaryMeasure
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.PrimaryMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one PrimaryMeasure(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class PrimaryMeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.PrimaryMeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimaryMeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYMEASURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "PrimaryMeasure");
    
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PRIMARYMEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryMeasure" element
     */
    public void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType primaryMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PRIMARYMEASURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PRIMARYMEASURE$0);
            }
            target.set(primaryMeasure);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PRIMARYMEASURE$0);
            return target;
        }
    }
}
