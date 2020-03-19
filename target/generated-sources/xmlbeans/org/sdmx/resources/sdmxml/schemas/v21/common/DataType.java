/*
 * XML Type:  DataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.DataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML DataType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.common.DataType.
 */
public interface DataType extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("datatyped46ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum STRING = Enum.forString("String");
    static final Enum ALPHA = Enum.forString("Alpha");
    static final Enum ALPHA_NUMERIC = Enum.forString("AlphaNumeric");
    static final Enum NUMERIC = Enum.forString("Numeric");
    static final Enum BIG_INTEGER = Enum.forString("BigInteger");
    static final Enum INTEGER = Enum.forString("Integer");
    static final Enum LONG = Enum.forString("Long");
    static final Enum SHORT = Enum.forString("Short");
    static final Enum DECIMAL = Enum.forString("Decimal");
    static final Enum FLOAT = Enum.forString("Float");
    static final Enum DOUBLE = Enum.forString("Double");
    static final Enum BOOLEAN = Enum.forString("Boolean");
    static final Enum URI = Enum.forString("URI");
    static final Enum COUNT = Enum.forString("Count");
    static final Enum INCLUSIVE_VALUE_RANGE = Enum.forString("InclusiveValueRange");
    static final Enum EXCLUSIVE_VALUE_RANGE = Enum.forString("ExclusiveValueRange");
    static final Enum INCREMENTAL = Enum.forString("Incremental");
    static final Enum OBSERVATIONAL_TIME_PERIOD = Enum.forString("ObservationalTimePeriod");
    static final Enum STANDARD_TIME_PERIOD = Enum.forString("StandardTimePeriod");
    static final Enum BASIC_TIME_PERIOD = Enum.forString("BasicTimePeriod");
    static final Enum GREGORIAN_TIME_PERIOD = Enum.forString("GregorianTimePeriod");
    static final Enum GREGORIAN_YEAR = Enum.forString("GregorianYear");
    static final Enum GREGORIAN_YEAR_MONTH = Enum.forString("GregorianYearMonth");
    static final Enum GREGORIAN_DAY = Enum.forString("GregorianDay");
    static final Enum REPORTING_TIME_PERIOD = Enum.forString("ReportingTimePeriod");
    static final Enum REPORTING_YEAR = Enum.forString("ReportingYear");
    static final Enum REPORTING_SEMESTER = Enum.forString("ReportingSemester");
    static final Enum REPORTING_TRIMESTER = Enum.forString("ReportingTrimester");
    static final Enum REPORTING_QUARTER = Enum.forString("ReportingQuarter");
    static final Enum REPORTING_MONTH = Enum.forString("ReportingMonth");
    static final Enum REPORTING_WEEK = Enum.forString("ReportingWeek");
    static final Enum REPORTING_DAY = Enum.forString("ReportingDay");
    static final Enum DATE_TIME = Enum.forString("DateTime");
    static final Enum TIME_RANGE = Enum.forString("TimeRange");
    static final Enum MONTH = Enum.forString("Month");
    static final Enum MONTH_DAY = Enum.forString("MonthDay");
    static final Enum DAY = Enum.forString("Day");
    static final Enum TIME = Enum.forString("Time");
    static final Enum DURATION = Enum.forString("Duration");
    static final Enum XHTML = Enum.forString("XHTML");
    static final Enum KEY_VALUES = Enum.forString("KeyValues");
    static final Enum IDENTIFIABLE_REFERENCE = Enum.forString("IdentifiableReference");
    static final Enum DATA_SET_REFERENCE = Enum.forString("DataSetReference");
    static final Enum ATTACHMENT_CONSTRAINT_REFERENCE = Enum.forString("AttachmentConstraintReference");
    
    static final int INT_STRING = Enum.INT_STRING;
    static final int INT_ALPHA = Enum.INT_ALPHA;
    static final int INT_ALPHA_NUMERIC = Enum.INT_ALPHA_NUMERIC;
    static final int INT_NUMERIC = Enum.INT_NUMERIC;
    static final int INT_BIG_INTEGER = Enum.INT_BIG_INTEGER;
    static final int INT_INTEGER = Enum.INT_INTEGER;
    static final int INT_LONG = Enum.INT_LONG;
    static final int INT_SHORT = Enum.INT_SHORT;
    static final int INT_DECIMAL = Enum.INT_DECIMAL;
    static final int INT_FLOAT = Enum.INT_FLOAT;
    static final int INT_DOUBLE = Enum.INT_DOUBLE;
    static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
    static final int INT_URI = Enum.INT_URI;
    static final int INT_COUNT = Enum.INT_COUNT;
    static final int INT_INCLUSIVE_VALUE_RANGE = Enum.INT_INCLUSIVE_VALUE_RANGE;
    static final int INT_EXCLUSIVE_VALUE_RANGE = Enum.INT_EXCLUSIVE_VALUE_RANGE;
    static final int INT_INCREMENTAL = Enum.INT_INCREMENTAL;
    static final int INT_OBSERVATIONAL_TIME_PERIOD = Enum.INT_OBSERVATIONAL_TIME_PERIOD;
    static final int INT_STANDARD_TIME_PERIOD = Enum.INT_STANDARD_TIME_PERIOD;
    static final int INT_BASIC_TIME_PERIOD = Enum.INT_BASIC_TIME_PERIOD;
    static final int INT_GREGORIAN_TIME_PERIOD = Enum.INT_GREGORIAN_TIME_PERIOD;
    static final int INT_GREGORIAN_YEAR = Enum.INT_GREGORIAN_YEAR;
    static final int INT_GREGORIAN_YEAR_MONTH = Enum.INT_GREGORIAN_YEAR_MONTH;
    static final int INT_GREGORIAN_DAY = Enum.INT_GREGORIAN_DAY;
    static final int INT_REPORTING_TIME_PERIOD = Enum.INT_REPORTING_TIME_PERIOD;
    static final int INT_REPORTING_YEAR = Enum.INT_REPORTING_YEAR;
    static final int INT_REPORTING_SEMESTER = Enum.INT_REPORTING_SEMESTER;
    static final int INT_REPORTING_TRIMESTER = Enum.INT_REPORTING_TRIMESTER;
    static final int INT_REPORTING_QUARTER = Enum.INT_REPORTING_QUARTER;
    static final int INT_REPORTING_MONTH = Enum.INT_REPORTING_MONTH;
    static final int INT_REPORTING_WEEK = Enum.INT_REPORTING_WEEK;
    static final int INT_REPORTING_DAY = Enum.INT_REPORTING_DAY;
    static final int INT_DATE_TIME = Enum.INT_DATE_TIME;
    static final int INT_TIME_RANGE = Enum.INT_TIME_RANGE;
    static final int INT_MONTH = Enum.INT_MONTH;
    static final int INT_MONTH_DAY = Enum.INT_MONTH_DAY;
    static final int INT_DAY = Enum.INT_DAY;
    static final int INT_TIME = Enum.INT_TIME;
    static final int INT_DURATION = Enum.INT_DURATION;
    static final int INT_XHTML = Enum.INT_XHTML;
    static final int INT_KEY_VALUES = Enum.INT_KEY_VALUES;
    static final int INT_IDENTIFIABLE_REFERENCE = Enum.INT_IDENTIFIABLE_REFERENCE;
    static final int INT_DATA_SET_REFERENCE = Enum.INT_DATA_SET_REFERENCE;
    static final int INT_ATTACHMENT_CONSTRAINT_REFERENCE = Enum.INT_ATTACHMENT_CONSTRAINT_REFERENCE;
    
    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v21.common.DataType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_STRING
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_STRING = 1;
        static final int INT_ALPHA = 2;
        static final int INT_ALPHA_NUMERIC = 3;
        static final int INT_NUMERIC = 4;
        static final int INT_BIG_INTEGER = 5;
        static final int INT_INTEGER = 6;
        static final int INT_LONG = 7;
        static final int INT_SHORT = 8;
        static final int INT_DECIMAL = 9;
        static final int INT_FLOAT = 10;
        static final int INT_DOUBLE = 11;
        static final int INT_BOOLEAN = 12;
        static final int INT_URI = 13;
        static final int INT_COUNT = 14;
        static final int INT_INCLUSIVE_VALUE_RANGE = 15;
        static final int INT_EXCLUSIVE_VALUE_RANGE = 16;
        static final int INT_INCREMENTAL = 17;
        static final int INT_OBSERVATIONAL_TIME_PERIOD = 18;
        static final int INT_STANDARD_TIME_PERIOD = 19;
        static final int INT_BASIC_TIME_PERIOD = 20;
        static final int INT_GREGORIAN_TIME_PERIOD = 21;
        static final int INT_GREGORIAN_YEAR = 22;
        static final int INT_GREGORIAN_YEAR_MONTH = 23;
        static final int INT_GREGORIAN_DAY = 24;
        static final int INT_REPORTING_TIME_PERIOD = 25;
        static final int INT_REPORTING_YEAR = 26;
        static final int INT_REPORTING_SEMESTER = 27;
        static final int INT_REPORTING_TRIMESTER = 28;
        static final int INT_REPORTING_QUARTER = 29;
        static final int INT_REPORTING_MONTH = 30;
        static final int INT_REPORTING_WEEK = 31;
        static final int INT_REPORTING_DAY = 32;
        static final int INT_DATE_TIME = 33;
        static final int INT_TIME_RANGE = 34;
        static final int INT_MONTH = 35;
        static final int INT_MONTH_DAY = 36;
        static final int INT_DAY = 37;
        static final int INT_TIME = 38;
        static final int INT_DURATION = 39;
        static final int INT_XHTML = 40;
        static final int INT_KEY_VALUES = 41;
        static final int INT_IDENTIFIABLE_REFERENCE = 42;
        static final int INT_DATA_SET_REFERENCE = 43;
        static final int INT_ATTACHMENT_CONSTRAINT_REFERENCE = 44;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("String", INT_STRING),
                new Enum("Alpha", INT_ALPHA),
                new Enum("AlphaNumeric", INT_ALPHA_NUMERIC),
                new Enum("Numeric", INT_NUMERIC),
                new Enum("BigInteger", INT_BIG_INTEGER),
                new Enum("Integer", INT_INTEGER),
                new Enum("Long", INT_LONG),
                new Enum("Short", INT_SHORT),
                new Enum("Decimal", INT_DECIMAL),
                new Enum("Float", INT_FLOAT),
                new Enum("Double", INT_DOUBLE),
                new Enum("Boolean", INT_BOOLEAN),
                new Enum("URI", INT_URI),
                new Enum("Count", INT_COUNT),
                new Enum("InclusiveValueRange", INT_INCLUSIVE_VALUE_RANGE),
                new Enum("ExclusiveValueRange", INT_EXCLUSIVE_VALUE_RANGE),
                new Enum("Incremental", INT_INCREMENTAL),
                new Enum("ObservationalTimePeriod", INT_OBSERVATIONAL_TIME_PERIOD),
                new Enum("StandardTimePeriod", INT_STANDARD_TIME_PERIOD),
                new Enum("BasicTimePeriod", INT_BASIC_TIME_PERIOD),
                new Enum("GregorianTimePeriod", INT_GREGORIAN_TIME_PERIOD),
                new Enum("GregorianYear", INT_GREGORIAN_YEAR),
                new Enum("GregorianYearMonth", INT_GREGORIAN_YEAR_MONTH),
                new Enum("GregorianDay", INT_GREGORIAN_DAY),
                new Enum("ReportingTimePeriod", INT_REPORTING_TIME_PERIOD),
                new Enum("ReportingYear", INT_REPORTING_YEAR),
                new Enum("ReportingSemester", INT_REPORTING_SEMESTER),
                new Enum("ReportingTrimester", INT_REPORTING_TRIMESTER),
                new Enum("ReportingQuarter", INT_REPORTING_QUARTER),
                new Enum("ReportingMonth", INT_REPORTING_MONTH),
                new Enum("ReportingWeek", INT_REPORTING_WEEK),
                new Enum("ReportingDay", INT_REPORTING_DAY),
                new Enum("DateTime", INT_DATE_TIME),
                new Enum("TimeRange", INT_TIME_RANGE),
                new Enum("Month", INT_MONTH),
                new Enum("MonthDay", INT_MONTH_DAY),
                new Enum("Day", INT_DAY),
                new Enum("Time", INT_TIME),
                new Enum("Duration", INT_DURATION),
                new Enum("XHTML", INT_XHTML),
                new Enum("KeyValues", INT_KEY_VALUES),
                new Enum("IdentifiableReference", INT_IDENTIFIABLE_REFERENCE),
                new Enum("DataSetReference", INT_DATA_SET_REFERENCE),
                new Enum("AttachmentConstraintReference", INT_ATTACHMENT_CONSTRAINT_REFERENCE),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.DataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.DataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
