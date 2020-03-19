/*
 * XML Type:  ReferencesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ReferencesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ReferencesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType
{
    private static final long serialVersionUID = 1L;
    
    public ReferencesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "None");
    private static final javax.xml.namespace.QName ALL$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "All");
    private static final javax.xml.namespace.QName PARENTS$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Parents");
    private static final javax.xml.namespace.QName PARENTSANDSIBLINGS$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ParentsAndSiblings");
    private static final javax.xml.namespace.QName CHILDREN$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Children");
    private static final javax.xml.namespace.QName DESCENDANTS$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Descendants");
    private static final javax.xml.namespace.QName SPECIFICOBJECTS$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "SpecificObjects");
    private static final javax.xml.namespace.QName PROCESSCONSTRAINTS$14 = 
        new javax.xml.namespace.QName("", "processConstraints");
    private static final javax.xml.namespace.QName DETAIL$16 = 
        new javax.xml.namespace.QName("", "detail");
    
    
    /**
     * Gets the "None" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(NONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "None" element
     */
    public boolean isSetNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONE$0) != 0;
        }
    }
    
    /**
     * Sets the "None" element
     */
    public void setNone(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType none)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(NONE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(NONE$0);
            }
            target.set(none);
        }
    }
    
    /**
     * Appends and returns a new empty "None" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(NONE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "None" element
     */
    public void unsetNone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONE$0, 0);
        }
    }
    
    /**
     * Gets the "All" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "All" element
     */
    public boolean isSetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALL$2) != 0;
        }
    }
    
    /**
     * Sets the "All" element
     */
    public void setAll(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType all)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ALL$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALL$2);
            }
            target.set(all);
        }
    }
    
    /**
     * Appends and returns a new empty "All" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ALL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "All" element
     */
    public void unsetAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALL$2, 0);
        }
    }
    
    /**
     * Gets the "Parents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getParents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PARENTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Parents" element
     */
    public boolean isSetParents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTS$4) != 0;
        }
    }
    
    /**
     * Sets the "Parents" element
     */
    public void setParents(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType parents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PARENTS$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PARENTS$4);
            }
            target.set(parents);
        }
    }
    
    /**
     * Appends and returns a new empty "Parents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewParents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PARENTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Parents" element
     */
    public void unsetParents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTS$4, 0);
        }
    }
    
    /**
     * Gets the "ParentsAndSiblings" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getParentsAndSiblings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PARENTSANDSIBLINGS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ParentsAndSiblings" element
     */
    public boolean isSetParentsAndSiblings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTSANDSIBLINGS$6) != 0;
        }
    }
    
    /**
     * Sets the "ParentsAndSiblings" element
     */
    public void setParentsAndSiblings(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType parentsAndSiblings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PARENTSANDSIBLINGS$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PARENTSANDSIBLINGS$6);
            }
            target.set(parentsAndSiblings);
        }
    }
    
    /**
     * Appends and returns a new empty "ParentsAndSiblings" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewParentsAndSiblings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PARENTSANDSIBLINGS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ParentsAndSiblings" element
     */
    public void unsetParentsAndSiblings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTSANDSIBLINGS$6, 0);
        }
    }
    
    /**
     * Gets the "Children" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CHILDREN$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Children" element
     */
    public boolean isSetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDREN$8) != 0;
        }
    }
    
    /**
     * Sets the "Children" element
     */
    public void setChildren(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType children)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CHILDREN$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CHILDREN$8);
            }
            target.set(children);
        }
    }
    
    /**
     * Appends and returns a new empty "Children" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CHILDREN$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Children" element
     */
    public void unsetChildren()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDREN$8, 0);
        }
    }
    
    /**
     * Gets the "Descendants" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDescendants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DESCENDANTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Descendants" element
     */
    public boolean isSetDescendants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCENDANTS$10) != 0;
        }
    }
    
    /**
     * Sets the "Descendants" element
     */
    public void setDescendants(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType descendants)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DESCENDANTS$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DESCENDANTS$10);
            }
            target.set(descendants);
        }
    }
    
    /**
     * Appends and returns a new empty "Descendants" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDescendants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DESCENDANTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Descendants" element
     */
    public void unsetDescendants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCENDANTS$10, 0);
        }
    }
    
    /**
     * Gets the "SpecificObjects" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType getSpecificObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType)get_store().find_element_user(SPECIFICOBJECTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SpecificObjects" element
     */
    public boolean isSetSpecificObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIFICOBJECTS$12) != 0;
        }
    }
    
    /**
     * Sets the "SpecificObjects" element
     */
    public void setSpecificObjects(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType specificObjects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType)get_store().find_element_user(SPECIFICOBJECTS$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType)get_store().add_element_user(SPECIFICOBJECTS$12);
            }
            target.set(specificObjects);
        }
    }
    
    /**
     * Appends and returns a new empty "SpecificObjects" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType addNewSpecificObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType)get_store().add_element_user(SPECIFICOBJECTS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "SpecificObjects" element
     */
    public void unsetSpecificObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIFICOBJECTS$12, 0);
        }
    }
    
    /**
     * Gets the "processConstraints" attribute
     */
    public boolean getProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSCONSTRAINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROCESSCONSTRAINTS$14);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "processConstraints" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROCESSCONSTRAINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PROCESSCONSTRAINTS$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "processConstraints" attribute
     */
    public boolean isSetProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROCESSCONSTRAINTS$14) != null;
        }
    }
    
    /**
     * Sets the "processConstraints" attribute
     */
    public void setProcessConstraints(boolean processConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSCONSTRAINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESSCONSTRAINTS$14);
            }
            target.setBooleanValue(processConstraints);
        }
    }
    
    /**
     * Sets (as xml) the "processConstraints" attribute
     */
    public void xsetProcessConstraints(org.apache.xmlbeans.XmlBoolean processConstraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PROCESSCONSTRAINTS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PROCESSCONSTRAINTS$14);
            }
            target.set(processConstraints);
        }
    }
    
    /**
     * Unsets the "processConstraints" attribute
     */
    public void unsetProcessConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROCESSCONSTRAINTS$14);
        }
    }
    
    /**
     * Gets the "detail" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailType.Enum getDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DETAIL$16);
            }
            if (target == null)
            {
                return null;
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "detail" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType xgetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType)get_store().find_attribute_user(DETAIL$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType)get_default_attribute_value(DETAIL$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "detail" attribute
     */
    public boolean isSetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETAIL$16) != null;
        }
    }
    
    /**
     * Sets the "detail" attribute
     */
    public void setDetail(org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailType.Enum detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAIL$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAIL$16);
            }
            target.setEnumValue(detail);
        }
    }
    
    /**
     * Sets (as xml) the "detail" attribute
     */
    public void xsetDetail(org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType detail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType)get_store().find_attribute_user(DETAIL$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType)get_store().add_attribute_user(DETAIL$16);
            }
            target.set(detail);
        }
    }
    
    /**
     * Unsets the "detail" attribute
     */
    public void unsetDetail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETAIL$16);
        }
    }
}
