/*
 * An XML document type.
 * Localname: SubmitStructureRequest
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * A document containing one SubmitStructureRequest(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message) element.
 *
 * This is a complex type.
 */
public class SubmitStructureRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitStructureRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITSTRUCTUREREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitStructureRequest");
    
    
    /**
     * Gets the "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType getSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitStructureRequest" element
     */
    public void setSubmitStructureRequest(org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType submitStructureRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$0);
            }
            target.set(submitStructureRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType addNewSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.message.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$0);
            return target;
        }
    }
}
