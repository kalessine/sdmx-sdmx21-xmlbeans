/*
 * XML Type:  MetadataRegistrationEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML MetadataRegistrationEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface MetadataRegistrationEventsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataRegistrationEventsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("metadataregistrationeventstype2b47type");
    
    /**
     * Gets the "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAllEvents();
    
    /**
     * True if has "AllEvents" element
     */
    boolean isSetAllEvents();
    
    /**
     * Sets the "AllEvents" element
     */
    void setAllEvents(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType allEvents);
    
    /**
     * Appends and returns a new empty "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAllEvents();
    
    /**
     * Unsets the "AllEvents" element
     */
    void unsetAllEvents();
    
    /**
     * Gets array of all "RegistrationID" elements
     */
    java.lang.String[] getRegistrationIDArray();
    
    /**
     * Gets ith "RegistrationID" element
     */
    java.lang.String getRegistrationIDArray(int i);
    
    /**
     * Gets (as xml) array of all "RegistrationID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] xgetRegistrationIDArray();
    
    /**
     * Gets (as xml) ith "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetRegistrationIDArray(int i);
    
    /**
     * Returns number of "RegistrationID" element
     */
    int sizeOfRegistrationIDArray();
    
    /**
     * Sets array of all "RegistrationID" element
     */
    void setRegistrationIDArray(java.lang.String[] registrationIDArray);
    
    /**
     * Sets ith "RegistrationID" element
     */
    void setRegistrationIDArray(int i, java.lang.String registrationID);
    
    /**
     * Sets (as xml) array of all "RegistrationID" element
     */
    void xsetRegistrationIDArray(org.sdmx.resources.sdmxml.schemas.v21.common.IDType[] registrationIDArray);
    
    /**
     * Sets (as xml) ith "RegistrationID" element
     */
    void xsetRegistrationIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.IDType registrationID);
    
    /**
     * Inserts the value as the ith "RegistrationID" element
     */
    void insertRegistrationID(int i, java.lang.String registrationID);
    
    /**
     * Appends the value as the last "RegistrationID" element
     */
    void addRegistrationID(java.lang.String registrationID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType insertNewRegistrationID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType addNewRegistrationID();
    
    /**
     * Removes the ith "RegistrationID" element
     */
    void removeRegistrationID(int i);
    
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
     * Gets array of all "MetadataflowReference" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] getMetadataflowReferenceArray();
    
    /**
     * Gets ith "MetadataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType getMetadataflowReferenceArray(int i);
    
    /**
     * Returns number of "MetadataflowReference" element
     */
    int sizeOfMetadataflowReferenceArray();
    
    /**
     * Sets array of all "MetadataflowReference" element
     */
    void setMetadataflowReferenceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] metadataflowReferenceArray);
    
    /**
     * Sets ith "MetadataflowReference" element
     */
    void setMetadataflowReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType metadataflowReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType insertNewMetadataflowReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType addNewMetadataflowReference();
    
    /**
     * Removes the ith "MetadataflowReference" element
     */
    void removeMetadataflowReference(int i);
    
    /**
     * Gets array of all "MetadataStructureDefinitionReference" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] getMetadataStructureDefinitionReferenceArray();
    
    /**
     * Gets ith "MetadataStructureDefinitionReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType getMetadataStructureDefinitionReferenceArray(int i);
    
    /**
     * Returns number of "MetadataStructureDefinitionReference" element
     */
    int sizeOfMetadataStructureDefinitionReferenceArray();
    
    /**
     * Sets array of all "MetadataStructureDefinitionReference" element
     */
    void setMetadataStructureDefinitionReferenceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] metadataStructureDefinitionReferenceArray);
    
    /**
     * Sets ith "MetadataStructureDefinitionReference" element
     */
    void setMetadataStructureDefinitionReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType metadataStructureDefinitionReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinitionReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType insertNewMetadataStructureDefinitionReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinitionReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType addNewMetadataStructureDefinitionReference();
    
    /**
     * Removes the ith "MetadataStructureDefinitionReference" element
     */
    void removeMetadataStructureDefinitionReference(int i);
    
    /**
     * Gets array of all "Category" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] getCategoryArray();
    
    /**
     * Gets ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getCategoryArray(int i);
    
    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "Category" element
     */
    void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] categoryArray);
    
    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewCategory();
    
    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets the "TYPE" attribute
     */
    java.lang.String getTYPE();
    
    /**
     * Gets (as xml) the "TYPE" attribute
     */
    org.apache.xmlbeans.XmlString xgetTYPE();
    
    /**
     * True if has "TYPE" attribute
     */
    boolean isSetTYPE();
    
    /**
     * Sets the "TYPE" attribute
     */
    void setTYPE(java.lang.String type);
    
    /**
     * Sets (as xml) the "TYPE" attribute
     */
    void xsetTYPE(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "TYPE" attribute
     */
    void unsetTYPE();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
