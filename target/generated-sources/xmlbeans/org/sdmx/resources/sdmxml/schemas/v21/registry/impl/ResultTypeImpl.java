/*
 * XML Type:  ResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML ResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class ResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType
{
    private static final long serialVersionUID = 1L;
    
    public ResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "Registration");
    private static final javax.xml.namespace.QName CONTENTCONSTRAINT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "ContentConstraint");
    
    
    /**
     * Gets the "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType getRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().find_element_user(REGISTRATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Registration" element
     */
    public void setRegistration(org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType registration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().find_element_user(REGISTRATION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().add_element_user(REGISTRATION$0);
            }
            target.set(registration);
        }
    }
    
    /**
     * Appends and returns a new empty "Registration" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType addNewRegistration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType)get_store().add_element_user(REGISTRATION$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "ContentConstraint" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType[] getContentConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENTCONSTRAINT$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType getContentConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType)get_store().find_element_user(CONTENTCONSTRAINT$2, i);
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
    public void setContentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType[] contentConstraintArray)
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
    public void setContentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType contentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType)get_store().find_element_user(CONTENTCONSTRAINT$2, i);
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
    public org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType insertNewContentConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType)get_store().insert_element_user(CONTENTCONSTRAINT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType addNewContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintReferenceType)get_store().add_element_user(CONTENTCONSTRAINT$2);
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
