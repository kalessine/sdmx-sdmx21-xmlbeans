/*
 * XML Type:  OrganisationSchemeMapType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML OrganisationSchemeMapType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class OrganisationSchemeMapTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ItemSchemeMapTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationSchemeMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONMAP$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationMap");
    
    
    /**
     * Gets array of all "OrganisationMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType[] getOrganisationMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONMAP$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType getOrganisationMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().find_element_user(ORGANISATIONMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationMap" element
     */
    public int sizeOfOrganisationMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONMAP$0);
        }
    }
    
    /**
     * Sets array of all "OrganisationMap" element
     */
    public void setOrganisationMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType[] organisationMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationMapArray, ORGANISATIONMAP$0);
        }
    }
    
    /**
     * Sets ith "OrganisationMap" element
     */
    public void setOrganisationMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType organisationMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().find_element_user(ORGANISATIONMAP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType insertNewOrganisationMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().insert_element_user(ORGANISATIONMAP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType addNewOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationMapType)get_store().add_element_user(ORGANISATIONMAP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationMap" element
     */
    public void removeOrganisationMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONMAP$0, i);
        }
    }
}
