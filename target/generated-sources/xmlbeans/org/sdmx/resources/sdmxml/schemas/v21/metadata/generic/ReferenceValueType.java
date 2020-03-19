/*
 * XML Type:  ReferenceValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.metadata.generic;


/**
 * An XML ReferenceValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/metadata/generic).
 *
 * This is a complex type.
 */
public interface ReferenceValueType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReferenceValueType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("referencevaluetype3abctype");
    
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
     * Gets the "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getDataKey();
    
    /**
     * True if has "DataKey" element
     */
    boolean isSetDataKey();
    
    /**
     * Sets the "DataKey" element
     */
    void setDataKey(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType dataKey);
    
    /**
     * Appends and returns a new empty "DataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewDataKey();
    
    /**
     * Unsets the "DataKey" element
     */
    void unsetDataKey();
    
    /**
     * Gets the "DataSetReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getDataSetReference();
    
    /**
     * True if has "DataSetReference" element
     */
    boolean isSetDataSetReference();
    
    /**
     * Sets the "DataSetReference" element
     */
    void setDataSetReference(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType dataSetReference);
    
    /**
     * Appends and returns a new empty "DataSetReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewDataSetReference();
    
    /**
     * Unsets the "DataSetReference" element
     */
    void unsetDataSetReference();
    
    /**
     * Gets the "ConstraintContentReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getConstraintContentReference();
    
    /**
     * True if has "ConstraintContentReference" element
     */
    boolean isSetConstraintContentReference();
    
    /**
     * Sets the "ConstraintContentReference" element
     */
    void setConstraintContentReference(org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType constraintContentReference);
    
    /**
     * Appends and returns a new empty "ConstraintContentReference" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType addNewConstraintContentReference();
    
    /**
     * Unsets the "ConstraintContentReference" element
     */
    void unsetConstraintContentReference();
    
    /**
     * Gets the "ReportPeriod" element
     */
    java.lang.Object getReportPeriod();
    
    /**
     * Gets (as xml) the "ReportPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType xgetReportPeriod();
    
    /**
     * True if has "ReportPeriod" element
     */
    boolean isSetReportPeriod();
    
    /**
     * Sets the "ReportPeriod" element
     */
    void setReportPeriod(java.lang.Object reportPeriod);
    
    /**
     * Sets (as xml) the "ReportPeriod" element
     */
    void xsetReportPeriod(org.sdmx.resources.sdmxml.schemas.v21.common.ObservationalTimePeriodType reportPeriod);
    
    /**
     * Unsets the "ReportPeriod" element
     */
    void unsetReportPeriod();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.metadata.generic.ReferenceValueType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
