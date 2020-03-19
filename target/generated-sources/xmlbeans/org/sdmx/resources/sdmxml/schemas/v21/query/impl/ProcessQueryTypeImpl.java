/*
 * XML Type:  ProcessQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML ProcessQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class ProcessQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ProcessQueryType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProcessWhere");
    
    
    /**
     * Gets the "ProcessWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType getProcessWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType)get_store().find_element_user(PROCESSWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProcessWhere" element
     */
    public void setProcessWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType processWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType)get_store().find_element_user(PROCESSWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType)get_store().add_element_user(PROCESSWHERE$0);
            }
            target.set(processWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ProcessWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType addNewProcessWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ProcessWhereType)get_store().add_element_user(PROCESSWHERE$0);
            return target;
        }
    }
}
