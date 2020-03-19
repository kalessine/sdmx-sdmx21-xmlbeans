/*
 * XML Type:  MetadataAttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML MetadataAttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface MetadataAttributeType extends org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataAttributeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("metadataattributetype7663type");
    
    /**
     * Gets array of all "MetadataAttribute" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType[] getMetadataAttributeArray();
    
    /**
     * Gets ith "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType getMetadataAttributeArray(int i);
    
    /**
     * Returns number of "MetadataAttribute" element
     */
    int sizeOfMetadataAttributeArray();
    
    /**
     * Sets array of all "MetadataAttribute" element
     */
    void setMetadataAttributeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType[] metadataAttributeArray);
    
    /**
     * Sets ith "MetadataAttribute" element
     */
    void setMetadataAttributeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType metadataAttribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType insertNewMetadataAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataAttribute" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType addNewMetadataAttribute();
    
    /**
     * Removes the ith "MetadataAttribute" element
     */
    void removeMetadataAttribute(int i);
    
    /**
     * Gets the "minOccurs" attribute
     */
    java.math.BigInteger getMinOccurs();
    
    /**
     * Gets (as xml) the "minOccurs" attribute
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetMinOccurs();
    
    /**
     * True if has "minOccurs" attribute
     */
    boolean isSetMinOccurs();
    
    /**
     * Sets the "minOccurs" attribute
     */
    void setMinOccurs(java.math.BigInteger minOccurs);
    
    /**
     * Sets (as xml) the "minOccurs" attribute
     */
    void xsetMinOccurs(org.apache.xmlbeans.XmlNonNegativeInteger minOccurs);
    
    /**
     * Unsets the "minOccurs" attribute
     */
    void unsetMinOccurs();
    
    /**
     * Gets the "maxOccurs" attribute
     */
    java.lang.Object getMaxOccurs();
    
    /**
     * Gets (as xml) the "maxOccurs" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType xgetMaxOccurs();
    
    /**
     * True if has "maxOccurs" attribute
     */
    boolean isSetMaxOccurs();
    
    /**
     * Sets the "maxOccurs" attribute
     */
    void setMaxOccurs(java.lang.Object maxOccurs);
    
    /**
     * Sets (as xml) the "maxOccurs" attribute
     */
    void xsetMaxOccurs(org.sdmx.resources.sdmxml.schemas.v21.common.OccurenceType maxOccurs);
    
    /**
     * Unsets the "maxOccurs" attribute
     */
    void unsetMaxOccurs();
    
    /**
     * Gets the "isPresentational" attribute
     */
    boolean getIsPresentational();
    
    /**
     * Gets (as xml) the "isPresentational" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsPresentational();
    
    /**
     * True if has "isPresentational" attribute
     */
    boolean isSetIsPresentational();
    
    /**
     * Sets the "isPresentational" attribute
     */
    void setIsPresentational(boolean isPresentational);
    
    /**
     * Sets (as xml) the "isPresentational" attribute
     */
    void xsetIsPresentational(org.apache.xmlbeans.XmlBoolean isPresentational);
    
    /**
     * Unsets the "isPresentational" attribute
     */
    void unsetIsPresentational();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
