/*
 * An XML document type.
 * Localname: IdentifiableObjectTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.IdentifiableObjectTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one IdentifiableObjectTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class IdentifiableObjectTargetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.IdentifiableObjectTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiableObjectTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIABLEOBJECTTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "IdentifiableObjectTarget");
    
    
    /**
     * Gets the "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiableObjectTarget" element
     */
    public void setIdentifiableObjectTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType identifiableObjectTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$0);
            }
            target.set(identifiableObjectTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$0);
            return target;
        }
    }
}
