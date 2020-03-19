/*
 * XML Type:  CategorisationWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML CategorisationWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class CategorisationWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.CategorisationWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType
{
    private static final long serialVersionUID = 1L;
    
    public CategorisationWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYSCHEME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategoryScheme");
    private static final javax.xml.namespace.QName TARGETCATEGORY$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetCategory");
    private static final javax.xml.namespace.QName OBJECTREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ObjectReference");
    private static final javax.xml.namespace.QName CATEGORISEDOBJECTTYPE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategorisedObjectType");
    
    
    /**
     * Gets the "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType getCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType)get_store().find_element_user(CATEGORYSCHEME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategoryScheme" element
     */
    public boolean isSetCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEME$0) != 0;
        }
    }
    
    /**
     * Sets the "CategoryScheme" element
     */
    public void setCategoryScheme(org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType categoryScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType)get_store().find_element_user(CATEGORYSCHEME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType)get_store().add_element_user(CATEGORYSCHEME$0);
            }
            target.set(categoryScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType addNewCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType)get_store().add_element_user(CATEGORYSCHEME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CategoryScheme" element
     */
    public void unsetCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEME$0, 0);
        }
    }
    
    /**
     * Gets the "TargetCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getTargetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(TARGETCATEGORY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TargetCategory" element
     */
    public boolean isSetTargetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETCATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "TargetCategory" element
     */
    public void setTargetCategory(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType targetCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().find_element_user(TARGETCATEGORY$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(TARGETCATEGORY$2);
            }
            target.set(targetCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewTargetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType)get_store().add_element_user(TARGETCATEGORY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TargetCategory" element
     */
    public void unsetTargetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETCATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "ObjectReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(OBJECTREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ObjectReference" element
     */
    public boolean isSetObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "ObjectReference" element
     */
    public void setObjectReference(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType objectReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(OBJECTREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(OBJECTREFERENCE$4);
            }
            target.set(objectReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ObjectReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(OBJECTREFERENCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ObjectReference" element
     */
    public void unsetObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets array of all "CategorisedObjectType" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum[] getCategorisedObjectTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORISEDOBJECTTYPE$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CategorisedObjectType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getCategorisedObjectTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORISEDOBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CategorisedObjectType" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType[] xgetCategorisedObjectTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORISEDOBJECTTYPE$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CategorisedObjectType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType xgetCategorisedObjectTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_element_user(CATEGORISEDOBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)target;
        }
    }
    
    /**
     * Returns number of "CategorisedObjectType" element
     */
    public int sizeOfCategorisedObjectTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORISEDOBJECTTYPE$6);
        }
    }
    
    /**
     * Sets array of all "CategorisedObjectType" element
     */
    public void setCategorisedObjectTypeArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum[] categorisedObjectTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorisedObjectTypeArray, CATEGORISEDOBJECTTYPE$6);
        }
    }
    
    /**
     * Sets ith "CategorisedObjectType" element
     */
    public void setCategorisedObjectTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum categorisedObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORISEDOBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setEnumValue(categorisedObjectType);
        }
    }
    
    /**
     * Sets (as xml) array of all "CategorisedObjectType" element
     */
    public void xsetCategorisedObjectTypeArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType[]categorisedObjectTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorisedObjectTypeArray, CATEGORISEDOBJECTTYPE$6);
        }
    }
    
    /**
     * Sets (as xml) ith "CategorisedObjectType" element
     */
    public void xsetCategorisedObjectTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType categorisedObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().find_element_user(CATEGORISEDOBJECTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorisedObjectType);
        }
    }
    
    /**
     * Inserts the value as the ith "CategorisedObjectType" element
     */
    public void insertCategorisedObjectType(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum categorisedObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORISEDOBJECTTYPE$6, i);
            target.setEnumValue(categorisedObjectType);
        }
    }
    
    /**
     * Appends the value as the last "CategorisedObjectType" element
     */
    public void addCategorisedObjectType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum categorisedObjectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORISEDOBJECTTYPE$6);
            target.setEnumValue(categorisedObjectType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorisedObjectType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType insertNewCategorisedObjectType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().insert_element_user(CATEGORISEDOBJECTTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorisedObjectType" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType addNewCategorisedObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType)get_store().add_element_user(CATEGORISEDOBJECTTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorisedObjectType" element
     */
    public void removeCategorisedObjectType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORISEDOBJECTTYPE$6, i);
        }
    }
}
