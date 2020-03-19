/*
 * XML Type:  StructureWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML StructureWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface StructureWhereType extends org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructureWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("structurewheretypee771type");
    
    /**
     * Gets array of all "UsedConcept" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] getUsedConceptArray();
    
    /**
     * Gets ith "UsedConcept" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType getUsedConceptArray(int i);
    
    /**
     * Returns number of "UsedConcept" element
     */
    int sizeOfUsedConceptArray();
    
    /**
     * Sets array of all "UsedConcept" element
     */
    void setUsedConceptArray(org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] usedConceptArray);
    
    /**
     * Sets ith "UsedConcept" element
     */
    void setUsedConceptArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType usedConcept);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UsedConcept" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType insertNewUsedConcept(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UsedConcept" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType addNewUsedConcept();
    
    /**
     * Removes the ith "UsedConcept" element
     */
    void removeUsedConcept(int i);
    
    /**
     * Gets array of all "UsedRepresentation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType[] getUsedRepresentationArray();
    
    /**
     * Gets ith "UsedRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getUsedRepresentationArray(int i);
    
    /**
     * Returns number of "UsedRepresentation" element
     */
    int sizeOfUsedRepresentationArray();
    
    /**
     * Sets array of all "UsedRepresentation" element
     */
    void setUsedRepresentationArray(org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType[] usedRepresentationArray);
    
    /**
     * Sets ith "UsedRepresentation" element
     */
    void setUsedRepresentationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType usedRepresentation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UsedRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType insertNewUsedRepresentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UsedRepresentation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType addNewUsedRepresentation();
    
    /**
     * Removes the ith "UsedRepresentation" element
     */
    void removeUsedRepresentation(int i);
    
    /**
     * Gets array of all "ComponentListWhere" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType[] getComponentListWhereArray();
    
    /**
     * Gets ith "ComponentListWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType getComponentListWhereArray(int i);
    
    /**
     * Returns number of "ComponentListWhere" element
     */
    int sizeOfComponentListWhereArray();
    
    /**
     * Sets array of all "ComponentListWhere" element
     */
    void setComponentListWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType[] componentListWhereArray);
    
    /**
     * Sets ith "ComponentListWhere" element
     */
    void setComponentListWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType componentListWhere);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentListWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType insertNewComponentListWhere(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentListWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType addNewComponentListWhere();
    
    /**
     * Removes the ith "ComponentListWhere" element
     */
    void removeComponentListWhere(int i);
    
    /**
     * Gets array of all "ComponentWhere" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] getComponentWhereArray();
    
    /**
     * Gets ith "ComponentWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType getComponentWhereArray(int i);
    
    /**
     * Returns number of "ComponentWhere" element
     */
    int sizeOfComponentWhereArray();
    
    /**
     * Sets array of all "ComponentWhere" element
     */
    void setComponentWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] componentWhereArray);
    
    /**
     * Sets ith "ComponentWhere" element
     */
    void setComponentWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType componentWhere);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType insertNewComponentWhere(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentWhere" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType addNewComponentWhere();
    
    /**
     * Removes the ith "ComponentWhere" element
     */
    void removeComponentWhere(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
