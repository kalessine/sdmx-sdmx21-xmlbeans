/*
 * XML Type:  SubmitStructureRequestType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SubmitStructureRequestType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SubmitStructureRequestTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSTRUCTUREREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitStructureRequest");
    
    
    /**
     * Gets the "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType getSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitStructureRequest" element
     */
    public boolean isSetSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSTRUCTUREREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitStructureRequest" element
     */
    public void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType submitStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$0);
            }
            target.set(submitStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType addNewSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitStructureRequest" element
     */
    public void unsetSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSTRUCTUREREQUEST$0, 0);
        }
    }
}
