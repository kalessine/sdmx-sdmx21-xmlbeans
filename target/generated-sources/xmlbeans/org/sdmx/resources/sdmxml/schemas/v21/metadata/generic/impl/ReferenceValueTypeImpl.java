/*
 * XML Type:  ReferenceValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.impl;
/**
 * An XML ReferenceValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic).
 *
 * This is a complex type.
 */
public class ReferenceValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "ObjectReference");
    private static final javax.xml.namespace.QName DATAKEY$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "DataKey");
    private static final javax.xml.namespace.QName DATASETREFERENCE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "DataSetReference");
    private static final javax.xml.namespace.QName CONSTRAINTCONTENTREFERENCE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "ConstraintContentReference");
    private static final javax.xml.namespace.QName REPORTPERIOD$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic", "ReportPeriod");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "ObjectReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
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
            return get_store().count_elements(OBJECTREFERENCE$0) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
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
            get_store().remove_element(OBJECTREFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "DataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getDataKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().find_element_user(DATAKEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataKey" element
     */
    public boolean isSetDataKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAKEY$2) != 0;
        }
    }
    
    /**
     * Sets the "DataKey" element
     */
    public void setDataKey(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType dataKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().find_element_user(DATAKEY$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().add_element_user(DATAKEY$2);
            }
            target.set(dataKey);
        }
    }
    
    /**
     * Appends and returns a new empty "DataKey" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewDataKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType)get_store().add_element_user(DATAKEY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DataKey" element
     */
    public void unsetDataKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAKEY$2, 0);
        }
    }
    
    /**
     * Gets the "DataSetReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getDataSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(DATASETREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataSetReference" element
     */
    public boolean isSetDataSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "DataSetReference" element
     */
    public void setDataSetReference(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType dataSetReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().find_element_user(DATASETREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(DATASETREFERENCE$4);
            }
            target.set(dataSetReference);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSetReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewDataSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType)get_store().add_element_user(DATASETREFERENCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DataSetReference" element
     */
    public void unsetDataSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets the "ConstraintContentReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getConstraintContentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(CONSTRAINTCONTENTREFERENCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConstraintContentReference" element
     */
    public boolean isSetConstraintContentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTCONTENTREFERENCE$6) != 0;
        }
    }
    
    /**
     * Sets the "ConstraintContentReference" element
     */
    public void setConstraintContentReference(org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType constraintContentReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().find_element_user(CONSTRAINTCONTENTREFERENCE$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(CONSTRAINTCONTENTREFERENCE$6);
            }
            target.set(constraintContentReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintContentReference" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType addNewConstraintContentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType)get_store().add_element_user(CONSTRAINTCONTENTREFERENCE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ConstraintContentReference" element
     */
    public void unsetConstraintContentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTCONTENTREFERENCE$6, 0);
        }
    }
    
    /**
     * Gets the "ReportPeriod" element
     */
    public java.lang.Object getReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTPERIOD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportPeriod" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_element_user(REPORTPERIOD$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportPeriod" element
     */
    public boolean isSetReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTPERIOD$8) != 0;
        }
    }
    
    /**
     * Sets the "ReportPeriod" element
     */
    public void setReportPeriod(java.lang.Object reportPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTPERIOD$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTPERIOD$8);
            }
            target.setObjectValue(reportPeriod);
        }
    }
    
    /**
     * Sets (as xml) the "ReportPeriod" element
     */
    public void xsetReportPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType reportPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().find_element_user(REPORTPERIOD$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType)get_store().add_element_user(REPORTPERIOD$8);
            }
            target.set(reportPeriod);
        }
    }
    
    /**
     * Unsets the "ReportPeriod" element
     */
    public void unsetReportPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTPERIOD$8, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
}
