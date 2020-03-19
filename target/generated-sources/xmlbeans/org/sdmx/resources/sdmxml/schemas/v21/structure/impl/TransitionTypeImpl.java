/*
 * XML Type:  TransitionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML TransitionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class TransitionTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.IdentifiableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType
{
    private static final long serialVersionUID = 1L;
    
    public TransitionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETSTEP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "TargetStep");
    private static final javax.xml.namespace.QName CONDITION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Condition");
    private static final javax.xml.namespace.QName LOCALID$4 = 
        new javax.xml.namespace.QName("", "localID");
    
    
    /**
     * Gets the "TargetStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType getTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType)get_store().find_element_user(TARGETSTEP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TargetStep" element
     */
    public void setTargetStep(org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType)get_store().find_element_user(TARGETSTEP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType)get_store().add_element_user(TARGETSTEP$0);
            }
            target.set(targetStep);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType addNewTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalProcessStepReferenceType)get_store().add_element_user(TARGETSTEP$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Condition" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONDITION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Condition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(CONDITION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Condition" element
     */
    public int sizeOfConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITION$2);
        }
    }
    
    /**
     * Sets array of all "Condition" element
     */
    public void setConditionArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] conditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conditionArray, CONDITION$2);
        }
    }
    
    /**
     * Sets ith "Condition" element
     */
    public void setConditionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(CONDITION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(condition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Condition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(CONDITION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Condition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(CONDITION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Condition" element
     */
    public void removeCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITION$2, i);
        }
    }
    
    /**
     * Gets the "localID" attribute
     */
    public java.lang.String getLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "localID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(LOCALID$4);
            return target;
        }
    }
    
    /**
     * True if has "localID" attribute
     */
    public boolean isSetLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCALID$4) != null;
        }
    }
    
    /**
     * Sets the "localID" attribute
     */
    public void setLocalID(java.lang.String localID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$4);
            }
            target.setStringValue(localID);
        }
    }
    
    /**
     * Sets (as xml) the "localID" attribute
     */
    public void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType localID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(LOCALID$4);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(LOCALID$4);
            }
            target.set(localID);
        }
    }
    
    /**
     * Unsets the "localID" attribute
     */
    public void unsetLocalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCALID$4);
        }
    }
}
