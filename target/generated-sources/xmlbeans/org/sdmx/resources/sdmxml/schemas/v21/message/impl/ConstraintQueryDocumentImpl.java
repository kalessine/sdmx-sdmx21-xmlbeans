/*
 * An XML document type.
 * Localname: ConstraintQuery
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one ConstraintQuery(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class ConstraintQueryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintQueryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTQUERY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "ConstraintQuery");
    
    
    /**
     * Gets the "ConstraintQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType getConstraintQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType)get_store().find_element_user(CONSTRAINTQUERY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintQuery" element
     */
    public void setConstraintQuery(org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType constraintQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType)get_store().find_element_user(CONSTRAINTQUERY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType)get_store().add_element_user(CONSTRAINTQUERY$0);
            }
            target.set(constraintQuery);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintQuery" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType addNewConstraintQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.ConstraintQueryType)get_store().add_element_user(CONSTRAINTQUERY$0);
            return target;
        }
    }
}
