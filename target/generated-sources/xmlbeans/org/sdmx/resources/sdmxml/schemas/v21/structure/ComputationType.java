/*
 * XML Type:  ComputationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML ComputationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface ComputationType extends org.sdmx.resources.sdmxml.schemas.v21.common.AnnotableType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComputationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("computationtypeb93dtype");
    
    /**
     * Gets array of all "Description" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getDescriptionArray();
    
    /**
     * Gets ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getDescriptionArray(int i);
    
    /**
     * Returns number of "Description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "Description" element
     */
    void setDescriptionArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] descriptionArray);
    
    /**
     * Sets ith "Description" element
     */
    void setDescriptionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewDescription();
    
    /**
     * Removes the ith "Description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "localID" attribute
     */
    java.lang.String getLocalID();
    
    /**
     * Gets (as xml) the "localID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetLocalID();
    
    /**
     * True if has "localID" attribute
     */
    boolean isSetLocalID();
    
    /**
     * Sets the "localID" attribute
     */
    void setLocalID(java.lang.String localID);
    
    /**
     * Sets (as xml) the "localID" attribute
     */
    void xsetLocalID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType localID);
    
    /**
     * Unsets the "localID" attribute
     */
    void unsetLocalID();
    
    /**
     * Gets the "softwarePackage" attribute
     */
    java.lang.String getSoftwarePackage();
    
    /**
     * Gets (as xml) the "softwarePackage" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoftwarePackage();
    
    /**
     * True if has "softwarePackage" attribute
     */
    boolean isSetSoftwarePackage();
    
    /**
     * Sets the "softwarePackage" attribute
     */
    void setSoftwarePackage(java.lang.String softwarePackage);
    
    /**
     * Sets (as xml) the "softwarePackage" attribute
     */
    void xsetSoftwarePackage(org.apache.xmlbeans.XmlString softwarePackage);
    
    /**
     * Unsets the "softwarePackage" attribute
     */
    void unsetSoftwarePackage();
    
    /**
     * Gets the "softwareLanguage" attribute
     */
    java.lang.String getSoftwareLanguage();
    
    /**
     * Gets (as xml) the "softwareLanguage" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoftwareLanguage();
    
    /**
     * True if has "softwareLanguage" attribute
     */
    boolean isSetSoftwareLanguage();
    
    /**
     * Sets the "softwareLanguage" attribute
     */
    void setSoftwareLanguage(java.lang.String softwareLanguage);
    
    /**
     * Sets (as xml) the "softwareLanguage" attribute
     */
    void xsetSoftwareLanguage(org.apache.xmlbeans.XmlString softwareLanguage);
    
    /**
     * Unsets the "softwareLanguage" attribute
     */
    void unsetSoftwareLanguage();
    
    /**
     * Gets the "softwareVersion" attribute
     */
    java.lang.String getSoftwareVersion();
    
    /**
     * Gets (as xml) the "softwareVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoftwareVersion();
    
    /**
     * True if has "softwareVersion" attribute
     */
    boolean isSetSoftwareVersion();
    
    /**
     * Sets the "softwareVersion" attribute
     */
    void setSoftwareVersion(java.lang.String softwareVersion);
    
    /**
     * Sets (as xml) the "softwareVersion" attribute
     */
    void xsetSoftwareVersion(org.apache.xmlbeans.XmlString softwareVersion);
    
    /**
     * Unsets the "softwareVersion" attribute
     */
    void unsetSoftwareVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
