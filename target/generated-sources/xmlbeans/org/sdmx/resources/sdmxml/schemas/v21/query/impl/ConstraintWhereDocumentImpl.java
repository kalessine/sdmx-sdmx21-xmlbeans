/*
 * An XML document type.
 * Localname: ConstraintWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ConstraintWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ConstraintWhereDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructuralMetadataWhereDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConstraintWhere");
    
    
    /**
     * Gets the "ConstraintWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType getConstraintWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType)get_store().find_element_user(CONSTRAINTWHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintWhere" element
     */
    public void setConstraintWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType constraintWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType)get_store().find_element_user(CONSTRAINTWHERE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType)get_store().add_element_user(CONSTRAINTWHERE$0);
            }
            target.set(constraintWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType addNewConstraintWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ConstraintWhereType)get_store().add_element_user(CONSTRAINTWHERE$0);
            return target;
        }
    }
}
