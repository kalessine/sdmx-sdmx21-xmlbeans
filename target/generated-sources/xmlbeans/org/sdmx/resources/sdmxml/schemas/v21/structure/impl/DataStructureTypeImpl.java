/*
 * XML Type:  DataStructureType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML DataStructureType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class DataStructureTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.StructureTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureType
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTRUCTURECOMPONENTS$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataStructureComponents");
    
    
    /**
     * Gets the "DataStructureComponents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType getDataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType)get_store().find_element_user(DATASTRUCTURECOMPONENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataStructureComponents" element
     */
    public boolean isSetDataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTRUCTURECOMPONENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "DataStructureComponents" element
     */
    public void setDataStructureComponents(org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType dataStructureComponents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType)get_store().find_element_user(DATASTRUCTURECOMPONENTS$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType)get_store().add_element_user(DATASTRUCTURECOMPONENTS$0);
            }
            target.set(dataStructureComponents);
        }
    }
    
    /**
     * Appends and returns a new empty "DataStructureComponents" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType addNewDataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsType)get_store().add_element_user(DATASTRUCTURECOMPONENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DataStructureComponents" element
     */
    public void unsetDataStructureComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTRUCTURECOMPONENTS$0, 0);
        }
    }
}
