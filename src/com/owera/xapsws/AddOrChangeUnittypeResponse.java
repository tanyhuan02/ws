/**
 * AddOrChangeUnittypeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.owera.xapsws;

public class AddOrChangeUnittypeResponse  implements java.io.Serializable {
    private com.owera.xapsws.Unittype unittype;

    public AddOrChangeUnittypeResponse() {
    }

    public AddOrChangeUnittypeResponse(
           com.owera.xapsws.Unittype unittype) {
           this.unittype = unittype;
    }


    /**
     * Gets the unittype value for this AddOrChangeUnittypeResponse.
     * 
     * @return unittype
     */
    public com.owera.xapsws.Unittype getUnittype() {
        return unittype;
    }


    /**
     * Sets the unittype value for this AddOrChangeUnittypeResponse.
     * 
     * @param unittype
     */
    public void setUnittype(com.owera.xapsws.Unittype unittype) {
        this.unittype = unittype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddOrChangeUnittypeResponse)) return false;
        AddOrChangeUnittypeResponse other = (AddOrChangeUnittypeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unittype==null && other.getUnittype()==null) || 
             (this.unittype!=null &&
              this.unittype.equals(other.getUnittype())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUnittype() != null) {
            _hashCode += getUnittype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddOrChangeUnittypeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xapsws.owera.com/", ">AddOrChangeUnittypeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unittype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unittype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xapsws.owera.com/", "Unittype"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
