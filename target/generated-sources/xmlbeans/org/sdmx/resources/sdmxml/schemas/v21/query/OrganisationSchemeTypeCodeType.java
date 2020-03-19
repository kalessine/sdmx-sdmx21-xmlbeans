/*
 * XML Type:  OrganisationSchemeTypeCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML OrganisationSchemeTypeCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType.
 */
public interface OrganisationSchemeTypeCodeType extends org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableTypeCodelistType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationSchemeTypeCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("organisationschemetypecodetype0c43type");
    
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum ORGANISATION_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.ORGANISATION_SCHEME;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum AGENCY_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.AGENCY_SCHEME;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DATA_CONSUMER_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DATA_CONSUMER_SCHEME;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum DATA_PROVIDER_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.DATA_PROVIDER_SCHEME;
    static final org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum ORGANISATION_UNIT_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.ORGANISATION_UNIT_SCHEME;
    
    static final int INT_ORGANISATION_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_ORGANISATION_SCHEME;
    static final int INT_AGENCY_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_AGENCY_SCHEME;
    static final int INT_DATA_CONSUMER_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DATA_CONSUMER_SCHEME;
    static final int INT_DATA_PROVIDER_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_DATA_PROVIDER_SCHEME;
    static final int INT_ORGANISATION_UNIT_SCHEME = org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.INT_ORGANISATION_UNIT_SCHEME;
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.OrganisationSchemeTypeCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
