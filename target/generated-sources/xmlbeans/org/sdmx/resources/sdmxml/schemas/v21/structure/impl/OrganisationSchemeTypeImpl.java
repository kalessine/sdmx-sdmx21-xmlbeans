/*
 * XML Type:  OrganisationSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML OrganisationSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class OrganisationSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationSchemeBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
     * Gets array of all "Organisation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType[] getOrganisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATION$1, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType getOrganisationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().find_element_user(ORGANISATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Organisation" element
     */
    public int sizeOfOrganisationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATION$1);
        }
    }
    
    /**
     * Sets array of all "Organisation" element
     */
    public void setOrganisationArray(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType[] organisationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationArray, ORGANISATION$0, ORGANISATION$1);
        }
    }
    
    /**
     * Sets ith "Organisation" element
     */
    public void setOrganisationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType organisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().find_element_user(ORGANISATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Organisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType insertNewOrganisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationType)get_store().insert_element_user(ORGANISATION$1, ORGANISATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Organisation" element
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
    
    /**
     * Removes the ith "Organisation" element
     */
    public void removeOrganisation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATION$1, i);
        }
    }
}
