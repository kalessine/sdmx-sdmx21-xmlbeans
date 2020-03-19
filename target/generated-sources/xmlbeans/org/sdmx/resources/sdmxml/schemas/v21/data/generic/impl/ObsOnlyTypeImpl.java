/*
 * XML Type:  ObsOnlyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.generic.impl;
/**
 * An XML ObsOnlyType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic).
 *
 * This is a complex type.
 */
public class ObsOnlyTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType
{
    private static final long serialVersionUID = 1L;
    
    public ObsOnlyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBSKEY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "ObsKey");
    private static final javax.xml.namespace.QName OBSVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "ObsValue");
    private static final javax.xml.namespace.QName ATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Attributes");
    
    
    /**
     * Gets the "ObsKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType getObsKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(OBSKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObsKey" element
     */
    public void setObsKey(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType obsKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(OBSKEY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(OBSKEY$0);
            }
            target.set(obsKey);
        }
    }
    
    /**
     * Appends and returns a new empty "ObsKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType addNewObsKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(OBSKEY$0);
            return target;
        }
    }
    
    /**
     * Gets the "ObsValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType getObsValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType)get_store().find_element_user(OBSVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ObsValue" element
     */
    public boolean isSetObsValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBSVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "ObsValue" element
     */
    public void setObsValue(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType obsValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType)get_store().find_element_user(OBSVALUE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType)get_store().add_element_user(OBSVALUE$2);
            }
            target.set(obsValue);
        }
    }
    
    /**
     * Appends and returns a new empty "ObsValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType addNewObsValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsValueType)get_store().add_element_user(OBSVALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ObsValue" element
     */
    public void unsetObsValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBSVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$4) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$4);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$4, 0);
        }
    }
}
