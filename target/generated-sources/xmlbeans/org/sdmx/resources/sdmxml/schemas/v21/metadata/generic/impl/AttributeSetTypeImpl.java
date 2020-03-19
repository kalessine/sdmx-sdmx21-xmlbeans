/*
 * XML Type:  AttributeSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.impl;
/**
 * An XML AttributeSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic).
 *
 * This is a complex type.
 */
public class AttributeSetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType
{
    private static final long serialVersionUID = 1L;
    
    public AttributeSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTEDATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "ReportedAttribute");
    
    
    /**
     * Gets array of all "ReportedAttribute" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType[] getReportedAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTEDATTRIBUTE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType[] result = new org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportedAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType getReportedAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType)get_store().find_element_user(REPORTEDATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportedAttribute" element
     */
    public int sizeOfReportedAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTEDATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "ReportedAttribute" element
     */
    public void setReportedAttributeArray(org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType[] reportedAttributeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportedAttributeArray, REPORTEDATTRIBUTE$0);
        }
    }
    
    /**
     * Sets ith "ReportedAttribute" element
     */
    public void setReportedAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType reportedAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType)get_store().find_element_user(REPORTEDATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportedAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportedAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType insertNewReportedAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType)get_store().insert_element_user(REPORTEDATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportedAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType addNewReportedAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType)get_store().add_element_user(REPORTEDATTRIBUTE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportedAttribute" element
     */
    public void removeReportedAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTEDATTRIBUTE$0, i);
        }
    }
}
