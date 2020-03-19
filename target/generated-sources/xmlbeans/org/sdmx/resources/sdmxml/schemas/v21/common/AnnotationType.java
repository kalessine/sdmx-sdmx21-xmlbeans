/*
 * XML Type:  AnnotationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML AnnotationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public interface AnnotationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnnotationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("annotationtype29c7type");
    
    /**
     * Gets the "AnnotationTitle" element
     */
    java.lang.String getAnnotationTitle();
    
    /**
     * Gets (as xml) the "AnnotationTitle" element
     */
    org.apache.xmlbeans.XmlString xgetAnnotationTitle();
    
    /**
     * True if has "AnnotationTitle" element
     */
    boolean isSetAnnotationTitle();
    
    /**
     * Sets the "AnnotationTitle" element
     */
    void setAnnotationTitle(java.lang.String annotationTitle);
    
    /**
     * Sets (as xml) the "AnnotationTitle" element
     */
    void xsetAnnotationTitle(org.apache.xmlbeans.XmlString annotationTitle);
    
    /**
     * Unsets the "AnnotationTitle" element
     */
    void unsetAnnotationTitle();
    
    /**
     * Gets the "AnnotationType" element
     */
    java.lang.String getAnnotationType();
    
    /**
     * Gets (as xml) the "AnnotationType" element
     */
    org.apache.xmlbeans.XmlString xgetAnnotationType();
    
    /**
     * True if has "AnnotationType" element
     */
    boolean isSetAnnotationType();
    
    /**
     * Sets the "AnnotationType" element
     */
    void setAnnotationType(java.lang.String annotationType);
    
    /**
     * Sets (as xml) the "AnnotationType" element
     */
    void xsetAnnotationType(org.apache.xmlbeans.XmlString annotationType);
    
    /**
     * Unsets the "AnnotationType" element
     */
    void unsetAnnotationType();
    
    /**
     * Gets the "AnnotationURL" element
     */
    java.lang.String getAnnotationURL();
    
    /**
     * Gets (as xml) the "AnnotationURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetAnnotationURL();
    
    /**
     * True if has "AnnotationURL" element
     */
    boolean isSetAnnotationURL();
    
    /**
     * Sets the "AnnotationURL" element
     */
    void setAnnotationURL(java.lang.String annotationURL);
    
    /**
     * Sets (as xml) the "AnnotationURL" element
     */
    void xsetAnnotationURL(org.apache.xmlbeans.XmlAnyURI annotationURL);
    
    /**
     * Unsets the "AnnotationURL" element
     */
    void unsetAnnotationURL();
    
    /**
     * Gets array of all "AnnotationText" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getAnnotationTextArray();
    
    /**
     * Gets ith "AnnotationText" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getAnnotationTextArray(int i);
    
    /**
     * Returns number of "AnnotationText" element
     */
    int sizeOfAnnotationTextArray();
    
    /**
     * Sets array of all "AnnotationText" element
     */
    void setAnnotationTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] annotationTextArray);
    
    /**
     * Sets ith "AnnotationText" element
     */
    void setAnnotationTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType annotationText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AnnotationText" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewAnnotationText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AnnotationText" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewAnnotationText();
    
    /**
     * Removes the ith "AnnotationText" element
     */
    void removeAnnotationText(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.AnnotationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
