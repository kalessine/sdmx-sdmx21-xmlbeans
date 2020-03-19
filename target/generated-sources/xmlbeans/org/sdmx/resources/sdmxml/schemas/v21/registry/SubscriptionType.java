/*
 * XML Type:  SubscriptionType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML SubscriptionType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface SubscriptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubscriptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("subscriptiontypeababtype");
    
    /**
     * Gets the "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType getOrganisation();
    
    /**
     * Sets the "Organisation" element
     */
    void setOrganisation(org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType organisation);
    
    /**
     * Appends and returns a new empty "Organisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.OrganisationReferenceType addNewOrganisation();
    
    /**
     * Gets the "RegistryURN" element
     */
    java.lang.String getRegistryURN();
    
    /**
     * Gets (as xml) the "RegistryURN" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetRegistryURN();
    
    /**
     * True if has "RegistryURN" element
     */
    boolean isSetRegistryURN();
    
    /**
     * Sets the "RegistryURN" element
     */
    void setRegistryURN(java.lang.String registryURN);
    
    /**
     * Sets (as xml) the "RegistryURN" element
     */
    void xsetRegistryURN(org.apache.xmlbeans.XmlAnyURI registryURN);
    
    /**
     * Unsets the "RegistryURN" element
     */
    void unsetRegistryURN();
    
    /**
     * Gets array of all "NotificationMailTo" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] getNotificationMailToArray();
    
    /**
     * Gets ith "NotificationMailTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType getNotificationMailToArray(int i);
    
    /**
     * Returns number of "NotificationMailTo" element
     */
    int sizeOfNotificationMailToArray();
    
    /**
     * Sets array of all "NotificationMailTo" element
     */
    void setNotificationMailToArray(org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] notificationMailToArray);
    
    /**
     * Sets ith "NotificationMailTo" element
     */
    void setNotificationMailToArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType notificationMailTo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationMailTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType insertNewNotificationMailTo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationMailTo" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType addNewNotificationMailTo();
    
    /**
     * Removes the ith "NotificationMailTo" element
     */
    void removeNotificationMailTo(int i);
    
    /**
     * Gets array of all "NotificationHTTP" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] getNotificationHTTPArray();
    
    /**
     * Gets ith "NotificationHTTP" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType getNotificationHTTPArray(int i);
    
    /**
     * Returns number of "NotificationHTTP" element
     */
    int sizeOfNotificationHTTPArray();
    
    /**
     * Sets array of all "NotificationHTTP" element
     */
    void setNotificationHTTPArray(org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType[] notificationHTTPArray);
    
    /**
     * Sets ith "NotificationHTTP" element
     */
    void setNotificationHTTPArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType notificationHTTP);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "NotificationHTTP" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType insertNewNotificationHTTP(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "NotificationHTTP" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NotificationURLType addNewNotificationHTTP();
    
    /**
     * Removes the ith "NotificationHTTP" element
     */
    void removeNotificationHTTP(int i);
    
    /**
     * Gets the "SubscriberAssignedID" element
     */
    java.lang.String getSubscriberAssignedID();
    
    /**
     * Gets (as xml) the "SubscriberAssignedID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetSubscriberAssignedID();
    
    /**
     * True if has "SubscriberAssignedID" element
     */
    boolean isSetSubscriberAssignedID();
    
    /**
     * Sets the "SubscriberAssignedID" element
     */
    void setSubscriberAssignedID(java.lang.String subscriberAssignedID);
    
    /**
     * Sets (as xml) the "SubscriberAssignedID" element
     */
    void xsetSubscriberAssignedID(org.sdmx.resources.sdmxml.schemas.v21.common.IDType subscriberAssignedID);
    
    /**
     * Unsets the "SubscriberAssignedID" element
     */
    void unsetSubscriberAssignedID();
    
    /**
     * Gets the "ValidityPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType getValidityPeriod();
    
    /**
     * Sets the "ValidityPeriod" element
     */
    void setValidityPeriod(org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType validityPeriod);
    
    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.ValidityPeriodType addNewValidityPeriod();
    
    /**
     * Gets the "EventSelector" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType getEventSelector();
    
    /**
     * Sets the "EventSelector" element
     */
    void setEventSelector(org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType eventSelector);
    
    /**
     * Appends and returns a new empty "EventSelector" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType addNewEventSelector();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.SubscriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
