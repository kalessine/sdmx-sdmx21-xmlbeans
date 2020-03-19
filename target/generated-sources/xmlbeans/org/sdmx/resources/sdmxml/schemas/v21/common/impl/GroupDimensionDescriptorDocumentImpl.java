/*
 * An XML document type.
 * Localname: GroupDimensionDescriptor
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.GroupDimensionDescriptorDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one GroupDimensionDescriptor(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class GroupDimensionDescriptorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.GroupDimensionDescriptorDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupDimensionDescriptorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPDIMENSIONDESCRIPTOR$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "GroupDimensionDescriptor");
    
    
    /**
     * Gets the "GroupDimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getGroupDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(GROUPDIMENSIONDESCRIPTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GroupDimensionDescriptor" element
     */
    public void setGroupDimensionDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType groupDimensionDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(GROUPDIMENSIONDESCRIPTOR$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(GROUPDIMENSIONDESCRIPTOR$0);
            }
            target.set(groupDimensionDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupDimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewGroupDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(GROUPDIMENSIONDESCRIPTOR$0);
            return target;
        }
    }
}
