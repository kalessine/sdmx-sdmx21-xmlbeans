/*
 * XML Type:  ProcessStepType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML ProcessStepType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface ProcessStepType extends org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepBaseType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessStepType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("processsteptype5951type");
    
    /**
     * Gets array of all "Input" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] getInputArray();
    
    /**
     * Gets ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType getInputArray(int i);
    
    /**
     * Returns number of "Input" element
     */
    int sizeOfInputArray();
    
    /**
     * Sets array of all "Input" element
     */
    void setInputArray(org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] inputArray);
    
    /**
     * Sets ith "Input" element
     */
    void setInputArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType input);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType insertNewInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Input" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType addNewInput();
    
    /**
     * Removes the ith "Input" element
     */
    void removeInput(int i);
    
    /**
     * Gets array of all "Output" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] getOutputArray();
    
    /**
     * Gets ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType getOutputArray(int i);
    
    /**
     * Returns number of "Output" element
     */
    int sizeOfOutputArray();
    
    /**
     * Sets array of all "Output" element
     */
    void setOutputArray(org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType[] outputArray);
    
    /**
     * Sets ith "Output" element
     */
    void setOutputArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType output);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType insertNewOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Output" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.InputOutputType addNewOutput();
    
    /**
     * Removes the ith "Output" element
     */
    void removeOutput(int i);
    
    /**
     * Gets the "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType getComputation();
    
    /**
     * True if has "Computation" element
     */
    boolean isSetComputation();
    
    /**
     * Sets the "Computation" element
     */
    void setComputation(org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType computation);
    
    /**
     * Appends and returns a new empty "Computation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ComputationType addNewComputation();
    
    /**
     * Unsets the "Computation" element
     */
    void unsetComputation();
    
    /**
     * Gets array of all "Transition" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType[] getTransitionArray();
    
    /**
     * Gets ith "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType getTransitionArray(int i);
    
    /**
     * Returns number of "Transition" element
     */
    int sizeOfTransitionArray();
    
    /**
     * Sets array of all "Transition" element
     */
    void setTransitionArray(org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType[] transitionArray);
    
    /**
     * Sets ith "Transition" element
     */
    void setTransitionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType transition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType insertNewTransition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Transition" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.TransitionType addNewTransition();
    
    /**
     * Removes the ith "Transition" element
     */
    void removeTransition(int i);
    
    /**
     * Gets array of all "ProcessStep" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[] getProcessStepArray();
    
    /**
     * Gets ith "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType getProcessStepArray(int i);
    
    /**
     * Returns number of "ProcessStep" element
     */
    int sizeOfProcessStepArray();
    
    /**
     * Sets array of all "ProcessStep" element
     */
    void setProcessStepArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType[] processStepArray);
    
    /**
     * Sets ith "ProcessStep" element
     */
    void setProcessStepArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType processStep);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType insertNewProcessStep(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProcessStep" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType addNewProcessStep();
    
    /**
     * Removes the ith "ProcessStep" element
     */
    void removeProcessStep(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessStepType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
