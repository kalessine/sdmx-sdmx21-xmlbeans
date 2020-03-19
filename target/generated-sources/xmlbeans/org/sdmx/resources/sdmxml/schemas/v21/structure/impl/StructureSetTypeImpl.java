/*
 * XML Type:  StructureSetType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML StructureSetType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class StructureSetTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.StructureSetBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.StructureSetType
{
    private static final long serialVersionUID = 1L;
    
    public StructureSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "RelatedStructure");
    private static final javax.xml.namespace.QName ORGANISATIONSCHEMEMAP$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "OrganisationSchemeMap");
    private static final javax.xml.namespace.QName CATEGORYSCHEMEMAP$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CategorySchemeMap");
    private static final javax.xml.namespace.QName CODELISTMAP$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CodelistMap");
    private static final javax.xml.namespace.QName CONCEPTSCHEMEMAP$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConceptSchemeMap");
    private static final javax.xml.namespace.QName REPORTINGTAXONOMYMAP$10 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ReportingTaxonomyMap");
    private static final javax.xml.namespace.QName HYBRIDCODELISTMAP$12 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "HybridCodelistMap");
    private static final javax.xml.namespace.QName STRUCTUREMAP$14 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "StructureMap");
    
    
    /**
     * Gets array of all "RelatedStructure" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] getRelatedStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDSTRUCTURE$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelatedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType getRelatedStructureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(RELATEDSTRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelatedStructure" element
     */
    public int sizeOfRelatedStructureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDSTRUCTURE$0);
        }
    }
    
    /**
     * Sets array of all "RelatedStructure" element
     */
    public void setRelatedStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType[] relatedStructureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relatedStructureArray, RELATEDSTRUCTURE$0);
        }
    }
    
    /**
     * Sets ith "RelatedStructure" element
     */
    public void setRelatedStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType relatedStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().find_element_user(RELATEDSTRUCTURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedStructure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelatedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType insertNewRelatedStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().insert_element_user(RELATEDSTRUCTURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelatedStructure" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType addNewRelatedStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.StructureOrUsageReferenceType)get_store().add_element_user(RELATEDSTRUCTURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelatedStructure" element
     */
    public void removeRelatedStructure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDSTRUCTURE$0, i);
        }
    }
    
    /**
     * Gets array of all "OrganisationSchemeMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType[] getOrganisationSchemeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANISATIONSCHEMEMAP$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType getOrganisationSchemeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType)get_store().find_element_user(ORGANISATIONSCHEMEMAP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganisationSchemeMap" element
     */
    public int sizeOfOrganisationSchemeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANISATIONSCHEMEMAP$2);
        }
    }
    
    /**
     * Sets array of all "OrganisationSchemeMap" element
     */
    public void setOrganisationSchemeMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType[] organisationSchemeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organisationSchemeMapArray, ORGANISATIONSCHEMEMAP$2);
        }
    }
    
    /**
     * Sets ith "OrganisationSchemeMap" element
     */
    public void setOrganisationSchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType organisationSchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType)get_store().find_element_user(ORGANISATIONSCHEMEMAP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organisationSchemeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType insertNewOrganisationSchemeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType)get_store().insert_element_user(ORGANISATIONSCHEMEMAP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganisationSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType addNewOrganisationSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.OrganisationSchemeMapType)get_store().add_element_user(ORGANISATIONSCHEMEMAP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganisationSchemeMap" element
     */
    public void removeOrganisationSchemeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANISATIONSCHEMEMAP$2, i);
        }
    }
    
    /**
     * Gets array of all "CategorySchemeMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType[] getCategorySchemeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYSCHEMEMAP$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType getCategorySchemeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType)get_store().find_element_user(CATEGORYSCHEMEMAP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategorySchemeMap" element
     */
    public int sizeOfCategorySchemeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYSCHEMEMAP$4);
        }
    }
    
    /**
     * Sets array of all "CategorySchemeMap" element
     */
    public void setCategorySchemeMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType[] categorySchemeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categorySchemeMapArray, CATEGORYSCHEMEMAP$4);
        }
    }
    
    /**
     * Sets ith "CategorySchemeMap" element
     */
    public void setCategorySchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType categorySchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType)get_store().find_element_user(CATEGORYSCHEMEMAP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categorySchemeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType insertNewCategorySchemeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType)get_store().insert_element_user(CATEGORYSCHEMEMAP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategorySchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType addNewCategorySchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CategorySchemeMapType)get_store().add_element_user(CATEGORYSCHEMEMAP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategorySchemeMap" element
     */
    public void removeCategorySchemeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYSCHEMEMAP$4, i);
        }
    }
    
    /**
     * Gets array of all "CodelistMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType[] getCodelistMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODELISTMAP$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType getCodelistMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType)get_store().find_element_user(CODELISTMAP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodelistMap" element
     */
    public int sizeOfCodelistMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODELISTMAP$6);
        }
    }
    
    /**
     * Sets array of all "CodelistMap" element
     */
    public void setCodelistMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType[] codelistMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codelistMapArray, CODELISTMAP$6);
        }
    }
    
    /**
     * Sets ith "CodelistMap" element
     */
    public void setCodelistMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType codelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType)get_store().find_element_user(CODELISTMAP$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codelistMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType insertNewCodelistMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType)get_store().insert_element_user(CODELISTMAP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType addNewCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.CodelistMapType)get_store().add_element_user(CODELISTMAP$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodelistMap" element
     */
    public void removeCodelistMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODELISTMAP$6, i);
        }
    }
    
    /**
     * Gets array of all "ConceptSchemeMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType[] getConceptSchemeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPTSCHEMEMAP$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType getConceptSchemeMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType)get_store().find_element_user(CONCEPTSCHEMEMAP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConceptSchemeMap" element
     */
    public int sizeOfConceptSchemeMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPTSCHEMEMAP$8);
        }
    }
    
    /**
     * Sets array of all "ConceptSchemeMap" element
     */
    public void setConceptSchemeMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType[] conceptSchemeMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptSchemeMapArray, CONCEPTSCHEMEMAP$8);
        }
    }
    
    /**
     * Sets ith "ConceptSchemeMap" element
     */
    public void setConceptSchemeMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType conceptSchemeMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType)get_store().find_element_user(CONCEPTSCHEMEMAP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conceptSchemeMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType insertNewConceptSchemeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType)get_store().insert_element_user(CONCEPTSCHEMEMAP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptSchemeMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType addNewConceptSchemeMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConceptSchemeMapType)get_store().add_element_user(CONCEPTSCHEMEMAP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConceptSchemeMap" element
     */
    public void removeConceptSchemeMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPTSCHEMEMAP$8, i);
        }
    }
    
    /**
     * Gets array of all "ReportingTaxonomyMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType[] getReportingTaxonomyMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGTAXONOMYMAP$10, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType getReportingTaxonomyMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType)get_store().find_element_user(REPORTINGTAXONOMYMAP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingTaxonomyMap" element
     */
    public int sizeOfReportingTaxonomyMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGTAXONOMYMAP$10);
        }
    }
    
    /**
     * Sets array of all "ReportingTaxonomyMap" element
     */
    public void setReportingTaxonomyMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType[] reportingTaxonomyMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reportingTaxonomyMapArray, REPORTINGTAXONOMYMAP$10);
        }
    }
    
    /**
     * Sets ith "ReportingTaxonomyMap" element
     */
    public void setReportingTaxonomyMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType reportingTaxonomyMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType)get_store().find_element_user(REPORTINGTAXONOMYMAP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reportingTaxonomyMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType insertNewReportingTaxonomyMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType)get_store().insert_element_user(REPORTINGTAXONOMYMAP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingTaxonomyMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType addNewReportingTaxonomyMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ReportingTaxonomyMapType)get_store().add_element_user(REPORTINGTAXONOMYMAP$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingTaxonomyMap" element
     */
    public void removeReportingTaxonomyMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGTAXONOMYMAP$10, i);
        }
    }
    
    /**
     * Gets array of all "HybridCodelistMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType[] getHybridCodelistMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HYBRIDCODELISTMAP$12, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType getHybridCodelistMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType)get_store().find_element_user(HYBRIDCODELISTMAP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "HybridCodelistMap" element
     */
    public int sizeOfHybridCodelistMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYBRIDCODELISTMAP$12);
        }
    }
    
    /**
     * Sets array of all "HybridCodelistMap" element
     */
    public void setHybridCodelistMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType[] hybridCodelistMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hybridCodelistMapArray, HYBRIDCODELISTMAP$12);
        }
    }
    
    /**
     * Sets ith "HybridCodelistMap" element
     */
    public void setHybridCodelistMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType hybridCodelistMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType)get_store().find_element_user(HYBRIDCODELISTMAP$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hybridCodelistMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType insertNewHybridCodelistMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType)get_store().insert_element_user(HYBRIDCODELISTMAP$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "HybridCodelistMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType addNewHybridCodelistMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.HybridCodelistMapType)get_store().add_element_user(HYBRIDCODELISTMAP$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "HybridCodelistMap" element
     */
    public void removeHybridCodelistMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYBRIDCODELISTMAP$12, i);
        }
    }
    
    /**
     * Gets array of all "StructureMap" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType[] getStructureMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTUREMAP$14, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructureMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType getStructureMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType)get_store().find_element_user(STRUCTUREMAP$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructureMap" element
     */
    public int sizeOfStructureMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTUREMAP$14);
        }
    }
    
    /**
     * Sets array of all "StructureMap" element
     */
    public void setStructureMapArray(org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType[] structureMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structureMapArray, STRUCTUREMAP$14);
        }
    }
    
    /**
     * Sets ith "StructureMap" element
     */
    public void setStructureMapArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType structureMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType)get_store().find_element_user(STRUCTUREMAP$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structureMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructureMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType insertNewStructureMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType)get_store().insert_element_user(STRUCTUREMAP$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructureMap" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType addNewStructureMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.StructureMapType)get_store().add_element_user(STRUCTUREMAP$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructureMap" element
     */
    public void removeStructureMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTUREMAP$14, i);
        }
    }
}
