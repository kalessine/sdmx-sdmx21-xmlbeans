/*
 * XML Type:  AnnotationWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML AnnotationWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class AnnotationWhereTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.AnnotationWhereType
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Type");
    private static final javax.xml.namespace.QName TITLE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Title");
    private static final javax.xml.namespace.QName TEXT$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "Text");
    
    
    /**
     * Gets the "Type" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Title" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().find_element_user(TITLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$2) != 0;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().find_element_user(TITLE$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().add_element_user(TITLE$2);
            }
            target.set(title);
        }
    }
    
    /**
     * Appends and returns a new empty "Title" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryStringType)get_store().add_element_user(TITLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$2, 0);
        }
    }
    
    /**
     * Gets the "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$4) != 0;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXT$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(TEXT$4);
            }
            target.set(text);
        }
    }
    
    /**
     * Appends and returns a new empty "Text" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(TEXT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$4, 0);
        }
    }
}
