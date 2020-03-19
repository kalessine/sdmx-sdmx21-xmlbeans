/*
 * XML Type:  ISOConceptReferenceType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ISOConceptReferenceType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ISOConceptReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ISOConceptReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public ISOConceptReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPTAGENCY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptAgency");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEID$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptSchemeID");
    private static final javax.xml.namespace.QName CONCEPTID$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptID");
    
    
    /**
     * Gets the "ConceptAgency" element
     */
    public java.lang.String getConceptAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTAGENCY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConceptAgency" element
     */
    public org.apache.xmlbeans.XmlString xgetConceptAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTAGENCY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConceptAgency" element
     */
    public void setConceptAgency(java.lang.String conceptAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTAGENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPTAGENCY$0);
            }
            target.setStringValue(conceptAgency);
        }
    }
    
    /**
     * Sets (as xml) the "ConceptAgency" element
     */
    public void xsetConceptAgency(org.apache.xmlbeans.XmlString conceptAgency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTAGENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPTAGENCY$0);
            }
            target.set(conceptAgency);
        }
    }
    
    /**
     * Gets the "ConceptSchemeID" element
     */
    public java.lang.String getConceptSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTSCHEMEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConceptSchemeID" element
     */
    public org.apache.xmlbeans.XmlString xgetConceptSchemeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTSCHEMEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConceptSchemeID" element
     */
    public void setConceptSchemeID(java.lang.String conceptSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTSCHEMEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPTSCHEMEID$2);
            }
            target.setStringValue(conceptSchemeID);
        }
    }
    
    /**
     * Sets (as xml) the "ConceptSchemeID" element
     */
    public void xsetConceptSchemeID(org.apache.xmlbeans.XmlString conceptSchemeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTSCHEMEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPTSCHEMEID$2);
            }
            target.set(conceptSchemeID);
        }
    }
    
    /**
     * Gets the "ConceptID" element
     */
    public java.lang.String getConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConceptID" element
     */
    public org.apache.xmlbeans.XmlString xgetConceptID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTID$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConceptID" element
     */
    public void setConceptID(java.lang.String conceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONCEPTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONCEPTID$4);
            }
            target.setStringValue(conceptID);
        }
    }
    
    /**
     * Sets (as xml) the "ConceptID" element
     */
    public void xsetConceptID(org.apache.xmlbeans.XmlString conceptID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONCEPTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONCEPTID$4);
            }
            target.set(conceptID);
        }
    }
}
