/*
 * XML Type:  QueryRegistrationRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML QueryRegistrationRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface QueryRegistrationRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryRegistrationRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("queryregistrationrequesttypef27atype");
    
    /**
     * Gets the "QueryType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType.Enum getQueryType();
    
    /**
     * Gets (as xml) the "QueryType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType xgetQueryType();
    
    /**
     * Sets the "QueryType" element
     */
    void setQueryType(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType.Enum queryType);
    
    /**
     * Sets (as xml) the "QueryType" element
     */
    void xsetQueryType(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryTypeType queryType);
    
    /**
     * Gets the "All" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAll();
    
    /**
     * True if has "All" element
     */
    boolean isSetAll();
    
    /**
     * Sets the "All" element
     */
    void setAll(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType all);
    
    /**
     * Appends and returns a new empty "All" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAll();
    
    /**
     * Unsets the "All" element
     */
    void unsetAll();
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreement();
    
    /**
     * True if has "ProvisionAgreement" element
     */
    boolean isSetProvisionAgreement();
    
    /**
     * Sets the "ProvisionAgreement" element
     */
    void setProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement);
    
    /**
     * Appends and returns a new empty "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgreement();
    
    /**
     * Unsets the "ProvisionAgreement" element
     */
    void unsetProvisionAgreement();
    
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
     * Gets the "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType getDataflow();
    
    /**
     * True if has "Dataflow" element
     */
    boolean isSetDataflow();
    
    /**
     * Sets the "Dataflow" element
     */
    void setDataflow(org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType dataflow);
    
    /**
     * Appends and returns a new empty "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataflowReferenceType addNewDataflow();
    
    /**
     * Unsets the "Dataflow" element
     */
    void unsetDataflow();
    
    /**
     * Gets the "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType getMetadataflow();
    
    /**
     * True if has "Metadataflow" element
     */
    boolean isSetMetadataflow();
    
    /**
     * Sets the "Metadataflow" element
     */
    void setMetadataflow(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType metadataflow);
    
    /**
     * Appends and returns a new empty "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType addNewMetadataflow();
    
    /**
     * Unsets the "Metadataflow" element
     */
    void unsetMetadataflow();
    
    /**
     * Gets the "ReferencePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType getReferencePeriod();
    
    /**
     * True if has "ReferencePeriod" element
     */
    boolean isSetReferencePeriod();
    
    /**
     * Sets the "ReferencePeriod" element
     */
    void setReferencePeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType referencePeriod);
    
    /**
     * Appends and returns a new empty "ReferencePeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ReferencePeriodType addNewReferencePeriod();
    
    /**
     * Unsets the "ReferencePeriod" element
     */
    void unsetReferencePeriod();
    
    /**
     * Gets array of all "DataKeySet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] getDataKeySetArray();
    
    /**
     * Gets ith "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType getDataKeySetArray(int i);
    
    /**
     * Returns number of "DataKeySet" element
     */
    int sizeOfDataKeySetArray();
    
    /**
     * Sets array of all "DataKeySet" element
     */
    void setDataKeySetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] dataKeySetArray);
    
    /**
     * Sets ith "DataKeySet" element
     */
    void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType dataKeySet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType insertNewDataKeySet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType addNewDataKeySet();
    
    /**
     * Removes the ith "DataKeySet" element
     */
    void removeDataKeySet(int i);
    
    /**
     * Gets array of all "MetadataKeySet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] getMetadataKeySetArray();
    
    /**
     * Gets ith "MetadataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType getMetadataKeySetArray(int i);
    
    /**
     * Returns number of "MetadataKeySet" element
     */
    int sizeOfMetadataKeySetArray();
    
    /**
     * Sets array of all "MetadataKeySet" element
     */
    void setMetadataKeySetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] metadataKeySetArray);
    
    /**
     * Sets ith "MetadataKeySet" element
     */
    void setMetadataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType metadataKeySet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType insertNewMetadataKeySet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataKeySet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType addNewMetadataKeySet();
    
    /**
     * Removes the ith "MetadataKeySet" element
     */
    void removeMetadataKeySet(int i);
    
    /**
     * Gets array of all "CubeRegion" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] getCubeRegionArray();
    
    /**
     * Gets ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType getCubeRegionArray(int i);
    
    /**
     * Returns number of "CubeRegion" element
     */
    int sizeOfCubeRegionArray();
    
    /**
     * Sets array of all "CubeRegion" element
     */
    void setCubeRegionArray(org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] cubeRegionArray);
    
    /**
     * Sets ith "CubeRegion" element
     */
    void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType cubeRegion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType insertNewCubeRegion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType addNewCubeRegion();
    
    /**
     * Removes the ith "CubeRegion" element
     */
    void removeCubeRegion(int i);
    
    /**
     * Gets array of all "MetadataTargetRegion" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] getMetadataTargetRegionArray();
    
    /**
     * Gets ith "MetadataTargetRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType getMetadataTargetRegionArray(int i);
    
    /**
     * Returns number of "MetadataTargetRegion" element
     */
    int sizeOfMetadataTargetRegionArray();
    
    /**
     * Sets array of all "MetadataTargetRegion" element
     */
    void setMetadataTargetRegionArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] metadataTargetRegionArray);
    
    /**
     * Sets ith "MetadataTargetRegion" element
     */
    void setMetadataTargetRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType metadataTargetRegion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType insertNewMetadataTargetRegion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetRegion" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType addNewMetadataTargetRegion();
    
    /**
     * Removes the ith "MetadataTargetRegion" element
     */
    void removeMetadataTargetRegion(int i);
    
    /**
     * Gets the "returnConstraints" attribute
     */
    boolean getReturnConstraints();
    
    /**
     * Gets (as xml) the "returnConstraints" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetReturnConstraints();
    
    /**
     * True if has "returnConstraints" attribute
     */
    boolean isSetReturnConstraints();
    
    /**
     * Sets the "returnConstraints" attribute
     */
    void setReturnConstraints(boolean returnConstraints);
    
    /**
     * Sets (as xml) the "returnConstraints" attribute
     */
    void xsetReturnConstraints(org.apache.xmlbeans.XmlBoolean returnConstraints);
    
    /**
     * Unsets the "returnConstraints" attribute
     */
    void unsetReturnConstraints();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
