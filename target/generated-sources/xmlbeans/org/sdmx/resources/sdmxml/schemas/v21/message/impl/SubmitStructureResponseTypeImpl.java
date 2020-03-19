/*
 * XML Type:  SubmitStructureResponseType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML SubmitStructureResponseType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class SubmitStructureResponseTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.RegistryInterfaceTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSTRUCTURERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitStructureResponse");
    
    
    /**
     * Gets the "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType getSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitStructureResponse" element
     */
    public boolean isSetSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSTRUCTURERESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitStructureResponse" element
     */
    public void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType submitStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$0);
            }
            target.set(submitStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType addNewSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitStructureResponse" element
     */
    public void unsetSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSTRUCTURERESPONSE$0, 0);
        }
    }
}
