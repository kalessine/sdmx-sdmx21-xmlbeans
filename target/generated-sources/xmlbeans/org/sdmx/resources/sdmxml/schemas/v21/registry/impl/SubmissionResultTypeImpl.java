/*
 * XML Type:  SubmissionResultType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML SubmissionResultType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class SubmissionResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.SubmissionResultType
{
    private static final long serialVersionUID = 1L;
    
    public SubmissionResultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITTEDSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "SubmittedStructure");
    private static final javax.xml.namespace.QName STATUSMESSAGE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StatusMessage");
    
    
    /**
     * Gets the "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType getSubmittedStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().find_element_user(SUBMITTEDSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmittedStructure" element
     */
    public void setSubmittedStructure(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType submittedStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().find_element_user(SUBMITTEDSTRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().add_element_user(SUBMITTEDSTRUCTURE$0);
            }
            target.set(submittedStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmittedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType addNewSubmittedStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmittedStructureType)get_store().add_element_user(SUBMITTEDSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Gets the "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType getStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StatusMessage" element
     */
    public void setStatusMessage(org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType statusMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().find_element_user(STATUSMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$2);
            }
            target.set(statusMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusMessage" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType addNewStatusMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StatusMessageType)get_store().add_element_user(STATUSMESSAGE$2);
            return target;
        }
    }
}
