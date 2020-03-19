/*
 * An XML document type.
 * Localname: ItemAssociation
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one ItemAssociation(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class ItemAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ItemAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEMASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ItemAssociation");
    private static final org.apache.xmlbeans.QNameSet ITEMASSOCIATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingCategoryMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategoryMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodeMap"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ItemAssociation"),
    });
    
    
    /**
     * Gets the "ItemAssociation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType getItemAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().find_element_user(ITEMASSOCIATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ItemAssociation" element
     */
    public void setItemAssociation(org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType itemAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().find_element_user(ITEMASSOCIATION$1, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().add_element_user(ITEMASSOCIATION$0);
            }
            target.set(itemAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "ItemAssociation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType addNewItemAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ItemAssociationType)get_store().add_element_user(ITEMASSOCIATION$0);
            return target;
        }
    }
}
