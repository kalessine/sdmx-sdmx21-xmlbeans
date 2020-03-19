/*
 * XML Type:  ComponentValueSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML ComponentValueSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public interface ComponentValueSetType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentValueSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("componentvaluesettyped97atype");
    
    /**
     * Gets array of all "Value" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType[] getValueArray();
    
    /**
     * Gets ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType getValueArray(int i);
    
    /**
     * Returns number of "Value" element
     */
    int sizeOfValueArray();
    
    /**
     * Sets array of all "Value" element
     */
    void setValueArray(org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType[] valueArray);
    
    /**
     * Sets ith "Value" element
     */
    void setValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType value);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType insertNewValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SimpleValueType addNewValue();
    
    /**
     * Removes the ith "Value" element
     */
    void removeValue(int i);
    
    /**
     * Gets array of all "DataSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getDataSetArray();
    
    /**
     * Gets ith "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getDataSetArray(int i);
    
    /**
     * Returns number of "DataSet" element
     */
    int sizeOfDataSetArray();
    
    /**
     * Sets array of all "DataSet" element
     */
    void setDataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] dataSetArray);
    
    /**
     * Sets ith "DataSet" element
     */
    void setDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType dataSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType insertNewDataSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewDataSet();
    
    /**
     * Removes the ith "DataSet" element
     */
    void removeDataSet(int i);
    
    /**
     * Gets array of all "DataKey" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] getDataKeyArray();
    
    /**
     * Gets ith "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getDataKeyArray(int i);
    
    /**
     * Returns number of "DataKey" element
     */
    int sizeOfDataKeyArray();
    
    /**
     * Sets array of all "DataKey" element
     */
    void setDataKeyArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] dataKeyArray);
    
    /**
     * Sets ith "DataKey" element
     */
    void setDataKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType dataKey);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType insertNewDataKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewDataKey();
    
    /**
     * Removes the ith "DataKey" element
     */
    void removeDataKey(int i);
    
    /**
     * Gets array of all "Object" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] getObjectArray();
    
    /**
     * Gets ith "Object" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getObjectArray(int i);
    
    /**
     * Returns number of "Object" element
     */
    int sizeOfObjectArray();
    
    /**
     * Sets array of all "Object" element
     */
    void setObjectArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] objectArray);
    
    /**
     * Sets ith "Object" element
     */
    void setObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType object);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Object" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType insertNewObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Object" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewObject();
    
    /**
     * Removes the ith "Object" element
     */
    void removeObject(int i);
    
    /**
     * Gets the "TimeRange" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getTimeRange();
    
    /**
     * True if has "TimeRange" element
     */
    boolean isSetTimeRange();
    
    /**
     * Sets the "TimeRange" element
     */
    void setTimeRange(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType timeRange);
    
    /**
     * Appends and returns a new empty "TimeRange" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewTimeRange();
    
    /**
     * Unsets the "TimeRange" element
     */
    void unsetTimeRange();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType id);
    
    /**
     * Gets the "include" attribute
     */
    boolean getInclude();
    
    /**
     * Gets (as xml) the "include" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetInclude();
    
    /**
     * True if has "include" attribute
     */
    boolean isSetInclude();
    
    /**
     * Sets the "include" attribute
     */
    void setInclude(boolean include);
    
    /**
     * Sets (as xml) the "include" attribute
     */
    void xsetInclude(org.apache.xmlbeans.XmlBoolean include);
    
    /**
     * Unsets the "include" attribute
     */
    void unsetInclude();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ComponentValueSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
