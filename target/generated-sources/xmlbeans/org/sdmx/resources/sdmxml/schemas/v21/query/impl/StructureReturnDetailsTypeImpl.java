/*
 * XML Type:  StructureReturnDetailsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureReturnDetailsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureReturnDetailsTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.StructureReturnDetailsBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType
{
    private static final long serialVersionUID = 1L;
    
    public StructureReturnDetailsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCES$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "References");
    private static final javax.xml.namespace.QName RETURNMATCHEDARTEFACT$2 = 
        new javax.xml.namespace.QName("", "returnMatchedArtefact");
    
    
    /**
     * Gets the "References" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType getReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "References" element
     */
    public void setReferences(org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType)get_store().add_element_user(REFERENCES$0);
            }
            target.set(references);
        }
    }
    
    /**
     * Appends and returns a new empty "References" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType addNewReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ReferencesType)get_store().add_element_user(REFERENCES$0);
            return target;
        }
    }
    
    /**
     * Gets the "returnMatchedArtefact" attribute
     */
    public boolean getReturnMatchedArtefact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNMATCHEDARTEFACT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RETURNMATCHEDARTEFACT$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "returnMatchedArtefact" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReturnMatchedArtefact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNMATCHEDARTEFACT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(RETURNMATCHEDARTEFACT$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "returnMatchedArtefact" attribute
     */
    public boolean isSetReturnMatchedArtefact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RETURNMATCHEDARTEFACT$2) != null;
        }
    }
    
    /**
     * Sets the "returnMatchedArtefact" attribute
     */
    public void setReturnMatchedArtefact(boolean returnMatchedArtefact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETURNMATCHEDARTEFACT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETURNMATCHEDARTEFACT$2);
            }
            target.setBooleanValue(returnMatchedArtefact);
        }
    }
    
    /**
     * Sets (as xml) the "returnMatchedArtefact" attribute
     */
    public void xsetReturnMatchedArtefact(org.apache.xmlbeans.XmlBoolean returnMatchedArtefact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RETURNMATCHEDARTEFACT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RETURNMATCHEDARTEFACT$2);
            }
            target.set(returnMatchedArtefact);
        }
    }
    
    /**
     * Unsets the "returnMatchedArtefact" attribute
     */
    public void unsetReturnMatchedArtefact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RETURNMATCHEDARTEFACT$2);
        }
    }
}
