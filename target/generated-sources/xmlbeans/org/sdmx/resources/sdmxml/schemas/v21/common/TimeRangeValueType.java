/*
 * XML Type:  TimeRangeValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML TimeRangeValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public interface TimeRangeValueType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeRangeValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("timerangevaluetyped5d5type");
    
    /**
     * Gets the "BeforePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getBeforePeriod();
    
    /**
     * True if has "BeforePeriod" element
     */
    boolean isSetBeforePeriod();
    
    /**
     * Sets the "BeforePeriod" element
     */
    void setBeforePeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType beforePeriod);
    
    /**
     * Appends and returns a new empty "BeforePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewBeforePeriod();
    
    /**
     * Unsets the "BeforePeriod" element
     */
    void unsetBeforePeriod();
    
    /**
     * Gets the "AfterPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getAfterPeriod();
    
    /**
     * True if has "AfterPeriod" element
     */
    boolean isSetAfterPeriod();
    
    /**
     * Sets the "AfterPeriod" element
     */
    void setAfterPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType afterPeriod);
    
    /**
     * Appends and returns a new empty "AfterPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewAfterPeriod();
    
    /**
     * Unsets the "AfterPeriod" element
     */
    void unsetAfterPeriod();
    
    /**
     * Gets the "StartPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getStartPeriod();
    
    /**
     * True if has "StartPeriod" element
     */
    boolean isSetStartPeriod();
    
    /**
     * Sets the "StartPeriod" element
     */
    void setStartPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType startPeriod);
    
    /**
     * Appends and returns a new empty "StartPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewStartPeriod();
    
    /**
     * Unsets the "StartPeriod" element
     */
    void unsetStartPeriod();
    
    /**
     * Gets the "EndPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType getEndPeriod();
    
    /**
     * True if has "EndPeriod" element
     */
    boolean isSetEndPeriod();
    
    /**
     * Sets the "EndPeriod" element
     */
    void setEndPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType endPeriod);
    
    /**
     * Appends and returns a new empty "EndPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimePeriodRangeType addNewEndPeriod();
    
    /**
     * Unsets the "EndPeriod" element
     */
    void unsetEndPeriod();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
