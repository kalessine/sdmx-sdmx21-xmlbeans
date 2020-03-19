/*
 * An XML document type.
 * Localname: TimeDimensionWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one TimeDimensionWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class TimeDimensionWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.ComponentWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeDimensionWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEDIMENSIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionWhere");
    
    
    /**
     * Gets the "TimeDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType getTimeDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().find_element_user(TIMEDIMENSIONWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeDimensionWhere" element
     */
    public void setTimeDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType timeDimensionWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().find_element_user(TIMEDIMENSIONWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().add_element_user(TIMEDIMENSIONWHERE$0);
            }
            target.set(timeDimensionWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeDimensionWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType addNewTimeDimensionWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType)get_store().add_element_user(TIMEDIMENSIONWHERE$0);
            return target;
        }
    }
}
