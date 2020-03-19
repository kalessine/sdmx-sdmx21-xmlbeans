/*
 * An XML document type.
 * Localname: DimensionDescriptorValuesTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DimensionDescriptorValuesTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one DimensionDescriptorValuesTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class DimensionDescriptorValuesTargetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.DimensionDescriptorValuesTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DimensionDescriptorValuesTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONDESCRIPTORVALUESTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DimensionDescriptorValuesTarget");
    
    
    /**
     * Gets the "DimensionDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDimensionDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTORVALUESTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DimensionDescriptorValuesTarget" element
     */
    public void setDimensionDescriptorValuesTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dimensionDescriptorValuesTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTORVALUESTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTORVALUESTARGET$0);
            }
            target.set(dimensionDescriptorValuesTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDimensionDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTORVALUESTARGET$0);
            return target;
        }
    }
}
