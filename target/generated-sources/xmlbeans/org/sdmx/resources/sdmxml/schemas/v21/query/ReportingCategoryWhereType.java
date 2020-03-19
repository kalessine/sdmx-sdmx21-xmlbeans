/*
 * XML Type:  ReportingCategoryWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML ReportingCategoryWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface ReportingCategoryWhereType extends org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportingCategoryWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("reportingcategorywheretypea5b8type");
    
    /**
     * Gets array of all "ProvisioningMetadata" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType[] getProvisioningMetadataArray();
    
    /**
     * Gets ith "ProvisioningMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType getProvisioningMetadataArray(int i);
    
    /**
     * Returns number of "ProvisioningMetadata" element
     */
    int sizeOfProvisioningMetadataArray();
    
    /**
     * Sets array of all "ProvisioningMetadata" element
     */
    void setProvisioningMetadataArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType[] provisioningMetadataArray);
    
    /**
     * Sets ith "ProvisioningMetadata" element
     */
    void setProvisioningMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType provisioningMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisioningMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType insertNewProvisioningMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisioningMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureUsageReferenceType addNewProvisioningMetadata();
    
    /**
     * Removes the ith "ProvisioningMetadata" element
     */
    void removeProvisioningMetadata(int i);
    
    /**
     * Gets array of all "StructuralMetadata" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType[] getStructuralMetadataArray();
    
    /**
     * Gets ith "StructuralMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType getStructuralMetadataArray(int i);
    
    /**
     * Returns number of "StructuralMetadata" element
     */
    int sizeOfStructuralMetadataArray();
    
    /**
     * Sets array of all "StructuralMetadata" element
     */
    void setStructuralMetadataArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType[] structuralMetadataArray);
    
    /**
     * Sets ith "StructuralMetadata" element
     */
    void setStructuralMetadataArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType structuralMetadata);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType insertNewStructuralMetadata(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralMetadata" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureReferenceType addNewStructuralMetadata();
    
    /**
     * Removes the ith "StructuralMetadata" element
     */
    void removeStructuralMetadata(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReportingCategoryWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
