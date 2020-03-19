/*
 * XML Type:  GroupWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML GroupWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class GroupWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.GroupWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.GroupWhereType
{
    private static final long serialVersionUID = 1L;
    
    public GroupWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttachmentConstraint");
    
    
    /**
     * Gets the "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttachmentConstraint" element
     */
    public boolean isSetAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTCONSTRAINT$0) != 0;
        }
    }
    
    /**
     * Sets the "AttachmentConstraint" element
     */
    public void setAttachmentConstraint(org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(ATTACHMENTCONSTRAINT$0);
            }
            target.set(attachmentConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(ATTACHMENTCONSTRAINT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "AttachmentConstraint" element
     */
    public void unsetAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTCONSTRAINT$0, 0);
        }
    }
}
