/*
 * XML Type:  RegistryInterfaceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.message.impl;
/**
 * An XML RegistryInterfaceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message).
 *
 * This is a complex type.
 */
public class RegistryInterfaceTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.message.impl.MessageTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.message.RegistryInterfaceType
{
    private static final long serialVersionUID = 1L;
    
    public RegistryInterfaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitRegistrationsRequest");
    private static final javax.xml.namespace.QName SUBMITREGISTRATIONSRESPONSE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitRegistrationsResponse");
    private static final javax.xml.namespace.QName QUERYREGISTRATIONREQUEST$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QueryRegistrationRequest");
    private static final javax.xml.namespace.QName QUERYREGISTRATIONRESPONSE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QueryRegistrationResponse");
    private static final javax.xml.namespace.QName SUBMITSTRUCTUREREQUEST$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitStructureRequest");
    private static final javax.xml.namespace.QName SUBMITSTRUCTURERESPONSE$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitStructureResponse");
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONSREQUEST$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitSubscriptionsRequest");
    private static final javax.xml.namespace.QName SUBMITSUBSCRIPTIONSRESPONSE$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "SubmitSubscriptionsResponse");
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONREQUEST$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QuerySubscriptionRequest");
    private static final javax.xml.namespace.QName QUERYSUBSCRIPTIONRESPONSE$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "QuerySubscriptionResponse");
    private static final javax.xml.namespace.QName NOTIFYREGISTRYEVENT$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/message", "NotifyRegistryEvent");
    
    
    /**
     * Gets the "SubmitRegistrationsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType getSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().find_element_user(SUBMITREGISTRATIONSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitRegistrationsRequest" element
     */
    public boolean isSetSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITREGISTRATIONSREQUEST$0) != 0;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationsRequest" element
     */
    public void setSubmitRegistrationsRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType submitRegistrationsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().find_element_user(SUBMITREGISTRATIONSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().add_element_user(SUBMITREGISTRATIONSREQUEST$0);
            }
            target.set(submitRegistrationsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType addNewSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsRequestType)get_store().add_element_user(SUBMITREGISTRATIONSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitRegistrationsRequest" element
     */
    public void unsetSubmitRegistrationsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITREGISTRATIONSREQUEST$0, 0);
        }
    }
    
    /**
     * Gets the "SubmitRegistrationsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType getSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().find_element_user(SUBMITREGISTRATIONSRESPONSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitRegistrationsResponse" element
     */
    public boolean isSetSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITREGISTRATIONSRESPONSE$2) != 0;
        }
    }
    
    /**
     * Sets the "SubmitRegistrationsResponse" element
     */
    public void setSubmitRegistrationsResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType submitRegistrationsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().find_element_user(SUBMITREGISTRATIONSRESPONSE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().add_element_user(SUBMITREGISTRATIONSRESPONSE$2);
            }
            target.set(submitRegistrationsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitRegistrationsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType addNewSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitRegistrationsResponseType)get_store().add_element_user(SUBMITREGISTRATIONSRESPONSE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitRegistrationsResponse" element
     */
    public void unsetSubmitRegistrationsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITREGISTRATIONSRESPONSE$2, 0);
        }
    }
    
    /**
     * Gets the "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType getQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryRegistrationRequest" element
     */
    public boolean isSetQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYREGISTRATIONREQUEST$4) != 0;
        }
    }
    
    /**
     * Sets the "QueryRegistrationRequest" element
     */
    public void setQueryRegistrationRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType queryRegistrationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().find_element_user(QUERYREGISTRATIONREQUEST$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$4);
            }
            target.set(queryRegistrationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType addNewQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationRequestType)get_store().add_element_user(QUERYREGISTRATIONREQUEST$4);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryRegistrationRequest" element
     */
    public void unsetQueryRegistrationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYREGISTRATIONREQUEST$4, 0);
        }
    }
    
    /**
     * Gets the "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType getQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QueryRegistrationResponse" element
     */
    public boolean isSetQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYREGISTRATIONRESPONSE$6) != 0;
        }
    }
    
    /**
     * Sets the "QueryRegistrationResponse" element
     */
    public void setQueryRegistrationResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType queryRegistrationResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().find_element_user(QUERYREGISTRATIONRESPONSE$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$6);
            }
            target.set(queryRegistrationResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryRegistrationResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType addNewQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QueryRegistrationResponseType)get_store().add_element_user(QUERYREGISTRATIONRESPONSE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "QueryRegistrationResponse" element
     */
    public void unsetQueryRegistrationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYREGISTRATIONRESPONSE$6, 0);
        }
    }
    
    /**
     * Gets the "SubmitStructureRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType getSubmitStructureRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$8, 0);
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
            return get_store().count_elements(SUBMITSTRUCTUREREQUEST$8) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().find_element_user(SUBMITSTRUCTUREREQUEST$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$8);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureRequestType)get_store().add_element_user(SUBMITSTRUCTUREREQUEST$8);
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
            get_store().remove_element(SUBMITSTRUCTUREREQUEST$8, 0);
        }
    }
    
    /**
     * Gets the "SubmitStructureResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType getSubmitStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$10, 0);
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
            return get_store().count_elements(SUBMITSTRUCTURERESPONSE$10) != 0;
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().find_element_user(SUBMITSTRUCTURERESPONSE$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$10);
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
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitStructureResponseType)get_store().add_element_user(SUBMITSTRUCTURERESPONSE$10);
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
            get_store().remove_element(SUBMITSTRUCTURERESPONSE$10, 0);
        }
    }
    
    /**
     * Gets the "SubmitSubscriptionsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType getSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONSREQUEST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitSubscriptionsRequest" element
     */
    public boolean isSetSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSUBSCRIPTIONSREQUEST$12) != 0;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionsRequest" element
     */
    public void setSubmitSubscriptionsRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType submitSubscriptionsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().find_element_user(SUBMITSUBSCRIPTIONSREQUEST$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONSREQUEST$12);
            }
            target.set(submitSubscriptionsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionsRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType addNewSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsRequestType)get_store().add_element_user(SUBMITSUBSCRIPTIONSREQUEST$12);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitSubscriptionsRequest" element
     */
    public void unsetSubmitSubscriptionsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSUBSCRIPTIONSREQUEST$12, 0);
        }
    }
    
    /**
     * Gets the "SubmitSubscriptionsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType getSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONSRESPONSE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubmitSubscriptionsResponse" element
     */
    public boolean isSetSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBMITSUBSCRIPTIONSRESPONSE$14) != 0;
        }
    }
    
    /**
     * Sets the "SubmitSubscriptionsResponse" element
     */
    public void setSubmitSubscriptionsResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType submitSubscriptionsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().find_element_user(SUBMITSUBSCRIPTIONSRESPONSE$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONSRESPONSE$14);
            }
            target.set(submitSubscriptionsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitSubscriptionsResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType addNewSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.SubmitSubscriptionsResponseType)get_store().add_element_user(SUBMITSUBSCRIPTIONSRESPONSE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "SubmitSubscriptionsResponse" element
     */
    public void unsetSubmitSubscriptionsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBMITSUBSCRIPTIONSRESPONSE$14, 0);
        }
    }
    
    /**
     * Gets the "QuerySubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType getQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().find_element_user(QUERYSUBSCRIPTIONREQUEST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QuerySubscriptionRequest" element
     */
    public boolean isSetQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSUBSCRIPTIONREQUEST$16) != 0;
        }
    }
    
    /**
     * Sets the "QuerySubscriptionRequest" element
     */
    public void setQuerySubscriptionRequest(org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType querySubscriptionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().find_element_user(QUERYSUBSCRIPTIONREQUEST$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().add_element_user(QUERYSUBSCRIPTIONREQUEST$16);
            }
            target.set(querySubscriptionRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptionRequest" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType addNewQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionRequestType)get_store().add_element_user(QUERYSUBSCRIPTIONREQUEST$16);
            return target;
        }
    }
    
    /**
     * Unsets the "QuerySubscriptionRequest" element
     */
    public void unsetQuerySubscriptionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSUBSCRIPTIONREQUEST$16, 0);
        }
    }
    
    /**
     * Gets the "QuerySubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType getQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().find_element_user(QUERYSUBSCRIPTIONRESPONSE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "QuerySubscriptionResponse" element
     */
    public boolean isSetQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYSUBSCRIPTIONRESPONSE$18) != 0;
        }
    }
    
    /**
     * Sets the "QuerySubscriptionResponse" element
     */
    public void setQuerySubscriptionResponse(org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType querySubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().find_element_user(QUERYSUBSCRIPTIONRESPONSE$18, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().add_element_user(QUERYSUBSCRIPTIONRESPONSE$18);
            }
            target.set(querySubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QuerySubscriptionResponse" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType addNewQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.QuerySubscriptionResponseType)get_store().add_element_user(QUERYSUBSCRIPTIONRESPONSE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "QuerySubscriptionResponse" element
     */
    public void unsetQuerySubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYSUBSCRIPTIONRESPONSE$18, 0);
        }
    }
    
    /**
     * Gets the "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType getNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NotifyRegistryEvent" element
     */
    public boolean isSetNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTIFYREGISTRYEVENT$20) != 0;
        }
    }
    
    /**
     * Sets the "NotifyRegistryEvent" element
     */
    public void setNotifyRegistryEvent(org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType notifyRegistryEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().find_element_user(NOTIFYREGISTRYEVENT$20, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$20);
            }
            target.set(notifyRegistryEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "NotifyRegistryEvent" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType addNewNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.NotifyRegistryEventType)get_store().add_element_user(NOTIFYREGISTRYEVENT$20);
            return target;
        }
    }
    
    /**
     * Unsets the "NotifyRegistryEvent" element
     */
    public void unsetNotifyRegistryEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTIFYREGISTRYEVENT$20, 0);
        }
    }
}
