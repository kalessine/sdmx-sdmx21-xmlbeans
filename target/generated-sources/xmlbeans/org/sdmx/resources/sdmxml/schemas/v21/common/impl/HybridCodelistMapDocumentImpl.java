/*
 * An XML document type.
 * Localname: HybridCodelistMap
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.HybridCodelistMapDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * A document containing one HybridCodelistMap(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common) element.
 *
 * This is a complex type.
 */
public class HybridCodelistMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.HybridCodelistMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public HybridCodelistMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HYBRIDCODELISTMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HybridCodelistMap");
    
    
    /**
     * Gets the "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODELISTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HybridCodelistMap" element
     */
    public void setHybridCodelistMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hybridCodelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODELISTMAP$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODELISTMAP$0);
            }
            target.set(hybridCodelistMap);
        }
    }
    
    /**
     * Appends and returns a new empty "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODELISTMAP$0);
            return target;
        }
    }
}
