/*
 * XML Type:  MetadataKeyType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.MetadataKeyType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML MetadataKeyType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class MetadataKeyTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.common.impl.DistinctKeyTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.MetadataKeyType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataKeyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORT$0 = 
        new javax.xml.namespace.QName("", "report");
    private static final javax.xml.namespace.QName METADATATARGET$2 = 
        new javax.xml.namespace.QName("", "metadataTarget");
    
    
    /**
     * Gets the "report" attribute
     */
    public java.lang.String getReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "report" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetReport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(REPORT$0);
            return target;
        }
    }
    
    /**
     * Sets the "report" attribute
     */
    public void setReport(java.lang.String report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORT$0);
            }
            target.setStringValue(report);
        }
    }
    
    /**
     * Sets (as xml) the "report" attribute
     */
    public void xsetReport(org.sdmx.resources.sdmxml.schemas.v21.common.IDType report)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(REPORT$0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(REPORT$0);
            }
            target.set(report);
        }
    }
    
    /**
     * Gets the "metadataTarget" attribute
     */
    public java.lang.String getMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATATARGET$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "metadataTarget" attribute
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(METADATATARGET$2);
            return target;
        }
    }
    
    /**
     * Sets the "metadataTarget" attribute
     */
    public void setMetadataTarget(java.lang.String metadataTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATATARGET$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METADATATARGET$2);
            }
            target.setStringValue(metadataTarget);
        }
    }
    
    /**
     * Sets (as xml) the "metadataTarget" attribute
     */
    public void xsetMetadataTarget(org.sdmx.resources.sdmxml.schemas.v21.common.IDType metadataTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.IDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().find_attribute_user(METADATATARGET$2);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.IDType)get_store().add_attribute_user(METADATATARGET$2);
            }
            target.set(metadataTarget);
        }
    }
}
