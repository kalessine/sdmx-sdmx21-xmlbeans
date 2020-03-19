/*
 * XML Type:  ObservationalTimePeriodType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML ObservationalTimePeriodType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
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
 *     org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeType
 */
public class ObservationalTimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.StandardTimePeriodType, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeType
{
    private static final long serialVersionUID = 1L;
    
    public ObservationalTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ObservationalTimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
