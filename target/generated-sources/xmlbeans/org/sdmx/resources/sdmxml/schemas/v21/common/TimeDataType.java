/*
 * XML Type:  TimeDataType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML TimeDataType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType.
 */
public interface TimeDataType extends org.sdmx.resources.sdmxml.schemas.v21.common.SimpleDataType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeDataType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("timedatatype9f9ftype");
    
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum OBSERVATIONAL_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.OBSERVATIONAL_TIME_PERIOD;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum STANDARD_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.STANDARD_TIME_PERIOD;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum BASIC_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.BASIC_TIME_PERIOD;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum GREGORIAN_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.GREGORIAN_TIME_PERIOD;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum GREGORIAN_YEAR = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.GREGORIAN_YEAR;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum GREGORIAN_YEAR_MONTH = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.GREGORIAN_YEAR_MONTH;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum GREGORIAN_DAY = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.GREGORIAN_DAY;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_TIME_PERIOD;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_YEAR = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_YEAR;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_SEMESTER = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_SEMESTER;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_TRIMESTER = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_TRIMESTER;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_QUARTER = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_QUARTER;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_MONTH = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_MONTH;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_WEEK = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_WEEK;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum REPORTING_DAY = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.REPORTING_DAY;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum DATE_TIME = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.DATE_TIME;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum TIME_RANGE = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.TIME_RANGE;
    
    static final int INT_OBSERVATIONAL_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_OBSERVATIONAL_TIME_PERIOD;
    static final int INT_STANDARD_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_STANDARD_TIME_PERIOD;
    static final int INT_BASIC_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_BASIC_TIME_PERIOD;
    static final int INT_GREGORIAN_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_GREGORIAN_TIME_PERIOD;
    static final int INT_GREGORIAN_YEAR = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_GREGORIAN_YEAR;
    static final int INT_GREGORIAN_YEAR_MONTH = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_GREGORIAN_YEAR_MONTH;
    static final int INT_GREGORIAN_DAY = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_GREGORIAN_DAY;
    static final int INT_REPORTING_TIME_PERIOD = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_TIME_PERIOD;
    static final int INT_REPORTING_YEAR = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_YEAR;
    static final int INT_REPORTING_SEMESTER = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_SEMESTER;
    static final int INT_REPORTING_TRIMESTER = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_TRIMESTER;
    static final int INT_REPORTING_QUARTER = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_QUARTER;
    static final int INT_REPORTING_MONTH = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_MONTH;
    static final int INT_REPORTING_WEEK = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_WEEK;
    static final int INT_REPORTING_DAY = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_REPORTING_DAY;
    static final int INT_DATE_TIME = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_DATE_TIME;
    static final int INT_TIME_RANGE = org.sdmx.resources.sdmxml.schemas.v21.common.DataType.INT_TIME_RANGE;
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
