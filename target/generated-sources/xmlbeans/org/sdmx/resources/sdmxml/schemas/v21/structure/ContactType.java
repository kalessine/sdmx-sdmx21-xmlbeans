/*
 * XML Type:  ContactType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure;


/**
 * An XML ContactType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public interface ContactType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("contacttype8f16type");
    
    /**
     * Gets array of all "Name" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getNameArray();
    
    /**
     * Gets ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getNameArray(int i);
    
    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "Name" element
     */
    void setNameArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] nameArray);
    
    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewName();
    
    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);
    
    /**
     * Gets array of all "Department" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getDepartmentArray();
    
    /**
     * Gets ith "Department" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getDepartmentArray(int i);
    
    /**
     * Returns number of "Department" element
     */
    int sizeOfDepartmentArray();
    
    /**
     * Sets array of all "Department" element
     */
    void setDepartmentArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] departmentArray);
    
    /**
     * Sets ith "Department" element
     */
    void setDepartmentArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType department);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Department" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewDepartment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Department" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewDepartment();
    
    /**
     * Removes the ith "Department" element
     */
    void removeDepartment(int i);
    
    /**
     * Gets array of all "Role" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] getRoleArray();
    
    /**
     * Gets ith "Role" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType getRoleArray(int i);
    
    /**
     * Returns number of "Role" element
     */
    int sizeOfRoleArray();
    
    /**
     * Sets array of all "Role" element
     */
    void setRoleArray(org.sdmx.resources.sdmxml.schemas.v21.common.TextType[] roleArray);
    
    /**
     * Sets ith "Role" element
     */
    void setRoleArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TextType role);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Role" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType insertNewRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Role" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TextType addNewRole();
    
    /**
     * Removes the ith "Role" element
     */
    void removeRole(int i);
    
    /**
     * Gets array of all "Telephone" elements
     */
    java.lang.String[] getTelephoneArray();
    
    /**
     * Gets ith "Telephone" element
     */
    java.lang.String getTelephoneArray(int i);
    
    /**
     * Gets (as xml) array of all "Telephone" elements
     */
    org.apache.xmlbeans.XmlString[] xgetTelephoneArray();
    
    /**
     * Gets (as xml) ith "Telephone" element
     */
    org.apache.xmlbeans.XmlString xgetTelephoneArray(int i);
    
    /**
     * Returns number of "Telephone" element
     */
    int sizeOfTelephoneArray();
    
    /**
     * Sets array of all "Telephone" element
     */
    void setTelephoneArray(java.lang.String[] telephoneArray);
    
    /**
     * Sets ith "Telephone" element
     */
    void setTelephoneArray(int i, java.lang.String telephone);
    
    /**
     * Sets (as xml) array of all "Telephone" element
     */
    void xsetTelephoneArray(org.apache.xmlbeans.XmlString[] telephoneArray);
    
    /**
     * Sets (as xml) ith "Telephone" element
     */
    void xsetTelephoneArray(int i, org.apache.xmlbeans.XmlString telephone);
    
    /**
     * Inserts the value as the ith "Telephone" element
     */
    void insertTelephone(int i, java.lang.String telephone);
    
    /**
     * Appends the value as the last "Telephone" element
     */
    void addTelephone(java.lang.String telephone);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Telephone" element
     */
    org.apache.xmlbeans.XmlString insertNewTelephone(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Telephone" element
     */
    org.apache.xmlbeans.XmlString addNewTelephone();
    
    /**
     * Removes the ith "Telephone" element
     */
    void removeTelephone(int i);
    
    /**
     * Gets array of all "Fax" elements
     */
    java.lang.String[] getFaxArray();
    
    /**
     * Gets ith "Fax" element
     */
    java.lang.String getFaxArray(int i);
    
    /**
     * Gets (as xml) array of all "Fax" elements
     */
    org.apache.xmlbeans.XmlString[] xgetFaxArray();
    
    /**
     * Gets (as xml) ith "Fax" element
     */
    org.apache.xmlbeans.XmlString xgetFaxArray(int i);
    
    /**
     * Returns number of "Fax" element
     */
    int sizeOfFaxArray();
    
    /**
     * Sets array of all "Fax" element
     */
    void setFaxArray(java.lang.String[] faxArray);
    
    /**
     * Sets ith "Fax" element
     */
    void setFaxArray(int i, java.lang.String fax);
    
    /**
     * Sets (as xml) array of all "Fax" element
     */
    void xsetFaxArray(org.apache.xmlbeans.XmlString[] faxArray);
    
    /**
     * Sets (as xml) ith "Fax" element
     */
    void xsetFaxArray(int i, org.apache.xmlbeans.XmlString fax);
    
    /**
     * Inserts the value as the ith "Fax" element
     */
    void insertFax(int i, java.lang.String fax);
    
    /**
     * Appends the value as the last "Fax" element
     */
    void addFax(java.lang.String fax);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Fax" element
     */
    org.apache.xmlbeans.XmlString insertNewFax(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Fax" element
     */
    org.apache.xmlbeans.XmlString addNewFax();
    
    /**
     * Removes the ith "Fax" element
     */
    void removeFax(int i);
    
    /**
     * Gets array of all "X400" elements
     */
    java.lang.String[] getX400Array();
    
    /**
     * Gets ith "X400" element
     */
    java.lang.String getX400Array(int i);
    
    /**
     * Gets (as xml) array of all "X400" elements
     */
    org.apache.xmlbeans.XmlString[] xgetX400Array();
    
    /**
     * Gets (as xml) ith "X400" element
     */
    org.apache.xmlbeans.XmlString xgetX400Array(int i);
    
    /**
     * Returns number of "X400" element
     */
    int sizeOfX400Array();
    
    /**
     * Sets array of all "X400" element
     */
    void setX400Array(java.lang.String[] x400Array);
    
    /**
     * Sets ith "X400" element
     */
    void setX400Array(int i, java.lang.String x400);
    
    /**
     * Sets (as xml) array of all "X400" element
     */
    void xsetX400Array(org.apache.xmlbeans.XmlString[] x400Array);
    
    /**
     * Sets (as xml) ith "X400" element
     */
    void xsetX400Array(int i, org.apache.xmlbeans.XmlString x400);
    
    /**
     * Inserts the value as the ith "X400" element
     */
    void insertX400(int i, java.lang.String x400);
    
    /**
     * Appends the value as the last "X400" element
     */
    void addX400(java.lang.String x400);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "X400" element
     */
    org.apache.xmlbeans.XmlString insertNewX400(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "X400" element
     */
    org.apache.xmlbeans.XmlString addNewX400();
    
    /**
     * Removes the ith "X400" element
     */
    void removeX400(int i);
    
    /**
     * Gets array of all "URI" elements
     */
    java.lang.String[] getURIArray();
    
    /**
     * Gets ith "URI" element
     */
    java.lang.String getURIArray(int i);
    
    /**
     * Gets (as xml) array of all "URI" elements
     */
    org.apache.xmlbeans.XmlAnyURI[] xgetURIArray();
    
    /**
     * Gets (as xml) ith "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetURIArray(int i);
    
    /**
     * Returns number of "URI" element
     */
    int sizeOfURIArray();
    
    /**
     * Sets array of all "URI" element
     */
    void setURIArray(java.lang.String[] uriArray);
    
    /**
     * Sets ith "URI" element
     */
    void setURIArray(int i, java.lang.String uri);
    
    /**
     * Sets (as xml) array of all "URI" element
     */
    void xsetURIArray(org.apache.xmlbeans.XmlAnyURI[] uriArray);
    
    /**
     * Sets (as xml) ith "URI" element
     */
    void xsetURIArray(int i, org.apache.xmlbeans.XmlAnyURI uri);
    
    /**
     * Inserts the value as the ith "URI" element
     */
    void insertURI(int i, java.lang.String uri);
    
    /**
     * Appends the value as the last "URI" element
     */
    void addURI(java.lang.String uri);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewURI(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "URI" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewURI();
    
    /**
     * Removes the ith "URI" element
     */
    void removeURI(int i);
    
    /**
     * Gets array of all "Email" elements
     */
    java.lang.String[] getEmailArray();
    
    /**
     * Gets ith "Email" element
     */
    java.lang.String getEmailArray(int i);
    
    /**
     * Gets (as xml) array of all "Email" elements
     */
    org.apache.xmlbeans.XmlString[] xgetEmailArray();
    
    /**
     * Gets (as xml) ith "Email" element
     */
    org.apache.xmlbeans.XmlString xgetEmailArray(int i);
    
    /**
     * Returns number of "Email" element
     */
    int sizeOfEmailArray();
    
    /**
     * Sets array of all "Email" element
     */
    void setEmailArray(java.lang.String[] emailArray);
    
    /**
     * Sets ith "Email" element
     */
    void setEmailArray(int i, java.lang.String email);
    
    /**
     * Sets (as xml) array of all "Email" element
     */
    void xsetEmailArray(org.apache.xmlbeans.XmlString[] emailArray);
    
    /**
     * Sets (as xml) ith "Email" element
     */
    void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email);
    
    /**
     * Inserts the value as the ith "Email" element
     */
    void insertEmail(int i, java.lang.String email);
    
    /**
     * Appends the value as the last "Email" element
     */
    void addEmail(java.lang.String email);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Email" element
     */
    org.apache.xmlbeans.XmlString insertNewEmail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Email" element
     */
    org.apache.xmlbeans.XmlString addNewEmail();
    
    /**
     * Removes the ith "Email" element
     */
    void removeEmail(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.IDType xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.sdmx.resources.sdmxml.schemas.v21.common.IDType id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.structure.ContactType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
