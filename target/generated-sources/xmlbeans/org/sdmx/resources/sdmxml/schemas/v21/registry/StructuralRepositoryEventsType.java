/*
 * XML Type:  StructuralRepositoryEventsType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry;


/**
 * An XML StructuralRepositoryEventsType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public interface StructuralRepositoryEventsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StructuralRepositoryEventsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("structuralrepositoryeventstypebc28type");
    
    /**
     * Gets array of all "AgencyID" elements
     */
    java.lang.String[] getAgencyIDArray();
    
    /**
     * Gets ith "AgencyID" element
     */
    java.lang.String getAgencyIDArray(int i);
    
    /**
     * Gets (as xml) array of all "AgencyID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType[] xgetAgencyIDArray();
    
    /**
     * Gets (as xml) ith "AgencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType xgetAgencyIDArray(int i);
    
    /**
     * Returns number of "AgencyID" element
     */
    int sizeOfAgencyIDArray();
    
    /**
     * Sets array of all "AgencyID" element
     */
    void setAgencyIDArray(java.lang.String[] agencyIDArray);
    
    /**
     * Sets ith "AgencyID" element
     */
    void setAgencyIDArray(int i, java.lang.String agencyID);
    
    /**
     * Sets (as xml) array of all "AgencyID" element
     */
    void xsetAgencyIDArray(org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType[] agencyIDArray);
    
    /**
     * Sets (as xml) ith "AgencyID" element
     */
    void xsetAgencyIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType agencyID);
    
    /**
     * Inserts the value as the ith "AgencyID" element
     */
    void insertAgencyID(int i, java.lang.String agencyID);
    
    /**
     * Appends the value as the last "AgencyID" element
     */
    void addAgencyID(java.lang.String agencyID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType insertNewAgencyID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.NestedIDQueryType addNewAgencyID();
    
    /**
     * Removes the ith "AgencyID" element
     */
    void removeAgencyID(int i);
    
    /**
     * Gets the "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType getAllEvents();
    
    /**
     * True if has "AllEvents" element
     */
    boolean isSetAllEvents();
    
    /**
     * Sets the "AllEvents" element
     */
    void setAllEvents(org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType allEvents);
    
    /**
     * Appends and returns a new empty "AllEvents" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.EmptyType addNewAllEvents();
    
    /**
     * Unsets the "AllEvents" element
     */
    void unsetAllEvents();
    
    /**
     * Gets array of all "AgencyScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getAgencySchemeArray();
    
    /**
     * Gets ith "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getAgencySchemeArray(int i);
    
    /**
     * Returns number of "AgencyScheme" element
     */
    int sizeOfAgencySchemeArray();
    
    /**
     * Sets array of all "AgencyScheme" element
     */
    void setAgencySchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] agencySchemeArray);
    
    /**
     * Sets ith "AgencyScheme" element
     */
    void setAgencySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType agencyScheme);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewAgencyScheme(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AgencyScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewAgencyScheme();
    
    /**
     * Removes the ith "AgencyScheme" element
     */
    void removeAgencyScheme(int i);
    
    /**
     * Gets array of all "DataConsmerScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getDataConsmerSchemeArray();
    
    /**
     * Gets ith "DataConsmerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getDataConsmerSchemeArray(int i);
    
    /**
     * Returns number of "DataConsmerScheme" element
     */
    int sizeOfDataConsmerSchemeArray();
    
    /**
     * Sets array of all "DataConsmerScheme" element
     */
    void setDataConsmerSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] dataConsmerSchemeArray);
    
    /**
     * Sets ith "DataConsmerScheme" element
     */
    void setDataConsmerSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType dataConsmerScheme);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataConsmerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewDataConsmerScheme(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataConsmerScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewDataConsmerScheme();
    
    /**
     * Removes the ith "DataConsmerScheme" element
     */
    void removeDataConsmerScheme(int i);
    
    /**
     * Gets array of all "DataProviderScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getDataProviderSchemeArray();
    
    /**
     * Gets ith "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getDataProviderSchemeArray(int i);
    
    /**
     * Returns number of "DataProviderScheme" element
     */
    int sizeOfDataProviderSchemeArray();
    
    /**
     * Sets array of all "DataProviderScheme" element
     */
    void setDataProviderSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] dataProviderSchemeArray);
    
    /**
     * Sets ith "DataProviderScheme" element
     */
    void setDataProviderSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType dataProviderScheme);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewDataProviderScheme(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProviderScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewDataProviderScheme();
    
    /**
     * Removes the ith "DataProviderScheme" element
     */
    void removeDataProviderScheme(int i);
    
    /**
     * Gets array of all "OrganisationUnitScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getOrganisationUnitSchemeArray();
    
    /**
     * Gets ith "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getOrganisationUnitSchemeArray(int i);
    
    /**
     * Returns number of "OrganisationUnitScheme" element
     */
    int sizeOfOrganisationUnitSchemeArray();
    
    /**
     * Sets array of all "OrganisationUnitScheme" element
     */
    void setOrganisationUnitSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] organisationUnitSchemeArray);
    
    /**
     * Sets ith "OrganisationUnitScheme" element
     */
    void setOrganisationUnitSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType organisationUnitScheme);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewOrganisationUnitScheme(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationUnitScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewOrganisationUnitScheme();
    
    /**
     * Removes the ith "OrganisationUnitScheme" element
     */
    void removeOrganisationUnitScheme(int i);
    
    /**
     * Gets array of all "Dataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getDataflowArray();
    
    /**
     * Gets ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getDataflowArray(int i);
    
    /**
     * Returns number of "Dataflow" element
     */
    int sizeOfDataflowArray();
    
    /**
     * Sets array of all "Dataflow" element
     */
    void setDataflowArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] dataflowArray);
    
    /**
     * Sets ith "Dataflow" element
     */
    void setDataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType dataflow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewDataflow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewDataflow();
    
    /**
     * Removes the ith "Dataflow" element
     */
    void removeDataflow(int i);
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getMetadataflowArray();
    
    /**
     * Gets ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getMetadataflowArray(int i);
    
    /**
     * Returns number of "Metadataflow" element
     */
    int sizeOfMetadataflowArray();
    
    /**
     * Sets array of all "Metadataflow" element
     */
    void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] metadataflowArray);
    
    /**
     * Sets ith "Metadataflow" element
     */
    void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType metadataflow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewMetadataflow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewMetadataflow();
    
    /**
     * Removes the ith "Metadataflow" element
     */
    void removeMetadataflow(int i);
    
    /**
     * Gets array of all "CategoryScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getCategorySchemeArray();
    
    /**
     * Gets ith "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getCategorySchemeArray(int i);
    
    /**
     * Returns number of "CategoryScheme" element
     */
    int sizeOfCategorySchemeArray();
    
    /**
     * Sets array of all "CategoryScheme" element
     */
    void setCategorySchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] categorySchemeArray);
    
    /**
     * Sets ith "CategoryScheme" element
     */
    void setCategorySchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType categoryScheme);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewCategoryScheme(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewCategoryScheme();
    
    /**
     * Removes the ith "CategoryScheme" element
     */
    void removeCategoryScheme(int i);
    
    /**
     * Gets array of all "Categorisation" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType[] getCategorisationArray();
    
    /**
     * Gets ith "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType getCategorisationArray(int i);
    
    /**
     * Returns number of "Categorisation" element
     */
    int sizeOfCategorisationArray();
    
    /**
     * Sets array of all "Categorisation" element
     */
    void setCategorisationArray(org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType[] categorisationArray);
    
    /**
     * Sets ith "Categorisation" element
     */
    void setCategorisationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType categorisation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType insertNewCategorisation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Categorisation" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.IdentifiableObjectEventType addNewCategorisation();
    
    /**
     * Removes the ith "Categorisation" element
     */
    void removeCategorisation(int i);
    
    /**
     * Gets array of all "Codelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getCodelistArray();
    
    /**
     * Gets ith "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getCodelistArray(int i);
    
    /**
     * Returns number of "Codelist" element
     */
    int sizeOfCodelistArray();
    
    /**
     * Sets array of all "Codelist" element
     */
    void setCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] codelistArray);
    
    /**
     * Sets ith "Codelist" element
     */
    void setCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType codelist);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewCodelist(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Codelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewCodelist();
    
    /**
     * Removes the ith "Codelist" element
     */
    void removeCodelist(int i);
    
    /**
     * Gets array of all "HierarchicalCodelist" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getHierarchicalCodelistArray();
    
    /**
     * Gets ith "HierarchicalCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getHierarchicalCodelistArray(int i);
    
    /**
     * Returns number of "HierarchicalCodelist" element
     */
    int sizeOfHierarchicalCodelistArray();
    
    /**
     * Sets array of all "HierarchicalCodelist" element
     */
    void setHierarchicalCodelistArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] hierarchicalCodelistArray);
    
    /**
     * Sets ith "HierarchicalCodelist" element
     */
    void setHierarchicalCodelistArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType hierarchicalCodelist);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HierarchicalCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewHierarchicalCodelist(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HierarchicalCodelist" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewHierarchicalCodelist();
    
    /**
     * Removes the ith "HierarchicalCodelist" element
     */
    void removeHierarchicalCodelist(int i);
    
    /**
     * Gets array of all "ConceptScheme" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getConceptSchemeArray();
    
    /**
     * Gets ith "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getConceptSchemeArray(int i);
    
    /**
     * Returns number of "ConceptScheme" element
     */
    int sizeOfConceptSchemeArray();
    
    /**
     * Sets array of all "ConceptScheme" element
     */
    void setConceptSchemeArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] conceptSchemeArray);
    
    /**
     * Sets ith "ConceptScheme" element
     */
    void setConceptSchemeArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType conceptScheme);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewConceptScheme(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptScheme" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewConceptScheme();
    
    /**
     * Removes the ith "ConceptScheme" element
     */
    void removeConceptScheme(int i);
    
    /**
     * Gets array of all "MetadataStructureDefinition" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getMetadataStructureDefinitionArray();
    
    /**
     * Gets ith "MetadataStructureDefinition" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getMetadataStructureDefinitionArray(int i);
    
    /**
     * Returns number of "MetadataStructureDefinition" element
     */
    int sizeOfMetadataStructureDefinitionArray();
    
    /**
     * Sets array of all "MetadataStructureDefinition" element
     */
    void setMetadataStructureDefinitionArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] metadataStructureDefinitionArray);
    
    /**
     * Sets ith "MetadataStructureDefinition" element
     */
    void setMetadataStructureDefinitionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType metadataStructureDefinition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructureDefinition" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewMetadataStructureDefinition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructureDefinition" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewMetadataStructureDefinition();
    
    /**
     * Removes the ith "MetadataStructureDefinition" element
     */
    void removeMetadataStructureDefinition(int i);
    
    /**
     * Gets array of all "KeyFamily" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getKeyFamilyArray();
    
    /**
     * Gets ith "KeyFamily" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getKeyFamilyArray(int i);
    
    /**
     * Returns number of "KeyFamily" element
     */
    int sizeOfKeyFamilyArray();
    
    /**
     * Sets array of all "KeyFamily" element
     */
    void setKeyFamilyArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] keyFamilyArray);
    
    /**
     * Sets ith "KeyFamily" element
     */
    void setKeyFamilyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType keyFamily);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "KeyFamily" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewKeyFamily(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "KeyFamily" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewKeyFamily();
    
    /**
     * Removes the ith "KeyFamily" element
     */
    void removeKeyFamily(int i);
    
    /**
     * Gets array of all "StructureSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getStructureSetArray();
    
    /**
     * Gets ith "StructureSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getStructureSetArray(int i);
    
    /**
     * Returns number of "StructureSet" element
     */
    int sizeOfStructureSetArray();
    
    /**
     * Sets array of all "StructureSet" element
     */
    void setStructureSetArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] structureSetArray);
    
    /**
     * Sets ith "StructureSet" element
     */
    void setStructureSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType structureSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewStructureSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewStructureSet();
    
    /**
     * Removes the ith "StructureSet" element
     */
    void removeStructureSet(int i);
    
    /**
     * Gets array of all "ReportingTaxonomy" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getReportingTaxonomyArray();
    
    /**
     * Gets ith "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getReportingTaxonomyArray(int i);
    
    /**
     * Returns number of "ReportingTaxonomy" element
     */
    int sizeOfReportingTaxonomyArray();
    
    /**
     * Sets array of all "ReportingTaxonomy" element
     */
    void setReportingTaxonomyArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] reportingTaxonomyArray);
    
    /**
     * Sets ith "ReportingTaxonomy" element
     */
    void setReportingTaxonomyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType reportingTaxonomy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewReportingTaxonomy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomy" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewReportingTaxonomy();
    
    /**
     * Removes the ith "ReportingTaxonomy" element
     */
    void removeReportingTaxonomy(int i);
    
    /**
     * Gets array of all "Process" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getProcessArray();
    
    /**
     * Gets ith "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getProcessArray(int i);
    
    /**
     * Returns number of "Process" element
     */
    int sizeOfProcessArray();
    
    /**
     * Sets array of all "Process" element
     */
    void setProcessArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] processArray);
    
    /**
     * Sets ith "Process" element
     */
    void setProcessArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType process);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewProcess(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Process" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewProcess();
    
    /**
     * Removes the ith "Process" element
     */
    void removeProcess(int i);
    
    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getAttachmentConstraintArray();
    
    /**
     * Gets ith "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getAttachmentConstraintArray(int i);
    
    /**
     * Returns number of "AttachmentConstraint" element
     */
    int sizeOfAttachmentConstraintArray();
    
    /**
     * Sets array of all "AttachmentConstraint" element
     */
    void setAttachmentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] attachmentConstraintArray);
    
    /**
     * Sets ith "AttachmentConstraint" element
     */
    void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType attachmentConstraint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewAttachmentConstraint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewAttachmentConstraint();
    
    /**
     * Removes the ith "AttachmentConstraint" element
     */
    void removeAttachmentConstraint(int i);
    
    /**
     * Gets array of all "ContentConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getContentConstraintArray();
    
    /**
     * Gets ith "ContentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getContentConstraintArray(int i);
    
    /**
     * Returns number of "ContentConstraint" element
     */
    int sizeOfContentConstraintArray();
    
    /**
     * Sets array of all "ContentConstraint" element
     */
    void setContentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] contentConstraintArray);
    
    /**
     * Sets ith "ContentConstraint" element
     */
    void setContentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType contentConstraint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewContentConstraint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewContentConstraint();
    
    /**
     * Removes the ith "ContentConstraint" element
     */
    void removeContentConstraint(int i);
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] getProvisionAgreementArray();
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType getProvisionAgreementArray(int i);
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType[] provisionAgreementArray);
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType provisionAgreement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType insertNewProvisionAgreement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.registry.VersionableObjectEventType addNewProvisionAgreement();
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);
    
    /**
     * Gets the "TYPE" attribute
     */
    java.lang.String getTYPE();
    
    /**
     * Gets (as xml) the "TYPE" attribute
     */
    org.apache.xmlbeans.XmlString xgetTYPE();
    
    /**
     * True if has "TYPE" attribute
     */
    boolean isSetTYPE();
    
    /**
     * Sets the "TYPE" attribute
     */
    void setTYPE(java.lang.String type);
    
    /**
     * Sets (as xml) the "TYPE" attribute
     */
    void xsetTYPE(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "TYPE" attribute
     */
    void unsetTYPE();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
