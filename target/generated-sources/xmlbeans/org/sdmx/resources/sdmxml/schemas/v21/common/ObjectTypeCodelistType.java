/*
 * XML Type:  ObjectTypeCodelistType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.common;


/**
 * An XML ObjectTypeCodelistType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/common).
 *
 * This is an atomic type that is a restriction of org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.
 */
public interface ObjectTypeCodelistType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectTypeCodelistType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB67EE5029402B06B4E80363EF8653D27").resolveHandle("objecttypecodelisttype8bd2type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ANY = Enum.forString("Any");
    static final Enum AGENCY = Enum.forString("Agency");
    static final Enum AGENCY_SCHEME = Enum.forString("AgencyScheme");
    static final Enum ATTACHMENT_CONSTRAINT = Enum.forString("AttachmentConstraint");
    static final Enum ATTRIBUTE = Enum.forString("Attribute");
    static final Enum ATTRIBUTE_DESCRIPTOR = Enum.forString("AttributeDescriptor");
    static final Enum CATEGORISATION = Enum.forString("Categorisation");
    static final Enum CATEGORY = Enum.forString("Category");
    static final Enum CATEGORY_SCHEME_MAP = Enum.forString("CategorySchemeMap");
    static final Enum CATEGORY_SCHEME = Enum.forString("CategoryScheme");
    static final Enum CODE = Enum.forString("Code");
    static final Enum CODE_MAP = Enum.forString("CodeMap");
    static final Enum CODELIST = Enum.forString("Codelist");
    static final Enum CODELIST_MAP = Enum.forString("CodelistMap");
    static final Enum COMPONENT_MAP = Enum.forString("ComponentMap");
    static final Enum CONCEPT = Enum.forString("Concept");
    static final Enum CONCEPT_MAP = Enum.forString("ConceptMap");
    static final Enum CONCEPT_SCHEME = Enum.forString("ConceptScheme");
    static final Enum CONCEPT_SCHEME_MAP = Enum.forString("ConceptSchemeMap");
    static final Enum CONSTRAINT = Enum.forString("Constraint");
    static final Enum CONSTRAINT_TARGET = Enum.forString("ConstraintTarget");
    static final Enum CONTENT_CONSTRAINT = Enum.forString("ContentConstraint");
    static final Enum DATAFLOW = Enum.forString("Dataflow");
    static final Enum DATA_CONSUMER = Enum.forString("DataConsumer");
    static final Enum DATA_CONSUMER_SCHEME = Enum.forString("DataConsumerScheme");
    static final Enum DATA_PROVIDER = Enum.forString("DataProvider");
    static final Enum DATA_PROVIDER_SCHEME = Enum.forString("DataProviderScheme");
    static final Enum DATA_SET_TARGET = Enum.forString("DataSetTarget");
    static final Enum DATA_STRUCTURE = Enum.forString("DataStructure");
    static final Enum DIMENSION = Enum.forString("Dimension");
    static final Enum DIMENSION_DESCRIPTOR = Enum.forString("DimensionDescriptor");
    static final Enum DIMENSION_DESCRIPTOR_VALUES_TARGET = Enum.forString("DimensionDescriptorValuesTarget");
    static final Enum GROUP_DIMENSION_DESCRIPTOR = Enum.forString("GroupDimensionDescriptor");
    static final Enum HIERARCHICAL_CODE = Enum.forString("HierarchicalCode");
    static final Enum HIERARCHICAL_CODELIST = Enum.forString("HierarchicalCodelist");
    static final Enum HIERARCHY = Enum.forString("Hierarchy");
    static final Enum HYBRID_CODELIST_MAP = Enum.forString("HybridCodelistMap");
    static final Enum HYBRID_CODE_MAP = Enum.forString("HybridCodeMap");
    static final Enum IDENTIFIABLE_OBJECT_TARGET = Enum.forString("IdentifiableObjectTarget");
    static final Enum LEVEL = Enum.forString("Level");
    static final Enum MEASURE_DESCRIPTOR = Enum.forString("MeasureDescriptor");
    static final Enum MEASURE_DIMENSION = Enum.forString("MeasureDimension");
    static final Enum METADATAFLOW = Enum.forString("Metadataflow");
    static final Enum METADATA_ATTRIBUTE = Enum.forString("MetadataAttribute");
    static final Enum METADATA_SET = Enum.forString("MetadataSet");
    static final Enum METADATA_STRUCTURE = Enum.forString("MetadataStructure");
    static final Enum METADATA_TARGET = Enum.forString("MetadataTarget");
    static final Enum ORGANISATION = Enum.forString("Organisation");
    static final Enum ORGANISATION_MAP = Enum.forString("OrganisationMap");
    static final Enum ORGANISATION_SCHEME = Enum.forString("OrganisationScheme");
    static final Enum ORGANISATION_SCHEME_MAP = Enum.forString("OrganisationSchemeMap");
    static final Enum ORGANISATION_UNIT = Enum.forString("OrganisationUnit");
    static final Enum ORGANISATION_UNIT_SCHEME = Enum.forString("OrganisationUnitScheme");
    static final Enum PRIMARY_MEASURE = Enum.forString("PrimaryMeasure");
    static final Enum PROCESS = Enum.forString("Process");
    static final Enum PROCESS_STEP = Enum.forString("ProcessStep");
    static final Enum PROVISION_AGREEMENT = Enum.forString("ProvisionAgreement");
    static final Enum REPORTING_CATEGORY = Enum.forString("ReportingCategory");
    static final Enum REPORTING_CATEGORY_MAP = Enum.forString("ReportingCategoryMap");
    static final Enum REPORTING_TAXONOMY = Enum.forString("ReportingTaxonomy");
    static final Enum REPORTING_TAXONOMY_MAP = Enum.forString("ReportingTaxonomyMap");
    static final Enum REPORTING_YEAR_START_DAY = Enum.forString("ReportingYearStartDay");
    static final Enum REPORT_PERIOD_TARGET = Enum.forString("ReportPeriodTarget");
    static final Enum REPORT_STRUCTURE = Enum.forString("ReportStructure");
    static final Enum STRUCTURE_MAP = Enum.forString("StructureMap");
    static final Enum STRUCTURE_SET = Enum.forString("StructureSet");
    static final Enum TIME_DIMENSION = Enum.forString("TimeDimension");
    static final Enum TRANSITION = Enum.forString("Transition");
    
    static final int INT_ANY = Enum.INT_ANY;
    static final int INT_AGENCY = Enum.INT_AGENCY;
    static final int INT_AGENCY_SCHEME = Enum.INT_AGENCY_SCHEME;
    static final int INT_ATTACHMENT_CONSTRAINT = Enum.INT_ATTACHMENT_CONSTRAINT;
    static final int INT_ATTRIBUTE = Enum.INT_ATTRIBUTE;
    static final int INT_ATTRIBUTE_DESCRIPTOR = Enum.INT_ATTRIBUTE_DESCRIPTOR;
    static final int INT_CATEGORISATION = Enum.INT_CATEGORISATION;
    static final int INT_CATEGORY = Enum.INT_CATEGORY;
    static final int INT_CATEGORY_SCHEME_MAP = Enum.INT_CATEGORY_SCHEME_MAP;
    static final int INT_CATEGORY_SCHEME = Enum.INT_CATEGORY_SCHEME;
    static final int INT_CODE = Enum.INT_CODE;
    static final int INT_CODE_MAP = Enum.INT_CODE_MAP;
    static final int INT_CODELIST = Enum.INT_CODELIST;
    static final int INT_CODELIST_MAP = Enum.INT_CODELIST_MAP;
    static final int INT_COMPONENT_MAP = Enum.INT_COMPONENT_MAP;
    static final int INT_CONCEPT = Enum.INT_CONCEPT;
    static final int INT_CONCEPT_MAP = Enum.INT_CONCEPT_MAP;
    static final int INT_CONCEPT_SCHEME = Enum.INT_CONCEPT_SCHEME;
    static final int INT_CONCEPT_SCHEME_MAP = Enum.INT_CONCEPT_SCHEME_MAP;
    static final int INT_CONSTRAINT = Enum.INT_CONSTRAINT;
    static final int INT_CONSTRAINT_TARGET = Enum.INT_CONSTRAINT_TARGET;
    static final int INT_CONTENT_CONSTRAINT = Enum.INT_CONTENT_CONSTRAINT;
    static final int INT_DATAFLOW = Enum.INT_DATAFLOW;
    static final int INT_DATA_CONSUMER = Enum.INT_DATA_CONSUMER;
    static final int INT_DATA_CONSUMER_SCHEME = Enum.INT_DATA_CONSUMER_SCHEME;
    static final int INT_DATA_PROVIDER = Enum.INT_DATA_PROVIDER;
    static final int INT_DATA_PROVIDER_SCHEME = Enum.INT_DATA_PROVIDER_SCHEME;
    static final int INT_DATA_SET_TARGET = Enum.INT_DATA_SET_TARGET;
    static final int INT_DATA_STRUCTURE = Enum.INT_DATA_STRUCTURE;
    static final int INT_DIMENSION = Enum.INT_DIMENSION;
    static final int INT_DIMENSION_DESCRIPTOR = Enum.INT_DIMENSION_DESCRIPTOR;
    static final int INT_DIMENSION_DESCRIPTOR_VALUES_TARGET = Enum.INT_DIMENSION_DESCRIPTOR_VALUES_TARGET;
    static final int INT_GROUP_DIMENSION_DESCRIPTOR = Enum.INT_GROUP_DIMENSION_DESCRIPTOR;
    static final int INT_HIERARCHICAL_CODE = Enum.INT_HIERARCHICAL_CODE;
    static final int INT_HIERARCHICAL_CODELIST = Enum.INT_HIERARCHICAL_CODELIST;
    static final int INT_HIERARCHY = Enum.INT_HIERARCHY;
    static final int INT_HYBRID_CODELIST_MAP = Enum.INT_HYBRID_CODELIST_MAP;
    static final int INT_HYBRID_CODE_MAP = Enum.INT_HYBRID_CODE_MAP;
    static final int INT_IDENTIFIABLE_OBJECT_TARGET = Enum.INT_IDENTIFIABLE_OBJECT_TARGET;
    static final int INT_LEVEL = Enum.INT_LEVEL;
    static final int INT_MEASURE_DESCRIPTOR = Enum.INT_MEASURE_DESCRIPTOR;
    static final int INT_MEASURE_DIMENSION = Enum.INT_MEASURE_DIMENSION;
    static final int INT_METADATAFLOW = Enum.INT_METADATAFLOW;
    static final int INT_METADATA_ATTRIBUTE = Enum.INT_METADATA_ATTRIBUTE;
    static final int INT_METADATA_SET = Enum.INT_METADATA_SET;
    static final int INT_METADATA_STRUCTURE = Enum.INT_METADATA_STRUCTURE;
    static final int INT_METADATA_TARGET = Enum.INT_METADATA_TARGET;
    static final int INT_ORGANISATION = Enum.INT_ORGANISATION;
    static final int INT_ORGANISATION_MAP = Enum.INT_ORGANISATION_MAP;
    static final int INT_ORGANISATION_SCHEME = Enum.INT_ORGANISATION_SCHEME;
    static final int INT_ORGANISATION_SCHEME_MAP = Enum.INT_ORGANISATION_SCHEME_MAP;
    static final int INT_ORGANISATION_UNIT = Enum.INT_ORGANISATION_UNIT;
    static final int INT_ORGANISATION_UNIT_SCHEME = Enum.INT_ORGANISATION_UNIT_SCHEME;
    static final int INT_PRIMARY_MEASURE = Enum.INT_PRIMARY_MEASURE;
    static final int INT_PROCESS = Enum.INT_PROCESS;
    static final int INT_PROCESS_STEP = Enum.INT_PROCESS_STEP;
    static final int INT_PROVISION_AGREEMENT = Enum.INT_PROVISION_AGREEMENT;
    static final int INT_REPORTING_CATEGORY = Enum.INT_REPORTING_CATEGORY;
    static final int INT_REPORTING_CATEGORY_MAP = Enum.INT_REPORTING_CATEGORY_MAP;
    static final int INT_REPORTING_TAXONOMY = Enum.INT_REPORTING_TAXONOMY;
    static final int INT_REPORTING_TAXONOMY_MAP = Enum.INT_REPORTING_TAXONOMY_MAP;
    static final int INT_REPORTING_YEAR_START_DAY = Enum.INT_REPORTING_YEAR_START_DAY;
    static final int INT_REPORT_PERIOD_TARGET = Enum.INT_REPORT_PERIOD_TARGET;
    static final int INT_REPORT_STRUCTURE = Enum.INT_REPORT_STRUCTURE;
    static final int INT_STRUCTURE_MAP = Enum.INT_STRUCTURE_MAP;
    static final int INT_STRUCTURE_SET = Enum.INT_STRUCTURE_SET;
    static final int INT_TIME_DIMENSION = Enum.INT_TIME_DIMENSION;
    static final int INT_TRANSITION = Enum.INT_TRANSITION;
    
    /**
     * Enumeration value class for org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ANY
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_ANY = 1;
        static final int INT_AGENCY = 2;
        static final int INT_AGENCY_SCHEME = 3;
        static final int INT_ATTACHMENT_CONSTRAINT = 4;
        static final int INT_ATTRIBUTE = 5;
        static final int INT_ATTRIBUTE_DESCRIPTOR = 6;
        static final int INT_CATEGORISATION = 7;
        static final int INT_CATEGORY = 8;
        static final int INT_CATEGORY_SCHEME_MAP = 9;
        static final int INT_CATEGORY_SCHEME = 10;
        static final int INT_CODE = 11;
        static final int INT_CODE_MAP = 12;
        static final int INT_CODELIST = 13;
        static final int INT_CODELIST_MAP = 14;
        static final int INT_COMPONENT_MAP = 15;
        static final int INT_CONCEPT = 16;
        static final int INT_CONCEPT_MAP = 17;
        static final int INT_CONCEPT_SCHEME = 18;
        static final int INT_CONCEPT_SCHEME_MAP = 19;
        static final int INT_CONSTRAINT = 20;
        static final int INT_CONSTRAINT_TARGET = 21;
        static final int INT_CONTENT_CONSTRAINT = 22;
        static final int INT_DATAFLOW = 23;
        static final int INT_DATA_CONSUMER = 24;
        static final int INT_DATA_CONSUMER_SCHEME = 25;
        static final int INT_DATA_PROVIDER = 26;
        static final int INT_DATA_PROVIDER_SCHEME = 27;
        static final int INT_DATA_SET_TARGET = 28;
        static final int INT_DATA_STRUCTURE = 29;
        static final int INT_DIMENSION = 30;
        static final int INT_DIMENSION_DESCRIPTOR = 31;
        static final int INT_DIMENSION_DESCRIPTOR_VALUES_TARGET = 32;
        static final int INT_GROUP_DIMENSION_DESCRIPTOR = 33;
        static final int INT_HIERARCHICAL_CODE = 34;
        static final int INT_HIERARCHICAL_CODELIST = 35;
        static final int INT_HIERARCHY = 36;
        static final int INT_HYBRID_CODELIST_MAP = 37;
        static final int INT_HYBRID_CODE_MAP = 38;
        static final int INT_IDENTIFIABLE_OBJECT_TARGET = 39;
        static final int INT_LEVEL = 40;
        static final int INT_MEASURE_DESCRIPTOR = 41;
        static final int INT_MEASURE_DIMENSION = 42;
        static final int INT_METADATAFLOW = 43;
        static final int INT_METADATA_ATTRIBUTE = 44;
        static final int INT_METADATA_SET = 45;
        static final int INT_METADATA_STRUCTURE = 46;
        static final int INT_METADATA_TARGET = 47;
        static final int INT_ORGANISATION = 48;
        static final int INT_ORGANISATION_MAP = 49;
        static final int INT_ORGANISATION_SCHEME = 50;
        static final int INT_ORGANISATION_SCHEME_MAP = 51;
        static final int INT_ORGANISATION_UNIT = 52;
        static final int INT_ORGANISATION_UNIT_SCHEME = 53;
        static final int INT_PRIMARY_MEASURE = 54;
        static final int INT_PROCESS = 55;
        static final int INT_PROCESS_STEP = 56;
        static final int INT_PROVISION_AGREEMENT = 57;
        static final int INT_REPORTING_CATEGORY = 58;
        static final int INT_REPORTING_CATEGORY_MAP = 59;
        static final int INT_REPORTING_TAXONOMY = 60;
        static final int INT_REPORTING_TAXONOMY_MAP = 61;
        static final int INT_REPORTING_YEAR_START_DAY = 62;
        static final int INT_REPORT_PERIOD_TARGET = 63;
        static final int INT_REPORT_STRUCTURE = 64;
        static final int INT_STRUCTURE_MAP = 65;
        static final int INT_STRUCTURE_SET = 66;
        static final int INT_TIME_DIMENSION = 67;
        static final int INT_TRANSITION = 68;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Any", INT_ANY),
                new Enum("Agency", INT_AGENCY),
                new Enum("AgencyScheme", INT_AGENCY_SCHEME),
                new Enum("AttachmentConstraint", INT_ATTACHMENT_CONSTRAINT),
                new Enum("Attribute", INT_ATTRIBUTE),
                new Enum("AttributeDescriptor", INT_ATTRIBUTE_DESCRIPTOR),
                new Enum("Categorisation", INT_CATEGORISATION),
                new Enum("Category", INT_CATEGORY),
                new Enum("CategorySchemeMap", INT_CATEGORY_SCHEME_MAP),
                new Enum("CategoryScheme", INT_CATEGORY_SCHEME),
                new Enum("Code", INT_CODE),
                new Enum("CodeMap", INT_CODE_MAP),
                new Enum("Codelist", INT_CODELIST),
                new Enum("CodelistMap", INT_CODELIST_MAP),
                new Enum("ComponentMap", INT_COMPONENT_MAP),
                new Enum("Concept", INT_CONCEPT),
                new Enum("ConceptMap", INT_CONCEPT_MAP),
                new Enum("ConceptScheme", INT_CONCEPT_SCHEME),
                new Enum("ConceptSchemeMap", INT_CONCEPT_SCHEME_MAP),
                new Enum("Constraint", INT_CONSTRAINT),
                new Enum("ConstraintTarget", INT_CONSTRAINT_TARGET),
                new Enum("ContentConstraint", INT_CONTENT_CONSTRAINT),
                new Enum("Dataflow", INT_DATAFLOW),
                new Enum("DataConsumer", INT_DATA_CONSUMER),
                new Enum("DataConsumerScheme", INT_DATA_CONSUMER_SCHEME),
                new Enum("DataProvider", INT_DATA_PROVIDER),
                new Enum("DataProviderScheme", INT_DATA_PROVIDER_SCHEME),
                new Enum("DataSetTarget", INT_DATA_SET_TARGET),
                new Enum("DataStructure", INT_DATA_STRUCTURE),
                new Enum("Dimension", INT_DIMENSION),
                new Enum("DimensionDescriptor", INT_DIMENSION_DESCRIPTOR),
                new Enum("DimensionDescriptorValuesTarget", INT_DIMENSION_DESCRIPTOR_VALUES_TARGET),
                new Enum("GroupDimensionDescriptor", INT_GROUP_DIMENSION_DESCRIPTOR),
                new Enum("HierarchicalCode", INT_HIERARCHICAL_CODE),
                new Enum("HierarchicalCodelist", INT_HIERARCHICAL_CODELIST),
                new Enum("Hierarchy", INT_HIERARCHY),
                new Enum("HybridCodelistMap", INT_HYBRID_CODELIST_MAP),
                new Enum("HybridCodeMap", INT_HYBRID_CODE_MAP),
                new Enum("IdentifiableObjectTarget", INT_IDENTIFIABLE_OBJECT_TARGET),
                new Enum("Level", INT_LEVEL),
                new Enum("MeasureDescriptor", INT_MEASURE_DESCRIPTOR),
                new Enum("MeasureDimension", INT_MEASURE_DIMENSION),
                new Enum("Metadataflow", INT_METADATAFLOW),
                new Enum("MetadataAttribute", INT_METADATA_ATTRIBUTE),
                new Enum("MetadataSet", INT_METADATA_SET),
                new Enum("MetadataStructure", INT_METADATA_STRUCTURE),
                new Enum("MetadataTarget", INT_METADATA_TARGET),
                new Enum("Organisation", INT_ORGANISATION),
                new Enum("OrganisationMap", INT_ORGANISATION_MAP),
                new Enum("OrganisationScheme", INT_ORGANISATION_SCHEME),
                new Enum("OrganisationSchemeMap", INT_ORGANISATION_SCHEME_MAP),
                new Enum("OrganisationUnit", INT_ORGANISATION_UNIT),
                new Enum("OrganisationUnitScheme", INT_ORGANISATION_UNIT_SCHEME),
                new Enum("PrimaryMeasure", INT_PRIMARY_MEASURE),
                new Enum("Process", INT_PROCESS),
                new Enum("ProcessStep", INT_PROCESS_STEP),
                new Enum("ProvisionAgreement", INT_PROVISION_AGREEMENT),
                new Enum("ReportingCategory", INT_REPORTING_CATEGORY),
                new Enum("ReportingCategoryMap", INT_REPORTING_CATEGORY_MAP),
                new Enum("ReportingTaxonomy", INT_REPORTING_TAXONOMY),
                new Enum("ReportingTaxonomyMap", INT_REPORTING_TAXONOMY_MAP),
                new Enum("ReportingYearStartDay", INT_REPORTING_YEAR_START_DAY),
                new Enum("ReportPeriodTarget", INT_REPORT_PERIOD_TARGET),
                new Enum("ReportStructure", INT_REPORT_STRUCTURE),
                new Enum("StructureMap", INT_STRUCTURE_MAP),
                new Enum("StructureSet", INT_STRUCTURE_SET),
                new Enum("TimeDimension", INT_TIME_DIMENSION),
                new Enum("Transition", INT_TRANSITION),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType newValue(java.lang.Object obj) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) type.newValue( obj ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType newInstance() {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.sdmx.resources.sdmxml.schemas.v21.common.ObjectTypeCodelistType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
