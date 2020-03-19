/*
 * XML Type:  HierarchicalCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML HierarchicalCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface HierarchicalCodelistType extends org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HierarchicalCodelistType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("hierarchicalcodelisttype605ctype");
    
    /**
     * Gets array of all "IncludedCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType[] getIncludedCodelistArray();
    
    /**
     * Gets ith "IncludedCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType getIncludedCodelistArray(int i);
    
    /**
     * Returns number of "IncludedCodelist" element
     */
    int sizeOfIncludedCodelistArray();
    
    /**
     * Sets array of all "IncludedCodelist" element
     */
    void setIncludedCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType[] includedCodelistArray);
    
    /**
     * Sets ith "IncludedCodelist" element
     */
    void setIncludedCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType includedCodelist);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncludedCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType insertNewIncludedCodelist(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncludedCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.IncludedCodelistReferenceType addNewIncludedCodelist();
    
    /**
     * Removes the ith "IncludedCodelist" element
     */
    void removeIncludedCodelist(int i);
    
    /**
     * Gets array of all "Hierarchy" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType[] getHierarchyArray();
    
    /**
     * Gets ith "Hierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType getHierarchyArray(int i);
    
    /**
     * Returns number of "Hierarchy" element
     */
    int sizeOfHierarchyArray();
    
    /**
     * Sets array of all "Hierarchy" element
     */
    void setHierarchyArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType[] hierarchyArray);
    
    /**
     * Sets ith "Hierarchy" element
     */
    void setHierarchyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType hierarchy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Hierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType insertNewHierarchy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Hierarchy" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchyType addNewHierarchy();
    
    /**
     * Removes the ith "Hierarchy" element
     */
    void removeHierarchy(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
