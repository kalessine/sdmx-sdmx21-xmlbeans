/*
 * XML Type:  StructureWhereType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.query.impl;
/**
 * An XML StructureWhereType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query).
 *
 * This is a complex type.
 */
public class StructureWhereTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.query.impl.MaintainableWhereTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.query.StructureWhereType
{
    private static final long serialVersionUID = 1L;
    
    public StructureWhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEDCONCEPT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "UsedConcept");
    private static final javax.xml.namespace.QName USEDREPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "UsedRepresentation");
    private static final javax.xml.namespace.QName COMPONENTLISTWHERE$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentListWhere");
    private static final org.apache.xmlbeans.QNameSet COMPONENTLISTWHERE$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataTargetWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ReportStructureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentListWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupWhere"),
    });
    private static final javax.xml.namespace.QName COMPONENTWHERE$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentWhere");
    private static final org.apache.xmlbeans.QNameSet COMPONENTWHERE$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "PrimaryMeasureWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "GroupDimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MetadataAttributeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TimeDimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "AttributeWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "TargetObjectWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "DimensionWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "ComponentWhere"),
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/query", "MeasureDimensionWhere"),
    });
    
    
    /**
     * Gets array of all "UsedConcept" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] getUsedConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEDCONCEPT$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UsedConcept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType getUsedConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(USEDCONCEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UsedConcept" element
     */
    public int sizeOfUsedConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEDCONCEPT$0);
        }
    }
    
    /**
     * Sets array of all "UsedConcept" element
     */
    public void setUsedConceptArray(org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType[] usedConceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usedConceptArray, USEDCONCEPT$0);
        }
    }
    
    /**
     * Sets ith "UsedConcept" element
     */
    public void setUsedConceptArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType usedConcept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().find_element_user(USEDCONCEPT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(usedConcept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UsedConcept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType insertNewUsedConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().insert_element_user(USEDCONCEPT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UsedConcept" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType addNewUsedConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ConceptReferenceType)get_store().add_element_user(USEDCONCEPT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "UsedConcept" element
     */
    public void removeUsedConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEDCONCEPT$0, i);
        }
    }
    
    /**
     * Gets array of all "UsedRepresentation" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType[] getUsedRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEDREPRESENTATION$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UsedRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType getUsedRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(USEDREPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UsedRepresentation" element
     */
    public int sizeOfUsedRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEDREPRESENTATION$2);
        }
    }
    
    /**
     * Sets array of all "UsedRepresentation" element
     */
    public void setUsedRepresentationArray(org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType[] usedRepresentationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usedRepresentationArray, USEDREPRESENTATION$2);
        }
    }
    
    /**
     * Sets ith "UsedRepresentation" element
     */
    public void setUsedRepresentationArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType usedRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().find_element_user(USEDREPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(usedRepresentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UsedRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType insertNewUsedRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().insert_element_user(USEDREPRESENTATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UsedRepresentation" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType addNewUsedRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.ItemSchemeReferenceBaseType)get_store().add_element_user(USEDREPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "UsedRepresentation" element
     */
    public void removeUsedRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEDREPRESENTATION$2, i);
        }
    }
    
    /**
     * Gets array of all "ComponentListWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType[] getComponentListWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTLISTWHERE$5, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentListWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType getComponentListWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().find_element_user(COMPONENTLISTWHERE$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComponentListWhere" element
     */
    public int sizeOfComponentListWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTLISTWHERE$5);
        }
    }
    
    /**
     * Sets array of all "ComponentListWhere" element
     */
    public void setComponentListWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType[] componentListWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentListWhereArray, COMPONENTLISTWHERE$4, COMPONENTLISTWHERE$5);
        }
    }
    
    /**
     * Sets ith "ComponentListWhere" element
     */
    public void setComponentListWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType componentListWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().find_element_user(COMPONENTLISTWHERE$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentListWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentListWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType insertNewComponentListWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().insert_element_user(COMPONENTLISTWHERE$5, COMPONENTLISTWHERE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentListWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType addNewComponentListWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentListWhereType)get_store().add_element_user(COMPONENTLISTWHERE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentListWhere" element
     */
    public void removeComponentListWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTLISTWHERE$5, i);
        }
    }
    
    /**
     * Gets array of all "ComponentWhere" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] getComponentWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENTWHERE$7, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] result = new org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType getComponentWhereArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().find_element_user(COMPONENTWHERE$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ComponentWhere" element
     */
    public int sizeOfComponentWhereArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTWHERE$7);
        }
    }
    
    /**
     * Sets array of all "ComponentWhere" element
     */
    public void setComponentWhereArray(org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType[] componentWhereArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentWhereArray, COMPONENTWHERE$6, COMPONENTWHERE$7);
        }
    }
    
    /**
     * Sets ith "ComponentWhere" element
     */
    public void setComponentWhereArray(int i, org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType componentWhere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().find_element_user(COMPONENTWHERE$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(componentWhere);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType insertNewComponentWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().insert_element_user(COMPONENTWHERE$7, COMPONENTWHERE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ComponentWhere" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType addNewComponentWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.query.ComponentWhereType)get_store().add_element_user(COMPONENTWHERE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ComponentWhere" element
     */
    public void removeComponentWhere(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTWHERE$7, i);
        }
    }
}
