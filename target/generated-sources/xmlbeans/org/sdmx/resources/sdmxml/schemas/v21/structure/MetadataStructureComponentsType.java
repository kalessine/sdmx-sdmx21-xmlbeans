/*
 * XML Type:  MetadataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML MetadataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface MetadataStructureComponentsType extends org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataStructureComponentsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("metadatastructurecomponentstypeeab0type");
    
    /**
     * Gets array of all "MetadataTarget" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType[] getMetadataTargetArray();
    
    /**
     * Gets ith "MetadataTarget" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType getMetadataTargetArray(int i);
    
    /**
     * Returns number of "MetadataTarget" element
     */
    int sizeOfMetadataTargetArray();
    
    /**
     * Sets array of all "MetadataTarget" element
     */
    void setMetadataTargetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType[] metadataTargetArray);
    
    /**
     * Sets ith "MetadataTarget" element
     */
    void setMetadataTargetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType metadataTarget);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTarget" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType insertNewMetadataTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTarget" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataTargetType addNewMetadataTarget();
    
    /**
     * Removes the ith "MetadataTarget" element
     */
    void removeMetadataTarget(int i);
    
    /**
     * Gets array of all "ReportStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType[] getReportStructureArray();
    
    /**
     * Gets ith "ReportStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType getReportStructureArray(int i);
    
    /**
     * Returns number of "ReportStructure" element
     */
    int sizeOfReportStructureArray();
    
    /**
     * Sets array of all "ReportStructure" element
     */
    void setReportStructureArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType[] reportStructureArray);
    
    /**
     * Sets ith "ReportStructure" element
     */
    void setReportStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType reportStructure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType insertNewReportStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ReportStructureType addNewReportStructure();
    
    /**
     * Removes the ith "ReportStructure" element
     */
    void removeReportStructure(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
