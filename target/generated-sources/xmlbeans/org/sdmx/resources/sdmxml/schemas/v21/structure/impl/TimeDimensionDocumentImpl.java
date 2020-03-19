/*
 * An XML document type.
 * Localname: TimeDimension
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * A document containing one TimeDimension(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure) element.
 *
 * This is a complex type.
 */
public class TimeDimensionDocumentImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ComponentDocumentImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimeDimensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEDIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "TimeDimension");
    
    
    /**
     * Gets the "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType getTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().find_element_user(TIMEDIMENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimeDimension" element
     */
    public void setTimeDimension(org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType timeDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().find_element_user(TIMEDIMENSION$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().add_element_user(TIMEDIMENSION$0);
            }
            target.set(timeDimension);
        }
    }
    
    /**
     * Appends and returns a new empty "TimeDimension" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType addNewTimeDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.TimeDimensionType)get_store().add_element_user(TIMEDIMENSION$0);
            return target;
        }
    }
}
