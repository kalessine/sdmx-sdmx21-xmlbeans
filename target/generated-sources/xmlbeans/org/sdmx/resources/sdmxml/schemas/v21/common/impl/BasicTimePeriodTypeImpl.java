/*
 * XML Type:  BasicTimePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML BasicTimePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlDateTime
 */
public class BasicTimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.GregorianTimePeriodType, org.apache.xmlbeans.XmlDateTime
{
    private static final long serialVersionUID = 1L;
    
    public BasicTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected BasicTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
