/*
 * An XML document type.
 * Localname: ContentConstraint
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ContentConstraint(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ContentConstraintDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ContentConstraintDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContentConstraintDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTCONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ContentConstraint");
    
    
    /**
     * Gets the "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONTENTCONSTRAINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContentConstraint" element
     */
    public void setContentConstraint(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType contentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONTENTCONSTRAINT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONTENTCONSTRAINT$0);
            }
            target.set(contentConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONTENTCONSTRAINT$0);
            return target;
        }
    }
}
