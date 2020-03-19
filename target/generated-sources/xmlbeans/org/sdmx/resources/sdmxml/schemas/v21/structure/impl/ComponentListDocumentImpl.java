/*
 * An XML document type.
 * Localname: ComponentList
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ComponentList(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ComponentListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTLIST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ComponentList");
    private static final org.apache.xmlbeans.QNameSet COMPONENTLIST$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DimensionList"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ComponentList"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportStructure"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Group"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MeasureList"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataTarget"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "AttributeList"),
    });
    
    
    /**
     * Gets the "ComponentList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType getComponentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().find_element_user(COMPONENTLIST$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ComponentList" element
     */
    public void setComponentList(org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType componentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().find_element_user(COMPONENTLIST$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().add_element_user(COMPONENTLIST$0);
            }
            target.set(componentList);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentList" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType addNewComponentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ComponentListType)get_store().add_element_user(COMPONENTLIST$0);
            return target;
        }
    }
}
