/*
 * XML Type:  GroupType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML GroupType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class GroupTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.GroupBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType
{
    private static final long serialVersionUID = 1L;
    
    public GroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPDIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "GroupDimension");
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttachmentConstraint");
    
    
    /**
     * Gets array of all "GroupDimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType[] getGroupDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUPDIMENSION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GroupDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType getGroupDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().find_element_user(GROUPDIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GroupDimension" element
     */
    public int sizeOfGroupDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPDIMENSION$0);
        }
    }
    
    /**
     * Sets array of all "GroupDimension" element
     */
    public void setGroupDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType[] groupDimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupDimensionArray, GROUPDIMENSION$0);
        }
    }
    
    /**
     * Sets ith "GroupDimension" element
     */
    public void setGroupDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType groupDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().find_element_user(GROUPDIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(groupDimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GroupDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType insertNewGroupDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.GroupDimensionType)get_store().insert_element_user(GROUPDIMENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GroupDimension" element
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
    
    /**
     * Removes the ith "GroupDimension" element
     */
    public void removeGroupDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPDIMENSION$0, i);
        }
    }
    
    /**
     * Gets the "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$2, 0);
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
            return get_store().count_elements(ATTACHMENTCONSTRAINT$2) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(ATTACHMENTCONSTRAINT$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(ATTACHMENTCONSTRAINT$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(ATTACHMENTCONSTRAINT$2);
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
            get_store().remove_element(ATTACHMENTCONSTRAINT$2, 0);
        }
    }
}
