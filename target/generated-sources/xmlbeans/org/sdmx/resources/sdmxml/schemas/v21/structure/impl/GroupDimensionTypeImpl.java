/*
 * XML Type:  GroupDimensionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML GroupDimensionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class GroupDimensionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.GroupDimensionBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType
{
    private static final long serialVersionUID = 1L;
    
    public GroupDimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSIONREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DimensionReference");
    
    
    /**
     * Gets the "DimensionReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType getDimensionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().find_element_user(DIMENSIONREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DimensionReference" element
     */
    public void setDimensionReference(org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType dimensionReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().find_element_user(DIMENSIONREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().add_element_user(DIMENSIONREFERENCE$0);
            }
            target.set(dimensionReference);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType addNewDimensionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().add_element_user(DIMENSIONREFERENCE$0);
            return target;
        }
    }
}
