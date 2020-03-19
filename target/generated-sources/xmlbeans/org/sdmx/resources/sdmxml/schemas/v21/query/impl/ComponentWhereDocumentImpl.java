/*
 * An XML document type.
 * Localname: ComponentWhere
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * A document containing one ComponentWhere(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query) element.
 *
 * This is a complex type.
 */
public class ComponentWhereDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentWhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTWHERE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentWhere");
    private static final org.apache.xmlbeans.QNameSet COMPONENTWHERE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupDimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttributeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MeasureDimensionWhere"),
    });
    
    
    /**
     * Gets the "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType getComponentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().find_element_user(COMPONENTWHERE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ComponentWhere" element
     */
    public void setComponentWhere(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType componentWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().find_element_user(COMPONENTWHERE$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().add_element_user(COMPONENTWHERE$0);
            }
            target.set(componentWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType addNewComponentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().add_element_user(COMPONENTWHERE$0);
            return target;
        }
    }
}
