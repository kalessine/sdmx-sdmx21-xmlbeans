/*
 * XML Type:  ConstraintsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConstraintsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConstraintsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttachmentConstraint");
    private static final javax.xml.namespace.QName CONTENTCONSTRAINT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ContentConstraint");
    
    
    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType[] getAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTCONSTRAINT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType getAttachmentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType)get_store().find_element_user(ATTACHMENTCONSTRAINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachmentConstraint" element
     */
    public int sizeOfAttachmentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTCONSTRAINT$0);
        }
    }
    
    /**
     * Sets array of all "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType[] attachmentConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentConstraintArray, ATTACHMENTCONSTRAINT$0);
        }
    }
    
    /**
     * Sets ith "AttachmentConstraint" element
     */
    public void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType)get_store().find_element_user(ATTACHMENTCONSTRAINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType insertNewAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType)get_store().insert_element_user(ATTACHMENTCONSTRAINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttachmentConstraintType)get_store().add_element_user(ATTACHMENTCONSTRAINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentConstraint" element
     */
    public void removeAttachmentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTCONSTRAINT$0, i);
        }
    }
    
    /**
     * Gets array of all "ContentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType[] getContentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENTCONSTRAINT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType getContentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType)get_store().find_element_user(CONTENTCONSTRAINT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ContentConstraint" element
     */
    public int sizeOfContentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTCONSTRAINT$2);
        }
    }
    
    /**
     * Sets array of all "ContentConstraint" element
     */
    public void setContentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType[] contentConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contentConstraintArray, CONTENTCONSTRAINT$2);
        }
    }
    
    /**
     * Sets ith "ContentConstraint" element
     */
    public void setContentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType contentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType)get_store().find_element_user(CONTENTCONSTRAINT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contentConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType insertNewContentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType)get_store().insert_element_user(CONTENTCONSTRAINT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType addNewContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintType)get_store().add_element_user(CONTENTCONSTRAINT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContentConstraint" element
     */
    public void removeContentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTCONSTRAINT$2, i);
        }
    }
}
