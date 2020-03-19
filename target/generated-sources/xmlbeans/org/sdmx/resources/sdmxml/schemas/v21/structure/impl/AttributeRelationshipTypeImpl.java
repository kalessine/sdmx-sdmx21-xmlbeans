/*
 * XML Type:  AttributeRelationshipType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML AttributeRelationshipType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class AttributeRelationshipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeRelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "None");
    private static final javax.xml.namespace.QName DIMENSION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dimension");
    private static final javax.xml.namespace.QName ATTACHMENTGROUP$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttachmentGroup");
    private static final javax.xml.namespace.QName GROUP$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Group");
    private static final javax.xml.namespace.QName PRIMARYMEASURE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "PrimaryMeasure");
    
    
    /**
     * Gets the "None" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(NONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "None" element
     */
    public boolean isSetNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONE$0) != 0;
        }
    }
    
    /**
     * Sets the "None" element
     */
    public void setNone(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType none)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(NONE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(NONE$0);
            }
            target.set(none);
        }
    }
    
    /**
     * Appends and returns a new empty "None" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(NONE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "None" element
     */
    public void unsetNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONE$0, 0);
        }
    }
    
    /**
     * Gets array of all "Dimension" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().find_element_user(DIMENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$2);
        }
    }
    
    /**
     * Sets array of all "Dimension" element
     */
    public void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType[] dimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionArray, DIMENSION$2);
        }
    }
    
    /**
     * Sets ith "Dimension" element
     */
    public void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().find_element_user(DIMENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().insert_element_user(DIMENSION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType)get_store().add_element_user(DIMENSION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$2, i);
        }
    }
    
    /**
     * Gets array of all "AttachmentGroup" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType[] getAttachmentGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTACHMENTGROUP$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AttachmentGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType getAttachmentGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().find_element_user(ATTACHMENTGROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AttachmentGroup" element
     */
    public int sizeOfAttachmentGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTGROUP$4);
        }
    }
    
    /**
     * Sets array of all "AttachmentGroup" element
     */
    public void setAttachmentGroupArray(org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType[] attachmentGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attachmentGroupArray, ATTACHMENTGROUP$4);
        }
    }
    
    /**
     * Sets ith "AttachmentGroup" element
     */
    public void setAttachmentGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType attachmentGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().find_element_user(ATTACHMENTGROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attachmentGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType insertNewAttachmentGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().insert_element_user(ATTACHMENTGROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentGroup" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType addNewAttachmentGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().add_element_user(ATTACHMENTGROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AttachmentGroup" element
     */
    public void removeAttachmentGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTGROUP$4, i);
        }
    }
    
    /**
     * Gets the "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().find_element_user(GROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Group" element
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$6) != 0;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().find_element_user(GROUP$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().add_element_user(GROUP$6);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType)get_store().add_element_user(GROUP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Group" element
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$6, 0);
        }
    }
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType getPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType)get_store().find_element_user(PRIMARYMEASURE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryMeasure" element
     */
    public boolean isSetPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYMEASURE$8) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryMeasure" element
     */
    public void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType primaryMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType)get_store().find_element_user(PRIMARYMEASURE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType)get_store().add_element_user(PRIMARYMEASURE$8);
            }
            target.set(primaryMeasure);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType addNewPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType)get_store().add_element_user(PRIMARYMEASURE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryMeasure" element
     */
    public void unsetPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYMEASURE$8, 0);
        }
    }
}
