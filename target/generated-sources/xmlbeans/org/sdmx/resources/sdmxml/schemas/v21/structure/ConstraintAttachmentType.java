/*
 * XML Type:  ConstraintAttachmentType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML ConstraintAttachmentType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface ConstraintAttachmentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConstraintAttachmentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("constraintattachmenttype7088type");
    
    /**
     * Gets the "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProvider();
    
    /**
     * True if has "DataProvider" element
     */
    boolean isSetDataProvider();
    
    /**
     * Sets the "DataProvider" element
     */
    void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider);
    
    /**
     * Appends and returns a new empty "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider();
    
    /**
     * Unsets the "DataProvider" element
     */
    void unsetDataProvider();
    
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
     * Gets array of all "DataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType[] getDataStructureArray();
    
    /**
     * Gets ith "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType getDataStructureArray(int i);
    
    /**
     * Returns number of "DataStructure" element
     */
    int sizeOfDataStructureArray();
    
    /**
     * Sets array of all "DataStructure" element
     */
    void setDataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType[] dataStructureArray);
    
    /**
     * Sets ith "DataStructure" element
     */
    void setDataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType dataStructure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType insertNewDataStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataStructureReferenceType addNewDataStructure();
    
    /**
     * Removes the ith "DataStructure" element
     */
    void removeDataStructure(int i);
    
    /**
     * Gets array of all "QueryableDataSource" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType[] getQueryableDataSourceArray();
    
    /**
     * Gets ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType getQueryableDataSourceArray(int i);
    
    /**
     * Returns number of "QueryableDataSource" element
     */
    int sizeOfQueryableDataSourceArray();
    
    /**
     * Sets array of all "QueryableDataSource" element
     */
    void setQueryableDataSourceArray(org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType[] queryableDataSourceArray);
    
    /**
     * Sets ith "QueryableDataSource" element
     */
    void setQueryableDataSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType queryableDataSource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType insertNewQueryableDataSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QueryableDataSource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.QueryableDataSourceType addNewQueryableDataSource();
    
    /**
     * Removes the ith "QueryableDataSource" element
     */
    void removeQueryableDataSource(int i);
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] getMetadataStructureArray();
    
    /**
     * Gets ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType getMetadataStructureArray(int i);
    
    /**
     * Returns number of "MetadataStructure" element
     */
    int sizeOfMetadataStructureArray();
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    void setMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] metadataStructureArray);
    
    /**
     * Sets ith "MetadataStructure" element
     */
    void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType metadataStructure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType insertNewMetadataStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType addNewMetadataStructure();
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    void removeMetadataStructure(int i);
    
    /**
     * Gets array of all "Dataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType[] getDataflowArray();
    
    /**
     * Gets ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType getDataflowArray(int i);
    
    /**
     * Returns number of "Dataflow" element
     */
    int sizeOfDataflowArray();
    
    /**
     * Sets array of all "Dataflow" element
     */
    void setDataflowArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType[] dataflowArray);
    
    /**
     * Sets ith "Dataflow" element
     */
    void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType dataflow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType insertNewDataflow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType addNewDataflow();
    
    /**
     * Removes the ith "Dataflow" element
     */
    void removeDataflow(int i);
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] getMetadataflowArray();
    
    /**
     * Gets ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType getMetadataflowArray(int i);
    
    /**
     * Returns number of "Metadataflow" element
     */
    int sizeOfMetadataflowArray();
    
    /**
     * Sets array of all "Metadataflow" element
     */
    void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] metadataflowArray);
    
    /**
     * Sets ith "Metadataflow" element
     */
    void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType metadataflow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType insertNewMetadataflow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType addNewMetadataflow();
    
    /**
     * Removes the ith "Metadataflow" element
     */
    void removeMetadataflow(int i);
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] getProvisionAgreementArray();
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreementArray(int i);
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] provisionAgreementArray);
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgreement();
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
