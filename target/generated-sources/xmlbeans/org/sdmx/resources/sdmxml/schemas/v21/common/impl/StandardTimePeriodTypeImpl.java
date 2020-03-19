/*
 * XML Type:  StandardTimePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML StandardTimePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlDateTime
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingYearType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingSemesterType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTrimesterType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingQuarterType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingMonthType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingWeekType
 *     org.sdmx.resources.sdmxml.schemas.v21.common.ReportingDayType
 */
public class StandardTimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.ReportingTimePeriodType
{
    private static final long serialVersionUID = 1L;
    
    public StandardTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected StandardTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
