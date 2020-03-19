/*
 * XML Type:  DataStructureQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML DataStructureQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class DataStructureQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureQueryType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTRUCTUREWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataStructureWhere");
    
    
    /**
     * Gets the "DataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType getDataStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType)get_store().find_element_user(DATASTRUCTUREWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataStructureWhere" element
     */
    public void setDataStructureWhere(org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType dataStructureWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType)get_store().find_element_user(DATASTRUCTUREWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType)get_store().add_element_user(DATASTRUCTUREWHERE$0);
            }
            target.set(dataStructureWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "DataStructureWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType addNewDataStructureWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType)get_store().add_element_user(DATASTRUCTUREWHERE$0);
            return target;
        }
    }
}
