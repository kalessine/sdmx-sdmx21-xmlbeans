/*
 * XML Type:  ObjectTypeListType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeListType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common.impl;
/**
 * An XML ObjectTypeListType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is a complex type.
 */
public class ObjectTypeListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeListType
{
    private static final long serialVersionUID = 1L;
    
    public ObjectTypeListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANY$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Any");
    private static final javax.xml.namespace.QName AGENCY$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Agency");
    private static final javax.xml.namespace.QName AGENCYSCHEME$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AgencyScheme");
    private static final javax.xml.namespace.QName ATTACHMENTCONSTRAINT$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AttachmentConstraint");
    private static final javax.xml.namespace.QName ATTRIBUTE$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Attribute");
    private static final javax.xml.namespace.QName ATTRIBUTEDESCRIPTOR$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "AttributeDescriptor");
    private static final javax.xml.namespace.QName CATEGORISATION$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Categorisation");
    private static final javax.xml.namespace.QName CATEGORY$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Category");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEMAP$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CategorySchemeMap");
    private static final javax.xml.namespace.QName CATEGORYSCHEME$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CategoryScheme");
    private static final javax.xml.namespace.QName CODE$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Code");
    private static final javax.xml.namespace.QName CODEMAP$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CodeMap");
    private static final javax.xml.namespace.QName CODELIST$24 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Codelist");
    private static final javax.xml.namespace.QName CODELISTMAP$26 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "CodelistMap");
    private static final javax.xml.namespace.QName COMPONENTMAP$28 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ComponentMap");
    private static final javax.xml.namespace.QName CONCEPT$30 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Concept");
    private static final javax.xml.namespace.QName CONCEPTMAP$32 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ConceptMap");
    private static final javax.xml.namespace.QName CONCEPTSCHEME$34 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ConceptScheme");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEMAP$36 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ConceptSchemeMap");
    private static final javax.xml.namespace.QName CONTENTCONSTRAINT$38 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ContentConstraint");
    private static final javax.xml.namespace.QName DATAFLOW$40 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Dataflow");
    private static final javax.xml.namespace.QName DATACONSUMER$42 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataConsumer");
    private static final javax.xml.namespace.QName DATACONSUMERSCHEME$44 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataConsumerScheme");
    private static final javax.xml.namespace.QName DATAPROVIDER$46 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataProvider");
    private static final javax.xml.namespace.QName DATAPROVIDERSCHEME$48 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataProviderScheme");
    private static final javax.xml.namespace.QName DATASETTARGET$50 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataSetTarget");
    private static final javax.xml.namespace.QName DATASTRUCTURE$52 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DataStructure");
    private static final javax.xml.namespace.QName DIMENSION$54 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Dimension");
    private static final javax.xml.namespace.QName DIMENSIONDESCRIPTOR$56 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DimensionDescriptor");
    private static final javax.xml.namespace.QName DIMENSIONDESCRIPTORVALUESTARGET$58 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "DimensionDescriptorValuesTarget");
    private static final javax.xml.namespace.QName GROUPDIMENSIONDESCRIPTOR$60 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "GroupDimensionDescriptor");
    private static final javax.xml.namespace.QName HIERARCHICALCODE$62 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HierarchicalCode");
    private static final javax.xml.namespace.QName HIERARCHICALCODELIST$64 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HierarchicalCodelist");
    private static final javax.xml.namespace.QName HIERARCHY$66 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Hierarchy");
    private static final javax.xml.namespace.QName HYBRIDCODELISTMAP$68 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HybridCodelistMap");
    private static final javax.xml.namespace.QName HYBRIDCODEMAP$70 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "HybridCodeMap");
    private static final javax.xml.namespace.QName IDENTIFIABLEOBJECTTARGET$72 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "IdentifiableObjectTarget");
    private static final javax.xml.namespace.QName LEVEL$74 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Level");
    private static final javax.xml.namespace.QName MEASUREDESCRIPTOR$76 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MeasureDescriptor");
    private static final javax.xml.namespace.QName MEASUREDIMENSION$78 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MeasureDimension");
    private static final javax.xml.namespace.QName METADATAFLOW$80 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Metadataflow");
    private static final javax.xml.namespace.QName METADATAATTRIBUTE$82 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MetadataAttribute");
    private static final javax.xml.namespace.QName METADATASET$84 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MetadataSet");
    private static final javax.xml.namespace.QName METADATASTRUCTURE$86 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MetadataStructure");
    private static final javax.xml.namespace.QName METADATATARGET$88 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "MetadataTarget");
    private static final javax.xml.namespace.QName ORGANISATIONMAP$90 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationMap");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEMAP$92 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationSchemeMap");
    private static final javax.xml.namespace.QName ORGANISATIONUNIT$94 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationUnit");
    private static final javax.xml.namespace.QName ORGANISATIONUNITSCHEME$96 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "OrganisationUnitScheme");
    private static final javax.xml.namespace.QName PRIMARYMEASURE$98 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "PrimaryMeasure");
    private static final javax.xml.namespace.QName PROCESS$100 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Process");
    private static final javax.xml.namespace.QName PROCESSSTEP$102 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ProcessStep");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENT$104 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ProvisionAgreement");
    private static final javax.xml.namespace.QName REPORTINGCATEGORY$106 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingCategory");
    private static final javax.xml.namespace.QName REPORTINGCATEGORYMAP$108 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingCategoryMap");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMY$110 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingTaxonomy");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYMAP$112 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportingTaxonomyMap");
    private static final javax.xml.namespace.QName REPORTPERIODTARGET$114 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportPeriodTarget");
    private static final javax.xml.namespace.QName REPORTSTRUCTURE$116 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "ReportStructure");
    private static final javax.xml.namespace.QName STRUCTUREMAP$118 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "StructureMap");
    private static final javax.xml.namespace.QName STRUCTURESET$120 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "StructureSet");
    private static final javax.xml.namespace.QName TIMEDIMENSION$122 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "TimeDimension");
    private static final javax.xml.namespace.QName TRANSITION$124 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common", "Transition");
    
    
    /**
     * Gets the "Any" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ANY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Any" element
     */
    public boolean isSetAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANY$0) != 0;
        }
    }
    
    /**
     * Sets the "Any" element
     */
    public void setAny(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ANY$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ANY$0);
            }
            target.set(any);
        }
    }
    
    /**
     * Appends and returns a new empty "Any" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ANY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Any" element
     */
    public void unsetAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANY$0, 0);
        }
    }
    
    /**
     * Gets the "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(AGENCY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Agency" element
     */
    public boolean isSetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCY$2) != 0;
        }
    }
    
    /**
     * Sets the "Agency" element
     */
    public void setAgency(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType agency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(AGENCY$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(AGENCY$2);
            }
            target.set(agency);
        }
    }
    
    /**
     * Appends and returns a new empty "Agency" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(AGENCY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Agency" element
     */
    public void unsetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCY$2, 0);
        }
    }
    
    /**
     * Gets the "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAgencyScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(AGENCYSCHEME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AgencyScheme" element
     */
    public boolean isSetAgencyScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENCYSCHEME$4) != 0;
        }
    }
    
    /**
     * Sets the "AgencyScheme" element
     */
    public void setAgencyScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType agencyScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(AGENCYSCHEME$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(AGENCYSCHEME$4);
            }
            target.set(agencyScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "AgencyScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAgencyScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(AGENCYSCHEME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "AgencyScheme" element
     */
    public void unsetAgencyScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENCYSCHEME$4, 0);
        }
    }
    
    /**
     * Gets the "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTACHMENTCONSTRAINT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttachmentConstraint" element
     */
    public boolean isSetAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTCONSTRAINT$6) != 0;
        }
    }
    
    /**
     * Sets the "AttachmentConstraint" element
     */
    public void setAttachmentConstraint(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType attachmentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTACHMENTCONSTRAINT$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTACHMENTCONSTRAINT$6);
            }
            target.set(attachmentConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTACHMENTCONSTRAINT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "AttachmentConstraint" element
     */
    public void unsetAttachmentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTCONSTRAINT$6, 0);
        }
    }
    
    /**
     * Gets the "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTRIBUTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Attribute" element
     */
    public boolean isSetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTE$8) != 0;
        }
    }
    
    /**
     * Sets the "Attribute" element
     */
    public void setAttribute(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType attribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTRIBUTE$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTRIBUTE$8);
            }
            target.set(attribute);
        }
    }
    
    /**
     * Appends and returns a new empty "Attribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTRIBUTE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Attribute" element
     */
    public void unsetAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTE$8, 0);
        }
    }
    
    /**
     * Gets the "AttributeDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAttributeDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTRIBUTEDESCRIPTOR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttributeDescriptor" element
     */
    public boolean isSetAttributeDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEDESCRIPTOR$10) != 0;
        }
    }
    
    /**
     * Sets the "AttributeDescriptor" element
     */
    public void setAttributeDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType attributeDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ATTRIBUTEDESCRIPTOR$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTRIBUTEDESCRIPTOR$10);
            }
            target.set(attributeDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "AttributeDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAttributeDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ATTRIBUTEDESCRIPTOR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "AttributeDescriptor" element
     */
    public void unsetAttributeDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEDESCRIPTOR$10, 0);
        }
    }
    
    /**
     * Gets the "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCategorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORISATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Categorisation" element
     */
    public boolean isSetCategorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORISATION$12) != 0;
        }
    }
    
    /**
     * Sets the "Categorisation" element
     */
    public void setCategorisation(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType categorisation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORISATION$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORISATION$12);
            }
            target.set(categorisation);
        }
    }
    
    /**
     * Appends and returns a new empty "Categorisation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCategorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORISATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Categorisation" element
     */
    public void unsetCategorisation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORISATION$12, 0);
        }
    }
    
    /**
     * Gets the "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$14) != 0;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    public void setCategory(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORY$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORY$14);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "Category" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$14, 0);
        }
    }
    
    /**
     * Gets the "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEMEMAP$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemeMap" element
     */
    public boolean isSetCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEMAP$16) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemeMap" element
     */
    public void setCategorySchemeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType categorySchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEMEMAP$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEMEMAP$16);
            }
            target.set(categorySchemeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEMEMAP$16);
            return target;
        }
    }
    
    /**
     * Unsets the "CategorySchemeMap" element
     */
    public void unsetCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEMAP$16, 0);
        }
    }
    
    /**
     * Gets the "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEME$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategoryScheme" element
     */
    public boolean isSetCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEME$18) != 0;
        }
    }
    
    /**
     * Sets the "CategoryScheme" element
     */
    public void setCategoryScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType categoryScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CATEGORYSCHEME$18, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEME$18);
            }
            target.set(categoryScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "CategoryScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CATEGORYSCHEME$18);
            return target;
        }
    }
    
    /**
     * Unsets the "CategoryScheme" element
     */
    public void unsetCategoryScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEME$18, 0);
        }
    }
    
    /**
     * Gets the "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$20) != 0;
        }
    }
    
    /**
     * Sets the "Code" element
     */
    public void setCode(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODE$20, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODE$20);
            }
            target.set(code);
        }
    }
    
    /**
     * Appends and returns a new empty "Code" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$20, 0);
        }
    }
    
    /**
     * Gets the "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODEMAP$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodeMap" element
     */
    public boolean isSetCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEMAP$22) != 0;
        }
    }
    
    /**
     * Sets the "CodeMap" element
     */
    public void setCodeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType codeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODEMAP$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODEMAP$22);
            }
            target.set(codeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODEMAP$22);
            return target;
        }
    }
    
    /**
     * Unsets the "CodeMap" element
     */
    public void unsetCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEMAP$22, 0);
        }
    }
    
    /**
     * Gets the "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODELIST$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Codelist" element
     */
    public boolean isSetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELIST$24) != 0;
        }
    }
    
    /**
     * Sets the "Codelist" element
     */
    public void setCodelist(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType codelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODELIST$24, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODELIST$24);
            }
            target.set(codelist);
        }
    }
    
    /**
     * Appends and returns a new empty "Codelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODELIST$24);
            return target;
        }
    }
    
    /**
     * Unsets the "Codelist" element
     */
    public void unsetCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELIST$24, 0);
        }
    }
    
    /**
     * Gets the "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODELISTMAP$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CodelistMap" element
     */
    public boolean isSetCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTMAP$26) != 0;
        }
    }
    
    /**
     * Sets the "CodelistMap" element
     */
    public void setCodelistMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType codelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CODELISTMAP$26, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODELISTMAP$26);
            }
            target.set(codelistMap);
        }
    }
    
    /**
     * Appends and returns a new empty "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CODELISTMAP$26);
            return target;
        }
    }
    
    /**
     * Unsets the "CodelistMap" element
     */
    public void unsetCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTMAP$26, 0);
        }
    }
    
    /**
     * Gets the "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(COMPONENTMAP$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ComponentMap" element
     */
    public boolean isSetComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTMAP$28) != 0;
        }
    }
    
    /**
     * Sets the "ComponentMap" element
     */
    public void setComponentMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType componentMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(COMPONENTMAP$28, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(COMPONENTMAP$28);
            }
            target.set(componentMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(COMPONENTMAP$28);
            return target;
        }
    }
    
    /**
     * Unsets the "ComponentMap" element
     */
    public void unsetComponentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTMAP$28, 0);
        }
    }
    
    /**
     * Gets the "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPT$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Concept" element
     */
    public boolean isSetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$30) != 0;
        }
    }
    
    /**
     * Sets the "Concept" element
     */
    public void setConcept(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPT$30, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPT$30);
            }
            target.set(concept);
        }
    }
    
    /**
     * Appends and returns a new empty "Concept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPT$30);
            return target;
        }
    }
    
    /**
     * Unsets the "Concept" element
     */
    public void unsetConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$30, 0);
        }
    }
    
    /**
     * Gets the "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTMAP$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConceptMap" element
     */
    public boolean isSetConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTMAP$32) != 0;
        }
    }
    
    /**
     * Sets the "ConceptMap" element
     */
    public void setConceptMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType conceptMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTMAP$32, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTMAP$32);
            }
            target.set(conceptMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTMAP$32);
            return target;
        }
    }
    
    /**
     * Unsets the "ConceptMap" element
     */
    public void unsetConceptMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTMAP$32, 0);
        }
    }
    
    /**
     * Gets the "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConceptScheme" element
     */
    public boolean isSetConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEME$34) != 0;
        }
    }
    
    /**
     * Sets the "ConceptScheme" element
     */
    public void setConceptScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType conceptScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEME$34, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEME$34);
            }
            target.set(conceptScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEME$34);
            return target;
        }
    }
    
    /**
     * Unsets the "ConceptScheme" element
     */
    public void unsetConceptScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEME$34, 0);
        }
    }
    
    /**
     * Gets the "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEMEMAP$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConceptSchemeMap" element
     */
    public boolean isSetConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEMEMAP$36) != 0;
        }
    }
    
    /**
     * Sets the "ConceptSchemeMap" element
     */
    public void setConceptSchemeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType conceptSchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONCEPTSCHEMEMAP$36, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEMEMAP$36);
            }
            target.set(conceptSchemeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONCEPTSCHEMEMAP$36);
            return target;
        }
    }
    
    /**
     * Unsets the "ConceptSchemeMap" element
     */
    public void unsetConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEMEMAP$36, 0);
        }
    }
    
    /**
     * Gets the "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONTENTCONSTRAINT$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContentConstraint" element
     */
    public boolean isSetContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTCONSTRAINT$38) != 0;
        }
    }
    
    /**
     * Sets the "ContentConstraint" element
     */
    public void setContentConstraint(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType contentConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(CONTENTCONSTRAINT$38, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONTENTCONSTRAINT$38);
            }
            target.set(contentConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "ContentConstraint" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(CONTENTCONSTRAINT$38);
            return target;
        }
    }
    
    /**
     * Unsets the "ContentConstraint" element
     */
    public void unsetContentConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTCONSTRAINT$38, 0);
        }
    }
    
    /**
     * Gets the "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAFLOW$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Dataflow" element
     */
    public boolean isSetDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOW$40) != 0;
        }
    }
    
    /**
     * Sets the "Dataflow" element
     */
    public void setDataflow(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAFLOW$40, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAFLOW$40);
            }
            target.set(dataflow);
        }
    }
    
    /**
     * Appends and returns a new empty "Dataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAFLOW$40);
            return target;
        }
    }
    
    /**
     * Unsets the "Dataflow" element
     */
    public void unsetDataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOW$40, 0);
        }
    }
    
    /**
     * Gets the "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATACONSUMER$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataConsumer" element
     */
    public boolean isSetDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSUMER$42) != 0;
        }
    }
    
    /**
     * Sets the "DataConsumer" element
     */
    public void setDataConsumer(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataConsumer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATACONSUMER$42, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATACONSUMER$42);
            }
            target.set(dataConsumer);
        }
    }
    
    /**
     * Appends and returns a new empty "DataConsumer" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATACONSUMER$42);
            return target;
        }
    }
    
    /**
     * Unsets the "DataConsumer" element
     */
    public void unsetDataConsumer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSUMER$42, 0);
        }
    }
    
    /**
     * Gets the "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATACONSUMERSCHEME$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataConsumerScheme" element
     */
    public boolean isSetDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACONSUMERSCHEME$44) != 0;
        }
    }
    
    /**
     * Sets the "DataConsumerScheme" element
     */
    public void setDataConsumerScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataConsumerScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATACONSUMERSCHEME$44, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATACONSUMERSCHEME$44);
            }
            target.set(dataConsumerScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "DataConsumerScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATACONSUMERSCHEME$44);
            return target;
        }
    }
    
    /**
     * Unsets the "DataConsumerScheme" element
     */
    public void unsetDataConsumerScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACONSUMERSCHEME$44, 0);
        }
    }
    
    /**
     * Gets the "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAPROVIDER$46, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProvider" element
     */
    public boolean isSetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDER$46) != 0;
        }
    }
    
    /**
     * Sets the "DataProvider" element
     */
    public void setDataProvider(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAPROVIDER$46, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAPROVIDER$46);
            }
            target.set(dataProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProvider" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAPROVIDER$46);
            return target;
        }
    }
    
    /**
     * Unsets the "DataProvider" element
     */
    public void unsetDataProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDER$46, 0);
        }
    }
    
    /**
     * Gets the "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAPROVIDERSCHEME$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataProviderScheme" element
     */
    public boolean isSetDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAPROVIDERSCHEME$48) != 0;
        }
    }
    
    /**
     * Sets the "DataProviderScheme" element
     */
    public void setDataProviderScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataProviderScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATAPROVIDERSCHEME$48, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAPROVIDERSCHEME$48);
            }
            target.set(dataProviderScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "DataProviderScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATAPROVIDERSCHEME$48);
            return target;
        }
    }
    
    /**
     * Unsets the "DataProviderScheme" element
     */
    public void unsetDataProviderScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAPROVIDERSCHEME$48, 0);
        }
    }
    
    /**
     * Gets the "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATASETTARGET$50, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataSetTarget" element
     */
    public boolean isSetDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASETTARGET$50) != 0;
        }
    }
    
    /**
     * Sets the "DataSetTarget" element
     */
    public void setDataSetTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataSetTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATASETTARGET$50, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATASETTARGET$50);
            }
            target.set(dataSetTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSetTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATASETTARGET$50);
            return target;
        }
    }
    
    /**
     * Unsets the "DataSetTarget" element
     */
    public void unsetDataSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASETTARGET$50, 0);
        }
    }
    
    /**
     * Gets the "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATASTRUCTURE$52, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataStructure" element
     */
    public boolean isSetDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTRUCTURE$52) != 0;
        }
    }
    
    /**
     * Sets the "DataStructure" element
     */
    public void setDataStructure(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DATASTRUCTURE$52, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATASTRUCTURE$52);
            }
            target.set(dataStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "DataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DATASTRUCTURE$52);
            return target;
        }
    }
    
    /**
     * Unsets the "DataStructure" element
     */
    public void unsetDataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTRUCTURE$52, 0);
        }
    }
    
    /**
     * Gets the "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSION$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Dimension" element
     */
    public boolean isSetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$54) != 0;
        }
    }
    
    /**
     * Sets the "Dimension" element
     */
    public void setDimension(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSION$54, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSION$54);
            }
            target.set(dimension);
        }
    }
    
    /**
     * Appends and returns a new empty "Dimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSION$54);
            return target;
        }
    }
    
    /**
     * Unsets the "Dimension" element
     */
    public void unsetDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$54, 0);
        }
    }
    
    /**
     * Gets the "DimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTOR$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DimensionDescriptor" element
     */
    public boolean isSetDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSIONDESCRIPTOR$56) != 0;
        }
    }
    
    /**
     * Sets the "DimensionDescriptor" element
     */
    public void setDimensionDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dimensionDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTOR$56, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTOR$56);
            }
            target.set(dimensionDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTOR$56);
            return target;
        }
    }
    
    /**
     * Unsets the "DimensionDescriptor" element
     */
    public void unsetDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSIONDESCRIPTOR$56, 0);
        }
    }
    
    /**
     * Gets the "DimensionDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getDimensionDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTORVALUESTARGET$58, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DimensionDescriptorValuesTarget" element
     */
    public boolean isSetDimensionDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSIONDESCRIPTORVALUESTARGET$58) != 0;
        }
    }
    
    /**
     * Sets the "DimensionDescriptorValuesTarget" element
     */
    public void setDimensionDescriptorValuesTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType dimensionDescriptorValuesTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(DIMENSIONDESCRIPTORVALUESTARGET$58, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTORVALUESTARGET$58);
            }
            target.set(dimensionDescriptorValuesTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionDescriptorValuesTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewDimensionDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(DIMENSIONDESCRIPTORVALUESTARGET$58);
            return target;
        }
    }
    
    /**
     * Unsets the "DimensionDescriptorValuesTarget" element
     */
    public void unsetDimensionDescriptorValuesTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSIONDESCRIPTORVALUESTARGET$58, 0);
        }
    }
    
    /**
     * Gets the "GroupDimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getGroupDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(GROUPDIMENSIONDESCRIPTOR$60, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GroupDimensionDescriptor" element
     */
    public boolean isSetGroupDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUPDIMENSIONDESCRIPTOR$60) != 0;
        }
    }
    
    /**
     * Sets the "GroupDimensionDescriptor" element
     */
    public void setGroupDimensionDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType groupDimensionDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(GROUPDIMENSIONDESCRIPTOR$60, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(GROUPDIMENSIONDESCRIPTOR$60);
            }
            target.set(groupDimensionDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "GroupDimensionDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewGroupDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(GROUPDIMENSIONDESCRIPTOR$60);
            return target;
        }
    }
    
    /**
     * Unsets the "GroupDimensionDescriptor" element
     */
    public void unsetGroupDimensionDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUPDIMENSIONDESCRIPTOR$60, 0);
        }
    }
    
    /**
     * Gets the "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODE$62, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HierarchicalCode" element
     */
    public boolean isSetHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODE$62) != 0;
        }
    }
    
    /**
     * Sets the "HierarchicalCode" element
     */
    public void setHierarchicalCode(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hierarchicalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODE$62, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODE$62);
            }
            target.set(hierarchicalCode);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCode" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODE$62);
            return target;
        }
    }
    
    /**
     * Unsets the "HierarchicalCode" element
     */
    public void unsetHierarchicalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODE$62, 0);
        }
    }
    
    /**
     * Gets the "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODELIST$64, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HierarchicalCodelist" element
     */
    public boolean isSetHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELIST$64) != 0;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelist" element
     */
    public void setHierarchicalCodelist(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hierarchicalCodelist)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHICALCODELIST$64, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODELIST$64);
            }
            target.set(hierarchicalCodelist);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelist" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHICALCODELIST$64);
            return target;
        }
    }
    
    /**
     * Unsets the "HierarchicalCodelist" element
     */
    public void unsetHierarchicalCodelist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELIST$64, 0);
        }
    }
    
    /**
     * Gets the "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHY$66, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Hierarchy" element
     */
    public boolean isSetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHY$66) != 0;
        }
    }
    
    /**
     * Sets the "Hierarchy" element
     */
    public void setHierarchy(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hierarchy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HIERARCHY$66, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHY$66);
            }
            target.set(hierarchy);
        }
    }
    
    /**
     * Appends and returns a new empty "Hierarchy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HIERARCHY$66);
            return target;
        }
    }
    
    /**
     * Unsets the "Hierarchy" element
     */
    public void unsetHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHY$66, 0);
        }
    }
    
    /**
     * Gets the "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODELISTMAP$68, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HybridCodelistMap" element
     */
    public boolean isSetHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYBRIDCODELISTMAP$68) != 0;
        }
    }
    
    /**
     * Sets the "HybridCodelistMap" element
     */
    public void setHybridCodelistMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hybridCodelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODELISTMAP$68, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODELISTMAP$68);
            }
            target.set(hybridCodelistMap);
        }
    }
    
    /**
     * Appends and returns a new empty "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODELISTMAP$68);
            return target;
        }
    }
    
    /**
     * Unsets the "HybridCodelistMap" element
     */
    public void unsetHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYBRIDCODELISTMAP$68, 0);
        }
    }
    
    /**
     * Gets the "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODEMAP$70, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HybridCodeMap" element
     */
    public boolean isSetHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYBRIDCODEMAP$70) != 0;
        }
    }
    
    /**
     * Sets the "HybridCodeMap" element
     */
    public void setHybridCodeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType hybridCodeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(HYBRIDCODEMAP$70, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODEMAP$70);
            }
            target.set(hybridCodeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "HybridCodeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(HYBRIDCODEMAP$70);
            return target;
        }
    }
    
    /**
     * Unsets the "HybridCodeMap" element
     */
    public void unsetHybridCodeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYBRIDCODEMAP$70, 0);
        }
    }
    
    /**
     * Gets the "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$72, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiableObjectTarget" element
     */
    public boolean isSetIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIABLEOBJECTTARGET$72) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiableObjectTarget" element
     */
    public void setIdentifiableObjectTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType identifiableObjectTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(IDENTIFIABLEOBJECTTARGET$72, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$72);
            }
            target.set(identifiableObjectTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentifiableObjectTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(IDENTIFIABLEOBJECTTARGET$72);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiableObjectTarget" element
     */
    public void unsetIdentifiableObjectTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIABLEOBJECTTARGET$72, 0);
        }
    }
    
    /**
     * Gets the "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(LEVEL$74, 0);
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
            return get_store().count_elements(LEVEL$74) != 0;
        }
    }
    
    /**
     * Sets the "Level" element
     */
    public void setLevel(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(LEVEL$74, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(LEVEL$74);
            }
            target.set(level);
        }
    }
    
    /**
     * Appends and returns a new empty "Level" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(LEVEL$74);
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
            get_store().remove_element(LEVEL$74, 0);
        }
    }
    
    /**
     * Gets the "MeasureDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMeasureDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(MEASUREDESCRIPTOR$76, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MeasureDescriptor" element
     */
    public boolean isSetMeasureDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDESCRIPTOR$76) != 0;
        }
    }
    
    /**
     * Sets the "MeasureDescriptor" element
     */
    public void setMeasureDescriptor(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType measureDescriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(MEASUREDESCRIPTOR$76, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(MEASUREDESCRIPTOR$76);
            }
            target.set(measureDescriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureDescriptor" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMeasureDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(MEASUREDESCRIPTOR$76);
            return target;
        }
    }
    
    /**
     * Unsets the "MeasureDescriptor" element
     */
    public void unsetMeasureDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDESCRIPTOR$76, 0);
        }
    }
    
    /**
     * Gets the "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(MEASUREDIMENSION$78, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MeasureDimension" element
     */
    public boolean isSetMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREDIMENSION$78) != 0;
        }
    }
    
    /**
     * Sets the "MeasureDimension" element
     */
    public void setMeasureDimension(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType measureDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(MEASUREDIMENSION$78, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(MEASUREDIMENSION$78);
            }
            target.set(measureDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "MeasureDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(MEASUREDIMENSION$78);
            return target;
        }
    }
    
    /**
     * Unsets the "MeasureDimension" element
     */
    public void unsetMeasureDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREDIMENSION$78, 0);
        }
    }
    
    /**
     * Gets the "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAFLOW$80, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Metadataflow" element
     */
    public boolean isSetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOW$80) != 0;
        }
    }
    
    /**
     * Sets the "Metadataflow" element
     */
    public void setMetadataflow(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataflow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAFLOW$80, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAFLOW$80);
            }
            target.set(metadataflow);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadataflow" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAFLOW$80);
            return target;
        }
    }
    
    /**
     * Unsets the "Metadataflow" element
     */
    public void unsetMetadataflow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOW$80, 0);
        }
    }
    
    /**
     * Gets the "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAATTRIBUTE$82, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataAttribute" element
     */
    public boolean isSetMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAATTRIBUTE$82) != 0;
        }
    }
    
    /**
     * Sets the "MetadataAttribute" element
     */
    public void setMetadataAttribute(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATAATTRIBUTE$82, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAATTRIBUTE$82);
            }
            target.set(metadataAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataAttribute" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATAATTRIBUTE$82);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataAttribute" element
     */
    public void unsetMetadataAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAATTRIBUTE$82, 0);
        }
    }
    
    /**
     * Gets the "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATASET$84, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataSet" element
     */
    public boolean isSetMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASET$84) != 0;
        }
    }
    
    /**
     * Sets the "MetadataSet" element
     */
    public void setMetadataSet(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATASET$84, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATASET$84);
            }
            target.set(metadataSet);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATASET$84);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataSet" element
     */
    public void unsetMetadataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASET$84, 0);
        }
    }
    
    /**
     * Gets the "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATASTRUCTURE$86, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataStructure" element
     */
    public boolean isSetMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURE$86) != 0;
        }
    }
    
    /**
     * Sets the "MetadataStructure" element
     */
    public void setMetadataStructure(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATASTRUCTURE$86, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATASTRUCTURE$86);
            }
            target.set(metadataStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATASTRUCTURE$86);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataStructure" element
     */
    public void unsetMetadataStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURE$86, 0);
        }
    }
    
    /**
     * Gets the "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATATARGET$88, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataTarget" element
     */
    public boolean isSetMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATARGET$88) != 0;
        }
    }
    
    /**
     * Sets the "MetadataTarget" element
     */
    public void setMetadataTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType metadataTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(METADATATARGET$88, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATATARGET$88);
            }
            target.set(metadataTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(METADATATARGET$88);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataTarget" element
     */
    public void unsetMetadataTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATARGET$88, 0);
        }
    }
    
    /**
     * Gets the "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONMAP$90, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationMap" element
     */
    public boolean isSetOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONMAP$90) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationMap" element
     */
    public void setOrganisationMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONMAP$90, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONMAP$90);
            }
            target.set(organisationMap);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONMAP$90);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationMap" element
     */
    public void unsetOrganisationMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONMAP$90, 0);
        }
    }
    
    /**
     * Gets the "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONSCHEMEMAP$92, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationSchemeMap" element
     */
    public boolean isSetOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEMAP$92) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationSchemeMap" element
     */
    public void setOrganisationSchemeMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationSchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONSCHEMEMAP$92, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONSCHEMEMAP$92);
            }
            target.set(organisationSchemeMap);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONSCHEMEMAP$92);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationSchemeMap" element
     */
    public void unsetOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEMAP$92, 0);
        }
    }
    
    /**
     * Gets the "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNIT$94, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationUnit" element
     */
    public boolean isSetOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONUNIT$94) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationUnit" element
     */
    public void setOrganisationUnit(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNIT$94, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNIT$94);
            }
            target.set(organisationUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationUnit" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNIT$94);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationUnit" element
     */
    public void unsetOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONUNIT$94, 0);
        }
    }
    
    /**
     * Gets the "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNITSCHEME$96, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationUnitScheme" element
     */
    public boolean isSetOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONUNITSCHEME$96) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationUnitScheme" element
     */
    public void setOrganisationUnitScheme(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType organisationUnitScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(ORGANISATIONUNITSCHEME$96, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNITSCHEME$96);
            }
            target.set(organisationUnitScheme);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationUnitScheme" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(ORGANISATIONUNITSCHEME$96);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationUnitScheme" element
     */
    public void unsetOrganisationUnitScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONUNITSCHEME$96, 0);
        }
    }
    
    /**
     * Gets the "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PRIMARYMEASURE$98, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryMeasure" element
     */
    public boolean isSetPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYMEASURE$98) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryMeasure" element
     */
    public void setPrimaryMeasure(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType primaryMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PRIMARYMEASURE$98, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PRIMARYMEASURE$98);
            }
            target.set(primaryMeasure);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryMeasure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PRIMARYMEASURE$98);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryMeasure" element
     */
    public void unsetPrimaryMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYMEASURE$98, 0);
        }
    }
    
    /**
     * Gets the "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROCESS$100, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Process" element
     */
    public boolean isSetProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESS$100) != 0;
        }
    }
    
    /**
     * Sets the "Process" element
     */
    public void setProcess(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROCESS$100, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROCESS$100);
            }
            target.set(process);
        }
    }
    
    /**
     * Appends and returns a new empty "Process" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROCESS$100);
            return target;
        }
    }
    
    /**
     * Unsets the "Process" element
     */
    public void unsetProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESS$100, 0);
        }
    }
    
    /**
     * Gets the "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROCESSSTEP$102, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcessStep" element
     */
    public boolean isSetProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSSTEP$102) != 0;
        }
    }
    
    /**
     * Sets the "ProcessStep" element
     */
    public void setProcessStep(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType processStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROCESSSTEP$102, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROCESSSTEP$102);
            }
            target.set(processStep);
        }
    }
    
    /**
     * Appends and returns a new empty "ProcessStep" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROCESSSTEP$102);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcessStep" element
     */
    public void unsetProcessStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSSTEP$102, 0);
        }
    }
    
    /**
     * Gets the "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROVISIONAGREEMENT$104, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisionAgreement" element
     */
    public boolean isSetProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENT$104) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgreement" element
     */
    public void setProvisionAgreement(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType provisionAgreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(PROVISIONAGREEMENT$104, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROVISIONAGREEMENT$104);
            }
            target.set(provisionAgreement);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreement" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(PROVISIONAGREEMENT$104);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisionAgreement" element
     */
    public void unsetProvisionAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENT$104, 0);
        }
    }
    
    /**
     * Gets the "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGCATEGORY$106, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingCategory" element
     */
    public boolean isSetReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGCATEGORY$106) != 0;
        }
    }
    
    /**
     * Sets the "ReportingCategory" element
     */
    public void setReportingCategory(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGCATEGORY$106, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGCATEGORY$106);
            }
            target.set(reportingCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingCategory" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGCATEGORY$106);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingCategory" element
     */
    public void unsetReportingCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGCATEGORY$106, 0);
        }
    }
    
    /**
     * Gets the "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGCATEGORYMAP$108, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingCategoryMap" element
     */
    public boolean isSetReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGCATEGORYMAP$108) != 0;
        }
    }
    
    /**
     * Sets the "ReportingCategoryMap" element
     */
    public void setReportingCategoryMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingCategoryMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGCATEGORYMAP$108, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGCATEGORYMAP$108);
            }
            target.set(reportingCategoryMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingCategoryMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGCATEGORYMAP$108);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingCategoryMap" element
     */
    public void unsetReportingCategoryMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGCATEGORYMAP$108, 0);
        }
    }
    
    /**
     * Gets the "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMY$110, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingTaxonomy" element
     */
    public boolean isSetReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMY$110) != 0;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomy" element
     */
    public void setReportingTaxonomy(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingTaxonomy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMY$110, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMY$110);
            }
            target.set(reportingTaxonomy);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomy" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMY$110);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingTaxonomy" element
     */
    public void unsetReportingTaxonomy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMY$110, 0);
        }
    }
    
    /**
     * Gets the "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMYMAP$112, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingTaxonomyMap" element
     */
    public boolean isSetReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMYMAP$112) != 0;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomyMap" element
     */
    public void setReportingTaxonomyMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportingTaxonomyMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTINGTAXONOMYMAP$112, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMYMAP$112);
            }
            target.set(reportingTaxonomyMap);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTINGTAXONOMYMAP$112);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingTaxonomyMap" element
     */
    public void unsetReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMYMAP$112, 0);
        }
    }
    
    /**
     * Gets the "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTPERIODTARGET$114, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportPeriodTarget" element
     */
    public boolean isSetReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTPERIODTARGET$114) != 0;
        }
    }
    
    /**
     * Sets the "ReportPeriodTarget" element
     */
    public void setReportPeriodTarget(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportPeriodTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTPERIODTARGET$114, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTPERIODTARGET$114);
            }
            target.set(reportPeriodTarget);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportPeriodTarget" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTPERIODTARGET$114);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportPeriodTarget" element
     */
    public void unsetReportPeriodTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTPERIODTARGET$114, 0);
        }
    }
    
    /**
     * Gets the "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTSTRUCTURE$116, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportStructure" element
     */
    public boolean isSetReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTSTRUCTURE$116) != 0;
        }
    }
    
    /**
     * Sets the "ReportStructure" element
     */
    public void setReportStructure(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType reportStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(REPORTSTRUCTURE$116, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTSTRUCTURE$116);
            }
            target.set(reportStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(REPORTSTRUCTURE$116);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportStructure" element
     */
    public void unsetReportStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTSTRUCTURE$116, 0);
        }
    }
    
    /**
     * Gets the "StructureMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getStructureMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(STRUCTUREMAP$118, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureMap" element
     */
    public boolean isSetStructureMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTUREMAP$118) != 0;
        }
    }
    
    /**
     * Sets the "StructureMap" element
     */
    public void setStructureMap(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType structureMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(STRUCTUREMAP$118, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(STRUCTUREMAP$118);
            }
            target.set(structureMap);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewStructureMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(STRUCTUREMAP$118);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureMap" element
     */
    public void unsetStructureMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTUREMAP$118, 0);
        }
    }
    
    /**
     * Gets the "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(STRUCTURESET$120, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureSet" element
     */
    public boolean isSetStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESET$120) != 0;
        }
    }
    
    /**
     * Sets the "StructureSet" element
     */
    public void setStructureSet(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType structureSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(STRUCTURESET$120, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(STRUCTURESET$120);
            }
            target.set(structureSet);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(STRUCTURESET$120);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureSet" element
     */
    public void unsetStructureSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESET$120, 0);
        }
    }
    
    /**
     * Gets the "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(TIMEDIMENSION$122, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TimeDimension" element
     */
    public boolean isSetTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDIMENSION$122) != 0;
        }
    }
    
    /**
     * Sets the "TimeDimension" element
     */
    public void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType timeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(TIMEDIMENSION$122, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(TIMEDIMENSION$122);
            }
            target.set(timeDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(TIMEDIMENSION$122);
            return target;
        }
    }
    
    /**
     * Unsets the "TimeDimension" element
     */
    public void unsetTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDIMENSION$122, 0);
        }
    }
    
    /**
     * Gets the "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(TRANSITION$124, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Transition" element
     */
    public boolean isSetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSITION$124) != 0;
        }
    }
    
    /**
     * Sets the "Transition" element
     */
    public void setTransition(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType transition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().find_element_user(TRANSITION$124, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(TRANSITION$124);
            }
            target.set(transition);
        }
    }
    
    /**
     * Appends and returns a new empty "Transition" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType)get_store().add_element_user(TRANSITION$124);
            return target;
        }
    }
    
    /**
     * Unsets the "Transition" element
     */
    public void unsetTransition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSITION$124, 0);
        }
    }
}
