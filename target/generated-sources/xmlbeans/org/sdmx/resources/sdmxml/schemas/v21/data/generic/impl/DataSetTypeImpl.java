/*
 * XML Type:  DataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.generic.impl;
/**
 * An XML DataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic).
 *
 * This is a complex type.
 */
public class DataSetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.AnnotableTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.data.generic.DataSetType
{
    private static final long serialVersionUID = 1L;
    
    public DataSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAPROVIDER$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "DataProvider");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Attributes");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Group");
    private static final javax.xml.namespace.QName SERIES$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Series");
    private static final javax.xml.namespace.QName OBS$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/generic", "Obs");
    private static final javax.xml.namespace.QName STRUCTUREREF$10 = 
        new javax.xml.namespace.QName("", "structureRef");
    private static final javax.xml.namespace.QName SETID$12 = 
        new javax.xml.namespace.QName("", "setID");
    private static final javax.xml.namespace.QName ACTION$14 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName REPORTINGBEGINDATE$16 = 
        new javax.xml.namespace.QName("", "reportingBeginDate");
    private static final javax.xml.namespace.QName REPORTINGENDDATE$18 = 
        new javax.xml.namespace.QName("", "reportingEndDate");
    private static final javax.xml.namespace.QName VALIDFROMDATE$20 = 
        new javax.xml.namespace.QName("", "validFromDate");
    private static final javax.xml.namespace.QName VALIDTODATE$22 = 
        new javax.xml.namespace.QName("", "validToDate");
    private static final javax.xml.namespace.QName PUBLICATIONYEAR$24 = 
        new javax.xml.namespace.QName("", "publicationYear");
    private static final javax.xml.namespace.QName PUBLICATIONPERIOD$26 = 
        new javax.xml.namespace.QName("", "publicationPeriod");
    
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$0, 0);
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
            return get_store().count_elements(DATAPROVIDER$0) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().find_element_user(DATAPROVIDER$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType)get_store().add_element_user(DATAPROVIDER$0);
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
            get_store().remove_element(DATAPROVIDER$0, 0);
        }
    }
    
    /**
     * Gets the "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType getAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attributes" element
     */
    public boolean isSetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "Attributes" element
     */
    public void setAttributes(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().find_element_user(ATTRIBUTES$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$2);
            }
            target.set(attributes);
        }
    }
    
    /**
     * Appends and returns a new empty "Attributes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ValuesType)get_store().add_element_user(ATTRIBUTES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Attributes" element
     */
    public void unsetAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$2, 0);
        }
    }
    
    /**
     * Gets array of all "Group" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType[] result = new org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$4);
        }
    }
    
    /**
     * Sets array of all "Group" element
     */
    public void setGroupArray(org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType[] groupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$4);
        }
    }
    
    /**
     * Sets ith "Group" element
     */
    public void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType)get_store().insert_element_user(GROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.GroupType)get_store().add_element_user(GROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$4, i);
        }
    }
    
    /**
     * Gets array of all "Series" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType[] getSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIES$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType[] result = new org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType getSeriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType)get_store().find_element_user(SERIES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Series" element
     */
    public int sizeOfSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIES$6);
        }
    }
    
    /**
     * Sets array of all "Series" element
     */
    public void setSeriesArray(org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType[] seriesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(seriesArray, SERIES$6);
        }
    }
    
    /**
     * Sets ith "Series" element
     */
    public void setSeriesArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType)get_store().find_element_user(SERIES$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(series);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType insertNewSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType)get_store().insert_element_user(SERIES$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Series" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType addNewSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.SeriesType)get_store().add_element_user(SERIES$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Series" element
     */
    public void removeSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIES$6, i);
        }
    }
    
    /**
     * Gets array of all "Obs" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType[] getObsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBS$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType[] result = new org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType getObsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType)get_store().find_element_user(OBS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Obs" element
     */
    public int sizeOfObsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBS$8);
        }
    }
    
    /**
     * Sets array of all "Obs" element
     */
    public void setObsArray(org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType[] obsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(obsArray, OBS$8);
        }
    }
    
    /**
     * Sets ith "Obs" element
     */
    public void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType obs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType)get_store().find_element_user(OBS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(obs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType insertNewObs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType)get_store().insert_element_user(OBS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType addNewObs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.data.generic.ObsOnlyType)get_store().add_element_user(OBS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Obs" element
     */
    public void removeObs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBS$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$10);
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
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(STRUCTUREREF$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRUCTUREREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRUCTUREREF$10);
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
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(STRUCTUREREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(STRUCTUREREF$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETID$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(SETID$12);
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
            return get_store().find_attribute_user(SETID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETID$12);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(SETID$12);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(SETID$12);
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
            get_store().remove_attribute(SETID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$14);
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
            return get_store().find_attribute_user(ACTION$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$14);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().find_attribute_user(ACTION$14);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ActionType)get_store().add_attribute_user(ACTION$14);
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
            get_store().remove_attribute(ACTION$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$16);
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
            return get_store().find_attribute_user(REPORTINGBEGINDATE$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGBEGINDATE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGBEGINDATE$16);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGBEGINDATE$16);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().add_attribute_user(REPORTINGBEGINDATE$16);
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
            get_store().remove_attribute(REPORTINGBEGINDATE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$18);
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
            return get_store().find_attribute_user(REPORTINGENDDATE$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTINGENDDATE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTINGENDDATE$18);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().find_attribute_user(REPORTINGENDDATE$18);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType)get_store().add_attribute_user(REPORTINGENDDATE$18);
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
            get_store().remove_attribute(REPORTINGENDDATE$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$20);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROMDATE$20);
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
            return get_store().find_attribute_user(VALIDFROMDATE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROMDATE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROMDATE$20);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROMDATE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROMDATE$20);
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
            get_store().remove_attribute(VALIDFROMDATE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$22);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTODATE$22);
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
            return get_store().find_attribute_user(VALIDTODATE$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTODATE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTODATE$22);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTODATE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTODATE$22);
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
            get_store().remove_attribute(VALIDTODATE$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$24);
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
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$24);
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
            return get_store().find_attribute_user(PUBLICATIONYEAR$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONYEAR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONYEAR$24);
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
            target = (org.apache.xmlbeans.XmlGYear)get_store().find_attribute_user(PUBLICATIONYEAR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGYear)get_store().add_attribute_user(PUBLICATIONYEAR$24);
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
            get_store().remove_attribute(PUBLICATIONYEAR$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$26);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$26);
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
            return get_store().find_attribute_user(PUBLICATIONPERIOD$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBLICATIONPERIOD$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBLICATIONPERIOD$26);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_attribute_user(PUBLICATIONPERIOD$26);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_attribute_user(PUBLICATIONPERIOD$26);
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
            get_store().remove_attribute(PUBLICATIONPERIOD$26);
        }
    }
}
