/*
 * XML Type:  BaseHeaderType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message;


/**
 * An XML BaseHeaderType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public interface BaseHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("baseheadertypee4fatype");
    
    /**
     * Gets the "ID" element
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" element
     */
    void xsetID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id);
    
    /**
     * Gets the "Test" element
     */
    boolean getTest();
    
    /**
     * Gets (as xml) the "Test" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTest();
    
    /**
     * Sets the "Test" element
     */
    void setTest(boolean test);
    
    /**
     * Sets (as xml) the "Test" element
     */
    void xsetTest(org.apache.xmlbeans.XmlBoolean test);
    
    /**
     * Gets the "Prepared" element
     */
    java.util.Calendar getPrepared();
    
    /**
     * Gets (as xml) the "Prepared" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType xgetPrepared();
    
    /**
     * Sets the "Prepared" element
     */
    void setPrepared(java.util.Calendar prepared);
    
    /**
     * Sets (as xml) the "Prepared" element
     */
    void xsetPrepared(org.sdmx.resources.sdmxml.schemas.v21.message.HeaderTimeType prepared);
    
    /**
     * Gets the "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.SenderType getSender();
    
    /**
     * Sets the "Sender" element
     */
    void setSender(org.sdmx.resources.sdmxml.schemas.v21.message.SenderType sender);
    
    /**
     * Appends and returns a new empty "Sender" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.SenderType addNewSender();
    
    /**
     * Gets array of all "Receiver" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[] getReceiverArray();
    
    /**
     * Gets ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.PartyType getReceiverArray(int i);
    
    /**
     * Returns number of "Receiver" element
     */
    int sizeOfReceiverArray();
    
    /**
     * Sets array of all "Receiver" element
     */
    void setReceiverArray(org.sdmx.resources.sdmxml.schemas.v21.message.PartyType[] receiverArray);
    
    /**
     * Sets ith "Receiver" element
     */
    void setReceiverArray(int i, org.sdmx.resources.sdmxml.schemas.v21.message.PartyType receiver);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.PartyType insertNewReceiver(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Receiver" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.message.PartyType addNewReceiver();
    
    /**
     * Removes the ith "Receiver" element
     */
    void removeReceiver(int i);
    
    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getNameArray();
    
    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getNameArray(int i);
    
    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "Name" element
     */
    void setNameArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] nameArray);
    
    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewName();
    
    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);
    
    /**
     * Gets array of all "Structure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] getStructureArray();
    
    /**
     * Gets ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType getStructureArray(int i);
    
    /**
     * Returns number of "Structure" element
     */
    int sizeOfStructureArray();
    
    /**
     * Sets array of all "Structure" element
     */
    void setStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType[] structureArray);
    
    /**
     * Sets ith "Structure" element
     */
    void setStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType structure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType insertNewStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType addNewStructure();
    
    /**
     * Removes the ith "Structure" element
     */
    void removeStructure(int i);
    
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
     * Gets the "DataSetAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getDataSetAction();
    
    /**
     * Gets (as xml) the "DataSetAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetDataSetAction();
    
    /**
     * True if has "DataSetAction" element
     */
    boolean isSetDataSetAction();
    
    /**
     * Sets the "DataSetAction" element
     */
    void setDataSetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum dataSetAction);
    
    /**
     * Sets (as xml) the "DataSetAction" element
     */
    void xsetDataSetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType dataSetAction);
    
    /**
     * Unsets the "DataSetAction" element
     */
    void unsetDataSetAction();
    
    /**
     * Gets array of all "DataSetID" elements
     */
    java.lang.String[] getDataSetIDArray();
    
    /**
     * Gets ith "DataSetID" element
     */
    java.lang.String getDataSetIDArray(int i);
    
    /**
     * Gets (as xml) array of all "DataSetID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] xgetDataSetIDArray();
    
    /**
     * Gets (as xml) ith "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetDataSetIDArray(int i);
    
    /**
     * Returns number of "DataSetID" element
     */
    int sizeOfDataSetIDArray();
    
    /**
     * Sets array of all "DataSetID" element
     */
    void setDataSetIDArray(java.lang.String[] dataSetIDArray);
    
    /**
     * Sets ith "DataSetID" element
     */
    void setDataSetIDArray(int i, java.lang.String dataSetID);
    
    /**
     * Sets (as xml) array of all "DataSetID" element
     */
    void xsetDataSetIDArray(org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] dataSetIDArray);
    
    /**
     * Sets (as xml) ith "DataSetID" element
     */
    void xsetDataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.IDType dataSetID);
    
    /**
     * Inserts the value as the ith "DataSetID" element
     */
    void insertDataSetID(int i, java.lang.String dataSetID);
    
    /**
     * Appends the value as the last "DataSetID" element
     */
    void addDataSetID(java.lang.String dataSetID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType insertNewDataSetID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType addNewDataSetID();
    
    /**
     * Removes the ith "DataSetID" element
     */
    void removeDataSetID(int i);
    
    /**
     * Gets the "Extracted" element
     */
    java.util.Calendar getExtracted();
    
    /**
     * Gets (as xml) the "Extracted" element
     */
    org.apache.xmlbeans.XmlDateTime xgetExtracted();
    
    /**
     * True if has "Extracted" element
     */
    boolean isSetExtracted();
    
    /**
     * Sets the "Extracted" element
     */
    void setExtracted(java.util.Calendar extracted);
    
    /**
     * Sets (as xml) the "Extracted" element
     */
    void xsetExtracted(org.apache.xmlbeans.XmlDateTime extracted);
    
    /**
     * Unsets the "Extracted" element
     */
    void unsetExtracted();
    
    /**
     * Gets the "ReportingBegin" element
     */
    java.lang.Object getReportingBegin();
    
    /**
     * Gets (as xml) the "ReportingBegin" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetReportingBegin();
    
    /**
     * True if has "ReportingBegin" element
     */
    boolean isSetReportingBegin();
    
    /**
     * Sets the "ReportingBegin" element
     */
    void setReportingBegin(java.lang.Object reportingBegin);
    
    /**
     * Sets (as xml) the "ReportingBegin" element
     */
    void xsetReportingBegin(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType reportingBegin);
    
    /**
     * Unsets the "ReportingBegin" element
     */
    void unsetReportingBegin();
    
    /**
     * Gets the "ReportingEnd" element
     */
    java.lang.Object getReportingEnd();
    
    /**
     * Gets (as xml) the "ReportingEnd" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetReportingEnd();
    
    /**
     * True if has "ReportingEnd" element
     */
    boolean isSetReportingEnd();
    
    /**
     * Sets the "ReportingEnd" element
     */
    void setReportingEnd(java.lang.Object reportingEnd);
    
    /**
     * Sets (as xml) the "ReportingEnd" element
     */
    void xsetReportingEnd(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType reportingEnd);
    
    /**
     * Unsets the "ReportingEnd" element
     */
    void unsetReportingEnd();
    
    /**
     * Gets the "EmbargoDate" element
     */
    java.util.Calendar getEmbargoDate();
    
    /**
     * Gets (as xml) the "EmbargoDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEmbargoDate();
    
    /**
     * True if has "EmbargoDate" element
     */
    boolean isSetEmbargoDate();
    
    /**
     * Sets the "EmbargoDate" element
     */
    void setEmbargoDate(java.util.Calendar embargoDate);
    
    /**
     * Sets (as xml) the "EmbargoDate" element
     */
    void xsetEmbargoDate(org.apache.xmlbeans.XmlDateTime embargoDate);
    
    /**
     * Unsets the "EmbargoDate" element
     */
    void unsetEmbargoDate();
    
    /**
     * Gets array of all "Source" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getSourceArray();
    
    /**
     * Gets ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getSourceArray(int i);
    
    /**
     * Returns number of "Source" element
     */
    int sizeOfSourceArray();
    
    /**
     * Sets array of all "Source" element
     */
    void setSourceArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] sourceArray);
    
    /**
     * Sets ith "Source" element
     */
    void setSourceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType source);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewSource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Source" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewSource();
    
    /**
     * Removes the ith "Source" element
     */
    void removeSource(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.message.BaseHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
