/*
 * XML Type:  SubmittedStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmittedStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmittedStructureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType
{
    private static final long serialVersionUID = 1L;
    
    public SubmittedStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAINTAINABLEOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MaintainableObject");
    private static final javax.xml.namespace.QName ACTION$2 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName EXTERNALDEPENDENCIES$4 = 
        new javax.xml.namespace.QName("", "externalDependencies");
    
    
    /**
     * Gets the "MaintainableObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType getMaintainableObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType)get_store().find_element_user(MAINTAINABLEOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MaintainableObject" element
     */
    public void setMaintainableObject(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType maintainableObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType)get_store().find_element_user(MAINTAINABLEOBJECT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType)get_store().add_element_user(MAINTAINABLEOBJECT$0);
            }
            target.set(maintainableObject);
        }
    }
    
    /**
     * Appends and returns a new empty "MaintainableObject" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType addNewMaintainableObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableReferenceType)get_store().add_element_user(MAINTAINABLEOBJECT$0);
            return target;
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$2);
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$2) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$2);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ActionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_attribute_user(ACTION$2);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$2);
        }
    }
    
    /**
     * Gets the "externalDependencies" attribute
     */
    public boolean getExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALDEPENDENCIES$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "externalDependencies" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTERNALDEPENDENCIES$4);
            return target;
        }
    }
    
    /**
     * True if has "externalDependencies" attribute
     */
    public boolean isSetExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTERNALDEPENDENCIES$4) != null;
        }
    }
    
    /**
     * Sets the "externalDependencies" attribute
     */
    public void setExternalDependencies(boolean externalDependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALDEPENDENCIES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTERNALDEPENDENCIES$4);
            }
            target.setBooleanValue(externalDependencies);
        }
    }
    
    /**
     * Sets (as xml) the "externalDependencies" attribute
     */
    public void xsetExternalDependencies(org.apache.xmlbeans.XmlBoolean externalDependencies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTERNALDEPENDENCIES$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTERNALDEPENDENCIES$4);
            }
            target.set(externalDependencies);
        }
    }
    
    /**
     * Unsets the "externalDependencies" attribute
     */
    public void unsetExternalDependencies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTERNALDEPENDENCIES$4);
        }
    }
}
