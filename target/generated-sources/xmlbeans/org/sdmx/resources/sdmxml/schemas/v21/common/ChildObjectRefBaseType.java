/*
 * XML Type:  ChildObjectRefBaseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML ChildObjectRefBaseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public interface ChildObjectRefBaseType extends org.sdmx.resources.sdmxml.schemas.v21.common.RefBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ChildObjectRefBaseType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("childobjectrefbasetypee22dtype");
    
    /**
     * Gets the "agencyID" attribute
     */
    java.lang.String getAgencyID();
    
    /**
     * Gets (as xml) the "agencyID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType xgetAgencyID();
    
    /**
     * True if has "agencyID" attribute
     */
    boolean isSetAgencyID();
    
    /**
     * Sets the "agencyID" attribute
     */
    void setAgencyID(java.lang.String agencyID);
    
    /**
     * Sets (as xml) the "agencyID" attribute
     */
    void xsetAgencyID(org.sdmx.resources.sdmxml.schemas.v21.common.NestedNCNameIDType agencyID);
    
    /**
     * Unsets the "agencyID" attribute
     */
    void unsetAgencyID();
    
    /**
     * Gets the "maintainableParentID" attribute
     */
    java.lang.String getMaintainableParentID();
    
    /**
     * Gets (as xml) the "maintainableParentID" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetMaintainableParentID();
    
    /**
     * True if has "maintainableParentID" attribute
     */
    boolean isSetMaintainableParentID();
    
    /**
     * Sets the "maintainableParentID" attribute
     */
    void setMaintainableParentID(java.lang.String maintainableParentID);
    
    /**
     * Sets (as xml) the "maintainableParentID" attribute
     */
    void xsetMaintainableParentID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType maintainableParentID);
    
    /**
     * Unsets the "maintainableParentID" attribute
     */
    void unsetMaintainableParentID();
    
    /**
     * Gets the "maintainableParentVersion" attribute
     */
    java.lang.String getMaintainableParentVersion();
    
    /**
     * Gets (as xml) the "maintainableParentVersion" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.VersionType xgetMaintainableParentVersion();
    
    /**
     * True if has "maintainableParentVersion" attribute
     */
    boolean isSetMaintainableParentVersion();
    
    /**
     * Sets the "maintainableParentVersion" attribute
     */
    void setMaintainableParentVersion(java.lang.String maintainableParentVersion);
    
    /**
     * Sets (as xml) the "maintainableParentVersion" attribute
     */
    void xsetMaintainableParentVersion(org.sdmx.resources.sdmxml.schemas.v21.common.VersionType maintainableParentVersion);
    
    /**
     * Unsets the "maintainableParentVersion" attribute
     */
    void unsetMaintainableParentVersion();
    
    /**
     * Gets the "local" attribute
     */
    boolean getLocal();
    
    /**
     * Gets (as xml) the "local" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetLocal();
    
    /**
     * True if has "local" attribute
     */
    boolean isSetLocal();
    
    /**
     * Sets the "local" attribute
     */
    void setLocal(boolean local);
    
    /**
     * Sets (as xml) the "local" attribute
     */
    void xsetLocal(org.apache.xmlbeans.XmlBoolean local);
    
    /**
     * Unsets the "local" attribute
     */
    void unsetLocal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ChildObjectRefBaseType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
