/*
 * An XML document type.
 * Localname: HybridCodeMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.HybridCodeMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one HybridCodeMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class HybridCodeMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.HybridCodeMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public HybridCodeMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HYBRIDCODEMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HybridCodeMap");
    
    
    /**
     * Gets the "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODEMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HybridCodeMap" element
     */
    public void setHybridCodeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hybridCodeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODEMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODEMAP$0);
            }
            target.set(hybridCodeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODEMAP$0);
            return target;
        }
    }
}
