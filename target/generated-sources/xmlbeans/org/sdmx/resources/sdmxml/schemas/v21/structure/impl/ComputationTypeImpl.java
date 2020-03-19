/*
 * XML Type:  ComputationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ComputationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ComputationTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType
{
    private static final long serialVersionUID = 1L;
    
    public ComputationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Description");
    private static final javax.xml.namespace.QName LOCALID$2 = 
        new javax.xml.namespace.QName("", "localID");
    private static final javax.xml.namespace.QName SOFTWAREPACKAGE$4 = 
        new javax.xml.namespace.QName("", "softwarePackage");
    private static final javax.xml.namespace.QName SOFTWARELANGUAGE$6 = 
        new javax.xml.namespace.QName("", "softwareLanguage");
    private static final javax.xml.namespace.QName SOFTWAREVERSION$8 = 
        new javax.xml.namespace.QName("", "softwareVersion");
    
    
    /**
     * Gets array of all "Description" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "Description" element
     */
    public void setDescriptionArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(LOCALID$2);
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
            return get_store().find_attribute_user(LOCALID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCALID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCALID$2);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(LOCALID$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(LOCALID$2);
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
            get_store().remove_attribute(LOCALID$2);
        }
    }
    
    /**
     * Gets the "softwarePackage" attribute
     */
    public java.lang.String getSoftwarePackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOFTWAREPACKAGE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "softwarePackage" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoftwarePackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOFTWAREPACKAGE$4);
            return target;
        }
    }
    
    /**
     * True if has "softwarePackage" attribute
     */
    public boolean isSetSoftwarePackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOFTWAREPACKAGE$4) != null;
        }
    }
    
    /**
     * Sets the "softwarePackage" attribute
     */
    public void setSoftwarePackage(java.lang.String softwarePackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOFTWAREPACKAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOFTWAREPACKAGE$4);
            }
            target.setStringValue(softwarePackage);
        }
    }
    
    /**
     * Sets (as xml) the "softwarePackage" attribute
     */
    public void xsetSoftwarePackage(org.apache.xmlbeans.XmlString softwarePackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOFTWAREPACKAGE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOFTWAREPACKAGE$4);
            }
            target.set(softwarePackage);
        }
    }
    
    /**
     * Unsets the "softwarePackage" attribute
     */
    public void unsetSoftwarePackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOFTWAREPACKAGE$4);
        }
    }
    
    /**
     * Gets the "softwareLanguage" attribute
     */
    public java.lang.String getSoftwareLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOFTWARELANGUAGE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "softwareLanguage" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoftwareLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOFTWARELANGUAGE$6);
            return target;
        }
    }
    
    /**
     * True if has "softwareLanguage" attribute
     */
    public boolean isSetSoftwareLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOFTWARELANGUAGE$6) != null;
        }
    }
    
    /**
     * Sets the "softwareLanguage" attribute
     */
    public void setSoftwareLanguage(java.lang.String softwareLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOFTWARELANGUAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOFTWARELANGUAGE$6);
            }
            target.setStringValue(softwareLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "softwareLanguage" attribute
     */
    public void xsetSoftwareLanguage(org.apache.xmlbeans.XmlString softwareLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOFTWARELANGUAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOFTWARELANGUAGE$6);
            }
            target.set(softwareLanguage);
        }
    }
    
    /**
     * Unsets the "softwareLanguage" attribute
     */
    public void unsetSoftwareLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOFTWARELANGUAGE$6);
        }
    }
    
    /**
     * Gets the "softwareVersion" attribute
     */
    public java.lang.String getSoftwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOFTWAREVERSION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "softwareVersion" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoftwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOFTWAREVERSION$8);
            return target;
        }
    }
    
    /**
     * True if has "softwareVersion" attribute
     */
    public boolean isSetSoftwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOFTWAREVERSION$8) != null;
        }
    }
    
    /**
     * Sets the "softwareVersion" attribute
     */
    public void setSoftwareVersion(java.lang.String softwareVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOFTWAREVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOFTWAREVERSION$8);
            }
            target.setStringValue(softwareVersion);
        }
    }
    
    /**
     * Sets (as xml) the "softwareVersion" attribute
     */
    public void xsetSoftwareVersion(org.apache.xmlbeans.XmlString softwareVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOFTWAREVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOFTWAREVERSION$8);
            }
            target.set(softwareVersion);
        }
    }
    
    /**
     * Unsets the "softwareVersion" attribute
     */
    public void unsetSoftwareVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOFTWAREVERSION$8);
        }
    }
}
