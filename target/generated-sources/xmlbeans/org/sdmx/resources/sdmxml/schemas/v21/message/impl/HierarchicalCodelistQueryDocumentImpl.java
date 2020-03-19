/*
 * An XML document type.
 * Localname: HierarchicalCodelistQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one HierarchicalCodelistQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class HierarchicalCodelistQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public HierarchicalCodelistQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "HierarchicalCodelistQuery");
    
    
    /**
     * Gets the "HierarchicalCodelistQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType getHierarchicalCodelistQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType)get_store().find_element_user(HIERARCHICALCODELISTQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelistQuery" element
     */
    public void setHierarchicalCodelistQuery(org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType hierarchicalCodelistQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType)get_store().find_element_user(HIERARCHICALCODELISTQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType)get_store().add_element_user(HIERARCHICALCODELISTQUERY$0);
            }
            target.set(hierarchicalCodelistQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelistQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType addNewHierarchicalCodelistQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.HierarchicalCodelistQueryType)get_store().add_element_user(HIERARCHICALCODELISTQUERY$0);
            return target;
        }
    }
}
