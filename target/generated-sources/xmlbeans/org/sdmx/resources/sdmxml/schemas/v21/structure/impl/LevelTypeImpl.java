/*
 * XML Type:  LevelType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML LevelType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class LevelTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.LevelBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType
{
    private static final long serialVersionUID = 1L;
    
    public LevelTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODINGFORMAT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodingFormat");
    private static final javax.xml.namespace.QName LEVEL$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Level");
    
    
    /**
     * Gets the "CodingFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType getCodingFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType)get_store().find_element_user(CODINGFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodingFormat" element
     */
    public boolean isSetCodingFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODINGFORMAT$0) != 0;
        }
    }
    
    /**
     * Sets the "CodingFormat" element
     */
    public void setCodingFormat(org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType codingFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType)get_store().find_element_user(CODINGFORMAT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType)get_store().add_element_user(CODINGFORMAT$0);
            }
            target.set(codingFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "CodingFormat" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType addNewCodingFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodingTextFormatType)get_store().add_element_user(CODINGFORMAT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "CodingFormat" element
     */
    public void unsetCodingFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODINGFORMAT$0, 0);
        }
    }
    
    /**
     * Gets the "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Level" element
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEVEL$2) != 0;
        }
    }
    
    /**
     * Sets the "Level" element
     */
    public void setLevel(org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().add_element_user(LEVEL$2);
            }
            target.set(level);
        }
    }
    
    /**
     * Appends and returns a new empty "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType addNewLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.LevelType)get_store().add_element_user(LEVEL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Level" element
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEVEL$2, 0);
        }
    }
}
