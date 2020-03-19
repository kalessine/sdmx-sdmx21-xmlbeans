/*
 * XML Type:  ItemSchemeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ItemSchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ItemSchemeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ItemSchemeMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeMapBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ItemSchemeMapType
{
    private static final long serialVersionUID = 1L;
    
    public ItemSchemeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Target");
    private static final javax.xml.namespace.QName ITEMASSOCIATION$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ItemAssociation");
    private static final org.apache.xmlbeans.QNameSet ITEMASSOCIATION$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingCategoryMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategoryMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodeMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ItemAssociation"),
    });
    
    
    /**
     * Gets the "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(SOURCE$0, 0);
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
    public void setSource(org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "Source" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(TARGET$2, 0);
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
    public void setTarget(org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(TARGET$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(TARGET$2);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "Target" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "ItemAssociation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType[] getItemAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEMASSOCIATION$5, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ItemAssociation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType getItemAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().find_element_user(ITEMASSOCIATION$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ItemAssociation" element
     */
    public int sizeOfItemAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMASSOCIATION$5);
        }
    }
    
    /**
     * Sets array of all "ItemAssociation" element
     */
    public void setItemAssociationArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType[] itemAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemAssociationArray, ITEMASSOCIATION$4, ITEMASSOCIATION$5);
        }
    }
    
    /**
     * Sets ith "ItemAssociation" element
     */
    public void setItemAssociationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType itemAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().find_element_user(ITEMASSOCIATION$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(itemAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ItemAssociation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType insertNewItemAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().insert_element_user(ITEMASSOCIATION$5, ITEMASSOCIATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ItemAssociation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType addNewItemAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().add_element_user(ITEMASSOCIATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ItemAssociation" element
     */
    public void removeItemAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMASSOCIATION$5, i);
        }
    }
}
