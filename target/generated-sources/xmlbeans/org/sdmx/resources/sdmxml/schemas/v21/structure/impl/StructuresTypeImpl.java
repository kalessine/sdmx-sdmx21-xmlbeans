/*
 * XML Type:  StructuresType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML StructuresType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class StructuresTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.StructuresType
{
    private static final long serialVersionUID = 1L;
    
    public StructuresTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMES$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationSchemes");
    private static final javax.xml.namespace.QName DATAFLOWS$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Dataflows");
    private static final javax.xml.namespace.QName METADATAFLOWS$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Metadataflows");
    private static final javax.xml.namespace.QName CATEGORYSCHEMES$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategorySchemes");
    private static final javax.xml.namespace.QName CATEGORISATIONS$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Categorisations");
    private static final javax.xml.namespace.QName CODELISTS$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Codelists");
    private static final javax.xml.namespace.QName HIERARCHICALCODELISTS$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "HierarchicalCodelists");
    private static final javax.xml.namespace.QName CONCEPTS$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Concepts");
    private static final javax.xml.namespace.QName METADATASTRUCTURES$16 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataStructures");
    private static final javax.xml.namespace.QName DATASTRUCTURES$18 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataStructures");
    private static final javax.xml.namespace.QName STRUCTURESETS$20 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "StructureSets");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMIES$22 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingTaxonomies");
    private static final javax.xml.namespace.QName PROCESSES$24 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Processes");
    private static final javax.xml.namespace.QName CONSTRAINTS$26 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "Constraints");
    private static final javax.xml.namespace.QName PROVISIONAGREEMENTS$28 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ProvisionAgreements");
    
    
    /**
     * Gets the "OrganisationSchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType getOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType)get_store().find_element_user(ORGANISATIONSCHEMES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OrganisationSchemes" element
     */
    public boolean isSetOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMES$0) != 0;
        }
    }
    
    /**
     * Sets the "OrganisationSchemes" element
     */
    public void setOrganisationSchemes(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType organisationSchemes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType)get_store().find_element_user(ORGANISATIONSCHEMES$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType)get_store().add_element_user(ORGANISATIONSCHEMES$0);
            }
            target.set(organisationSchemes);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganisationSchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType addNewOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemesType)get_store().add_element_user(ORGANISATIONSCHEMES$0);
            return target;
        }
    }
    
    /**
     * Unsets the "OrganisationSchemes" element
     */
    public void unsetOrganisationSchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMES$0, 0);
        }
    }
    
    /**
     * Gets the "Dataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType getDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType)get_store().find_element_user(DATAFLOWS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Dataflows" element
     */
    public boolean isSetDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFLOWS$2) != 0;
        }
    }
    
    /**
     * Sets the "Dataflows" element
     */
    public void setDataflows(org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType dataflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType)get_store().find_element_user(DATAFLOWS$2, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType)get_store().add_element_user(DATAFLOWS$2);
            }
            target.set(dataflows);
        }
    }
    
    /**
     * Appends and returns a new empty "Dataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType addNewDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataflowsType)get_store().add_element_user(DATAFLOWS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Dataflows" element
     */
    public void unsetDataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFLOWS$2, 0);
        }
    }
    
    /**
     * Gets the "Metadataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType getMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType)get_store().find_element_user(METADATAFLOWS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Metadataflows" element
     */
    public boolean isSetMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAFLOWS$4) != 0;
        }
    }
    
    /**
     * Sets the "Metadataflows" element
     */
    public void setMetadataflows(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType metadataflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType)get_store().find_element_user(METADATAFLOWS$4, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType)get_store().add_element_user(METADATAFLOWS$4);
            }
            target.set(metadataflows);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadataflows" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType addNewMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataflowsType)get_store().add_element_user(METADATAFLOWS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Metadataflows" element
     */
    public void unsetMetadataflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAFLOWS$4, 0);
        }
    }
    
    /**
     * Gets the "CategorySchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType getCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType)get_store().find_element_user(CATEGORYSCHEMES$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategorySchemes" element
     */
    public boolean isSetCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMES$6) != 0;
        }
    }
    
    /**
     * Sets the "CategorySchemes" element
     */
    public void setCategorySchemes(org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType categorySchemes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType)get_store().find_element_user(CATEGORYSCHEMES$6, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType)get_store().add_element_user(CATEGORYSCHEMES$6);
            }
            target.set(categorySchemes);
        }
    }
    
    /**
     * Appends and returns a new empty "CategorySchemes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType addNewCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemesType)get_store().add_element_user(CATEGORYSCHEMES$6);
            return target;
        }
    }
    
    /**
     * Unsets the "CategorySchemes" element
     */
    public void unsetCategorySchemes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMES$6, 0);
        }
    }
    
    /**
     * Gets the "Categorisations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType getCategorisations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType)get_store().find_element_user(CATEGORISATIONS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Categorisations" element
     */
    public boolean isSetCategorisations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORISATIONS$8) != 0;
        }
    }
    
    /**
     * Sets the "Categorisations" element
     */
    public void setCategorisations(org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType categorisations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType)get_store().find_element_user(CATEGORISATIONS$8, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType)get_store().add_element_user(CATEGORISATIONS$8);
            }
            target.set(categorisations);
        }
    }
    
    /**
     * Appends and returns a new empty "Categorisations" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType addNewCategorisations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorisationsType)get_store().add_element_user(CATEGORISATIONS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Categorisations" element
     */
    public void unsetCategorisations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORISATIONS$8, 0);
        }
    }
    
    /**
     * Gets the "Codelists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType getCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType)get_store().find_element_user(CODELISTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Codelists" element
     */
    public boolean isSetCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTS$10) != 0;
        }
    }
    
    /**
     * Sets the "Codelists" element
     */
    public void setCodelists(org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType codelists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType)get_store().find_element_user(CODELISTS$10, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType)get_store().add_element_user(CODELISTS$10);
            }
            target.set(codelists);
        }
    }
    
    /**
     * Appends and returns a new empty "Codelists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType addNewCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistsType)get_store().add_element_user(CODELISTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Codelists" element
     */
    public void unsetCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTS$10, 0);
        }
    }
    
    /**
     * Gets the "HierarchicalCodelists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType getHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType)get_store().find_element_user(HIERARCHICALCODELISTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HierarchicalCodelists" element
     */
    public boolean isSetHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIERARCHICALCODELISTS$12) != 0;
        }
    }
    
    /**
     * Sets the "HierarchicalCodelists" element
     */
    public void setHierarchicalCodelists(org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType hierarchicalCodelists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType)get_store().find_element_user(HIERARCHICALCODELISTS$12, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType)get_store().add_element_user(HIERARCHICALCODELISTS$12);
            }
            target.set(hierarchicalCodelists);
        }
    }
    
    /**
     * Appends and returns a new empty "HierarchicalCodelists" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType addNewHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HierarchicalCodelistsType)get_store().add_element_user(HIERARCHICALCODELISTS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "HierarchicalCodelists" element
     */
    public void unsetHierarchicalCodelists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIERARCHICALCODELISTS$12, 0);
        }
    }
    
    /**
     * Gets the "Concepts" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType getConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType)get_store().find_element_user(CONCEPTS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Concepts" element
     */
    public boolean isSetConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTS$14) != 0;
        }
    }
    
    /**
     * Sets the "Concepts" element
     */
    public void setConcepts(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType concepts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType)get_store().find_element_user(CONCEPTS$14, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType)get_store().add_element_user(CONCEPTS$14);
            }
            target.set(concepts);
        }
    }
    
    /**
     * Appends and returns a new empty "Concepts" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType addNewConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptsType)get_store().add_element_user(CONCEPTS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Concepts" element
     */
    public void unsetConcepts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTS$14, 0);
        }
    }
    
    /**
     * Gets the "MetadataStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType getMetadataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType)get_store().find_element_user(METADATASTRUCTURES$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataStructures" element
     */
    public boolean isSetMetadataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATASTRUCTURES$16) != 0;
        }
    }
    
    /**
     * Sets the "MetadataStructures" element
     */
    public void setMetadataStructures(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType metadataStructures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType)get_store().find_element_user(METADATASTRUCTURES$16, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType)get_store().add_element_user(METADATASTRUCTURES$16);
            }
            target.set(metadataStructures);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType addNewMetadataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataStructuresType)get_store().add_element_user(METADATASTRUCTURES$16);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataStructures" element
     */
    public void unsetMetadataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATASTRUCTURES$16, 0);
        }
    }
    
    /**
     * Gets the "DataStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType getDataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType)get_store().find_element_user(DATASTRUCTURES$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataStructures" element
     */
    public boolean isSetDataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTRUCTURES$18) != 0;
        }
    }
    
    /**
     * Sets the "DataStructures" element
     */
    public void setDataStructures(org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType dataStructures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType)get_store().find_element_user(DATASTRUCTURES$18, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType)get_store().add_element_user(DATASTRUCTURES$18);
            }
            target.set(dataStructures);
        }
    }
    
    /**
     * Appends and returns a new empty "DataStructures" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType addNewDataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructuresType)get_store().add_element_user(DATASTRUCTURES$18);
            return target;
        }
    }
    
    /**
     * Unsets the "DataStructures" element
     */
    public void unsetDataStructures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTRUCTURES$18, 0);
        }
    }
    
    /**
     * Gets the "StructureSets" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType getStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType)get_store().find_element_user(STRUCTURESETS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StructureSets" element
     */
    public boolean isSetStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURESETS$20) != 0;
        }
    }
    
    /**
     * Sets the "StructureSets" element
     */
    public void setStructureSets(org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType structureSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType)get_store().find_element_user(STRUCTURESETS$20, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType)get_store().add_element_user(STRUCTURESETS$20);
            }
            target.set(structureSets);
        }
    }
    
    /**
     * Appends and returns a new empty "StructureSets" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType addNewStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetsType)get_store().add_element_user(STRUCTURESETS$20);
            return target;
        }
    }
    
    /**
     * Unsets the "StructureSets" element
     */
    public void unsetStructureSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURESETS$20, 0);
        }
    }
    
    /**
     * Gets the "ReportingTaxonomies" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType getReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType)get_store().find_element_user(REPORTINGTAXONOMIES$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingTaxonomies" element
     */
    public boolean isSetReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMIES$22) != 0;
        }
    }
    
    /**
     * Sets the "ReportingTaxonomies" element
     */
    public void setReportingTaxonomies(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType reportingTaxonomies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType)get_store().find_element_user(REPORTINGTAXONOMIES$22, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType)get_store().add_element_user(REPORTINGTAXONOMIES$22);
            }
            target.set(reportingTaxonomies);
        }
    }
    
    /**
     * Appends and returns a new empty "ReportingTaxonomies" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType addNewReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomiesType)get_store().add_element_user(REPORTINGTAXONOMIES$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingTaxonomies" element
     */
    public void unsetReportingTaxonomies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMIES$22, 0);
        }
    }
    
    /**
     * Gets the "Processes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType getProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType)get_store().find_element_user(PROCESSES$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Processes" element
     */
    public boolean isSetProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSES$24) != 0;
        }
    }
    
    /**
     * Sets the "Processes" element
     */
    public void setProcesses(org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType processes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType)get_store().find_element_user(PROCESSES$24, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType)get_store().add_element_user(PROCESSES$24);
            }
            target.set(processes);
        }
    }
    
    /**
     * Appends and returns a new empty "Processes" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType addNewProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProcessesType)get_store().add_element_user(PROCESSES$24);
            return target;
        }
    }
    
    /**
     * Unsets the "Processes" element
     */
    public void unsetProcesses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSES$24, 0);
        }
    }
    
    /**
     * Gets the "Constraints" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType getConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType)get_store().find_element_user(CONSTRAINTS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Constraints" element
     */
    public boolean isSetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTS$26) != 0;
        }
    }
    
    /**
     * Sets the "Constraints" element
     */
    public void setConstraints(org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType constraints)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType)get_store().find_element_user(CONSTRAINTS$26, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType)get_store().add_element_user(CONSTRAINTS$26);
            }
            target.set(constraints);
        }
    }
    
    /**
     * Appends and returns a new empty "Constraints" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType addNewConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintsType)get_store().add_element_user(CONSTRAINTS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "Constraints" element
     */
    public void unsetConstraints()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTS$26, 0);
        }
    }
    
    /**
     * Gets the "ProvisionAgreements" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType getProvisionAgreements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType)get_store().find_element_user(PROVISIONAGREEMENTS$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProvisionAgreements" element
     */
    public boolean isSetProvisionAgreements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVISIONAGREEMENTS$28) != 0;
        }
    }
    
    /**
     * Sets the "ProvisionAgreements" element
     */
    public void setProvisionAgreements(org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType provisionAgreements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType)get_store().find_element_user(PROVISIONAGREEMENTS$28, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType)get_store().add_element_user(PROVISIONAGREEMENTS$28);
            }
            target.set(provisionAgreements);
        }
    }
    
    /**
     * Appends and returns a new empty "ProvisionAgreements" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType addNewProvisionAgreements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ProvisionAgreementsType)get_store().add_element_user(PROVISIONAGREEMENTS$28);
            return target;
        }
    }
    
    /**
     * Unsets the "ProvisionAgreements" element
     */
    public void unsetProvisionAgreements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVISIONAGREEMENTS$28, 0);
        }
    }
}
