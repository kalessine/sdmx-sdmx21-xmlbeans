/*
 * XML Type:  RegistrationType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML RegistrationType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface RegistrationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegistrationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("registrationtype988ftype");
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreement();
    
    /**
     * Sets the "ProvisionAgreement" element
     */
    void setProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement);
    
    /**
     * Appends and returns a new empty "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgreement();
    
    /**
     * Gets the "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType getDatasource();
    
    /**
     * Sets the "Datasource" element
     */
    void setDatasource(org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType datasource);
    
    /**
     * Appends and returns a new empty "Datasource" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.DataSourceType addNewDatasource();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "validFrom" attribute
     */
    java.util.Calendar getValidFrom();
    
    /**
     * Gets (as xml) the "validFrom" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidFrom();
    
    /**
     * True if has "validFrom" attribute
     */
    boolean isSetValidFrom();
    
    /**
     * Sets the "validFrom" attribute
     */
    void setValidFrom(java.util.Calendar validFrom);
    
    /**
     * Sets (as xml) the "validFrom" attribute
     */
    void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
    
    /**
     * Unsets the "validFrom" attribute
     */
    void unsetValidFrom();
    
    /**
     * Gets the "validTo" attribute
     */
    java.util.Calendar getValidTo();
    
    /**
     * Gets (as xml) the "validTo" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetValidTo();
    
    /**
     * True if has "validTo" attribute
     */
    boolean isSetValidTo();
    
    /**
     * Sets the "validTo" attribute
     */
    void setValidTo(java.util.Calendar validTo);
    
    /**
     * Sets (as xml) the "validTo" attribute
     */
    void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
    
    /**
     * Unsets the "validTo" attribute
     */
    void unsetValidTo();
    
    /**
     * Gets the "lastUpdated" attribute
     */
    java.util.Calendar getLastUpdated();
    
    /**
     * Gets (as xml) the "lastUpdated" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetLastUpdated();
    
    /**
     * True if has "lastUpdated" attribute
     */
    boolean isSetLastUpdated();
    
    /**
     * Sets the "lastUpdated" attribute
     */
    void setLastUpdated(java.util.Calendar lastUpdated);
    
    /**
     * Sets (as xml) the "lastUpdated" attribute
     */
    void xsetLastUpdated(org.apache.xmlbeans.XmlDateTime lastUpdated);
    
    /**
     * Unsets the "lastUpdated" attribute
     */
    void unsetLastUpdated();
    
    /**
     * Gets the "indexTimeSeries" attribute
     */
    boolean getIndexTimeSeries();
    
    /**
     * Gets (as xml) the "indexTimeSeries" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexTimeSeries();
    
    /**
     * True if has "indexTimeSeries" attribute
     */
    boolean isSetIndexTimeSeries();
    
    /**
     * Sets the "indexTimeSeries" attribute
     */
    void setIndexTimeSeries(boolean indexTimeSeries);
    
    /**
     * Sets (as xml) the "indexTimeSeries" attribute
     */
    void xsetIndexTimeSeries(org.apache.xmlbeans.XmlBoolean indexTimeSeries);
    
    /**
     * Unsets the "indexTimeSeries" attribute
     */
    void unsetIndexTimeSeries();
    
    /**
     * Gets the "indexDataSet" attribute
     */
    boolean getIndexDataSet();
    
    /**
     * Gets (as xml) the "indexDataSet" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexDataSet();
    
    /**
     * True if has "indexDataSet" attribute
     */
    boolean isSetIndexDataSet();
    
    /**
     * Sets the "indexDataSet" attribute
     */
    void setIndexDataSet(boolean indexDataSet);
    
    /**
     * Sets (as xml) the "indexDataSet" attribute
     */
    void xsetIndexDataSet(org.apache.xmlbeans.XmlBoolean indexDataSet);
    
    /**
     * Unsets the "indexDataSet" attribute
     */
    void unsetIndexDataSet();
    
    /**
     * Gets the "indexAttributes" attribute
     */
    boolean getIndexAttributes();
    
    /**
     * Gets (as xml) the "indexAttributes" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexAttributes();
    
    /**
     * True if has "indexAttributes" attribute
     */
    boolean isSetIndexAttributes();
    
    /**
     * Sets the "indexAttributes" attribute
     */
    void setIndexAttributes(boolean indexAttributes);
    
    /**
     * Sets (as xml) the "indexAttributes" attribute
     */
    void xsetIndexAttributes(org.apache.xmlbeans.XmlBoolean indexAttributes);
    
    /**
     * Unsets the "indexAttributes" attribute
     */
    void unsetIndexAttributes();
    
    /**
     * Gets the "indexReportingPeriod" attribute
     */
    boolean getIndexReportingPeriod();
    
    /**
     * Gets (as xml) the "indexReportingPeriod" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIndexReportingPeriod();
    
    /**
     * True if has "indexReportingPeriod" attribute
     */
    boolean isSetIndexReportingPeriod();
    
    /**
     * Sets the "indexReportingPeriod" attribute
     */
    void setIndexReportingPeriod(boolean indexReportingPeriod);
    
    /**
     * Sets (as xml) the "indexReportingPeriod" attribute
     */
    void xsetIndexReportingPeriod(org.apache.xmlbeans.XmlBoolean indexReportingPeriod);
    
    /**
     * Unsets the "indexReportingPeriod" attribute
     */
    void unsetIndexReportingPeriod();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
