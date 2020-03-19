/*
 * An XML document type.
 * Localname: RegistryInterface
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one RegistryInterface(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class RegistryInterfaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegistryInterfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRYINTERFACE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "RegistryInterface");
    
    
    /**
     * Gets the "RegistryInterface" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType getRegistryInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType)get_store().find_element_user(REGISTRYINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegistryInterface" element
     */
    public void setRegistryInterface(org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType registryInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType)get_store().find_element_user(REGISTRYINTERFACE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType)get_store().add_element_user(REGISTRYINTERFACE$0);
            }
            target.set(registryInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "RegistryInterface" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType addNewRegistryInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType)get_store().add_element_user(REGISTRYINTERFACE$0);
            return target;
        }
    }
}
