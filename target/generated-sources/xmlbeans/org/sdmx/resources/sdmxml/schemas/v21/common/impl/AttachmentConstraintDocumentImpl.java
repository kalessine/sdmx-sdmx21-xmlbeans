/*
 * An XML document type.
 * Localname: AttachmentConstraint
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one AttachmentConstraint(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class AttachmentConstraintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentConstraintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AttachmentConstraint");
    
    
    /**
     * Gets the "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTACHMENTCONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentConstraint" element
     */
    public void setAttachmentConstraint(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTACHMENTCONSTRAINT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTACHMENTCONSTRAINT$0);
            }
            target.set(attachmentConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTACHMENTCONSTRAINT$0);
            return target;
        }
    }
}
