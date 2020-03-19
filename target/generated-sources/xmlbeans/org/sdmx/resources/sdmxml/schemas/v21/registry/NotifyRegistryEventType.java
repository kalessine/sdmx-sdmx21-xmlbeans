/*
 * XML Type:  NotifyRegistryEventType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML NotifyRegistryEventType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface NotifyRegistryEventType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotifyRegistryEventType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("notifyregistryeventtype46c6type");
    
    /**
     * Gets the "EventTime" element
     */
    java.util.Calendar getEventTime();
    
    /**
     * Gets (as xml) the "EventTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEventTime();
    
    /**
     * Sets the "EventTime" element
     */
    void setEventTime(java.util.Calendar eventTime);
    
    /**
     * Sets (as xml) the "EventTime" element
     */
    void xsetEventTime(org.apache.xmlbeans.XmlDateTime eventTime);
    
    /**
     * Gets the "ObjectURN" element
     */
    java.lang.String getObjectURN();
    
    /**
     * Gets (as xml) the "ObjectURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetObjectURN();
    
    /**
     * True if has "ObjectURN" element
     */
    boolean isSetObjectURN();
    
    /**
     * Sets the "ObjectURN" element
     */
    void setObjectURN(java.lang.String objectURN);
    
    /**
     * Sets (as xml) the "ObjectURN" element
     */
    void xsetObjectURN(org.apache.xmlbeans.XmlAnyURI objectURN);
    
    /**
     * Unsets the "ObjectURN" element
     */
    void unsetObjectURN();
    
    /**
     * Gets the "RegistrationID" element
     */
    java.lang.String getRegistrationID();
    
    /**
     * Gets (as xml) the "RegistrationID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetRegistrationID();
    
    /**
     * True if has "RegistrationID" element
     */
    boolean isSetRegistrationID();
    
    /**
     * Sets the "RegistrationID" element
     */
    void setRegistrationID(java.lang.String registrationID);
    
    /**
     * Sets (as xml) the "RegistrationID" element
     */
    void xsetRegistrationID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType registrationID);
    
    /**
     * Unsets the "RegistrationID" element
     */
    void unsetRegistrationID();
    
    /**
     * Gets the "SubscriptionURN" element
     */
    java.lang.String getSubscriptionURN();
    
    /**
     * Gets (as xml) the "SubscriptionURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSubscriptionURN();
    
    /**
     * Sets the "SubscriptionURN" element
     */
    void setSubscriptionURN(java.lang.String subscriptionURN);
    
    /**
     * Sets (as xml) the "SubscriptionURN" element
     */
    void xsetSubscriptionURN(org.apache.xmlbeans.XmlAnyURI subscriptionURN);
    
    /**
     * Gets the "EventAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum getEventAction();
    
    /**
     * Gets (as xml) the "EventAction" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ActionType xgetEventAction();
    
    /**
     * Sets the "EventAction" element
     */
    void setEventAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType.Enum eventAction);
    
    /**
     * Sets (as xml) the "EventAction" element
     */
    void xsetEventAction(org.sdmx.resources.sdmxml.schemas.v21.common.ActionType eventAction);
    
    /**
     * Gets the "StructuralEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType getStructuralEvent();
    
    /**
     * True if has "StructuralEvent" element
     */
    boolean isSetStructuralEvent();
    
    /**
     * Sets the "StructuralEvent" element
     */
    void setStructuralEvent(org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType structuralEvent);
    
    /**
     * Appends and returns a new empty "StructuralEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralEventType addNewStructuralEvent();
    
    /**
     * Unsets the "StructuralEvent" element
     */
    void unsetStructuralEvent();
    
    /**
     * Gets the "RegistrationEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType getRegistrationEvent();
    
    /**
     * True if has "RegistrationEvent" element
     */
    boolean isSetRegistrationEvent();
    
    /**
     * Sets the "RegistrationEvent" element
     */
    void setRegistrationEvent(org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType registrationEvent);
    
    /**
     * Appends and returns a new empty "RegistrationEvent" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.RegistrationEventType addNewRegistrationEvent();
    
    /**
     * Unsets the "RegistrationEvent" element
     */
    void unsetRegistrationEvent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
