/*
 * XML Type:  MetadataTargetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML MetadataTargetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class MetadataTargetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.MetadataTargetBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataTargetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYDESCRIPTORVALUESTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "KeyDescriptorValuesTarget");
    private static final javax.xml.namespace.QName DATASETTARGET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataSetTarget");
    private static final javax.xml.namespace.QName CONSTRAINTCONTENTTARGET$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConstraintContentTarget");
    private static final javax.xml.namespace.QName REPORTPERIODTARGET$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportPeriodTarget");
    private static final javax.xml.namespace.QName IDENTIFIABLEOBJECTTARGET$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "IdentifiableObjectTarget");
    
    
    /**
     * Gets array of all "KeyDescriptorValuesTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType[] getKeyDescriptorValuesTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYDESCRIPTORVALUESTARGET$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "KeyDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType getKeyDescriptorValuesTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().find_element_user(KEYDESCRIPTORVALUESTARGET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "KeyDescriptorValuesTarget" element
     */
    public int sizeOfKeyDescriptorValuesTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYDESCRIPTORVALUESTARGET$0);
        }
    }
    
    /**
     * Sets array of all "KeyDescriptorValuesTarget" element
     */
    public void setKeyDescriptorValuesTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType[] keyDescriptorValuesTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyDescriptorValuesTargetArray, KEYDESCRIPTORVALUESTARGET$0);
        }
    }
    
    /**
     * Sets ith "KeyDescriptorValuesTarget" element
     */
    public void setKeyDescriptorValuesTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType keyDescriptorValuesTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().find_element_user(KEYDESCRIPTORVALUESTARGET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyDescriptorValuesTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType insertNewKeyDescriptorValuesTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().insert_element_user(KEYDESCRIPTORVALUESTARGET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType addNewKeyDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().add_element_user(KEYDESCRIPTORVALUESTARGET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "KeyDescriptorValuesTarget" element
     */
    public void removeKeyDescriptorValuesTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYDESCRIPTORVALUESTARGET$0, i);
        }
    }
    
    /**
     * Gets array of all "DataSetTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType[] getDataSetTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASETTARGET$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType getDataSetTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().find_element_user(DATASETTARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataSetTarget" element
     */
    public int sizeOfDataSetTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETTARGET$2);
        }
    }
    
    /**
     * Sets array of all "DataSetTarget" element
     */
    public void setDataSetTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType[] dataSetTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSetTargetArray, DATASETTARGET$2);
        }
    }
    
    /**
     * Sets ith "DataSetTarget" element
     */
    public void setDataSetTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType dataSetTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().find_element_user(DATASETTARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSetTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType insertNewDataSetTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().insert_element_user(DATASETTARGET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType addNewDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataSetTargetType)get_store().add_element_user(DATASETTARGET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataSetTarget" element
     */
    public void removeDataSetTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETTARGET$2, i);
        }
    }
    
    /**
     * Gets array of all "ConstraintContentTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType[] getConstraintContentTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTRAINTCONTENTTARGET$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConstraintContentTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType getConstraintContentTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().find_element_user(CONSTRAINTCONTENTTARGET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConstraintContentTarget" element
     */
    public int sizeOfConstraintContentTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTCONTENTTARGET$4);
        }
    }
    
    /**
     * Sets array of all "ConstraintContentTarget" element
     */
    public void setConstraintContentTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType[] constraintContentTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(constraintContentTargetArray, CONSTRAINTCONTENTTARGET$4);
        }
    }
    
    /**
     * Sets ith "ConstraintContentTarget" element
     */
    public void setConstraintContentTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType constraintContentTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().find_element_user(CONSTRAINTCONTENTTARGET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constraintContentTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConstraintContentTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType insertNewConstraintContentTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().insert_element_user(CONSTRAINTCONTENTTARGET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConstraintContentTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType addNewConstraintContentTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().add_element_user(CONSTRAINTCONTENTTARGET$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConstraintContentTarget" element
     */
    public void removeConstraintContentTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTCONTENTTARGET$4, i);
        }
    }
    
    /**
     * Gets array of all "ReportPeriodTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType[] getReportPeriodTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTPERIODTARGET$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType getReportPeriodTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().find_element_user(REPORTPERIODTARGET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportPeriodTarget" element
     */
    public int sizeOfReportPeriodTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTPERIODTARGET$6);
        }
    }
    
    /**
     * Sets array of all "ReportPeriodTarget" element
     */
    public void setReportPeriodTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType[] reportPeriodTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportPeriodTargetArray, REPORTPERIODTARGET$6);
        }
    }
    
    /**
     * Sets ith "ReportPeriodTarget" element
     */
    public void setReportPeriodTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType reportPeriodTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().find_element_user(REPORTPERIODTARGET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportPeriodTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType insertNewReportPeriodTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().insert_element_user(REPORTPERIODTARGET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType addNewReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportPeriodTargetType)get_store().add_element_user(REPORTPERIODTARGET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportPeriodTarget" element
     */
    public void removeReportPeriodTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTPERIODTARGET$6, i);
        }
    }
    
    /**
     * Gets array of all "IdentifiableObjectTarget" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType[] getIdentifiableObjectTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIABLEOBJECTTARGET$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType getIdentifiableObjectTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentifiableObjectTarget" element
     */
    public int sizeOfIdentifiableObjectTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIABLEOBJECTTARGET$8);
        }
    }
    
    /**
     * Sets array of all "IdentifiableObjectTarget" element
     */
    public void setIdentifiableObjectTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType[] identifiableObjectTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identifiableObjectTargetArray, IDENTIFIABLEOBJECTTARGET$8);
        }
    }
    
    /**
     * Sets ith "IdentifiableObjectTarget" element
     */
    public void setIdentifiableObjectTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType identifiableObjectTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifiableObjectTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType insertNewIdentifiableObjectTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().insert_element_user(IDENTIFIABLEOBJECTTARGET$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType addNewIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentifiableObjectTarget" element
     */
    public void removeIdentifiableObjectTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIABLEOBJECTTARGET$8, i);
        }
    }
}
