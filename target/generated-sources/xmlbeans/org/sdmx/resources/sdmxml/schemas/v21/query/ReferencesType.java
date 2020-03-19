/*
 * XML Type:  ReferencesType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML ReferencesType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface ReferencesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferencesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("referencestypeb945type");
    
    /**
     * Gets the "None" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getNone();
    
    /**
     * True if has "None" element
     */
    boolean isSetNone();
    
    /**
     * Sets the "None" element
     */
    void setNone(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType none);
    
    /**
     * Appends and returns a new empty "None" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewNone();
    
    /**
     * Unsets the "None" element
     */
    void unsetNone();
    
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
     * Gets the "Parents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getParents();
    
    /**
     * True if has "Parents" element
     */
    boolean isSetParents();
    
    /**
     * Sets the "Parents" element
     */
    void setParents(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType parents);
    
    /**
     * Appends and returns a new empty "Parents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewParents();
    
    /**
     * Unsets the "Parents" element
     */
    void unsetParents();
    
    /**
     * Gets the "ParentsAndSiblings" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getParentsAndSiblings();
    
    /**
     * True if has "ParentsAndSiblings" element
     */
    boolean isSetParentsAndSiblings();
    
    /**
     * Sets the "ParentsAndSiblings" element
     */
    void setParentsAndSiblings(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType parentsAndSiblings);
    
    /**
     * Appends and returns a new empty "ParentsAndSiblings" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewParentsAndSiblings();
    
    /**
     * Unsets the "ParentsAndSiblings" element
     */
    void unsetParentsAndSiblings();
    
    /**
     * Gets the "Children" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getChildren();
    
    /**
     * True if has "Children" element
     */
    boolean isSetChildren();
    
    /**
     * Sets the "Children" element
     */
    void setChildren(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType children);
    
    /**
     * Appends and returns a new empty "Children" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewChildren();
    
    /**
     * Unsets the "Children" element
     */
    void unsetChildren();
    
    /**
     * Gets the "Descendants" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDescendants();
    
    /**
     * True if has "Descendants" element
     */
    boolean isSetDescendants();
    
    /**
     * Sets the "Descendants" element
     */
    void setDescendants(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType descendants);
    
    /**
     * Appends and returns a new empty "Descendants" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDescendants();
    
    /**
     * Unsets the "Descendants" element
     */
    void unsetDescendants();
    
    /**
     * Gets the "SpecificObjects" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType getSpecificObjects();
    
    /**
     * True if has "SpecificObjects" element
     */
    boolean isSetSpecificObjects();
    
    /**
     * Sets the "SpecificObjects" element
     */
    void setSpecificObjects(org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType specificObjects);
    
    /**
     * Appends and returns a new empty "SpecificObjects" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MaintainableObjectTypeListType addNewSpecificObjects();
    
    /**
     * Unsets the "SpecificObjects" element
     */
    void unsetSpecificObjects();
    
    /**
     * Gets the "processConstraints" attribute
     */
    boolean getProcessConstraints();
    
    /**
     * Gets (as xml) the "processConstraints" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetProcessConstraints();
    
    /**
     * True if has "processConstraints" attribute
     */
    boolean isSetProcessConstraints();
    
    /**
     * Sets the "processConstraints" attribute
     */
    void setProcessConstraints(boolean processConstraints);
    
    /**
     * Sets (as xml) the "processConstraints" attribute
     */
    void xsetProcessConstraints(org.apache.xmlbeans.XmlBoolean processConstraints);
    
    /**
     * Unsets the "processConstraints" attribute
     */
    void unsetProcessConstraints();
    
    /**
     * Gets the "detail" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailType.Enum getDetail();
    
    /**
     * Gets (as xml) the "detail" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType xgetDetail();
    
    /**
     * True if has "detail" attribute
     */
    boolean isSetDetail();
    
    /**
     * Sets the "detail" attribute
     */
    void setDetail(org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailType.Enum detail);
    
    /**
     * Sets (as xml) the "detail" attribute
     */
    void xsetDetail(org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableReturnDetailType detail);
    
    /**
     * Unsets the "detail" attribute
     */
    void unsetDetail();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
