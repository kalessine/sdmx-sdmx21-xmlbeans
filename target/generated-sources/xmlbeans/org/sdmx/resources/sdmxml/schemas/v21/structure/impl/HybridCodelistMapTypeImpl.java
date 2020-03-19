/*
 * XML Type:  HybridCodelistMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML HybridCodelistMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class HybridCodelistMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.HybridCodelistMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType
{
    private static final long serialVersionUID = 1L;
    
    public HybridCodelistMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Target");
    private static final javax.xml.namespace.QName HYBRIDCODEMAP$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "HybridCodeMap");
    
    
    /**
     * Gets the "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Target" element
     */
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AnyCodelistReferenceType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "HybridCodeMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType[] getHybridCodeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HYBRIDCODEMAP$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType getHybridCodeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType)get_store().find_element_user(HYBRIDCODEMAP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HybridCodeMap" element
     */
    public int sizeOfHybridCodeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYBRIDCODEMAP$4);
        }
    }
    
    /**
     * Sets array of all "HybridCodeMap" element
     */
    public void setHybridCodeMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType[] hybridCodeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hybridCodeMapArray, HYBRIDCODEMAP$4);
        }
    }
    
    /**
     * Sets ith "HybridCodeMap" element
     */
    public void setHybridCodeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType hybridCodeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType)get_store().find_element_user(HYBRIDCODEMAP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hybridCodeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType insertNewHybridCodeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType)get_store().insert_element_user(HYBRIDCODEMAP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType addNewHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodeMapType)get_store().add_element_user(HYBRIDCODEMAP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "HybridCodeMap" element
     */
    public void removeHybridCodeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYBRIDCODEMAP$4, i);
        }
    }
}
