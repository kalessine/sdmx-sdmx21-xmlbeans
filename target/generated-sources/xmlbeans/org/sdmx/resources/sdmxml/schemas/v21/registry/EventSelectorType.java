/*
 * XML Type:  EventSelectorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML EventSelectorType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface EventSelectorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventSelectorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("eventselectortypebbe1type");
    
    /**
     * Gets array of all "StructuralRepositoryEvents" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType[] getStructuralRepositoryEventsArray();
    
    /**
     * Gets ith "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType getStructuralRepositoryEventsArray(int i);
    
    /**
     * Returns number of "StructuralRepositoryEvents" element
     */
    int sizeOfStructuralRepositoryEventsArray();
    
    /**
     * Sets array of all "StructuralRepositoryEvents" element
     */
    void setStructuralRepositoryEventsArray(org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType[] structuralRepositoryEventsArray);
    
    /**
     * Sets ith "StructuralRepositoryEvents" element
     */
    void setStructuralRepositoryEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType structuralRepositoryEvents);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType insertNewStructuralRepositoryEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralRepositoryEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType addNewStructuralRepositoryEvents();
    
    /**
     * Removes the ith "StructuralRepositoryEvents" element
     */
    void removeStructuralRepositoryEvents(int i);
    
    /**
     * Gets array of all "DataRegistrationEvents" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType[] getDataRegistrationEventsArray();
    
    /**
     * Gets ith "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType getDataRegistrationEventsArray(int i);
    
    /**
     * Returns number of "DataRegistrationEvents" element
     */
    int sizeOfDataRegistrationEventsArray();
    
    /**
     * Sets array of all "DataRegistrationEvents" element
     */
    void setDataRegistrationEventsArray(org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType[] dataRegistrationEventsArray);
    
    /**
     * Sets ith "DataRegistrationEvents" element
     */
    void setDataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType dataRegistrationEvents);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType insertNewDataRegistrationEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType addNewDataRegistrationEvents();
    
    /**
     * Removes the ith "DataRegistrationEvents" element
     */
    void removeDataRegistrationEvents(int i);
    
    /**
     * Gets array of all "MetadataRegistrationEvents" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType[] getMetadataRegistrationEventsArray();
    
    /**
     * Gets ith "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType getMetadataRegistrationEventsArray(int i);
    
    /**
     * Returns number of "MetadataRegistrationEvents" element
     */
    int sizeOfMetadataRegistrationEventsArray();
    
    /**
     * Sets array of all "MetadataRegistrationEvents" element
     */
    void setMetadataRegistrationEventsArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType[] metadataRegistrationEventsArray);
    
    /**
     * Sets ith "MetadataRegistrationEvents" element
     */
    void setMetadataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType metadataRegistrationEvents);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType insertNewMetadataRegistrationEvents(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataRegistrationEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType addNewMetadataRegistrationEvents();
    
    /**
     * Removes the ith "MetadataRegistrationEvents" element
     */
    void removeMetadataRegistrationEvents(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
