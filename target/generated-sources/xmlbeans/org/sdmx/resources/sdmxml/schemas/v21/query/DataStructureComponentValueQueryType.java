/*
 * XML Type:  DataStructureComponentValueQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML DataStructureComponentValueQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface DataStructureComponentValueQueryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataStructureComponentValueQueryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("datastructurecomponentvaluequerytypec288type");
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType xgetID();
    
    /**
     * True if has "ID" element
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType id);
    
    /**
     * Unsets the "ID" element
     */
    void unsetID();
    
    /**
     * Gets array of all "NumericValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType[] getNumericValueArray();
    
    /**
     * Gets ith "NumericValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType getNumericValueArray(int i);
    
    /**
     * Returns number of "NumericValue" element
     */
    int sizeOfNumericValueArray();
    
    /**
     * Sets array of all "NumericValue" element
     */
    void setNumericValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType[] numericValueArray);
    
    /**
     * Sets ith "NumericValue" element
     */
    void setNumericValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType numericValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NumericValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType insertNewNumericValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NumericValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.NumericValueType addNewNumericValue();
    
    /**
     * Removes the ith "NumericValue" element
     */
    void removeNumericValue(int i);
    
    /**
     * Gets array of all "TextValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] getTextValueArray();
    
    /**
     * Gets ith "TextValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getTextValueArray(int i);
    
    /**
     * Returns number of "TextValue" element
     */
    int sizeOfTextValueArray();
    
    /**
     * Sets array of all "TextValue" element
     */
    void setTextValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] textValueArray);
    
    /**
     * Sets ith "TextValue" element
     */
    void setTextValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType textValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TextValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType insertNewTextValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TextValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewTextValue();
    
    /**
     * Removes the ith "TextValue" element
     */
    void removeTextValue(int i);
    
    /**
     * Gets array of all "TimeValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType[] getTimeValueArray();
    
    /**
     * Gets ith "TimeValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType getTimeValueArray(int i);
    
    /**
     * Returns number of "TimeValue" element
     */
    int sizeOfTimeValueArray();
    
    /**
     * Sets array of all "TimeValue" element
     */
    void setTimeValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType[] timeValueArray);
    
    /**
     * Sets ith "TimeValue" element
     */
    void setTimeValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType timeValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType insertNewTimeValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimePeriodValueType addNewTimeValue();
    
    /**
     * Removes the ith "TimeValue" element
     */
    void removeTimeValue(int i);
    
    /**
     * Gets the "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType getValue();
    
    /**
     * True if has "Value" element
     */
    boolean isSetValue();
    
    /**
     * Sets the "Value" element
     */
    void setValue(org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType value);
    
    /**
     * Appends and returns a new empty "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.SimpleValueType addNewValue();
    
    /**
     * Unsets the "Value" element
     */
    void unsetValue();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureComponentValueQueryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
