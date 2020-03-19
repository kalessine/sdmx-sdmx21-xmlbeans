/*
 * XML Type:  EventSelectorType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.registry.impl;
/**
 * An XML EventSelectorType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry).
 *
 * This is a complex type.
 */
public class EventSelectorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.sdmx.resources.sdmxml.schemas.v21.registry.EventSelectorType
{
    private static final long serialVersionUID = 1L;
    
    public EventSelectorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTURALREPOSITORYEVENTS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "StructuralRepositoryEvents");
    private static final javax.xml.namespace.QName DATAREGISTRATIONEVENTS$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "DataRegistrationEvents");
    private static final javax.xml.namespace.QName METADATAREGISTRATIONEVENTS$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/registry", "MetadataRegistrationEvents");
    
    
    /**
     * Gets array of all "StructuralRepositoryEvents" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType[] getStructuralRepositoryEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRUCTURALREPOSITORYEVENTS$0, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StructuralRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType getStructuralRepositoryEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType)get_store().find_element_user(STRUCTURALREPOSITORYEVENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "StructuralRepositoryEvents" element
     */
    public int sizeOfStructuralRepositoryEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRUCTURALREPOSITORYEVENTS$0);
        }
    }
    
    /**
     * Sets array of all "StructuralRepositoryEvents" element
     */
    public void setStructuralRepositoryEventsArray(org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType[] structuralRepositoryEventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(structuralRepositoryEventsArray, STRUCTURALREPOSITORYEVENTS$0);
        }
    }
    
    /**
     * Sets ith "StructuralRepositoryEvents" element
     */
    public void setStructuralRepositoryEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType structuralRepositoryEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType)get_store().find_element_user(STRUCTURALREPOSITORYEVENTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(structuralRepositoryEvents);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StructuralRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType insertNewStructuralRepositoryEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType)get_store().insert_element_user(STRUCTURALREPOSITORYEVENTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StructuralRepositoryEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType addNewStructuralRepositoryEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.StructuralRepositoryEventsType)get_store().add_element_user(STRUCTURALREPOSITORYEVENTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StructuralRepositoryEvents" element
     */
    public void removeStructuralRepositoryEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRUCTURALREPOSITORYEVENTS$0, i);
        }
    }
    
    /**
     * Gets array of all "DataRegistrationEvents" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType[] getDataRegistrationEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAREGISTRATIONEVENTS$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType getDataRegistrationEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType)get_store().find_element_user(DATAREGISTRATIONEVENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataRegistrationEvents" element
     */
    public int sizeOfDataRegistrationEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAREGISTRATIONEVENTS$2);
        }
    }
    
    /**
     * Sets array of all "DataRegistrationEvents" element
     */
    public void setDataRegistrationEventsArray(org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType[] dataRegistrationEventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataRegistrationEventsArray, DATAREGISTRATIONEVENTS$2);
        }
    }
    
    /**
     * Sets ith "DataRegistrationEvents" element
     */
    public void setDataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType dataRegistrationEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType)get_store().find_element_user(DATAREGISTRATIONEVENTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataRegistrationEvents);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType insertNewDataRegistrationEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType)get_store().insert_element_user(DATAREGISTRATIONEVENTS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType addNewDataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.DataRegistrationEventsType)get_store().add_element_user(DATAREGISTRATIONEVENTS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataRegistrationEvents" element
     */
    public void removeDataRegistrationEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAREGISTRATIONEVENTS$2, i);
        }
    }
    
    /**
     * Gets array of all "MetadataRegistrationEvents" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType[] getMetadataRegistrationEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAREGISTRATIONEVENTS$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType[] result = new org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType getMetadataRegistrationEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType)get_store().find_element_user(METADATAREGISTRATIONEVENTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataRegistrationEvents" element
     */
    public int sizeOfMetadataRegistrationEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAREGISTRATIONEVENTS$4);
        }
    }
    
    /**
     * Sets array of all "MetadataRegistrationEvents" element
     */
    public void setMetadataRegistrationEventsArray(org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType[] metadataRegistrationEventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataRegistrationEventsArray, METADATAREGISTRATIONEVENTS$4);
        }
    }
    
    /**
     * Sets ith "MetadataRegistrationEvents" element
     */
    public void setMetadataRegistrationEventsArray(int i, org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType metadataRegistrationEvents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType)get_store().find_element_user(METADATAREGISTRATIONEVENTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataRegistrationEvents);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType insertNewMetadataRegistrationEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType)get_store().insert_element_user(METADATAREGISTRATIONEVENTS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataRegistrationEvents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType addNewMetadataRegistrationEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.registry.MetadataRegistrationEventsType)get_store().add_element_user(METADATAREGISTRATIONEVENTS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataRegistrationEvents" element
     */
    public void removeMetadataRegistrationEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAREGISTRATIONEVENTS$4, i);
        }
    }
}
