/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface SubmitStructureRequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitStructureRequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("submitstructurerequesttype6f54type");
    
    /**
     * Gets the "StructureLocation" element
     */
    java.lang.String getStructureLocation();
    
    /**
     * Gets (as xml) the "StructureLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetStructureLocation();
    
    /**
     * True if has "StructureLocation" element
     */
    boolean isSetStructureLocation();
    
    /**
     * Sets the "StructureLocation" element
     */
    void setStructureLocation(java.lang.String structureLocation);
    
    /**
     * Sets (as xml) the "StructureLocation" element
     */
    void xsetStructureLocation(org.apache.xmlbeans.XmlAnyURI structureLocation);
    
    /**
     * Unsets the "StructureLocation" element
     */
    void unsetStructureLocation();
    
    /**
     * Gets the "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType getStructures();
    
    /**
     * True if has "Structures" element
     */
    boolean isSetStructures();
    
    /**
     * Sets the "Structures" element
     */
    void setStructures(org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType structures);
    
    /**
     * Appends and returns a new empty "Structures" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType addNewStructures();
    
    /**
     * Unsets the "Structures" element
     */
    void unsetStructures();
    
    /**
     * Gets array of all "SubmittedStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType[] getSubmittedStructureArray();
    
    /**
     * Gets ith "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType getSubmittedStructureArray(int i);
    
    /**
     * Returns number of "SubmittedStructure" element
     */
    int sizeOfSubmittedStructureArray();
    
    /**
     * Sets array of all "SubmittedStructure" element
     */
    void setSubmittedStructureArray(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType[] submittedStructureArray);
    
    /**
     * Sets ith "SubmittedStructure" element
     */
    void setSubmittedStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType submittedStructure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType insertNewSubmittedStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubmittedStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType addNewSubmittedStructure();
    
    /**
     * Removes the ith "SubmittedStructure" element
     */
    void removeSubmittedStructure(int i);
    
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
     * Gets the "externalDependencies" attribute
     */
    boolean getExternalDependencies();
    
    /**
     * Gets (as xml) the "externalDependencies" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetExternalDependencies();
    
    /**
     * True if has "externalDependencies" attribute
     */
    boolean isSetExternalDependencies();
    
    /**
     * Sets the "externalDependencies" attribute
     */
    void setExternalDependencies(boolean externalDependencies);
    
    /**
     * Sets (as xml) the "externalDependencies" attribute
     */
    void xsetExternalDependencies(org.apache.xmlbeans.XmlBoolean externalDependencies);
    
    /**
     * Unsets the "externalDependencies" attribute
     */
    void unsetExternalDependencies();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
