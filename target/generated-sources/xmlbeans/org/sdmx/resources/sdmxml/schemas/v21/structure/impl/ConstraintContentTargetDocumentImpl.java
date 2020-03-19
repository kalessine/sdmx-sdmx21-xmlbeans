/*
 * An XML document type.
 * Localname: ConstraintContentTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ConstraintContentTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ConstraintContentTargetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintContentTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTCONTENTTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConstraintContentTarget");
    
    
    /**
     * Gets the "ConstraintContentTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType getConstraintContentTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().find_element_user(CONSTRAINTCONTENTTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintContentTarget" element
     */
    public void setConstraintContentTarget(org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType constraintContentTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().find_element_user(CONSTRAINTCONTENTTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().add_element_user(CONSTRAINTCONTENTTARGET$0);
            }
            target.set(constraintContentTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintContentTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType addNewConstraintContentTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintContentTargetType)get_store().add_element_user(CONSTRAINTCONTENTTARGET$0);
            return target;
        }
    }
}
