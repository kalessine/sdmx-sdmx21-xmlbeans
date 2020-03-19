/*
 * XML Type:  MetadataParametersType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query;


/**
 * An XML MetadataParametersType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public interface MetadataParametersType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataParametersType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("metadataparameterstypef8b6type");
    
    /**
     * Gets array of all "MetadataSetID" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] getMetadataSetIDArray();
    
    /**
     * Gets ith "MetadataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType getMetadataSetIDArray(int i);
    
    /**
     * Returns number of "MetadataSetID" element
     */
    int sizeOfMetadataSetIDArray();
    
    /**
     * Sets array of all "MetadataSetID" element
     */
    void setMetadataSetIDArray(org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType[] metadataSetIDArray);
    
    /**
     * Sets ith "MetadataSetID" element
     */
    void setMetadataSetIDArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType metadataSetID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType insertNewMetadataSetID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataSetID" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.QueryIDType addNewMetadataSetID();
    
    /**
     * Removes the ith "MetadataSetID" element
     */
    void removeMetadataSetID(int i);
    
    /**
     * Gets array of all "DataProvider" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] getDataProviderArray();
    
    /**
     * Gets ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType getDataProviderArray(int i);
    
    /**
     * Returns number of "DataProvider" element
     */
    int sizeOfDataProviderArray();
    
    /**
     * Sets array of all "DataProvider" element
     */
    void setDataProviderArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType[] dataProviderArray);
    
    /**
     * Sets ith "DataProvider" element
     */
    void setDataProviderArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType dataProvider);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType insertNewDataProvider(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataProvider" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataProviderReferenceType addNewDataProvider();
    
    /**
     * Removes the ith "DataProvider" element
     */
    void removeDataProvider(int i);
    
    /**
     * Gets array of all "MetadataStructure" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] getMetadataStructureArray();
    
    /**
     * Gets ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType getMetadataStructureArray(int i);
    
    /**
     * Returns number of "MetadataStructure" element
     */
    int sizeOfMetadataStructureArray();
    
    /**
     * Sets array of all "MetadataStructure" element
     */
    void setMetadataStructureArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType[] metadataStructureArray);
    
    /**
     * Sets ith "MetadataStructure" element
     */
    void setMetadataStructureArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType metadataStructure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType insertNewMetadataStructure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataStructure" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataStructureReferenceType addNewMetadataStructure();
    
    /**
     * Removes the ith "MetadataStructure" element
     */
    void removeMetadataStructure(int i);
    
    /**
     * Gets array of all "Metadataflow" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] getMetadataflowArray();
    
    /**
     * Gets ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType getMetadataflowArray(int i);
    
    /**
     * Returns number of "Metadataflow" element
     */
    int sizeOfMetadataflowArray();
    
    /**
     * Sets array of all "Metadataflow" element
     */
    void setMetadataflowArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType[] metadataflowArray);
    
    /**
     * Sets ith "Metadataflow" element
     */
    void setMetadataflowArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType metadataflow);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType insertNewMetadataflow(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Metadataflow" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.MetadataflowReferenceType addNewMetadataflow();
    
    /**
     * Removes the ith "Metadataflow" element
     */
    void removeMetadataflow(int i);
    
    /**
     * Gets array of all "ProvisionAgreement" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] getProvisionAgreementArray();
    
    /**
     * Gets ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType getProvisionAgreementArray(int i);
    
    /**
     * Returns number of "ProvisionAgreement" element
     */
    int sizeOfProvisionAgreementArray();
    
    /**
     * Sets array of all "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType[] provisionAgreementArray);
    
    /**
     * Sets ith "ProvisionAgreement" element
     */
    void setProvisionAgreementArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType provisionAgreement);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType insertNewProvisionAgreement(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProvisionAgreement" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ProvisionAgreementReferenceType addNewProvisionAgreement();
    
    /**
     * Removes the ith "ProvisionAgreement" element
     */
    void removeProvisionAgreement(int i);
    
    /**
     * Gets array of all "Category" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] getCategoryArray();
    
    /**
     * Gets ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType getCategoryArray(int i);
    
    /**
     * Returns number of "Category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "Category" element
     */
    void setCategoryArray(org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType[] categoryArray);
    
    /**
     * Sets ith "Category" element
     */
    void setCategoryArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.CategoryReferenceType addNewCategory();
    
    /**
     * Removes the ith "Category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets array of all "Updated" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] getUpdatedArray();
    
    /**
     * Gets ith "Updated" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getUpdatedArray(int i);
    
    /**
     * Returns number of "Updated" element
     */
    int sizeOfUpdatedArray();
    
    /**
     * Sets array of all "Updated" element
     */
    void setUpdatedArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] updatedArray);
    
    /**
     * Sets ith "Updated" element
     */
    void setUpdatedArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType updated);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Updated" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType insertNewUpdated(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Updated" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewUpdated();
    
    /**
     * Removes the ith "Updated" element
     */
    void removeUpdated(int i);
    
    /**
     * Gets array of all "ConceptValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] getConceptValueArray();
    
    /**
     * Gets ith "ConceptValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType getConceptValueArray(int i);
    
    /**
     * Returns number of "ConceptValue" element
     */
    int sizeOfConceptValueArray();
    
    /**
     * Sets array of all "ConceptValue" element
     */
    void setConceptValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType[] conceptValueArray);
    
    /**
     * Sets ith "ConceptValue" element
     */
    void setConceptValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType conceptValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConceptValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType insertNewConceptValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConceptValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ConceptValueType addNewConceptValue();
    
    /**
     * Removes the ith "ConceptValue" element
     */
    void removeConceptValue(int i);
    
    /**
     * Gets array of all "RepresentationValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] getRepresentationValueArray();
    
    /**
     * Gets ith "RepresentationValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType getRepresentationValueArray(int i);
    
    /**
     * Returns number of "RepresentationValue" element
     */
    int sizeOfRepresentationValueArray();
    
    /**
     * Sets array of all "RepresentationValue" element
     */
    void setRepresentationValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType[] representationValueArray);
    
    /**
     * Sets ith "RepresentationValue" element
     */
    void setRepresentationValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType representationValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RepresentationValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType insertNewRepresentationValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RepresentationValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.CodeValueType addNewRepresentationValue();
    
    /**
     * Removes the ith "RepresentationValue" element
     */
    void removeRepresentationValue(int i);
    
    /**
     * Gets array of all "MetadataTargetValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType[] getMetadataTargetValueArray();
    
    /**
     * Gets ith "MetadataTargetValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType getMetadataTargetValueArray(int i);
    
    /**
     * Returns number of "MetadataTargetValue" element
     */
    int sizeOfMetadataTargetValueArray();
    
    /**
     * Sets array of all "MetadataTargetValue" element
     */
    void setMetadataTargetValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType[] metadataTargetValueArray);
    
    /**
     * Sets ith "MetadataTargetValue" element
     */
    void setMetadataTargetValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType metadataTargetValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType insertNewMetadataTargetValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataTargetValueType addNewMetadataTargetValue();
    
    /**
     * Removes the ith "MetadataTargetValue" element
     */
    void removeMetadataTargetValue(int i);
    
    /**
     * Gets array of all "ReportStructureValue" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType[] getReportStructureValueArray();
    
    /**
     * Gets ith "ReportStructureValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType getReportStructureValueArray(int i);
    
    /**
     * Returns number of "ReportStructureValue" element
     */
    int sizeOfReportStructureValueArray();
    
    /**
     * Sets array of all "ReportStructureValue" element
     */
    void setReportStructureValueArray(org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType[] reportStructureValueArray);
    
    /**
     * Sets ith "ReportStructureValue" element
     */
    void setReportStructureValueArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType reportStructureValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportStructureValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType insertNewReportStructureValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportStructureValue" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.ReportStructureValueType addNewReportStructureValue();
    
    /**
     * Removes the ith "ReportStructureValue" element
     */
    void removeReportStructureValue(int i);
    
    /**
     * Gets array of all "AttachmentConstraint" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] getAttachmentConstraintArray();
    
    /**
     * Gets ith "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType getAttachmentConstraintArray(int i);
    
    /**
     * Returns number of "AttachmentConstraint" element
     */
    int sizeOfAttachmentConstraintArray();
    
    /**
     * Sets array of all "AttachmentConstraint" element
     */
    void setAttachmentConstraintArray(org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType[] attachmentConstraintArray);
    
    /**
     * Sets ith "AttachmentConstraint" element
     */
    void setAttachmentConstraintArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType attachmentConstraint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType insertNewAttachmentConstraint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachmentConstraint" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.AttachmentConstraintReferenceType addNewAttachmentConstraint();
    
    /**
     * Removes the ith "AttachmentConstraint" element
     */
    void removeAttachmentConstraint(int i);
    
    /**
     * Gets array of all "AttachedObject" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] getAttachedObjectArray();
    
    /**
     * Gets ith "AttachedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType getAttachedObjectArray(int i);
    
    /**
     * Returns number of "AttachedObject" element
     */
    int sizeOfAttachedObjectArray();
    
    /**
     * Sets array of all "AttachedObject" element
     */
    void setAttachedObjectArray(org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType[] attachedObjectArray);
    
    /**
     * Sets ith "AttachedObject" element
     */
    void setAttachedObjectArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType attachedObject);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType insertNewAttachedObject(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedObject" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.ObjectReferenceType addNewAttachedObject();
    
    /**
     * Removes the ith "AttachedObject" element
     */
    void removeAttachedObject(int i);
    
    /**
     * Gets array of all "AttachedDataKey" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] getAttachedDataKeyArray();
    
    /**
     * Gets ith "AttachedDataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType getAttachedDataKeyArray(int i);
    
    /**
     * Returns number of "AttachedDataKey" element
     */
    int sizeOfAttachedDataKeyArray();
    
    /**
     * Sets array of all "AttachedDataKey" element
     */
    void setAttachedDataKeyArray(org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType[] attachedDataKeyArray);
    
    /**
     * Sets ith "AttachedDataKey" element
     */
    void setAttachedDataKeyArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType attachedDataKey);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedDataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType insertNewAttachedDataKey(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedDataKey" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.DataKeyType addNewAttachedDataKey();
    
    /**
     * Removes the ith "AttachedDataKey" element
     */
    void removeAttachedDataKey(int i);
    
    /**
     * Gets array of all "AttachedDataSet" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] getAttachedDataSetArray();
    
    /**
     * Gets ith "AttachedDataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType getAttachedDataSetArray(int i);
    
    /**
     * Returns number of "AttachedDataSet" element
     */
    int sizeOfAttachedDataSetArray();
    
    /**
     * Sets array of all "AttachedDataSet" element
     */
    void setAttachedDataSetArray(org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType[] attachedDataSetArray);
    
    /**
     * Sets ith "AttachedDataSet" element
     */
    void setAttachedDataSetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType attachedDataSet);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedDataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType insertNewAttachedDataSet(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedDataSet" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.SetReferenceType addNewAttachedDataSet();
    
    /**
     * Removes the ith "AttachedDataSet" element
     */
    void removeAttachedDataSet(int i);
    
    /**
     * Gets array of all "AttachedReportingPeriod" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] getAttachedReportingPeriodArray();
    
    /**
     * Gets ith "AttachedReportingPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType getAttachedReportingPeriodArray(int i);
    
    /**
     * Returns number of "AttachedReportingPeriod" element
     */
    int sizeOfAttachedReportingPeriodArray();
    
    /**
     * Sets array of all "AttachedReportingPeriod" element
     */
    void setAttachedReportingPeriodArray(org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType[] attachedReportingPeriodArray);
    
    /**
     * Sets ith "AttachedReportingPeriod" element
     */
    void setAttachedReportingPeriodArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType attachedReportingPeriod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AttachedReportingPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType insertNewAttachedReportingPeriod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AttachedReportingPeriod" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.common.TimeRangeValueType addNewAttachedReportingPeriod();
    
    /**
     * Removes the ith "AttachedReportingPeriod" element
     */
    void removeAttachedReportingPeriod(int i);
    
    /**
     * Gets array of all "Or" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType[] getOrArray();
    
    /**
     * Gets ith "Or" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType getOrArray(int i);
    
    /**
     * Returns number of "Or" element
     */
    int sizeOfOrArray();
    
    /**
     * Sets array of all "Or" element
     */
    void setOrArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType[] orArray);
    
    /**
     * Sets ith "Or" element
     */
    void setOrArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType or);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Or" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType insertNewOr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Or" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersOrType addNewOr();
    
    /**
     * Removes the ith "Or" element
     */
    void removeOr(int i);
    
    /**
     * Gets array of all "And" elements
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType[] getAndArray();
    
    /**
     * Gets ith "And" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType getAndArray(int i);
    
    /**
     * Returns number of "And" element
     */
    int sizeOfAndArray();
    
    /**
     * Sets array of all "And" element
     */
    void setAndArray(org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType[] andArray);
    
    /**
     * Sets ith "And" element
     */
    void setAndArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType and);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "And" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType insertNewAnd(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "And" element
     */
    org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersAndType addNewAnd();
    
    /**
     * Removes the ith "And" element
     */
    void removeAnd(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.query.MetadataParametersType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
