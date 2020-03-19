/*
 * XML Type:  ContentConstraintAttachmentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML ContentConstraintAttachmentType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface ContentConstraintAttachmentType extends org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContentConstraintAttachmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("contentconstraintattachmenttypede6ftype");
    
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
     * Gets array of all "MetadataSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getMetadataSetArray();
    
    /**
     * Gets ith "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getMetadataSetArray(int i);
    
    /**
     * Returns number of "MetadataSet" element
     */
    int sizeOfMetadataSetArray();
    
    /**
     * Sets array of all "MetadataSet" element
     */
    void setMetadataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] metadataSetArray);
    
    /**
     * Sets ith "MetadataSet" element
     */
    void setMetadataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType metadataSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType insertNewMetadataSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewMetadataSet();
    
    /**
     * Removes the ith "MetadataSet" element
     */
    void removeMetadataSet(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContentConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
