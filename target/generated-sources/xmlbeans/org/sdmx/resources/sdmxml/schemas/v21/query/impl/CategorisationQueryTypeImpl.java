/*
 * XML Type:  CategorisationQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML CategorisationQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class CategorisationQueryTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationQueryType
{
    private static final long serialVersionUID = 1L;
    
    public CategorisationQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORISATIONWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategorisationWhere");
    
    
    /**
     * Gets the "CategorisationWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType getCategorisationWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType)get_store().find_element_user(CATEGORISATIONWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategorisationWhere" element
     */
    public void setCategorisationWhere(org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType categorisationWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType)get_store().find_element_user(CATEGORISATIONWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType)get_store().add_element_user(CATEGORISATIONWHERE$0);
            }
            target.set(categorisationWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorisationWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType addNewCategorisationWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType)get_store().add_element_user(CATEGORISATIONWHERE$0);
            return target;
        }
    }
}
