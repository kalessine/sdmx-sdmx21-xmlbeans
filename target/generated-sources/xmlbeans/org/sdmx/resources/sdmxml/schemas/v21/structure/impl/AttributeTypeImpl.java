/*
 * XML Type:  AttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML AttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class AttributeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.AttributeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTROLE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptRole");
    private static final javax.xml.namespace.QName ATTRIBUTERELATIONSHIP$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttributeRelationship");
    private static final javax.xml.namespace.QName ASSIGNMENTSTATUS$4 = 
        new javax.xml.namespace.QName("", "assignmentStatus");
    
    
    /**
     * Gets array of all "ConceptRole" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] getConceptRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTROLE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptRole" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType getConceptRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(CONCEPTROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptRole" element
     */
    public int sizeOfConceptRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTROLE$0);
        }
    }
    
    /**
     * Sets array of all "ConceptRole" element
     */
    public void setConceptRoleArray(org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] conceptRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptRoleArray, CONCEPTROLE$0);
        }
    }
    
    /**
     * Sets ith "ConceptRole" element
     */
    public void setConceptRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType conceptRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(CONCEPTROLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptRole" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType insertNewConceptRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().insert_element_user(CONCEPTROLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptRole" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType addNewConceptRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().add_element_user(CONCEPTROLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptRole" element
     */
    public void removeConceptRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTROLE$0, i);
        }
    }
    
    /**
     * Gets the "AttributeRelationship" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType getAttributeRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType)get_store().find_element_user(ATTRIBUTERELATIONSHIP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttributeRelationship" element
     */
    public void setAttributeRelationship(org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType attributeRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType)get_store().find_element_user(ATTRIBUTERELATIONSHIP$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType)get_store().add_element_user(ATTRIBUTERELATIONSHIP$2);
            }
            target.set(attributeRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeRelationship" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType addNewAttributeRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType)get_store().add_element_user(ATTRIBUTERELATIONSHIP$2);
            return target;
        }
    }
    
    /**
     * Gets the "assignmentStatus" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType.Enum getAssignmentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNMENTSTATUS$4);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "assignmentStatus" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType xgetAssignmentStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType)get_store().find_attribute_user(ASSIGNMENTSTATUS$4);
            return target;
        }
    }
    
    /**
     * Sets the "assignmentStatus" attribute
     */
    public void setAssignmentStatus(org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType.Enum assignmentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNMENTSTATUS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNMENTSTATUS$4);
            }
            target.setEnumValue(assignmentStatus);
        }
    }
    
    /**
     * Sets (as xml) the "assignmentStatus" attribute
     */
    public void xsetAssignmentStatus(org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType assignmentStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType)get_store().find_attribute_user(ASSIGNMENTSTATUS$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.UsageStatusType)get_store().add_attribute_user(ASSIGNMENTSTATUS$4);
            }
            target.set(assignmentStatus);
        }
    }
}
