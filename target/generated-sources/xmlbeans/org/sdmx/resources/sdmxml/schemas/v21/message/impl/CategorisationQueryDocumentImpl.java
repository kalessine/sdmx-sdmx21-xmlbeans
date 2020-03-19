/*
 * An XML document type.
 * Localname: CategorisationQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one CategorisationQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class CategorisationQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategorisationQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORISATIONQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "CategorisationQuery");
    
    
    /**
     * Gets the "CategorisationQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType getCategorisationQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType)get_store().find_element_user(CATEGORISATIONQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CategorisationQuery" element
     */
    public void setCategorisationQuery(org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType categorisationQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType)get_store().find_element_user(CATEGORISATIONQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType)get_store().add_element_user(CATEGORISATIONQUERY$0);
            }
            target.set(categorisationQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorisationQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType addNewCategorisationQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.CategorisationQueryType)get_store().add_element_user(CATEGORISATIONQUERY$0);
            return target;
        }
    }
}
