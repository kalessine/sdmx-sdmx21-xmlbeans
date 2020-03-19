/*
 * XML Type:  DataStructureWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML DataStructureWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface DataStructureWhereType extends org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataStructureWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("datastructurewheretype8a3btype");
    
    /**
     * Gets array of all "AttributeWhere" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType[] getAttributeWhereArray();
    
    /**
     * Gets ith "AttributeWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType getAttributeWhereArray(int i);
    
    /**
     * Returns number of "AttributeWhere" element
     */
    int sizeOfAttributeWhereArray();
    
    /**
     * Sets array of all "AttributeWhere" element
     */
    void setAttributeWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType[] attributeWhereArray);
    
    /**
     * Sets ith "AttributeWhere" element
     */
    void setAttributeWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType attributeWhere);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttributeWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType insertNewAttributeWhere(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttributeWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.AttributeWhereType addNewAttributeWhere();
    
    /**
     * Removes the ith "AttributeWhere" element
     */
    void removeAttributeWhere(int i);
    
    /**
     * Gets array of all "DimensionWhere" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] getDimensionWhereArray();
    
    /**
     * Gets ith "DimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType getDimensionWhereArray(int i);
    
    /**
     * Returns number of "DimensionWhere" element
     */
    int sizeOfDimensionWhereArray();
    
    /**
     * Sets array of all "DimensionWhere" element
     */
    void setDimensionWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType[] dimensionWhereArray);
    
    /**
     * Sets ith "DimensionWhere" element
     */
    void setDimensionWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType dimensionWhere);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType insertNewDimensionWhere(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.DimensionWhereType addNewDimensionWhere();
    
    /**
     * Removes the ith "DimensionWhere" element
     */
    void removeDimensionWhere(int i);
    
    /**
     * Gets the "MeasureDimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType getMeasureDimensionWhere();
    
    /**
     * True if has "MeasureDimensionWhere" element
     */
    boolean isSetMeasureDimensionWhere();
    
    /**
     * Sets the "MeasureDimensionWhere" element
     */
    void setMeasureDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType measureDimensionWhere);
    
    /**
     * Appends and returns a new empty "MeasureDimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MeasureDimensionWhereType addNewMeasureDimensionWhere();
    
    /**
     * Unsets the "MeasureDimensionWhere" element
     */
    void unsetMeasureDimensionWhere();
    
    /**
     * Gets the "TimeDimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType getTimeDimensionWhere();
    
    /**
     * True if has "TimeDimensionWhere" element
     */
    boolean isSetTimeDimensionWhere();
    
    /**
     * Sets the "TimeDimensionWhere" element
     */
    void setTimeDimensionWhere(org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType timeDimensionWhere);
    
    /**
     * Appends and returns a new empty "TimeDimensionWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.TimeDimensionWhereType addNewTimeDimensionWhere();
    
    /**
     * Unsets the "TimeDimensionWhere" element
     */
    void unsetTimeDimensionWhere();
    
    /**
     * Gets the "PrimaryMeasureWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType getPrimaryMeasureWhere();
    
    /**
     * True if has "PrimaryMeasureWhere" element
     */
    boolean isSetPrimaryMeasureWhere();
    
    /**
     * Sets the "PrimaryMeasureWhere" element
     */
    void setPrimaryMeasureWhere(org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType primaryMeasureWhere);
    
    /**
     * Appends and returns a new empty "PrimaryMeasureWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureWhereType addNewPrimaryMeasureWhere();
    
    /**
     * Unsets the "PrimaryMeasureWhere" element
     */
    void unsetPrimaryMeasureWhere();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.DataStructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
