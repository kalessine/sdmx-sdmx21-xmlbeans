/*
 * An XML document type.
 * Localname: DataSetTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one DataSetTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class DataSetTargetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASETTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataSetTarget");
    
    
    /**
     * Gets the "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType getDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().find_element_user(DATASETTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSetTarget" element
     */
    public void setDataSetTarget(org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType dataSetTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().find_element_user(DATASETTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().add_element_user(DATASETTARGET$0);
            }
            target.set(dataSetTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType addNewDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().add_element_user(DATASETTARGET$0);
            return target;
        }
    }
}
