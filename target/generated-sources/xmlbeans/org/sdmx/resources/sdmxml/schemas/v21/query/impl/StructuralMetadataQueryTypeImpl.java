/*
 * XML Type:  StructuralMetadataQueryType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructuralMetadataQueryType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructuralMetadataQueryType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructuralMetadataQueryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructuralMetadataQueryType
{
    private static final long serialVersionUID = 1L;
    
    public StructuralMetadataQueryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RETURNDETAILS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReturnDetails");
    private static final javax.xml.namespace.QName STRUCTURALMETADATAWHERE$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructuralMetadataWhere");
    private static final org.apache.xmlbeans.QNameSet STRUCTURALMETADATAWHERE$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructuralMetadataWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataflowWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructuresWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "StructureSetWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProcessWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ProvisionAgreementWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DataStructureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "HierarchicalCodelistWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategorySchemeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CategorisationWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "CodelistWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportingTaxonomyWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataStructureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConstraintWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ConceptSchemeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "OrganisationSchemeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataflowWhere"),
    });
    
    
    /**
     * Gets the "ReturnDetails" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType getReturnDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType)get_store().find_element_user(RETURNDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ReturnDetails" element
     */
    public void setReturnDetails(org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType returnDetails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType)get_store().find_element_user(RETURNDETAILS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType)get_store().add_element_user(RETURNDETAILS$0);
            }
            target.set(returnDetails);
        }
    }
    
    /**
     * Appends and returns a new empty "ReturnDetails" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType addNewReturnDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.StructureReturnDetailsType)get_store().add_element_user(RETURNDETAILS$0);
            return target;
        }
    }
    
    /**
     * Gets the "StructuralMetadataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType getStructuralMetadataWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType)get_store().find_element_user(STRUCTURALMETADATAWHERE$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuralMetadataWhere" element
     */
    public void setStructuralMetadataWhere(org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType structuralMetadataWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType)get_store().find_element_user(STRUCTURALMETADATAWHERE$3, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType)get_store().add_element_user(STRUCTURALMETADATAWHERE$2);
            }
            target.set(structuralMetadataWhere);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuralMetadataWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType addNewStructuralMetadataWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.MaintainableWhereType)get_store().add_element_user(STRUCTURALMETADATAWHERE$2);
            return target;
        }
    }
}
