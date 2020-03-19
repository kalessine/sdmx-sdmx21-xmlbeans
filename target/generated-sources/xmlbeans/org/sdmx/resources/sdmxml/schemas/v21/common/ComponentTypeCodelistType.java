/*
 * XML Type:  ComponentTypeCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML ComponentTypeCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType.
 */
public interface ComponentTypeCodelistType extends org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentTypeCodelistType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("componenttypecodelisttype77c6type");
    
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum ATTRIBUTE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.ATTRIBUTE;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum CONSTRAINT_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.CONSTRAINT_TARGET;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DATA_SET_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DATA_SET_TARGET;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DIMENSION = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DIMENSION;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum IDENTIFIABLE_OBJECT_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.IDENTIFIABLE_OBJECT_TARGET;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DIMENSION_DESCRIPTOR_VALUES_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DIMENSION_DESCRIPTOR_VALUES_TARGET;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum MEASURE_DIMENSION = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.MEASURE_DIMENSION;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum METADATA_ATTRIBUTE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.METADATA_ATTRIBUTE;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum PRIMARY_MEASURE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.PRIMARY_MEASURE;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum REPORTING_YEAR_START_DAY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.REPORTING_YEAR_START_DAY;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum REPORT_PERIOD_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.REPORT_PERIOD_TARGET;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum TIME_DIMENSION = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.TIME_DIMENSION;
    
    static final int INT_ATTRIBUTE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_ATTRIBUTE;
    static final int INT_CONSTRAINT_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_CONSTRAINT_TARGET;
    static final int INT_DATA_SET_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DATA_SET_TARGET;
    static final int INT_DIMENSION = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DIMENSION;
    static final int INT_IDENTIFIABLE_OBJECT_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_IDENTIFIABLE_OBJECT_TARGET;
    static final int INT_DIMENSION_DESCRIPTOR_VALUES_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DIMENSION_DESCRIPTOR_VALUES_TARGET;
    static final int INT_MEASURE_DIMENSION = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_MEASURE_DIMENSION;
    static final int INT_METADATA_ATTRIBUTE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_METADATA_ATTRIBUTE;
    static final int INT_PRIMARY_MEASURE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_PRIMARY_MEASURE;
    static final int INT_REPORTING_YEAR_START_DAY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_REPORTING_YEAR_START_DAY;
    static final int INT_REPORT_PERIOD_TARGET = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_REPORT_PERIOD_TARGET;
    static final int INT_TIME_DIMENSION = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_TIME_DIMENSION;
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
