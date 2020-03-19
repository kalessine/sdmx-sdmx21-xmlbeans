/*
 * An XML document type.
 * Localname: SubmitStructureResponse
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one SubmitStructureResponse(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class SubmitStructureResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSTRUCTURERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitStructureResponse");
    
    
    /**
     * Gets the "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType getSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitStructureResponse" element
     */
    public void setSubmitStructureResponse(org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType submitStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$0);
            }
            target.set(submitStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType addNewSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$0);
            return target;
        }
    }
}
