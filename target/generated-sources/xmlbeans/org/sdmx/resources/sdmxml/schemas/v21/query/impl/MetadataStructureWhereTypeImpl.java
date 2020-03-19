/*
 * XML Type:  MetadataStructureWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataStructureWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataStructureWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.MetadataStructureWhereBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataStructureWhereType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataStructureWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATATARGETWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataTargetWhere");
    private static final javax.xml.namespace.QName TARGETOBJECTWHERE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectWhere");
    private static final javax.xml.namespace.QName REPORTSTRUCTUREWHERE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportStructureWhere");
    private static final javax.xml.namespace.QName METADATAATTRIBUTEWHERE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeWhere");
    
    
    /**
     * Gets array of all "MetadataTargetWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType[] getMetadataTargetWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATARGETWHERE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataTargetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType getMetadataTargetWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().find_element_user(METADATATARGETWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataTargetWhere" element
     */
    public int sizeOfMetadataTargetWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATARGETWHERE$0);
        }
    }
    
    /**
     * Sets array of all "MetadataTargetWhere" element
     */
    public void setMetadataTargetWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType[] metadataTargetWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataTargetWhereArray, METADATATARGETWHERE$0);
        }
    }
    
    /**
     * Sets ith "MetadataTargetWhere" element
     */
    public void setMetadataTargetWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType metadataTargetWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().find_element_user(METADATATARGETWHERE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataTargetWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType insertNewMetadataTargetWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().insert_element_user(METADATATARGETWHERE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType addNewMetadataTargetWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetWhereType)get_store().add_element_user(METADATATARGETWHERE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataTargetWhere" element
     */
    public void removeMetadataTargetWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATARGETWHERE$0, i);
        }
    }
    
    /**
     * Gets array of all "TargetObjectWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[] getTargetObjectWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGETOBJECTWHERE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType getTargetObjectWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().find_element_user(TARGETOBJECTWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TargetObjectWhere" element
     */
    public int sizeOfTargetObjectWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETOBJECTWHERE$2);
        }
    }
    
    /**
     * Sets array of all "TargetObjectWhere" element
     */
    public void setTargetObjectWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType[] targetObjectWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetObjectWhereArray, TARGETOBJECTWHERE$2);
        }
    }
    
    /**
     * Sets ith "TargetObjectWhere" element
     */
    public void setTargetObjectWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType targetObjectWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().find_element_user(TARGETOBJECTWHERE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetObjectWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType insertNewTargetObjectWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().insert_element_user(TARGETOBJECTWHERE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TargetObjectWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType addNewTargetObjectWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectWhereType)get_store().add_element_user(TARGETOBJECTWHERE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TargetObjectWhere" element
     */
    public void removeTargetObjectWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETOBJECTWHERE$2, i);
        }
    }
    
    /**
     * Gets array of all "ReportStructureWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType[] getReportStructureWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTSTRUCTUREWHERE$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType getReportStructureWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().find_element_user(REPORTSTRUCTUREWHERE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportStructureWhere" element
     */
    public int sizeOfReportStructureWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSTRUCTUREWHERE$4);
        }
    }
    
    /**
     * Sets array of all "ReportStructureWhere" element
     */
    public void setReportStructureWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType[] reportStructureWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportStructureWhereArray, REPORTSTRUCTUREWHERE$4);
        }
    }
    
    /**
     * Sets ith "ReportStructureWhere" element
     */
    public void setReportStructureWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType reportStructureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().find_element_user(REPORTSTRUCTUREWHERE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportStructureWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType insertNewReportStructureWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().insert_element_user(REPORTSTRUCTUREWHERE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType addNewReportStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureWhereType)get_store().add_element_user(REPORTSTRUCTUREWHERE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportStructureWhere" element
     */
    public void removeReportStructureWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSTRUCTUREWHERE$4, i);
        }
    }
    
    /**
     * Gets array of all "MetadataAttributeWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[] getMetadataAttributeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAATTRIBUTEWHERE$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType getMetadataAttributeWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().find_element_user(METADATAATTRIBUTEWHERE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataAttributeWhere" element
     */
    public int sizeOfMetadataAttributeWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAATTRIBUTEWHERE$6);
        }
    }
    
    /**
     * Sets array of all "MetadataAttributeWhere" element
     */
    public void setMetadataAttributeWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType[] metadataAttributeWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataAttributeWhereArray, METADATAATTRIBUTEWHERE$6);
        }
    }
    
    /**
     * Sets ith "MetadataAttributeWhere" element
     */
    public void setMetadataAttributeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType metadataAttributeWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().find_element_user(METADATAATTRIBUTEWHERE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataAttributeWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType insertNewMetadataAttributeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().insert_element_user(METADATAATTRIBUTEWHERE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttributeWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType addNewMetadataAttributeWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataAttributeWhereType)get_store().add_element_user(METADATAATTRIBUTEWHERE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataAttributeWhere" element
     */
    public void removeMetadataAttributeWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAATTRIBUTEWHERE$6, i);
        }
    }
}
