/*
 * XML Type:  PayloadStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML PayloadStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public interface PayloadStructureType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PayloadStructureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("payloadstructuretypeabf1type");
    
    /**
     * Gets the "ProvisionAgrement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgrement();
    
    /**
     * True if has "ProvisionAgrement" element
     */
    boolean isSetProvisionAgrement();
    
    /**
     * Sets the "ProvisionAgrement" element
     */
    void setProvisionAgrement(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgrement);
    
    /**
     * Appends and returns a new empty "ProvisionAgrement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgrement();
    
    /**
     * Unsets the "ProvisionAgrement" element
     */
    void unsetProvisionAgrement();
    
    /**
     * Gets the "StructureUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType getStructureUsage();
    
    /**
     * True if has "StructureUsage" element
     */
    boolean isSetStructureUsage();
    
    /**
     * Sets the "StructureUsage" element
     */
    void setStructureUsage(org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType structureUsage);
    
    /**
     * Appends and returns a new empty "StructureUsage" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceBaseType addNewStructureUsage();
    
    /**
     * Unsets the "StructureUsage" element
     */
    void unsetStructureUsage();
    
    /**
     * Gets the "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType getStructure();
    
    /**
     * True if has "Structure" element
     */
    boolean isSetStructure();
    
    /**
     * Sets the "Structure" element
     */
    void setStructure(org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType structure);
    
    /**
     * Appends and returns a new empty "Structure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceBaseType addNewStructure();
    
    /**
     * Unsets the "Structure" element
     */
    void unsetStructure();
    
    /**
     * Gets the "structureID" attribute
     */
    java.lang.String getStructureID();
    
    /**
     * Gets (as xml) the "structureID" attribute
     */
    org.apache.xmlbeans.XmlID xgetStructureID();
    
    /**
     * Sets the "structureID" attribute
     */
    void setStructureID(java.lang.String structureID);
    
    /**
     * Sets (as xml) the "structureID" attribute
     */
    void xsetStructureID(org.apache.xmlbeans.XmlID structureID);
    
    /**
     * Gets the "schemaURL" attribute
     */
    java.lang.String getSchemaURL();
    
    /**
     * Gets (as xml) the "schemaURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetSchemaURL();
    
    /**
     * True if has "schemaURL" attribute
     */
    boolean isSetSchemaURL();
    
    /**
     * Sets the "schemaURL" attribute
     */
    void setSchemaURL(java.lang.String schemaURL);
    
    /**
     * Sets (as xml) the "schemaURL" attribute
     */
    void xsetSchemaURL(org.apache.xmlbeans.XmlAnyURI schemaURL);
    
    /**
     * Unsets the "schemaURL" attribute
     */
    void unsetSchemaURL();
    
    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();
    
    /**
     * True if has "namespace" attribute
     */
    boolean isSetNamespace();
    
    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);
    
    /**
     * Unsets the "namespace" attribute
     */
    void unsetNamespace();
    
    /**
     * Gets the "dimensionAtObservation" attribute
     */
    java.lang.String getDimensionAtObservation();
    
    /**
     * Gets (as xml) the "dimensionAtObservation" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType xgetDimensionAtObservation();
    
    /**
     * True if has "dimensionAtObservation" attribute
     */
    boolean isSetDimensionAtObservation();
    
    /**
     * Sets the "dimensionAtObservation" attribute
     */
    void setDimensionAtObservation(java.lang.String dimensionAtObservation);
    
    /**
     * Sets (as xml) the "dimensionAtObservation" attribute
     */
    void xsetDimensionAtObservation(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationDimensionType dimensionAtObservation);
    
    /**
     * Unsets the "dimensionAtObservation" attribute
     */
    void unsetDimensionAtObservation();
    
    /**
     * Gets the "explicitMeasures" attribute
     */
    boolean getExplicitMeasures();
    
    /**
     * Gets (as xml) the "explicitMeasures" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetExplicitMeasures();
    
    /**
     * True if has "explicitMeasures" attribute
     */
    boolean isSetExplicitMeasures();
    
    /**
     * Sets the "explicitMeasures" attribute
     */
    void setExplicitMeasures(boolean explicitMeasures);
    
    /**
     * Sets (as xml) the "explicitMeasures" attribute
     */
    void xsetExplicitMeasures(org.apache.xmlbeans.XmlBoolean explicitMeasures);
    
    /**
     * Unsets the "explicitMeasures" attribute
     */
    void unsetExplicitMeasures();
    
    /**
     * Gets the "serviceURL" attribute
     */
    java.lang.String getServiceURL();
    
    /**
     * Gets (as xml) the "serviceURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetServiceURL();
    
    /**
     * True if has "serviceURL" attribute
     */
    boolean isSetServiceURL();
    
    /**
     * Sets the "serviceURL" attribute
     */
    void setServiceURL(java.lang.String serviceURL);
    
    /**
     * Sets (as xml) the "serviceURL" attribute
     */
    void xsetServiceURL(org.apache.xmlbeans.XmlAnyURI serviceURL);
    
    /**
     * Unsets the "serviceURL" attribute
     */
    void unsetServiceURL();
    
    /**
     * Gets the "structureURL" attribute
     */
    java.lang.String getStructureURL();
    
    /**
     * Gets (as xml) the "structureURL" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetStructureURL();
    
    /**
     * True if has "structureURL" attribute
     */
    boolean isSetStructureURL();
    
    /**
     * Sets the "structureURL" attribute
     */
    void setStructureURL(java.lang.String structureURL);
    
    /**
     * Sets (as xml) the "structureURL" attribute
     */
    void xsetStructureURL(org.apache.xmlbeans.XmlAnyURI structureURL);
    
    /**
     * Unsets the "structureURL" attribute
     */
    void unsetStructureURL();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.PayloadStructureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
