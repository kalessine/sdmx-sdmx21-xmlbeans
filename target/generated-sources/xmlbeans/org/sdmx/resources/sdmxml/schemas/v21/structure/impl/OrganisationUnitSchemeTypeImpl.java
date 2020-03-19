/*
 * XML Type:  OrganisationUnitSchemeType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML OrganisationUnitSchemeType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class OrganisationUnitSchemeTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.OrganisationSchemeTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitSchemeType
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitSchemeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationUnit");
    
    
    /**
     * Gets array of all "OrganisationUnit" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType[] getOrganisationUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONUNIT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType getOrganisationUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().find_element_user(ORGANISATIONUNIT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationUnit" element
     */
    public int sizeOfOrganisationUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONUNIT$0);
        }
    }
    
    /**
     * Sets array of all "OrganisationUnit" element
     */
    public void setOrganisationUnitArray(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType[] organisationUnitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationUnitArray, ORGANISATIONUNIT$0);
        }
    }
    
    /**
     * Sets ith "OrganisationUnit" element
     */
    public void setOrganisationUnitArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType organisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().find_element_user(ORGANISATIONUNIT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationUnit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType insertNewOrganisationUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().insert_element_user(ORGANISATIONUNIT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType addNewOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationUnitType)get_store().add_element_user(ORGANISATIONUNIT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationUnit" element
     */
    public void removeOrganisationUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONUNIT$0, i);
        }
    }
}
