/*
 * XML Type:  DimensionListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML DimensionListType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface DimensionListType extends org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DimensionListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("dimensionlisttype1cdatype");
    
    /**
     * Gets array of all "Dimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType[] getDimensionArray();
    
    /**
     * Gets ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType getDimensionArray(int i);
    
    /**
     * Returns number of "Dimension" element
     */
    int sizeOfDimensionArray();
    
    /**
     * Sets array of all "Dimension" element
     */
    void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType[] dimensionArray);
    
    /**
     * Sets ith "Dimension" element
     */
    void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType dimension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType insertNewDimension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionType addNewDimension();
    
    /**
     * Removes the ith "Dimension" element
     */
    void removeDimension(int i);
    
    /**
     * Gets array of all "MeasureDimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType[] getMeasureDimensionArray();
    
    /**
     * Gets ith "MeasureDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType getMeasureDimensionArray(int i);
    
    /**
     * Returns number of "MeasureDimension" element
     */
    int sizeOfMeasureDimensionArray();
    
    /**
     * Sets array of all "MeasureDimension" element
     */
    void setMeasureDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType[] measureDimensionArray);
    
    /**
     * Sets ith "MeasureDimension" element
     */
    void setMeasureDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType measureDimension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType insertNewMeasureDimension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.MeasureDimensionType addNewMeasureDimension();
    
    /**
     * Removes the ith "MeasureDimension" element
     */
    void removeMeasureDimension(int i);
    
    /**
     * Gets array of all "TimeDimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType[] getTimeDimensionArray();
    
    /**
     * Gets ith "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType getTimeDimensionArray(int i);
    
    /**
     * Returns number of "TimeDimension" element
     */
    int sizeOfTimeDimensionArray();
    
    /**
     * Sets array of all "TimeDimension" element
     */
    void setTimeDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType[] timeDimensionArray);
    
    /**
     * Sets ith "TimeDimension" element
     */
    void setTimeDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType timeDimension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType insertNewTimeDimension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TimeDimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType addNewTimeDimension();
    
    /**
     * Removes the ith "TimeDimension" element
     */
    void removeTimeDimension(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.DimensionListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
