/*
 * An XML document type.
 * Localname: PrimaryMeasureWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one PrimaryMeasureWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class PrimaryMeasureWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimaryMeasureWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMARYMEASUREWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureWhere");
    
    
    /**
     * Gets the "PrimaryMeasureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType getPrimaryMeasureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().find_element_user(PRIMARYMEASUREWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrimaryMeasureWhere" element
     */
    public void setPrimaryMeasureWhere(org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType primaryMeasureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().find_element_user(PRIMARYMEASUREWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().add_element_user(PRIMARYMEASUREWHERE$0);
            }
            target.set(primaryMeasureWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType addNewPrimaryMeasureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType)get_store().add_element_user(PRIMARYMEASUREWHERE$0);
            return target;
        }
    }
}
