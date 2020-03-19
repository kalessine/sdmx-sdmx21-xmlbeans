/*
 * XML Type:  MetadataQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML MetadataQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class MetadataQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.MetadataQueryType
{
    private static final long serialVersionUID = 1L;
    
    public MetadataQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURNDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReturnDetails");
    private static final javax.xml.namespace.QName METADATAPARAMETERS$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataParameters");
    
    
    /**
     * Gets the "ReturnDetails" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType getReturnDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType)get_store().find_element_user(RETURNDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReturnDetails" element
     */
    public void setReturnDetails(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType returnDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType)get_store().find_element_user(RETURNDETAILS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType)get_store().add_element_user(RETURNDETAILS$0);
            }
            target.set(returnDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "ReturnDetails" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType addNewReturnDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataReturnDetailsType)get_store().add_element_user(RETURNDETAILS$0);
            return target;
        }
    }
    
    /**
     * Gets the "MetadataParameters" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType getMetadataParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().find_element_user(METADATAPARAMETERS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MetadataParameters" element
     */
    public void setMetadataParameters(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType metadataParameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().find_element_user(METADATAPARAMETERS$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().add_element_user(METADATAPARAMETERS$2);
            }
            target.set(metadataParameters);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataParameters" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType addNewMetadataParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType)get_store().add_element_user(METADATAPARAMETERS$2);
            return target;
        }
    }
}
