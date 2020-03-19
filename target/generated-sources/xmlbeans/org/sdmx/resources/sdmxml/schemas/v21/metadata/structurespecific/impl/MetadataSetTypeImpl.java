/*
 * XML Type:  MetadataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.impl;
/**
 * An XML MetadataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific).
 *
 * This is a complex type.
 */
public class MetadataSetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.MetadataSetType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Name");
    private static final javax.xml.namespace.QName DATAPROVIDER$2 = 
        new javax.xml.namespace.QName("", "DataProvider");
    private static final javax.xml.namespace.QName REPORT$4 = 
        new javax.xml.namespace.QName("", "Report");
    private static final javax.xml.namespace.QName STRUCTUREREF$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "structureRef");
    private static final javax.xml.namespace.QName SETID$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "setID");
    private static final javax.xml.namespace.QName ACTION$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "action");
    private static final javax.xml.namespace.QName REPORTINGBEGINDATE$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "reportingBeginDate");
    private static final javax.xml.namespace.QName REPORTINGENDDATE$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "reportingEndDate");
    private static final javax.xml.namespace.QName VALIDFROMDATE$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "validFromDate");
    private static final javax.xml.namespace.QName VALIDTODATE$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "validToDate");
    private static final javax.xml.namespace.QName PUBLICATIONYEAR$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "publicationYear");
    private static final javax.xml.namespace.QName PUBLICATIONPERIOD$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/structurespecific", "publicationPeriod");
    
    
    /**
     * Gets array of all "Name" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0);
        }
    }
    
    /**
     * Sets array of all "Name" element
     */
    public void setNameArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$0);
        }
    }
    
    /**
     * Sets ith "Name" element
     */
    public void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().find_element_user(NAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().insert_element_user(NAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.TextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.TextType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, i);
        }
    }
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProvider" element
     */
    public boolean isSetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$2) != 0;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$2);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataProvider" element
     */
    public void unsetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$2, 0);
        }
    }
    
    /**
     * Gets array of all "Report" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType[] getReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORT$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType[] result = new org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Report" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType getReportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType)get_store().find_element_user(REPORT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Report" element
     */
    public int sizeOfReportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORT$4);
        }
    }
    
    /**
     * Sets array of all "Report" element
     */
    public void setReportArray(org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType[] reportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportArray, REPORT$4);
        }
    }
    
    /**
     * Sets ith "Report" element
     */
    public void setReportArray(int i, org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType)get_store().find_element_user(REPORT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(report);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Report" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType insertNewReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType)get_store().insert_element_user(REPORT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Report" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType addNewReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.metadata.structurespecific.ReportType)get_store().add_element_user(REPORT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Report" element
     */
    public void removeReport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORT$4, i);
        }
    }
    
    /**
     * Gets the "structureRef" attribute
     */
    public java.lang.String getStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "structureRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetStructureRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(STRUCTUREREF$6);
            return target;
        }
    }
    
    /**
     * Sets the "structureRef" attribute
     */
    public void setStructureRef(java.lang.String structureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREREF$6);
            }
            target.setStringValue(structureRef);
        }
    }
    
    /**
     * Sets (as xml) the "structureRef" attribute
     */
    public void xsetStructureRef(org.apache.xmlbeans.XmlIDREF structureRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(STRUCTUREREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(STRUCTUREREF$6);
            }
            target.set(structureRef);
        }
    }
    
    /**
     * Gets the "setID" attribute
     */
    public java.lang.String getSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "setID" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(SETID$8);
            return target;
        }
    }
    
    /**
     * True if has "setID" attribute
     */
    public boolean isSetSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SETID$8) != null;
        }
    }
    
    /**
     * Sets the "setID" attribute
     */
    public void setSetID(java.lang.String setID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETID$8);
            }
            target.setStringValue(setID);
        }
    }
    
    /**
     * Sets (as xml) the "setID" attribute
     */
    public void xsetSetID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType setID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(SETID$8);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(SETID$8);
            }
            target.set(setID);
        }
    }
    
    /**
     * Unsets the "setID" attribute
     */
    public void unsetSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SETID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$10);
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
            return get_store().find_attribute_user(ACTION$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_attribute_user(ACTION$10);
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
            get_store().remove_attribute(ACTION$10);
        }
    }
    
    /**
     * Gets the "reportingBeginDate" attribute
     */
    public java.util.Calendar getReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$12);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType xgetReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$12);
            return target;
        }
    }
    
    /**
     * True if has "reportingBeginDate" attribute
     */
    public boolean isSetReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTINGBEGINDATE$12) != null;
        }
    }
    
    /**
     * Sets the "reportingBeginDate" attribute
     */
    public void setReportingBeginDate(java.util.Calendar reportingBeginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGBEGINDATE$12);
            }
            target.setCalendarValue(reportingBeginDate);
        }
    }
    
    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    public void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType reportingBeginDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().add_attribute_user(REPORTINGBEGINDATE$12);
            }
            target.set(reportingBeginDate);
        }
    }
    
    /**
     * Unsets the "reportingBeginDate" attribute
     */
    public void unsetReportingBeginDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTINGBEGINDATE$12);
        }
    }
    
    /**
     * Gets the "reportingEndDate" attribute
     */
    public java.util.Calendar getReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$14);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType xgetReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$14);
            return target;
        }
    }
    
    /**
     * True if has "reportingEndDate" attribute
     */
    public boolean isSetReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPORTINGENDDATE$14) != null;
        }
    }
    
    /**
     * Sets the "reportingEndDate" attribute
     */
    public void setReportingEndDate(java.util.Calendar reportingEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGENDDATE$14);
            }
            target.setCalendarValue(reportingEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    public void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType reportingEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().add_attribute_user(REPORTINGENDDATE$14);
            }
            target.set(reportingEndDate);
        }
    }
    
    /**
     * Unsets the "reportingEndDate" attribute
     */
    public void unsetReportingEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPORTINGENDDATE$14);
        }
    }
    
    /**
     * Gets the "validFromDate" attribute
     */
    public java.util.Calendar getValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$16);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validFromDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROMDATE$16);
            return target;
        }
    }
    
    /**
     * True if has "validFromDate" attribute
     */
    public boolean isSetValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDFROMDATE$16) != null;
        }
    }
    
    /**
     * Sets the "validFromDate" attribute
     */
    public void setValidFromDate(java.util.Calendar validFromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROMDATE$16);
            }
            target.setCalendarValue(validFromDate);
        }
    }
    
    /**
     * Sets (as xml) the "validFromDate" attribute
     */
    public void xsetValidFromDate(org.apache.xmlbeans.XmlDateTime validFromDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROMDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROMDATE$16);
            }
            target.set(validFromDate);
        }
    }
    
    /**
     * Unsets the "validFromDate" attribute
     */
    public void unsetValidFromDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDFROMDATE$16);
        }
    }
    
    /**
     * Gets the "validToDate" attribute
     */
    public java.util.Calendar getValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$18);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validToDate" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTODATE$18);
            return target;
        }
    }
    
    /**
     * True if has "validToDate" attribute
     */
    public boolean isSetValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTODATE$18) != null;
        }
    }
    
    /**
     * Sets the "validToDate" attribute
     */
    public void setValidToDate(java.util.Calendar validToDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTODATE$18);
            }
            target.setCalendarValue(validToDate);
        }
    }
    
    /**
     * Sets (as xml) the "validToDate" attribute
     */
    public void xsetValidToDate(org.apache.xmlbeans.XmlDateTime validToDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTODATE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTODATE$18);
            }
            target.set(validToDate);
        }
    }
    
    /**
     * Unsets the "validToDate" attribute
     */
    public void unsetValidToDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTODATE$18);
        }
    }
    
    /**
     * Gets the "publicationYear" attribute
     */
    public java.util.Calendar getPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$20);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    public org.apache.xmlbeans.XmlGYear xgetPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$20);
            return target;
        }
    }
    
    /**
     * True if has "publicationYear" attribute
     */
    public boolean isSetPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLICATIONYEAR$20) != null;
        }
    }
    
    /**
     * Sets the "publicationYear" attribute
     */
    public void setPublicationYear(java.util.Calendar publicationYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONYEAR$20);
            }
            target.setCalendarValue(publicationYear);
        }
    }
    
    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    public void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYear target = null;
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGYear)get_store().add_attribute_user(PUBLICATIONYEAR$20);
            }
            target.set(publicationYear);
        }
    }
    
    /**
     * Unsets the "publicationYear" attribute
     */
    public void unsetPublicationYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLICATIONYEAR$20);
        }
    }
    
    /**
     * Gets the "publicationPeriod" attribute
     */
    public java.lang.Object getPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$22);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$22);
            return target;
        }
    }
    
    /**
     * True if has "publicationPeriod" attribute
     */
    public boolean isSetPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBLICATIONPERIOD$22) != null;
        }
    }
    
    /**
     * Sets the "publicationPeriod" attribute
     */
    public void setPublicationPeriod(java.lang.Object publicationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONPERIOD$22);
            }
            target.setObjectValue(publicationPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    public void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType publicationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$22);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_attribute_user(PUBLICATIONPERIOD$22);
            }
            target.set(publicationPeriod);
        }
    }
    
    /**
     * Unsets the "publicationPeriod" attribute
     */
    public void unsetPublicationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBLICATIONPERIOD$22);
        }
    }
}
