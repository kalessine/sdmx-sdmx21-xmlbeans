/*
 * XML Type:  PrimaryMeasureValueType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML PrimaryMeasureValueType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class PrimaryMeasureValueTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.DataStructureComponentValueQueryTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.PrimaryMeasureValueType
{
    private static final long serialVersionUID = 1L;
    
    public PrimaryMeasureValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ID");
    private static final javax.xml.namespace.QName TEXTVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TextValue");
    
    
    /**
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.NCNameIDType)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, 0);
        }
    }
    
    /**
     * Gets array of all "TextValue" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] getTextValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXTVALUE$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType getTextValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXTVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "TextValue" element
     */
    public int sizeOfTextValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTVALUE$2);
        }
    }
    
    /**
     * Sets array of all "TextValue" element
     */
    public void setTextValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType[] textValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(textValueArray, TEXTVALUE$2);
        }
    }
    
    /**
     * Sets ith "TextValue" element
     */
    public void setTextValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType textValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().find_element_user(TEXTVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(textValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType insertNewTextValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().insert_element_user(TEXTVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TextValue" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType addNewTextValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.QueryTextType)get_store().add_element_user(TEXTVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TextValue" element
     */
    public void removeTextValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTVALUE$2, i);
        }
    }
}
