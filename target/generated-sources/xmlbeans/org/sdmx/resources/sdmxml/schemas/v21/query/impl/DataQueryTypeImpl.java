/*
 * XML Type:  DataQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataQueryType
{
    private static final long serialVersionUID = 1L;
    
    public DataQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURNDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReturnDetails");
    private static final javax.xml.namespace.QName DATAWHERE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataWhere");
    
    
    /**
     * Gets the "ReturnDetails" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType getReturnDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType)get_store().find_element_user(RETURNDETAILS$0, 0);
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
    public void setReturnDetails(org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType returnDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType)get_store().find_element_user(RETURNDETAILS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType)get_store().add_element_user(RETURNDETAILS$0);
            }
            target.set(returnDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "ReturnDetails" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType addNewReturnDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataReturnDetailsType)get_store().add_element_user(RETURNDETAILS$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType getDataWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().find_element_user(DATAWHERE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataWhere" element
     */
    public void setDataWhere(org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType dataWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().find_element_user(DATAWHERE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().add_element_user(DATAWHERE$2);
            }
            target.set(dataWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "DataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType addNewDataWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType)get_store().add_element_user(DATAWHERE$2);
            return target;
        }
    }
}
