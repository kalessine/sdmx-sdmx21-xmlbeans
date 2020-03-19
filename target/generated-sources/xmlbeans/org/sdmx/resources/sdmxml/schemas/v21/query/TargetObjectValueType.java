/*
 * XML Type:  TargetObjectValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML TargetObjectValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface TargetObjectValueType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TargetObjectValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("targetobjectvaluetype4eactype");
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType id);
    
    /**
     * Gets the "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getDataSet();
    
    /**
     * True if has "DataSet" element
     */
    boolean isSetDataSet();
    
    /**
     * Sets the "DataSet" element
     */
    void setDataSet(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType dataSet);
    
    /**
     * Appends and returns a new empty "DataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewDataSet();
    
    /**
     * Unsets the "DataSet" element
     */
    void unsetDataSet();
    
    /**
     * Gets the "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getDataKey();
    
    /**
     * True if has "DataKey" element
     */
    boolean isSetDataKey();
    
    /**
     * Sets the "DataKey" element
     */
    void setDataKey(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType dataKey);
    
    /**
     * Appends and returns a new empty "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewDataKey();
    
    /**
     * Unsets the "DataKey" element
     */
    void unsetDataKey();
    
    /**
     * Gets the "Object" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getObject();
    
    /**
     * True if has "Object" element
     */
    boolean isSetObject();
    
    /**
     * Sets the "Object" element
     */
    void setObject(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType object);
    
    /**
     * Appends and returns a new empty "Object" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewObject();
    
    /**
     * Unsets the "Object" element
     */
    void unsetObject();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.TargetObjectValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
