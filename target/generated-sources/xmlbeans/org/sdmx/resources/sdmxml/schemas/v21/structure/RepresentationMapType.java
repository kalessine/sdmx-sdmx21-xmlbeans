/*
 * XML Type:  RepresentationMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML RepresentationMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface RepresentationMapType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepresentationMapType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("representationmaptypef785type");
    
    /**
     * Gets the "CodelistMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType getCodelistMap();
    
    /**
     * True if has "CodelistMap" element
     */
    boolean isSetCodelistMap();
    
    /**
     * Sets the "CodelistMap" element
     */
    void setCodelistMap(org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType codelistMap);
    
    /**
     * Appends and returns a new empty "CodelistMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodelistMapReferenceType addNewCodelistMap();
    
    /**
     * Unsets the "CodelistMap" element
     */
    void unsetCodelistMap();
    
    /**
     * Gets the "ToTextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType getToTextFormat();
    
    /**
     * True if has "ToTextFormat" element
     */
    boolean isSetToTextFormat();
    
    /**
     * Sets the "ToTextFormat" element
     */
    void setToTextFormat(org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType toTextFormat);
    
    /**
     * Appends and returns a new empty "ToTextFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TextFormatType addNewToTextFormat();
    
    /**
     * Unsets the "ToTextFormat" element
     */
    void unsetToTextFormat();
    
    /**
     * Gets the "ToValueType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType.Enum getToValueType();
    
    /**
     * Gets (as xml) the "ToValueType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType xgetToValueType();
    
    /**
     * True if has "ToValueType" element
     */
    boolean isSetToValueType();
    
    /**
     * Sets the "ToValueType" element
     */
    void setToValueType(org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType.Enum toValueType);
    
    /**
     * Sets (as xml) the "ToValueType" element
     */
    void xsetToValueType(org.sdmx.resources.sdmxml.schemas.v21.structure.ToValueTypeType toValueType);
    
    /**
     * Unsets the "ToValueType" element
     */
    void unsetToValueType();
    
    /**
     * Gets the "ValueMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType getValueMap();
    
    /**
     * True if has "ValueMap" element
     */
    boolean isSetValueMap();
    
    /**
     * Sets the "ValueMap" element
     */
    void setValueMap(org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType valueMap);
    
    /**
     * Appends and returns a new empty "ValueMap" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ValueMapType addNewValueMap();
    
    /**
     * Unsets the "ValueMap" element
     */
    void unsetValueMap();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.RepresentationMapType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
