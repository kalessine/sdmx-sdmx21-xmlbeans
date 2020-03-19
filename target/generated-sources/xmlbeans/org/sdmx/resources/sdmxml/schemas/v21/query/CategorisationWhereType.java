/*
 * XML Type:  CategorisationWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML CategorisationWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface CategorisationWhereType extends org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CategorisationWhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("categorisationwheretype52c2type");
    
    /**
     * Gets the "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType getCategoryScheme();
    
    /**
     * True if has "CategoryScheme" element
     */
    boolean isSetCategoryScheme();
    
    /**
     * Sets the "CategoryScheme" element
     */
    void setCategoryScheme(org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType categoryScheme);
    
    /**
     * Appends and returns a new empty "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategorySchemeReferenceType addNewCategoryScheme();
    
    /**
     * Unsets the "CategoryScheme" element
     */
    void unsetCategoryScheme();
    
    /**
     * Gets the "TargetCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getTargetCategory();
    
    /**
     * True if has "TargetCategory" element
     */
    boolean isSetTargetCategory();
    
    /**
     * Sets the "TargetCategory" element
     */
    void setTargetCategory(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType targetCategory);
    
    /**
     * Appends and returns a new empty "TargetCategory" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewTargetCategory();
    
    /**
     * Unsets the "TargetCategory" element
     */
    void unsetTargetCategory();
    
    /**
     * Gets the "ObjectReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getObjectReference();
    
    /**
     * True if has "ObjectReference" element
     */
    boolean isSetObjectReference();
    
    /**
     * Sets the "ObjectReference" element
     */
    void setObjectReference(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType objectReference);
    
    /**
     * Appends and returns a new empty "ObjectReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewObjectReference();
    
    /**
     * Unsets the "ObjectReference" element
     */
    void unsetObjectReference();
    
    /**
     * Gets array of all "CategorisedObjectType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum[] getCategorisedObjectTypeArray();
    
    /**
     * Gets ith "CategorisedObjectType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum getCategorisedObjectTypeArray(int i);
    
    /**
     * Gets (as xml) array of all "CategorisedObjectType" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType[] xgetCategorisedObjectTypeArray();
    
    /**
     * Gets (as xml) ith "CategorisedObjectType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType xgetCategorisedObjectTypeArray(int i);
    
    /**
     * Returns number of "CategorisedObjectType" element
     */
    int sizeOfCategorisedObjectTypeArray();
    
    /**
     * Sets array of all "CategorisedObjectType" element
     */
    void setCategorisedObjectTypeArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum[] categorisedObjectTypeArray);
    
    /**
     * Sets ith "CategorisedObjectType" element
     */
    void setCategorisedObjectTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum categorisedObjectType);
    
    /**
     * Sets (as xml) array of all "CategorisedObjectType" element
     */
    void xsetCategorisedObjectTypeArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType[] categorisedObjectTypeArray);
    
    /**
     * Sets (as xml) ith "CategorisedObjectType" element
     */
    void xsetCategorisedObjectTypeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType categorisedObjectType);
    
    /**
     * Inserts the value as the ith "CategorisedObjectType" element
     */
    void insertCategorisedObjectType(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum categorisedObjectType);
    
    /**
     * Appends the value as the last "CategorisedObjectType" element
     */
    void addCategorisedObjectType(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.Enum categorisedObjectType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorisedObjectType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType insertNewCategorisedObjectType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorisedObjectType" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType addNewCategorisedObjectType();
    
    /**
     * Removes the ith "CategorisedObjectType" element
     */
    void removeCategorisedObjectType(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.CategorisationWhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
