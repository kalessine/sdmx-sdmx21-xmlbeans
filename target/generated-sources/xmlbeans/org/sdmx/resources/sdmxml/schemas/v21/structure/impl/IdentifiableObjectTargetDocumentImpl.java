/*
 * An XML document type.
 * Localname: IdentifiableObjectTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one IdentifiableObjectTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class IdentifiableObjectTargetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiableObjectTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIABLEOBJECTTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "IdentifiableObjectTarget");
    
    
    /**
     * Gets the "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType getIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$0, 0);
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
    public void setIdentifiableObjectTarget(org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType identifiableObjectTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$0);
            }
            target.set(identifiableObjectTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType addNewIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.IdentifiableObjectTargetType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$0);
            return target;
        }
    }
}
