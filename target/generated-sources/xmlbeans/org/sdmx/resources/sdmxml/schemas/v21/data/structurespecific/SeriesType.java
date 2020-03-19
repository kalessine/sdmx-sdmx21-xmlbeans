/*
 * XML Type:  SeriesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific;


/**
 * An XML SeriesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific).
 *
 * This is a complex type.
 */
public interface SeriesType extends org.sdmx.resources.sdmxml.schemas.v21.common.AnnotableType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeriesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("seriestype5d94type");
    
    /**
     * Gets array of all "Obs" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] getObsArray();
    
    /**
     * Gets ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType getObsArray(int i);
    
    /**
     * Returns number of "Obs" element
     */
    int sizeOfObsArray();
    
    /**
     * Sets array of all "Obs" element
     */
    void setObsArray(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] obsArray);
    
    /**
     * Sets ith "Obs" element
     */
    void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType obs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType insertNewObs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType addNewObs();
    
    /**
     * Removes the ith "Obs" element
     */
    void removeObs(int i);
    
    /**
     * Gets the "TIME_PERIOD" attribute
     */
    java.lang.Object getTIMEPERIOD();
    
    /**
     * Gets (as xml) the "TIME_PERIOD" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetTIMEPERIOD();
    
    /**
     * True if has "TIME_PERIOD" attribute
     */
    boolean isSetTIMEPERIOD();
    
    /**
     * Sets the "TIME_PERIOD" attribute
     */
    void setTIMEPERIOD(java.lang.Object timeperiod);
    
    /**
     * Sets (as xml) the "TIME_PERIOD" attribute
     */
    void xsetTIMEPERIOD(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType timeperiod);
    
    /**
     * Unsets the "TIME_PERIOD" attribute
     */
    void unsetTIMEPERIOD();
    
    /**
     * Gets the "REPORTING_YEAR_START_DAY" attribute
     */
    java.util.Calendar getREPORTINGYEARSTARTDAY();
    
    /**
     * Gets (as xml) the "REPORTING_YEAR_START_DAY" attribute
     */
    org.apache.xmlbeans.XmlGMonthDay xgetREPORTINGYEARSTARTDAY();
    
    /**
     * True if has "REPORTING_YEAR_START_DAY" attribute
     */
    boolean isSetREPORTINGYEARSTARTDAY();
    
    /**
     * Sets the "REPORTING_YEAR_START_DAY" attribute
     */
    void setREPORTINGYEARSTARTDAY(java.util.Calendar reportingyearstartday);
    
    /**
     * Sets (as xml) the "REPORTING_YEAR_START_DAY" attribute
     */
    void xsetREPORTINGYEARSTARTDAY(org.apache.xmlbeans.XmlGMonthDay reportingyearstartday);
    
    /**
     * Unsets the "REPORTING_YEAR_START_DAY" attribute
     */
    void unsetREPORTINGYEARSTARTDAY();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
