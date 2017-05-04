/**
 * AlmanacResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package diary.seviceClient.almanac;

public class AlmanacResult  implements java.io.Serializable {
    private java.lang.String error_code;

    private java.lang.String reason;

    private diary.seviceClient.almanac.Result result;

    public AlmanacResult() {
    }

    public AlmanacResult(
           java.lang.String error_code,
           java.lang.String reason,
           diary.seviceClient.almanac.Result result) {
           this.error_code = error_code;
           this.reason = reason;
           this.result = result;
    }


    /**
     * Gets the error_code value for this AlmanacResult.
     * 
     * @return error_code
     */
    public java.lang.String getError_code() {
        return error_code;
    }


    /**
     * Sets the error_code value for this AlmanacResult.
     * 
     * @param error_code
     */
    public void setError_code(java.lang.String error_code) {
        this.error_code = error_code;
    }


    /**
     * Gets the reason value for this AlmanacResult.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this AlmanacResult.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the result value for this AlmanacResult.
     * 
     * @return result
     */
    public diary.seviceClient.almanac.Result getResult() {
        return result;
    }


    /**
     * Sets the result value for this AlmanacResult.
     * 
     * @param result
     */
    public void setResult(diary.seviceClient.almanac.Result result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlmanacResult)) return false;
        AlmanacResult other = (AlmanacResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error_code==null && other.getError_code()==null) || 
             (this.error_code!=null &&
              this.error_code.equals(other.getError_code()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getError_code() != null) {
            _hashCode += getError_code().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlmanacResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity/xsd", "AlmanacResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "error_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://entity/xsd", "Result"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
