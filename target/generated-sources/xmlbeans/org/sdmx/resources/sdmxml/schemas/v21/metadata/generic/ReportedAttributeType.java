/*
 * XML Type:  ReportedAttributeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.generic;


/**
 * An XML ReportedAttributeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic).
 *
 * This is a complex type.
 */
public interface ReportedAttributeType extends org.sdmx.resources.sdmxml.schemas.v21.common.AnnotableType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportedAttributeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("reportedattributetype6dabtype");
    
    /**
     * Gets array of all "Text" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getTextArray();
    
    /**
     * Gets ith "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getTextArray(int i);
    
    /**
     * Returns number of "Text" element
     */
    int sizeOfTextArray();
    
    /**
     * Sets array of all "Text" element
     */
    void setTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] textArray);
    
    /**
     * Sets ith "Text" element
     */
    void setTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType text);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewText();
    
    /**
     * Removes the ith "Text" element
     */
    void removeText(int i);
    
    /**
     * Gets array of all "StructuredText" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType[] getStructuredTextArray();
    
    /**
     * Gets ith "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType getStructuredTextArray(int i);
    
    /**
     * Returns number of "StructuredText" element
     */
    int sizeOfStructuredTextArray();
    
    /**
     * Sets array of all "StructuredText" element
     */
    void setStructuredTextArray(org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType[] structuredTextArray);
    
    /**
     * Sets ith "StructuredText" element
     */
    void setStructuredTextArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType structuredText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType insertNewStructuredText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuredText" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.XHTMLType addNewStructuredText();
    
    /**
     * Removes the ith "StructuredText" element
     */
    void removeStructuredText(int i);
    
    /**
     * Gets the "AttributeSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType getAttributeSet();
    
    /**
     * True if has "AttributeSet" element
     */
    boolean isSetAttributeSet();
    
    /**
     * Sets the "AttributeSet" element
     */
    void setAttributeSet(org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType attributeSet);
    
    /**
     * Appends and returns a new empty "AttributeSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.AttributeSetType addNewAttributeSet();
    
    /**
     * Unsets the "AttributeSet" element
     */
    void unsetAttributeSet();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id);
    
    /**
     * Gets the "value" attribute
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "value" attribute
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * True if has "value" attribute
     */
    boolean isSetValue();
    
    /**
     * Sets the "value" attribute
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "value" attribute
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * Unsets the "value" attribute
     */
    void unsetValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReportedAttributeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
