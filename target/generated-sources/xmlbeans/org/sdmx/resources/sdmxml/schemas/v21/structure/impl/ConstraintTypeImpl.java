/*
 * XML Type:  ConstraintType
 * Namespace: http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure
 * Java type: org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintType
 *
 * Automatically generated - do not modify.
 */
package org.sdmx.resources.sdmxml.schemas.v21.structure.impl;
/**
 * An XML ConstraintType(@http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure).
 *
 * This is a complex type.
 */
public class ConstraintTypeImpl extends org.sdmx.resources.sdmxml.schemas.v21.structure.impl.ConstraintBaseTypeImpl implements org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintType
{
    private static final long serialVersionUID = 1L;
    
    public ConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINTATTACHMENT$0 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "ConstraintAttachment");
    private static final javax.xml.namespace.QName DATAKEYSET$2 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "DataKeySet");
    private static final javax.xml.namespace.QName METADATAKEYSET$4 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataKeySet");
    private static final javax.xml.namespace.QName CUBEREGION$6 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "CubeRegion");
    private static final javax.xml.namespace.QName METADATATARGETREGION$8 = 
        new javax.xml.namespace.QName("http://www.sdmx.org/resources/sdmxml/schemas/v2_1/structure", "MetadataTargetRegion");
    
    
    /**
     * Gets the "ConstraintAttachment" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType getConstraintAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType)get_store().find_element_user(CONSTRAINTATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConstraintAttachment" element
     */
    public boolean isSetConstraintAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINTATTACHMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "ConstraintAttachment" element
     */
    public void setConstraintAttachment(org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType constraintAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType)get_store().find_element_user(CONSTRAINTATTACHMENT$0, 0);
            if (target == null)
            {
                target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType)get_store().add_element_user(CONSTRAINTATTACHMENT$0);
            }
            target.set(constraintAttachment);
        }
    }
    
    /**
     * Appends and returns a new empty "ConstraintAttachment" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType addNewConstraintAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.ConstraintAttachmentType)get_store().add_element_user(CONSTRAINTATTACHMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ConstraintAttachment" element
     */
    public void unsetConstraintAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINTATTACHMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "DataKeySet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] getDataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAKEYSET$2, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType getDataKeySetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().find_element_user(DATAKEYSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataKeySet" element
     */
    public int sizeOfDataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAKEYSET$2);
        }
    }
    
    /**
     * Sets array of all "DataKeySet" element
     */
    public void setDataKeySetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType[] dataKeySetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataKeySetArray, DATAKEYSET$2);
        }
    }
    
    /**
     * Sets ith "DataKeySet" element
     */
    public void setDataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType dataKeySet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().find_element_user(DATAKEYSET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataKeySet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType insertNewDataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().insert_element_user(DATAKEYSET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType addNewDataKeySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.DataKeySetType)get_store().add_element_user(DATAKEYSET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataKeySet" element
     */
    public void removeDataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAKEYSET$2, i);
        }
    }
    
    /**
     * Gets array of all "MetadataKeySet" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] getMetadataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATAKEYSET$4, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] result = new org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType getMetadataKeySetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().find_element_user(METADATAKEYSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataKeySet" element
     */
    public int sizeOfMetadataKeySetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAKEYSET$4);
        }
    }
    
    /**
     * Sets array of all "MetadataKeySet" element
     */
    public void setMetadataKeySetArray(org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType[] metadataKeySetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataKeySetArray, METADATAKEYSET$4);
        }
    }
    
    /**
     * Sets ith "MetadataKeySet" element
     */
    public void setMetadataKeySetArray(int i, org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType metadataKeySet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().find_element_user(METADATAKEYSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataKeySet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType insertNewMetadataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().insert_element_user(METADATAKEYSET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataKeySet" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType addNewMetadataKeySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.structure.MetadataKeySetType)get_store().add_element_user(METADATAKEYSET$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataKeySet" element
     */
    public void removeMetadataKeySet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAKEYSET$4, i);
        }
    }
    
    /**
     * Gets array of all "CubeRegion" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] getCubeRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUBEREGION$6, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType getCubeRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().find_element_user(CUBEREGION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CubeRegion" element
     */
    public int sizeOfCubeRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUBEREGION$6);
        }
    }
    
    /**
     * Sets array of all "CubeRegion" element
     */
    public void setCubeRegionArray(org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType[] cubeRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cubeRegionArray, CUBEREGION$6);
        }
    }
    
    /**
     * Sets ith "CubeRegion" element
     */
    public void setCubeRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType cubeRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().find_element_user(CUBEREGION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cubeRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType insertNewCubeRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().insert_element_user(CUBEREGION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CubeRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType addNewCubeRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.CubeRegionType)get_store().add_element_user(CUBEREGION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CubeRegion" element
     */
    public void removeCubeRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUBEREGION$6, i);
        }
    }
    
    /**
     * Gets array of all "MetadataTargetRegion" elements
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] getMetadataTargetRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METADATATARGETREGION$8, targetList);
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] result = new org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MetadataTargetRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType getMetadataTargetRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().find_element_user(METADATATARGETREGION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MetadataTargetRegion" element
     */
    public int sizeOfMetadataTargetRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATATARGETREGION$8);
        }
    }
    
    /**
     * Sets array of all "MetadataTargetRegion" element
     */
    public void setMetadataTargetRegionArray(org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType[] metadataTargetRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(metadataTargetRegionArray, METADATATARGETREGION$8);
        }
    }
    
    /**
     * Sets ith "MetadataTargetRegion" element
     */
    public void setMetadataTargetRegionArray(int i, org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType metadataTargetRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().find_element_user(METADATATARGETREGION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(metadataTargetRegion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MetadataTargetRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType insertNewMetadataTargetRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().insert_element_user(METADATATARGETREGION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MetadataTargetRegion" element
     */
    public org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType addNewMetadataTargetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType target = null;
            target = (org.sdmx.resources.sdmxml.schemas.v21.common.MetadataTargetRegionType)get_store().add_element_user(METADATATARGETREGION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "MetadataTargetRegion" element
     */
    public void removeMetadataTargetRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATATARGETREGION$8, i);
        }
    }
}
