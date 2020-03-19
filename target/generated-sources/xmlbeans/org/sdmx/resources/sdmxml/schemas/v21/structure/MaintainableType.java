/*
 * XML Type:  MaintainableType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML MaintainableType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface MaintainableType extends org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaintainableType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("maintainabletype140dtype");
    
    /**
     * Gets the "agencyID" attribute
     */
    java.lang.String getAgencyID();
    
    /**
     * Gets (as xml) the "agencyID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType xgetAgencyID();
    
    /**
     * Sets the "agencyID" attribute
     */
    void setAgencyID(java.lang.String agencyID);
    
    /**
     * Sets (as xml) the "agencyID" attribute
     */
    void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType agencyID);
    
    /**
     * Gets the "isFinal" attribute
     */
    boolean getIsFinal();
    
    /**
     * Gets (as xml) the "isFinal" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsFinal();
    
    /**
     * True if has "isFinal" attribute
     */
    boolean isSetIsFinal();
    
    /**
     * Sets the "isFinal" attribute
     */
    void setIsFinal(boolean isFinal);
    
    /**
     * Sets (as xml) the "isFinal" attribute
     */
    void xsetIsFinal(org.apache.xmlbeans.XmlBoolean isFinal);
    
    /**
     * Unsets the "isFinal" attribute
     */
    void unsetIsFinal();
    
    /**
     * Gets the "isExternalReference" attribute
     */
    boolean getIsExternalReference();
    
    /**
     * Gets (as xml) the "isExternalReference" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsExternalReference();
    
    /**
     * True if has "isExternalReference" attribute
     */
    boolean isSetIsExternalReference();
    
    /**
     * Sets the "isExternalReference" attribute
     */
    void setIsExternalReference(boolean isExternalReference);
    
    /**
     * Sets (as xml) the "isExternalReference" attribute
     */
    void xsetIsExternalReference(org.apache.xmlbeans.XmlBoolean isExternalReference);
    
    /**
     * Unsets the "isExternalReference" attribute
     */
    void unsetIsExternalReference();
    
    /**
     * Gets the "serviceURL" attribute
     */
    java.lang.String getServiceURL();
    
    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetServiceURL();
    
    /**
     * True if has "serviceURL" attribute
     */
    boolean isSetServiceURL();
    
    /**
     * Sets the "serviceURL" attribute
     */
    void setServiceURL(java.lang.String serviceURL);
    
    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL);
    
    /**
     * Unsets the "serviceURL" attribute
     */
    void unsetServiceURL();
    
    /**
     * Gets the "structureURL" attribute
     */
    java.lang.String getStructureURL();
    
    /**
     * Gets (as xml) the "structureURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetStructureURL();
    
    /**
     * True if has "structureURL" attribute
     */
    boolean isSetStructureURL();
    
    /**
     * Sets the "structureURL" attribute
     */
    void setStructureURL(java.lang.String structureURL);
    
    /**
     * Sets (as xml) the "structureURL" attribute
     */
    void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL);
    
    /**
     * Unsets the "structureURL" attribute
     */
    void unsetStructureURL();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MaintainableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
