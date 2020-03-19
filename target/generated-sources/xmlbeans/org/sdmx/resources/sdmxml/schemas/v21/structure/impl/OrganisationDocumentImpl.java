/*
 * An XML document type.
 * Localname: Organisation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one Organisation(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class OrganisationDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Organisation");
    private static final org.apache.xmlbeans.QNameSet ORGANISATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataConsumer"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationUnit"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataProvider"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Agency"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Organisation"),
    });
    
    
    /**
     * Gets the "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType getOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().find_element_user(ORGANISATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organisation" element
     */
    public void setOrganisation(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().find_element_user(ORGANISATION$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().add_element_user(ORGANISATION$0);
            }
            target.set(organisation);
        }
    }
    
    /**
     * Appends and returns a new empty "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType addNewOrganisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().add_element_user(ORGANISATION$0);
            return target;
        }
    }
}
