/*
 * XML Type:  DataRegistrationEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML DataRegistrationEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface DataRegistrationEventsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataRegistrationEventsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("dataregistrationeventstype97actype");
    
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
     * Gets array of all "DataflowReference" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] getDataflowReferenceArray();
    
    /**
     * Gets ith "DataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType getDataflowReferenceArray(int i);
    
    /**
     * Returns number of "DataflowReference" element
     */
    int sizeOfDataflowReferenceArray();
    
    /**
     * Sets array of all "DataflowReference" element
     */
    void setDataflowReferenceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] dataflowReferenceArray);
    
    /**
     * Sets ith "DataflowReference" element
     */
    void setDataflowReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType dataflowReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType insertNewDataflowReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataflowReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType addNewDataflowReference();
    
    /**
     * Removes the ith "DataflowReference" element
     */
    void removeDataflowReference(int i);
    
    /**
     * Gets array of all "KeyFamilyReference" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] getKeyFamilyReferenceArray();
    
    /**
     * Gets ith "KeyFamilyReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType getKeyFamilyReferenceArray(int i);
    
    /**
     * Returns number of "KeyFamilyReference" element
     */
    int sizeOfKeyFamilyReferenceArray();
    
    /**
     * Sets array of all "KeyFamilyReference" element
     */
    void setKeyFamilyReferenceArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType[] keyFamilyReferenceArray);
    
    /**
     * Sets ith "KeyFamilyReference" element
     */
    void setKeyFamilyReferenceArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType keyFamilyReference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamilyReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType insertNewKeyFamilyReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamilyReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MaintainableEventType addNewKeyFamilyReference();
    
    /**
     * Removes the ith "KeyFamilyReference" element
     */
    void removeKeyFamilyReference(int i);
    
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
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
