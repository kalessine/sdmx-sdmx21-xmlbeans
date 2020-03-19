/*
 * An XML document type.
 * Localname: DataStructureComponents
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one DataStructureComponents(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class DataStructureComponentsDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.GroupingDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.DataStructureComponentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataStructureComponentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}
