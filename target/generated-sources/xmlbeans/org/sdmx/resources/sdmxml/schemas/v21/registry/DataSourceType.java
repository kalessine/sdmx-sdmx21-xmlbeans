/*
 * XML Type:  DataSourceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML DataSourceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface DataSourceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("datasourcetypee923type");
    
    /**
     * Gets array of all "SimpleDataSource" elements
     */
    java.lang.String[] getSimpleDataSourceArray();
    
    /**
     * Gets ith "SimpleDataSource" element
     */
    java.lang.String getSimpleDataSourceArray(int i);
    
    /**
     * Gets (as xml) array of all "SimpleDataSource" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetSimpleDataSourceArray();
    
    /**
     * Gets (as xml) ith "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSimpleDataSourceArray(int i);
    
    /**
     * Returns number of "SimpleDataSource" element
     */
    int sizeOfSimpleDataSourceArray();
    
    /**
     * Sets array of all "SimpleDataSource" element
     */
    void setSimpleDataSourceArray(java.lang.String[] simpleDataSourceArray);
    
    /**
     * Sets ith "SimpleDataSource" element
     */
    void setSimpleDataSourceArray(int i, java.lang.String simpleDataSource);
    
    /**
     * Sets (as xml) array of all "SimpleDataSource" element
     */
    void xsetSimpleDataSourceArray(org.apache.xmlbeans.XmlAnyURI[] simpleDataSourceArray);
    
    /**
     * Sets (as xml) ith "SimpleDataSource" element
     */
    void xsetSimpleDataSourceArray(int i, org.apache.xmlbeans.XmlAnyURI simpleDataSource);
    
    /**
     * Inserts the value as the ith "SimpleDataSource" element
     */
    void insertSimpleDataSource(int i, java.lang.String simpleDataSource);
    
    /**
     * Appends the value as the last "SimpleDataSource" element
     */
    void addSimpleDataSource(java.lang.String simpleDataSource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewSimpleDataSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleDataSource" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewSimpleDataSource();
    
    /**
     * Removes the ith "SimpleDataSource" element
     */
    void removeSimpleDataSource(int i);
    
    /**
     * Gets array of all "QueryableDataSource" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType[] getQueryableDataSourceArray();
    
    /**
     * Gets ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType getQueryableDataSourceArray(int i);
    
    /**
     * Returns number of "QueryableDataSource" element
     */
    int sizeOfQueryableDataSourceArray();
    
    /**
     * Sets array of all "QueryableDataSource" element
     */
    void setQueryableDataSourceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType[] queryableDataSourceArray);
    
    /**
     * Sets ith "QueryableDataSource" element
     */
    void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType queryableDataSource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType insertNewQueryableDataSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.QueryableDataSourceType addNewQueryableDataSource();
    
    /**
     * Removes the ith "QueryableDataSource" element
     */
    void removeQueryableDataSource(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
