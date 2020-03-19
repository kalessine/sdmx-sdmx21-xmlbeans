/*
 * An XML document type.
 * Localname: ComponentListWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ComponentListWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ComponentListWhereDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentListWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTLISTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentListWhere");
    private static final org.apache.xmlbeans.QNameSet COMPONENTLISTWHERE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataTargetWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportStructureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentListWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupWhere"),
    });
    
    
    /**
     * Gets the "ComponentListWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType getComponentListWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().find_element_user(COMPONENTLISTWHERE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ComponentListWhere" element
     */
    public void setComponentListWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType componentListWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().find_element_user(COMPONENTLISTWHERE$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().add_element_user(COMPONENTLISTWHERE$0);
            }
            target.set(componentListWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentListWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType addNewComponentListWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().add_element_user(COMPONENTLISTWHERE$0);
            return target;
        }
    }
}
