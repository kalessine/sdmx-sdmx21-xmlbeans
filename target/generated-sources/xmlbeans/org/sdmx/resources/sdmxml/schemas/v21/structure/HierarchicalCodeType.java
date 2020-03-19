/*
 * XML Type:  HierarchicalCodeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML HierarchicalCodeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface HierarchicalCodeType extends org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HierarchicalCodeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("hierarchicalcodetype873etype");
    
    /**
     * Gets the "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType getCode();
    
    /**
     * True if has "Code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "Code" element
     */
    void setCode(org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType code);
    
    /**
     * Appends and returns a new empty "Code" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CodeReferenceType addNewCode();
    
    /**
     * Unsets the "Code" element
     */
    void unsetCode();
    
    /**
     * Gets the "CodelistAliasRef" element
     */
    java.lang.String getCodelistAliasRef();
    
    /**
     * Gets (as xml) the "CodelistAliasRef" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetCodelistAliasRef();
    
    /**
     * True if has "CodelistAliasRef" element
     */
    boolean isSetCodelistAliasRef();
    
    /**
     * Sets the "CodelistAliasRef" element
     */
    void setCodelistAliasRef(java.lang.String codelistAliasRef);
    
    /**
     * Sets (as xml) the "CodelistAliasRef" element
     */
    void xsetCodelistAliasRef(org.sdmx.resources.sdmxml.schemas.v21.common.IDType codelistAliasRef);
    
    /**
     * Unsets the "CodelistAliasRef" element
     */
    void unsetCodelistAliasRef();
    
    /**
     * Gets the "CodeID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType getCodeID();
    
    /**
     * True if has "CodeID" element
     */
    boolean isSetCodeID();
    
    /**
     * Sets the "CodeID" element
     */
    void setCodeID(org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType codeID);
    
    /**
     * Appends and returns a new empty "CodeID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalCodeReferenceType addNewCodeID();
    
    /**
     * Unsets the "CodeID" element
     */
    void unsetCodeID();
    
    /**
     * Gets array of all "HierarchicalCode" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] getHierarchicalCodeArray();
    
    /**
     * Gets ith "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType getHierarchicalCodeArray(int i);
    
    /**
     * Returns number of "HierarchicalCode" element
     */
    int sizeOfHierarchicalCodeArray();
    
    /**
     * Sets array of all "HierarchicalCode" element
     */
    void setHierarchicalCodeArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType[] hierarchicalCodeArray);
    
    /**
     * Sets ith "HierarchicalCode" element
     */
    void setHierarchicalCodeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType hierarchicalCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType insertNewHierarchicalCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCode" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType addNewHierarchicalCode();
    
    /**
     * Removes the ith "HierarchicalCode" element
     */
    void removeHierarchicalCode(int i);
    
    /**
     * Gets the "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType getLevel();
    
    /**
     * True if has "Level" element
     */
    boolean isSetLevel();
    
    /**
     * Sets the "Level" element
     */
    void setLevel(org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType level);
    
    /**
     * Appends and returns a new empty "Level" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalLevelReferenceType addNewLevel();
    
    /**
     * Unsets the "Level" element
     */
    void unsetLevel();
    
    /**
     * Gets the "version" attribute
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.VersionType xgetVersion();
    
    /**
     * True if has "version" attribute
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(org.sdmx.resources.sdmxml.schemas.v21.common.VersionType version);
    
    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
