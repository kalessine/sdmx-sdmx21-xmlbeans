/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmitStructureRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURELOCATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StructureLocation");
    private static final javax.xml.namespace.QName STRUCTURES$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Structures");
    private static final javax.xml.namespace.QName SUBMITTEDSTRUCTURE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubmittedStructure");
    private static final javax.xml.namespace.QName ACTION$6 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName EXTERNALDEPENDENCIES$8 = 
        new javax.xml.namespace.QName("", "externalDependencies");
    
    
    /**
     * Gets the "StructureLocation" element
     */
    public java.lang.String getStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StructureLocation" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "StructureLocation" element
     */
    public boolean isSetStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURELOCATION$0) != 0;
        }
    }
    
    /**
     * Sets the "StructureLocation" element
     */
    public void setStructureLocation(java.lang.String structureLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRUCTURELOCATION$0);
            }
            target.setStringValue(structureLocation);
        }
    }
    
    /**
     * Sets (as xml) the "StructureLocation" element
     */
    public void xsetStructureLocation(org.apache.xmlbeans.XmlAnyURI structureLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(STRUCTURELOCATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(STRUCTURELOCATION$0);
            }
            target.set(structureLocation);
        }
    }
    
    /**
     * Unsets the "StructureLocation" element
     */
    public void unsetStructureLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURELOCATION$0, 0);
        }
    }
    
    /**
     * Gets the "Structures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType getStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().find_element_user(STRUCTURES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Structures" element
     */
    public boolean isSetStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURES$2) != 0;
        }
    }
    
    /**
     * Sets the "Structures" element
     */
    public void setStructures(org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType structures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().find_element_user(STRUCTURES$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().add_element_user(STRUCTURES$2);
            }
            target.set(structures);
        }
    }
    
    /**
     * Appends and returns a new empty "Structures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType addNewStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType)get_store().add_element_user(STRUCTURES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Structures" element
     */
    public void unsetStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURES$2, 0);
        }
    }
    
    /**
     * Gets array of all "SubmittedStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType[] getSubmittedStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBMITTEDSTRUCTURE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType getSubmittedStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().find_element_user(SUBMITTEDSTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubmittedStructure" element
     */
    public int sizeOfSubmittedStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITTEDSTRUCTURE$4);
        }
    }
    
    /**
     * Sets array of all "SubmittedStructure" element
     */
    public void setSubmittedStructureArray(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType[] submittedStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(submittedStructureArray, SUBMITTEDSTRUCTURE$4);
        }
    }
    
    /**
     * Sets ith "SubmittedStructure" element
     */
    public void setSubmittedStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType submittedStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().find_element_user(SUBMITTEDSTRUCTURE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(submittedStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType insertNewSubmittedStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().insert_element_user(SUBMITTEDSTRUCTURE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType addNewSubmittedStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().add_element_user(SUBMITTEDSTRUCTURE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubmittedStructure" element
     */
    public void removeSubmittedStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITTEDSTRUCTURE$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ACTION$6);
            }
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_default_attribute_value(ACTION$6);
            }
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
            return get_store().find_attribute_user(ACTION$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$6);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_attribute_user(ACTION$6);
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
            get_store().remove_attribute(ACTION$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALDEPENDENCIES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTERNALDEPENDENCIES$8);
            }
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTERNALDEPENDENCIES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(EXTERNALDEPENDENCIES$8);
            }
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
            return get_store().find_attribute_user(EXTERNALDEPENDENCIES$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALDEPENDENCIES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTERNALDEPENDENCIES$8);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(EXTERNALDEPENDENCIES$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(EXTERNALDEPENDENCIES$8);
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
            get_store().remove_attribute(EXTERNALDEPENDENCIES$8);
        }
    }
}
