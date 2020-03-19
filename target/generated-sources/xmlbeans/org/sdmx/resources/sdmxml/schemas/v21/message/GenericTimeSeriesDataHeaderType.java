/*
 * XML Type:  GenericTimeSeriesDataHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message;


/**
 * An XML GenericTimeSeriesDataHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public interface GenericTimeSeriesDataHeaderType extends org.sdmx.resources.sdmxml.schemas.v21.message.GenericDataHeaderType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenericTimeSeriesDataHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("generictimeseriesdataheadertypeaf5ctype");
    
    /**
     * Gets array of all "Structure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] getStructureArray();
    
    /**
     * Gets ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType getStructureArray(int i);
    
    /**
     * Returns number of "Structure" element
     */
    int sizeOfStructureArray();
    
    /**
     * Sets array of all "Structure" element
     */
    void setStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] structureArray);
    
    /**
     * Sets ith "Structure" element
     */
    void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType structure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType insertNewStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType addNewStructure();
    
    /**
     * Removes the ith "Structure" element
     */
    void removeStructure(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.GenericTimeSeriesDataHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
