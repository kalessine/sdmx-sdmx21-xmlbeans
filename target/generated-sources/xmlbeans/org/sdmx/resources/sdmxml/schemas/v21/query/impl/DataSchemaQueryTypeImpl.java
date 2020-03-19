/*
 * XML Type:  DataSchemaQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataSchemaQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataSchemaQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataSchemaQueryType
{
    private static final long serialVersionUID = 1L;
    
    public DataSchemaQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataStructure");
    
    
    /**
     * Gets the "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType getDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType)get_store().find_element_user(DATASTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataStructure" element
     */
    public void setDataStructure(org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType dataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType)get_store().find_element_user(DATASTRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType)get_store().add_element_user(DATASTRUCTURE$0);
            }
            target.set(dataStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType addNewDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureRequestType)get_store().add_element_user(DATASTRUCTURE$0);
            return target;
        }
    }
}
