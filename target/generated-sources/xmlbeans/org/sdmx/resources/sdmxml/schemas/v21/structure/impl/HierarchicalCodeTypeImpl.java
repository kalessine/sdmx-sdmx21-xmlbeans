/*
 * XML Type:  HierarchicalCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML HierarchicalCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class HierarchicalCodeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.HierarchicalCodeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Code");
    private static final javax.xml.namespace.QName CODELISTALIASREF$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodelistAliasRef");
    private static final javax.xml.namespace.QName CODEID$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodeID");
    private static final javax.xml.namespace.QName HIERARCHICALCODE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "HierarchicalCode");
    private static final javax.xml.namespace.QName LEVEL$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Level");
    private static final javax.xml.namespace.QName VERSION$10 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName VALIDFROM$12 = 
        new javax.xml.namespace.QName("", "validFrom");
    private static final javax.xml.namespace.QName VALIDTO$14 = 
        new javax.xml.namespace.QName("", "validTo");
    
    
    /**
     * Gets the "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$0) != 0;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Appends and returns a new empty "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$0, 0);
        }
    }
    
    /**
     * Gets the "CodelistAliasRef" element
     */
    public java.lang.String getCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODELISTALIASREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodelistAliasRef" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(CODELISTALIASREF$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodelistAliasRef" element
     */
    public boolean isSetCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTALIASREF$2) != 0;
        }
    }
    
    /**
     * Sets the "CodelistAliasRef" element
     */
    public void setCodelistAliasRef(java.lang.String codelistAliasRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODELISTALIASREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODELISTALIASREF$2);
            }
            target.setStringValue(codelistAliasRef);
        }
    }
    
    /**
     * Sets (as xml) the "CodelistAliasRef" element
     */
    public void xsetCodelistAliasRef(org.sdmx.resources.sdmxml.schemas.v21.common.IDType codelistAliasRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_element_user(CODELISTALIASREF$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_element_user(CODELISTALIASREF$2);
            }
            target.set(codelistAliasRef);
        }
    }
    
    /**
     * Unsets the "CodelistAliasRef" element
     */
    public void unsetCodelistAliasRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTALIASREF$2, 0);
        }
    }
    
    /**
     * Gets the "CodeID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType getCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType)get_store().find_element_user(CODEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodeID" element
     */
    public boolean isSetCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEID$4) != 0;
        }
    }
    
    /**
     * Sets the "CodeID" element
     */
    public void setCodeID(org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType codeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType)get_store().find_element_user(CODEID$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType)get_store().add_element_user(CODEID$4);
            }
            target.set(codeID);
        }
    }
    
    /**
     * Appends and returns a new empty "CodeID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType addNewCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType)get_store().add_element_user(CODEID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CodeID" element
     */
    public void unsetCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEID$4, 0);
        }
    }
    
    /**
     * Gets array of all "HierarchicalCode" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] getHierarchicalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIERARCHICALCODE$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType getHierarchicalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().find_element_user(HIERARCHICALCODE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HierarchicalCode" element
     */
    public int sizeOfHierarchicalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODE$6);
        }
    }
    
    /**
     * Sets array of all "HierarchicalCode" element
     */
    public void setHierarchicalCodeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] hierarchicalCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hierarchicalCodeArray, HIERARCHICALCODE$6);
        }
    }
    
    /**
     * Sets ith "HierarchicalCode" element
     */
    public void setHierarchicalCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType hierarchicalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().find_element_user(HIERARCHICALCODE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hierarchicalCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType insertNewHierarchicalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().insert_element_user(HIERARCHICALCODE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType addNewHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType)get_store().add_element_user(HIERARCHICALCODE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "HierarchicalCode" element
     */
    public void removeHierarchicalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODE$6, i);
        }
    }
    
    /**
     * Gets the "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType)get_store().find_element_user(LEVEL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Level" element
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEVEL$8) != 0;
        }
    }
    
    /**
     * Sets the "Level" element
     */
    public void setLevel(org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType)get_store().find_element_user(LEVEL$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType)get_store().add_element_user(LEVEL$8);
            }
            target.set(level);
        }
    }
    
    /**
     * Appends and returns a new empty "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType addNewLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType)get_store().add_element_user(LEVEL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Level" element
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEVEL$8, 0);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.VersionType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(VERSION$10);
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$10) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$10);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.sdmx.resources.sdmxml.schemas.v21.common.VersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.VersionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().find_attribute_user(VERSION$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.VersionType)get_store().add_attribute_user(VERSION$10);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$10);
        }
    }
    
    /**
     * Gets the "validFrom" attribute
     */
    public java.util.Calendar getValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$12);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validFrom" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$12);
            return target;
        }
    }
    
    /**
     * True if has "validFrom" attribute
     */
    public boolean isSetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROM$12) != null;
        }
    }
    
    /**
     * Sets the "validFrom" attribute
     */
    public void setValidFrom(java.util.Calendar validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$12);
            }
            target.setCalendarValue(validFrom);
        }
    }
    
    /**
     * Sets (as xml) the "validFrom" attribute
     */
    public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$12);
            }
            target.set(validFrom);
        }
    }
    
    /**
     * Unsets the "validFrom" attribute
     */
    public void unsetValidFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROM$12);
        }
    }
    
    /**
     * Gets the "validTo" attribute
     */
    public java.util.Calendar getValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$14);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validTo" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$14);
            return target;
        }
    }
    
    /**
     * True if has "validTo" attribute
     */
    public boolean isSetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTO$14) != null;
        }
    }
    
    /**
     * Sets the "validTo" attribute
     */
    public void setValidTo(java.util.Calendar validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$14);
            }
            target.setCalendarValue(validTo);
        }
    }
    
    /**
     * Sets (as xml) the "validTo" attribute
     */
    public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$14);
            }
            target.set(validTo);
        }
    }
    
    /**
     * Unsets the "validTo" attribute
     */
    public void unsetValidTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTO$14);
        }
    }
}
