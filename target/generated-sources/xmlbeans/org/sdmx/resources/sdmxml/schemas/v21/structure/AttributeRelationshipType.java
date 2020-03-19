/*
 * XML Type:  AttributeRelationshipType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML AttributeRelationshipType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface AttributeRelationshipType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttributeRelationshipType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("attributerelationshiptype91aatype");
    
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
     * Gets array of all "Dimension" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType[] getDimensionArray();
    
    /**
     * Gets ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType getDimensionArray(int i);
    
    /**
     * Returns number of "Dimension" element
     */
    int sizeOfDimensionArray();
    
    /**
     * Sets array of all "Dimension" element
     */
    void setDimensionArray(org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType[] dimensionArray);
    
    /**
     * Sets ith "Dimension" element
     */
    void setDimensionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType dimension);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType insertNewDimension(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalDimensionReferenceType addNewDimension();
    
    /**
     * Removes the ith "Dimension" element
     */
    void removeDimension(int i);
    
    /**
     * Gets array of all "AttachmentGroup" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType[] getAttachmentGroupArray();
    
    /**
     * Gets ith "AttachmentGroup" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType getAttachmentGroupArray(int i);
    
    /**
     * Returns number of "AttachmentGroup" element
     */
    int sizeOfAttachmentGroupArray();
    
    /**
     * Sets array of all "AttachmentGroup" element
     */
    void setAttachmentGroupArray(org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType[] attachmentGroupArray);
    
    /**
     * Sets ith "AttachmentGroup" element
     */
    void setAttachmentGroupArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType attachmentGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentGroup" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType insertNewAttachmentGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentGroup" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType addNewAttachmentGroup();
    
    /**
     * Removes the ith "AttachmentGroup" element
     */
    void removeAttachmentGroup(int i);
    
    /**
     * Gets the "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType getGroup();
    
    /**
     * True if has "Group" element
     */
    boolean isSetGroup();
    
    /**
     * Sets the "Group" element
     */
    void setGroup(org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType group);
    
    /**
     * Appends and returns a new empty "Group" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalGroupKeyDescriptorReferenceType addNewGroup();
    
    /**
     * Unsets the "Group" element
     */
    void unsetGroup();
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType getPrimaryMeasure();
    
    /**
     * True if has "PrimaryMeasure" element
     */
    boolean isSetPrimaryMeasure();
    
    /**
     * Sets the "PrimaryMeasure" element
     */
    void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType primaryMeasure);
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.LocalPrimaryMeasureReferenceType addNewPrimaryMeasure();
    
    /**
     * Unsets the "PrimaryMeasure" element
     */
    void unsetPrimaryMeasure();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.AttributeRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
