/*
 * XML Type:  DataParametersAndType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML DataParametersAndType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface DataParametersAndType extends org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataParametersAndType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("dataparametersandtype148etype");
    
    /**
     * Gets array of all "DataSetID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] getDataSetIDArray();
    
    /**
     * Gets ith "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType getDataSetIDArray(int i);
    
    /**
     * Returns number of "DataSetID" element
     */
    int sizeOfDataSetIDArray();
    
    /**
     * Sets array of all "DataSetID" element
     */
    void setDataSetIDArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] dataSetIDArray);
    
    /**
     * Sets ith "DataSetID" element
     */
    void setDataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType dataSetID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType insertNewDataSetID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType addNewDataSetID();
    
    /**
     * Removes the ith "DataSetID" element
     */
    void removeDataSetID(int i);
    
    /**
     * Gets array of all "DataProvider" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] getDataProviderArray();
    
    /**
     * Gets ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProviderArray(int i);
    
    /**
     * Returns number of "DataProvider" element
     */
    int sizeOfDataProviderArray();
    
    /**
     * Sets array of all "DataProvider" element
     */
    void setDataProviderArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] dataProviderArray);
    
    /**
     * Sets ith "DataProvider" element
     */
    void setDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType insertNewDataProvider(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider();
    
    /**
     * Removes the ith "DataProvider" element
     */
    void removeDataProvider(int i);
    
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
     * Gets array of all "TimeDimensionValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType[] getTimeDimensionValueArray();
    
    /**
     * Gets ith "TimeDimensionValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType getTimeDimensionValueArray(int i);
    
    /**
     * Returns number of "TimeDimensionValue" element
     */
    int sizeOfTimeDimensionValueArray();
    
    /**
     * Sets array of all "TimeDimensionValue" element
     */
    void setTimeDimensionValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType[] timeDimensionValueArray);
    
    /**
     * Sets ith "TimeDimensionValue" element
     */
    void setTimeDimensionValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType timeDimensionValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeDimensionValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType insertNewTimeDimensionValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeDimensionValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionValueType addNewTimeDimensionValue();
    
    /**
     * Removes the ith "TimeDimensionValue" element
     */
    void removeTimeDimensionValue(int i);
    
    /**
     * Gets array of all "PrimaryMeasureValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType[] getPrimaryMeasureValueArray();
    
    /**
     * Gets ith "PrimaryMeasureValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType getPrimaryMeasureValueArray(int i);
    
    /**
     * Returns number of "PrimaryMeasureValue" element
     */
    int sizeOfPrimaryMeasureValueArray();
    
    /**
     * Sets array of all "PrimaryMeasureValue" element
     */
    void setPrimaryMeasureValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType[] primaryMeasureValueArray);
    
    /**
     * Sets ith "PrimaryMeasureValue" element
     */
    void setPrimaryMeasureValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType primaryMeasureValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PrimaryMeasureValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType insertNewPrimaryMeasureValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PrimaryMeasureValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType addNewPrimaryMeasureValue();
    
    /**
     * Removes the ith "PrimaryMeasureValue" element
     */
    void removePrimaryMeasureValue(int i);
    
    /**
     * Gets array of all "TimeFormat" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum[] getTimeFormatArray();
    
    /**
     * Gets ith "TimeFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum getTimeFormatArray(int i);
    
    /**
     * Gets (as xml) array of all "TimeFormat" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType[] xgetTimeFormatArray();
    
    /**
     * Gets (as xml) ith "TimeFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType xgetTimeFormatArray(int i);
    
    /**
     * Returns number of "TimeFormat" element
     */
    int sizeOfTimeFormatArray();
    
    /**
     * Sets array of all "TimeFormat" element
     */
    void setTimeFormatArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum[] timeFormatArray);
    
    /**
     * Sets ith "TimeFormat" element
     */
    void setTimeFormatArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum timeFormat);
    
    /**
     * Sets (as xml) array of all "TimeFormat" element
     */
    void xsetTimeFormatArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType[] timeFormatArray);
    
    /**
     * Sets (as xml) ith "TimeFormat" element
     */
    void xsetTimeFormatArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType timeFormat);
    
    /**
     * Inserts the value as the ith "TimeFormat" element
     */
    void insertTimeFormat(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum timeFormat);
    
    /**
     * Appends the value as the last "TimeFormat" element
     */
    void addTimeFormat(org.sdmx.resources.sdmxml.schemas.v21.common.DataType.Enum timeFormat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType insertNewTimeFormat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeFormat" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeDataType addNewTimeFormat();
    
    /**
     * Removes the ith "TimeFormat" element
     */
    void removeTimeFormat(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataParametersAndType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
