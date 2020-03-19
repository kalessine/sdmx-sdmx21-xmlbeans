/*
 * An XML document type.
 * Localname: GroupDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one GroupDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class GroupDimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPDIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "GroupDimension");
    
    
    /**
     * Gets the "GroupDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType getGroupDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().find_element_user(GROUPDIMENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GroupDimension" element
     */
    public void setGroupDimension(org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType groupDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().find_element_user(GROUPDIMENSION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().add_element_user(GROUPDIMENSION$0);
            }
            target.set(groupDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType addNewGroupDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().add_element_user(GROUPDIMENSION$0);
            return target;
        }
    }
}
