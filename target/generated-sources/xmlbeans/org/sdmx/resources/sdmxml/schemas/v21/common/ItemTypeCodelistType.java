/*
 * XML Type:  ItemTypeCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML ItemTypeCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType.
 */
public interface ItemTypeCodelistType extends org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemTypeCodelistType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("itemtypecodelisttype8c3etype");
    
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum AGENCY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.AGENCY;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum CATEGORY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.CATEGORY;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum CODE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.CODE;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum CONCEPT = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.CONCEPT;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DATA_CONSUMER = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DATA_CONSUMER;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DATA_PROVIDER = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DATA_PROVIDER;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum ORGANISATION_UNIT = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.ORGANISATION_UNIT;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum REPORTING_CATEGORY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.REPORTING_CATEGORY;
    
    static final int INT_AGENCY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_AGENCY;
    static final int INT_CATEGORY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_CATEGORY;
    static final int INT_CODE = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_CODE;
    static final int INT_CONCEPT = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_CONCEPT;
    static final int INT_DATA_CONSUMER = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DATA_CONSUMER;
    static final int INT_DATA_PROVIDER = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DATA_PROVIDER;
    static final int INT_ORGANISATION_UNIT = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_ORGANISATION_UNIT;
    static final int INT_REPORTING_CATEGORY = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_REPORTING_CATEGORY;
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ItemTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
