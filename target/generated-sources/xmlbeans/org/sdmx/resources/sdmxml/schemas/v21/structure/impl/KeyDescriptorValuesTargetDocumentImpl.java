/*
 * An XML document type.
 * Localname: KeyDescriptorValuesTarget
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one KeyDescriptorValuesTarget(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class KeyDescriptorValuesTargetDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeyDescriptorValuesTargetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYDESCRIPTORVALUESTARGET$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "KeyDescriptorValuesTarget");
    
    
    /**
     * Gets the "KeyDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType getKeyDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().find_element_user(KEYDESCRIPTORVALUESTARGET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeyDescriptorValuesTarget" element
     */
    public void setKeyDescriptorValuesTarget(org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType keyDescriptorValuesTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().find_element_user(KEYDESCRIPTORVALUESTARGET$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().add_element_user(KEYDESCRIPTORVALUESTARGET$0);
            }
            target.set(keyDescriptorValuesTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType addNewKeyDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.KeyDescriptorValuesTargetType)get_store().add_element_user(KEYDESCRIPTORVALUESTARGET$0);
            return target;
        }
    }
}
