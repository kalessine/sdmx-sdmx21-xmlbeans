/*
 * XML Type:  StructureSetWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML StructureSetWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface StructureSetWhereType extends org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructureSetWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("structuresetwheretypeb743type");
    
    /**
     * Gets array of all "RelatedStructures" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] getRelatedStructuresArray();
    
    /**
     * Gets ith "RelatedStructures" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType getRelatedStructuresArray(int i);
    
    /**
     * Returns number of "RelatedStructures" element
     */
    int sizeOfRelatedStructuresArray();
    
    /**
     * Sets array of all "RelatedStructures" element
     */
    void setRelatedStructuresArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] relatedStructuresArray);
    
    /**
     * Sets ith "RelatedStructures" element
     */
    void setRelatedStructuresArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType relatedStructures);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelatedStructures" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType insertNewRelatedStructures(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelatedStructures" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType addNewRelatedStructures();
    
    /**
     * Removes the ith "RelatedStructures" element
     */
    void removeRelatedStructures(int i);
    
    /**
     * Gets array of all "MappedObject" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType[] getMappedObjectArray();
    
    /**
     * Gets ith "MappedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType getMappedObjectArray(int i);
    
    /**
     * Returns number of "MappedObject" element
     */
    int sizeOfMappedObjectArray();
    
    /**
     * Sets array of all "MappedObject" element
     */
    void setMappedObjectArray(org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType[] mappedObjectArray);
    
    /**
     * Sets ith "MappedObject" element
     */
    void setMappedObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType mappedObject);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MappedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType insertNewMappedObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MappedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MappedObjectType addNewMappedObject();
    
    /**
     * Removes the ith "MappedObject" element
     */
    void removeMappedObject(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureSetWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
