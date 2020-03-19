/*
 * XML Type:  QueryResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML QueryResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class QueryResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.QueryResultType
{
    private static final long serialVersionUID = 1L;
    
    public QueryResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATARESULT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataResult");
    private static final javax.xml.namespace.QName METADATARESULT$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataResult");
    private static final javax.xml.namespace.QName TIMESERIESMATCH$4 = 
        new javax.xml.namespace.QName("", "timeSeriesMatch");
    
    
    /**
     * Gets the "DataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType getDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().find_element_user(DATARESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataResult" element
     */
    public boolean isSetDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARESULT$0) != 0;
        }
    }
    
    /**
     * Sets the "DataResult" element
     */
    public void setDataResult(org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType dataResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().find_element_user(DATARESULT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().add_element_user(DATARESULT$0);
            }
            target.set(dataResult);
        }
    }
    
    /**
     * Appends and returns a new empty "DataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType addNewDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().add_element_user(DATARESULT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataResult" element
     */
    public void unsetDataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARESULT$0, 0);
        }
    }
    
    /**
     * Gets the "MetadataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType getMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().find_element_user(METADATARESULT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataResult" element
     */
    public boolean isSetMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATARESULT$2) != 0;
        }
    }
    
    /**
     * Sets the "MetadataResult" element
     */
    public void setMetadataResult(org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType metadataResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().find_element_user(METADATARESULT$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().add_element_user(METADATARESULT$2);
            }
            target.set(metadataResult);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataResult" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType addNewMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.ResultType)get_store().add_element_user(METADATARESULT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataResult" element
     */
    public void unsetMetadataResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATARESULT$2, 0);
        }
    }
    
    /**
     * Gets the "timeSeriesMatch" attribute
     */
    public boolean getTimeSeriesMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESERIESMATCH$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeSeriesMatch" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTimeSeriesMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESERIESMATCH$4);
            return target;
        }
    }
    
    /**
     * Sets the "timeSeriesMatch" attribute
     */
    public void setTimeSeriesMatch(boolean timeSeriesMatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESERIESMATCH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESERIESMATCH$4);
            }
            target.setBooleanValue(timeSeriesMatch);
        }
    }
    
    /**
     * Sets (as xml) the "timeSeriesMatch" attribute
     */
    public void xsetTimeSeriesMatch(org.apache.xmlbeans.XmlBoolean timeSeriesMatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESERIESMATCH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TIMESERIESMATCH$4);
            }
            target.set(timeSeriesMatch);
        }
    }
}
