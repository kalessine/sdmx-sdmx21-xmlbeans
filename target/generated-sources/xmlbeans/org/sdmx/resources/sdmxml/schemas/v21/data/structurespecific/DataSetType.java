/*
 * XML Type:  DataSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific;


/**
 * An XML DataSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/data/structurespecific).
 *
 * This is a complex type.
 */
public interface DataSetType extends org.sdmx.resources.sdmxml.schemas.v21.common.AnnotableType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("datasettypef285type");
    
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
     * Gets array of all "Group" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.GroupType[] getGroupArray();
    
    /**
     * Gets ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.GroupType getGroupArray(int i);
    
    /**
     * Returns number of "Group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "Group" element
     */
    void setGroupArray(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.GroupType[] groupArray);
    
    /**
     * Sets ith "Group" element
     */
    void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.GroupType group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.GroupType insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.GroupType addNewGroup();
    
    /**
     * Removes the ith "Group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets array of all "Series" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType[] getSeriesArray();
    
    /**
     * Gets ith "Series" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType getSeriesArray(int i);
    
    /**
     * Returns number of "Series" element
     */
    int sizeOfSeriesArray();
    
    /**
     * Sets array of all "Series" element
     */
    void setSeriesArray(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType[] seriesArray);
    
    /**
     * Sets ith "Series" element
     */
    void setSeriesArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType series);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Series" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType insertNewSeries(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Series" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.SeriesType addNewSeries();
    
    /**
     * Removes the ith "Series" element
     */
    void removeSeries(int i);
    
    /**
     * Gets array of all "Obs" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] getObsArray();
    
    /**
     * Gets ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType getObsArray(int i);
    
    /**
     * Returns number of "Obs" element
     */
    int sizeOfObsArray();
    
    /**
     * Sets array of all "Obs" element
     */
    void setObsArray(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType[] obsArray);
    
    /**
     * Sets ith "Obs" element
     */
    void setObsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType obs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType insertNewObs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Obs" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.ObsType addNewObs();
    
    /**
     * Removes the ith "Obs" element
     */
    void removeObs(int i);
    
    /**
     * Gets the "structureRef" attribute
     */
    java.lang.String getStructureRef();
    
    /**
     * Gets (as xml) the "structureRef" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetStructureRef();
    
    /**
     * Sets the "structureRef" attribute
     */
    void setStructureRef(java.lang.String structureRef);
    
    /**
     * Sets (as xml) the "structureRef" attribute
     */
    void xsetStructureRef(org.apache.xmlbeans.XmlIDREF structureRef);
    
    /**
     * Gets the "setID" attribute
     */
    java.lang.String getSetID();
    
    /**
     * Gets (as xml) the "setID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetSetID();
    
    /**
     * True if has "setID" attribute
     */
    boolean isSetSetID();
    
    /**
     * Sets the "setID" attribute
     */
    void setSetID(java.lang.String setID);
    
    /**
     * Sets (as xml) the "setID" attribute
     */
    void xsetSetID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType setID);
    
    /**
     * Unsets the "setID" attribute
     */
    void unsetSetID();
    
    /**
     * Gets the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetAction();
    
    /**
     * True if has "action" attribute
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType action);
    
    /**
     * Unsets the "action" attribute
     */
    void unsetAction();
    
    /**
     * Gets the "reportingBeginDate" attribute
     */
    java.util.Calendar getReportingBeginDate();
    
    /**
     * Gets (as xml) the "reportingBeginDate" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType xgetReportingBeginDate();
    
    /**
     * True if has "reportingBeginDate" attribute
     */
    boolean isSetReportingBeginDate();
    
    /**
     * Sets the "reportingBeginDate" attribute
     */
    void setReportingBeginDate(java.util.Calendar reportingBeginDate);
    
    /**
     * Sets (as xml) the "reportingBeginDate" attribute
     */
    void xsetReportingBeginDate(org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType reportingBeginDate);
    
    /**
     * Unsets the "reportingBeginDate" attribute
     */
    void unsetReportingBeginDate();
    
    /**
     * Gets the "reportingEndDate" attribute
     */
    java.util.Calendar getReportingEndDate();
    
    /**
     * Gets (as xml) the "reportingEndDate" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType xgetReportingEndDate();
    
    /**
     * True if has "reportingEndDate" attribute
     */
    boolean isSetReportingEndDate();
    
    /**
     * Sets the "reportingEndDate" attribute
     */
    void setReportingEndDate(java.util.Calendar reportingEndDate);
    
    /**
     * Sets (as xml) the "reportingEndDate" attribute
     */
    void xsetReportingEndDate(org.sdmx.resources.sdmxml.schemas.v21.common.BasicTimePeriodType reportingEndDate);
    
    /**
     * Unsets the "reportingEndDate" attribute
     */
    void unsetReportingEndDate();
    
    /**
     * Gets the "validFromDate" attribute
     */
    java.util.Calendar getValidFromDate();
    
    /**
     * Gets (as xml) the "validFromDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFromDate();
    
    /**
     * True if has "validFromDate" attribute
     */
    boolean isSetValidFromDate();
    
    /**
     * Sets the "validFromDate" attribute
     */
    void setValidFromDate(java.util.Calendar validFromDate);
    
    /**
     * Sets (as xml) the "validFromDate" attribute
     */
    void xsetValidFromDate(org.apache.xmlbeans.XmlDateTime validFromDate);
    
    /**
     * Unsets the "validFromDate" attribute
     */
    void unsetValidFromDate();
    
    /**
     * Gets the "validToDate" attribute
     */
    java.util.Calendar getValidToDate();
    
    /**
     * Gets (as xml) the "validToDate" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidToDate();
    
    /**
     * True if has "validToDate" attribute
     */
    boolean isSetValidToDate();
    
    /**
     * Sets the "validToDate" attribute
     */
    void setValidToDate(java.util.Calendar validToDate);
    
    /**
     * Sets (as xml) the "validToDate" attribute
     */
    void xsetValidToDate(org.apache.xmlbeans.XmlDateTime validToDate);
    
    /**
     * Unsets the "validToDate" attribute
     */
    void unsetValidToDate();
    
    /**
     * Gets the "publicationYear" attribute
     */
    java.util.Calendar getPublicationYear();
    
    /**
     * Gets (as xml) the "publicationYear" attribute
     */
    org.apache.xmlbeans.XmlGYear xgetPublicationYear();
    
    /**
     * True if has "publicationYear" attribute
     */
    boolean isSetPublicationYear();
    
    /**
     * Sets the "publicationYear" attribute
     */
    void setPublicationYear(java.util.Calendar publicationYear);
    
    /**
     * Sets (as xml) the "publicationYear" attribute
     */
    void xsetPublicationYear(org.apache.xmlbeans.XmlGYear publicationYear);
    
    /**
     * Unsets the "publicationYear" attribute
     */
    void unsetPublicationYear();
    
    /**
     * Gets the "publicationPeriod" attribute
     */
    java.lang.Object getPublicationPeriod();
    
    /**
     * Gets (as xml) the "publicationPeriod" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetPublicationPeriod();
    
    /**
     * True if has "publicationPeriod" attribute
     */
    boolean isSetPublicationPeriod();
    
    /**
     * Sets the "publicationPeriod" attribute
     */
    void setPublicationPeriod(java.lang.Object publicationPeriod);
    
    /**
     * Sets (as xml) the "publicationPeriod" attribute
     */
    void xsetPublicationPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType publicationPeriod);
    
    /**
     * Unsets the "publicationPeriod" attribute
     */
    void unsetPublicationPeriod();
    
    /**
     * Gets the "dataScope" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataScopeType.Enum getDataScope();
    
    /**
     * Gets (as xml) the "dataScope" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataScopeType xgetDataScope();
    
    /**
     * Sets the "dataScope" attribute
     */
    void setDataScope(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataScopeType.Enum dataScope);
    
    /**
     * Sets (as xml) the "dataScope" attribute
     */
    void xsetDataScope(org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataScopeType dataScope);
    
    /**
     * Gets the "REPORTING_YEAR_START_DAY" attribute
     */
    java.util.Calendar getREPORTINGYEARSTARTDAY();
    
    /**
     * Gets (as xml) the "REPORTING_YEAR_START_DAY" attribute
     */
    org.apache.xmlbeans.XmlGMonthDay xgetREPORTINGYEARSTARTDAY();
    
    /**
     * True if has "REPORTING_YEAR_START_DAY" attribute
     */
    boolean isSetREPORTINGYEARSTARTDAY();
    
    /**
     * Sets the "REPORTING_YEAR_START_DAY" attribute
     */
    void setREPORTINGYEARSTARTDAY(java.util.Calendar reportingyearstartday);
    
    /**
     * Sets (as xml) the "REPORTING_YEAR_START_DAY" attribute
     */
    void xsetREPORTINGYEARSTARTDAY(org.apache.xmlbeans.XmlGMonthDay reportingyearstartday);
    
    /**
     * Unsets the "REPORTING_YEAR_START_DAY" attribute
     */
    void unsetREPORTINGYEARSTARTDAY();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.data.structurespecific.DataSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
