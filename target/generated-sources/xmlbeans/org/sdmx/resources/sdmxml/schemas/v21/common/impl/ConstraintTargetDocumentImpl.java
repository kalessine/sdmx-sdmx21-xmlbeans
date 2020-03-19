/*
 * An XML document type.
 * Localname: ConstraintTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ConstraintTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one ConstraintTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class ConstraintTargetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ConstraintTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ConstraintTarget");
    
    
    /**
     * Gets the "ConstraintTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConstraintTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONSTRAINTTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConstraintTarget" element
     */
    public void setConstraintTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType constraintTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONSTRAINTTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONSTRAINTTARGET$0);
            }
            target.set(constraintTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConstraintTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONSTRAINTTARGET$0);
            return target;
        }
    }
}
