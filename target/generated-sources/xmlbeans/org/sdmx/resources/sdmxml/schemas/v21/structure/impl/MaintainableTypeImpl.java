/*
 * XML Type:  MaintainableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MaintainableType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MaintainableTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MaintainableBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType
{
    private static final long serialVersionUID = 1L;
    
    public MaintainableTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCYID$0 = 
        new javax.xml.namespace.QName("", "agencyID");
    private static final javax.xml.namespace.QName ISFINAL$2 = 
        new javax.xml.namespace.QName("", "isFinal");
    private static final javax.xml.namespace.QName ISEXTERNALREFERENCE$4 = 
        new javax.xml.namespace.QName("", "isExternalReference");
    private static final javax.xml.namespace.QName SERVICEURL$6 = 
        new javax.xml.namespace.QName("", "serviceURL");
    private static final javax.xml.namespace.QName STRUCTUREURL$8 = 
        new javax.xml.namespace.QName("", "structureURL");
    
    
    /**
     * Gets the "agencyID" attribute
     */
    public java.lang.String getAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "agencyID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType xgetAgencyID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().find_attribute_user(AGENCYID$0);
            return target;
        }
    }
    
    /**
     * Sets the "agencyID" attribute
     */
    public void setAgencyID(java.lang.String agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGENCYID$0);
            }
            target.setStringValue(agencyID);
        }
    }
    
    /**
     * Sets (as xml) the "agencyID" attribute
     */
    public void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType agencyID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().find_attribute_user(AGENCYID$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType)get_store().add_attribute_user(AGENCYID$0);
            }
            target.set(agencyID);
        }
    }
    
    /**
     * Gets the "isFinal" attribute
     */
    public boolean getIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFINAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISFINAL$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isFinal" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFINAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISFINAL$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "isFinal" attribute
     */
    public boolean isSetIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISFINAL$2) != null;
        }
    }
    
    /**
     * Sets the "isFinal" attribute
     */
    public void setIsFinal(boolean isFinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFINAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFINAL$2);
            }
            target.setBooleanValue(isFinal);
        }
    }
    
    /**
     * Sets (as xml) the "isFinal" attribute
     */
    public void xsetIsFinal(org.apache.xmlbeans.XmlBoolean isFinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFINAL$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFINAL$2);
            }
            target.set(isFinal);
        }
    }
    
    /**
     * Unsets the "isFinal" attribute
     */
    public void unsetIsFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISFINAL$2);
        }
    }
    
    /**
     * Gets the "isExternalReference" attribute
     */
    public boolean getIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTERNALREFERENCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISEXTERNALREFERENCE$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isExternalReference" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTERNALREFERENCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISEXTERNALREFERENCE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "isExternalReference" attribute
     */
    public boolean isSetIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISEXTERNALREFERENCE$4) != null;
        }
    }
    
    /**
     * Sets the "isExternalReference" attribute
     */
    public void setIsExternalReference(boolean isExternalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISEXTERNALREFERENCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISEXTERNALREFERENCE$4);
            }
            target.setBooleanValue(isExternalReference);
        }
    }
    
    /**
     * Sets (as xml) the "isExternalReference" attribute
     */
    public void xsetIsExternalReference(org.apache.xmlbeans.XmlBoolean isExternalReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISEXTERNALREFERENCE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISEXTERNALREFERENCE$4);
            }
            target.set(isExternalReference);
        }
    }
    
    /**
     * Unsets the "isExternalReference" attribute
     */
    public void unsetIsExternalReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISEXTERNALREFERENCE$4);
        }
    }
    
    /**
     * Gets the "serviceURL" attribute
     */
    public java.lang.String getServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICEURL$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SERVICEURL$6);
            return target;
        }
    }
    
    /**
     * True if has "serviceURL" attribute
     */
    public boolean isSetServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SERVICEURL$6) != null;
        }
    }
    
    /**
     * Sets the "serviceURL" attribute
     */
    public void setServiceURL(java.lang.String serviceURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICEURL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICEURL$6);
            }
            target.setStringValue(serviceURL);
        }
    }
    
    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    public void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SERVICEURL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SERVICEURL$6);
            }
            target.set(serviceURL);
        }
    }
    
    /**
     * Unsets the "serviceURL" attribute
     */
    public void unsetServiceURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SERVICEURL$6);
        }
    }
    
    /**
     * Gets the "structureURL" attribute
     */
    public java.lang.String getStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREURL$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "structureURL" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(STRUCTUREURL$8);
            return target;
        }
    }
    
    /**
     * True if has "structureURL" attribute
     */
    public boolean isSetStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STRUCTUREURL$8) != null;
        }
    }
    
    /**
     * Sets the "structureURL" attribute
     */
    public void setStructureURL(java.lang.String structureURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREURL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREURL$8);
            }
            target.setStringValue(structureURL);
        }
    }
    
    /**
     * Sets (as xml) the "structureURL" attribute
     */
    public void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(STRUCTUREURL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(STRUCTUREURL$8);
            }
            target.set(structureURL);
        }
    }
    
    /**
     * Unsets the "structureURL" attribute
     */
    public void unsetStructureURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STRUCTUREURL$8);
        }
    }
}
