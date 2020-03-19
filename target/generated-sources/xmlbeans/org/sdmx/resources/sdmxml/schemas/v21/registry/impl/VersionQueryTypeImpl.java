/*
 * XML Type:  VersionQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML VersionQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.sdmx.resources.sdmxml.schemas.v21.common.VersionType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.LateBoundVersionType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.WildCardValueType
 */
public class VersionQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.VersionQueryType, org.sdmx.resources.sdmxml.schemas.v21.common.VersionQueryType, org.sdmx.resources.sdmxml.schemas.v21.common.WildCardValueType
{
    private static final long serialVersionUID = 1L;
    
    public VersionQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected VersionQueryTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
