/*
 * An XML document type.
 * Localname: PrimaryMeasure
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one PrimaryMeasure(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class PrimaryMeasureDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimaryMeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYMEASURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "PrimaryMeasure");
    
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType getPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType)get_store().find_element_user(PRIMARYMEASURE$0, 0);
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
    public void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType primaryMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType)get_store().find_element_user(PRIMARYMEASURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType)get_store().add_element_user(PRIMARYMEASURE$0);
            }
            target.set(primaryMeasure);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType addNewPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.PrimaryMeasureType)get_store().add_element_user(PRIMARYMEASURE$0);
            return target;
        }
    }
}
