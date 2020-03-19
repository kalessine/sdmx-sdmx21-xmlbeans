/*
 * XML Type:  QueryableDataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML QueryableDataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class QueryableDataSourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType
{
    private static final long serialVersionUID = 1L;
    
    public QueryableDataSourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAURL$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataURL");
    private static final javax.xml.namespace.QName WSDLURL$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "WSDLURL");
    private static final javax.xml.namespace.QName WADLURL$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "WADLURL");
    private static final javax.xml.namespace.QName ISRESTDATASOURCE$6 = 
        new javax.xml.namespace.QName("", "isRESTDatasource");
    private static final javax.xml.namespace.QName ISWEBSERVICEDATASOURCE$8 = 
        new javax.xml.namespace.QName("", "isWebServiceDatasource");
    
    
    /**
     * Gets the "DataURL" element
     */
    public java.lang.String getDataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataURL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetDataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATAURL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataURL" element
     */
    public void setDataURL(java.lang.String dataURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAURL$0);
            }
            target.setStringValue(dataURL);
        }
    }
    
    /**
     * Sets (as xml) the "DataURL" element
     */
    public void xsetDataURL(org.apache.xmlbeans.XmlAnyURI dataURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(DATAURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(DATAURL$0);
            }
            target.set(dataURL);
        }
    }
    
    /**
     * Gets the "WSDLURL" element
     */
    public java.lang.String getWSDLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WSDLURL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWSDLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLURL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "WSDLURL" element
     */
    public boolean isSetWSDLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLURL$2) != 0;
        }
    }
    
    /**
     * Sets the "WSDLURL" element
     */
    public void setWSDLURL(java.lang.String wsdlurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDLURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSDLURL$2);
            }
            target.setStringValue(wsdlurl);
        }
    }
    
    /**
     * Sets (as xml) the "WSDLURL" element
     */
    public void xsetWSDLURL(org.apache.xmlbeans.XmlAnyURI wsdlurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDLURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WSDLURL$2);
            }
            target.set(wsdlurl);
        }
    }
    
    /**
     * Unsets the "WSDLURL" element
     */
    public void unsetWSDLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLURL$2, 0);
        }
    }
    
    /**
     * Gets the "WADLURL" element
     */
    public java.lang.String getWADLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WADLURL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WADLURL" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWADLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WADLURL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "WADLURL" element
     */
    public boolean isSetWADLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WADLURL$4) != 0;
        }
    }
    
    /**
     * Sets the "WADLURL" element
     */
    public void setWADLURL(java.lang.String wadlurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WADLURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WADLURL$4);
            }
            target.setStringValue(wadlurl);
        }
    }
    
    /**
     * Sets (as xml) the "WADLURL" element
     */
    public void xsetWADLURL(org.apache.xmlbeans.XmlAnyURI wadlurl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WADLURL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WADLURL$4);
            }
            target.set(wadlurl);
        }
    }
    
    /**
     * Unsets the "WADLURL" element
     */
    public void unsetWADLURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WADLURL$4, 0);
        }
    }
    
    /**
     * Gets the "isRESTDatasource" attribute
     */
    public boolean getIsRESTDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISRESTDATASOURCE$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isRESTDatasource" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRESTDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISRESTDATASOURCE$6);
            return target;
        }
    }
    
    /**
     * Sets the "isRESTDatasource" attribute
     */
    public void setIsRESTDatasource(boolean isRESTDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISRESTDATASOURCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISRESTDATASOURCE$6);
            }
            target.setBooleanValue(isRESTDatasource);
        }
    }
    
    /**
     * Sets (as xml) the "isRESTDatasource" attribute
     */
    public void xsetIsRESTDatasource(org.apache.xmlbeans.XmlBoolean isRESTDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISRESTDATASOURCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISRESTDATASOURCE$6);
            }
            target.set(isRESTDatasource);
        }
    }
    
    /**
     * Gets the "isWebServiceDatasource" attribute
     */
    public boolean getIsWebServiceDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isWebServiceDatasource" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsWebServiceDatasource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$8);
            return target;
        }
    }
    
    /**
     * Sets the "isWebServiceDatasource" attribute
     */
    public void setIsWebServiceDatasource(boolean isWebServiceDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISWEBSERVICEDATASOURCE$8);
            }
            target.setBooleanValue(isWebServiceDatasource);
        }
    }
    
    /**
     * Sets (as xml) the "isWebServiceDatasource" attribute
     */
    public void xsetIsWebServiceDatasource(org.apache.xmlbeans.XmlBoolean isWebServiceDatasource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISWEBSERVICEDATASOURCE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISWEBSERVICEDATASOURCE$8);
            }
            target.set(isWebServiceDatasource);
        }
    }
}
