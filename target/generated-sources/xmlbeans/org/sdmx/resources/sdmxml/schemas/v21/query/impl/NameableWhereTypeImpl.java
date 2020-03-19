/*
 * XML Type:  NameableWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.NameableWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML NameableWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class NameableWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.IdentifiableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.NameableWhereType
{
    private static final long serialVersionUID = 1L;
    
    public NameableWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Description");
    
    
    /**
     * Gets the "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "Name" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
}
