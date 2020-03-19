/*
 * XML Type:  DataStructureComponentsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML DataStructureComponentsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface DataStructureComponentsType extends org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataStructureComponentsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("datastructurecomponentstyped1d5type");
    
    /**
     * Gets the "DimensionList" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType getDimensionList();
    
    /**
     * Sets the "DimensionList" element
     */
    void setDimensionList(org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType dimensionList);
    
    /**
     * Appends and returns a new empty "DimensionList" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType addNewDimensionList();
    
    /**
     * Gets array of all "Group" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType[] getGroupArray();
    
    /**
     * Gets ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType getGroupArray(int i);
    
    /**
     * Returns number of "Group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "Group" element
     */
    void setGroupArray(org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType[] groupArray);
    
    /**
     * Sets ith "Group" element
     */
    void setGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.GroupType addNewGroup();
    
    /**
     * Removes the ith "Group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets the "AttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType getAttributeList();
    
    /**
     * True if has "AttributeList" element
     */
    boolean isSetAttributeList();
    
    /**
     * Sets the "AttributeList" element
     */
    void setAttributeList(org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType attributeList);
    
    /**
     * Appends and returns a new empty "AttributeList" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeListType addNewAttributeList();
    
    /**
     * Unsets the "AttributeList" element
     */
    void unsetAttributeList();
    
    /**
     * Gets the "MeasureList" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType getMeasureList();
    
    /**
     * Sets the "MeasureList" element
     */
    void setMeasureList(org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType measureList);
    
    /**
     * Appends and returns a new empty "MeasureList" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureListType addNewMeasureList();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
