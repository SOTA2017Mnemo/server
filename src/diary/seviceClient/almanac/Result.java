/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package diary.seviceClient.almanac;

public class Result  implements java.io.Serializable {
    private java.lang.String baiji;

    private java.lang.String chongsha;

    private java.lang.String id;

    private java.lang.String ji;

    private java.lang.String jishen;

    private java.lang.String wuxing;

    private java.lang.String xiongshen;

    private java.lang.String yangli;

    private java.lang.String yi;

    private java.lang.String yinli;

    public Result() {
    }

    public Result(
           java.lang.String baiji,
           java.lang.String chongsha,
           java.lang.String id,
           java.lang.String ji,
           java.lang.String jishen,
           java.lang.String wuxing,
           java.lang.String xiongshen,
           java.lang.String yangli,
           java.lang.String yi,
           java.lang.String yinli) {
           this.baiji = baiji;
           this.chongsha = chongsha;
           this.id = id;
           this.ji = ji;
           this.jishen = jishen;
           this.wuxing = wuxing;
           this.xiongshen = xiongshen;
           this.yangli = yangli;
           this.yi = yi;
           this.yinli = yinli;
    }


    /**
     * Gets the baiji value for this Result.
     * 
     * @return baiji
     */
    public java.lang.String getBaiji() {
        return baiji;
    }


    /**
     * Sets the baiji value for this Result.
     * 
     * @param baiji
     */
    public void setBaiji(java.lang.String baiji) {
        this.baiji = baiji;
    }


    /**
     * Gets the chongsha value for this Result.
     * 
     * @return chongsha
     */
    public java.lang.String getChongsha() {
        return chongsha;
    }


    /**
     * Sets the chongsha value for this Result.
     * 
     * @param chongsha
     */
    public void setChongsha(java.lang.String chongsha) {
        this.chongsha = chongsha;
    }


    /**
     * Gets the id value for this Result.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Result.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ji value for this Result.
     * 
     * @return ji
     */
    public java.lang.String getJi() {
        return ji;
    }


    /**
     * Sets the ji value for this Result.
     * 
     * @param ji
     */
    public void setJi(java.lang.String ji) {
        this.ji = ji;
    }


    /**
     * Gets the jishen value for this Result.
     * 
     * @return jishen
     */
    public java.lang.String getJishen() {
        return jishen;
    }


    /**
     * Sets the jishen value for this Result.
     * 
     * @param jishen
     */
    public void setJishen(java.lang.String jishen) {
        this.jishen = jishen;
    }


    /**
     * Gets the wuxing value for this Result.
     * 
     * @return wuxing
     */
    public java.lang.String getWuxing() {
        return wuxing;
    }


    /**
     * Sets the wuxing value for this Result.
     * 
     * @param wuxing
     */
    public void setWuxing(java.lang.String wuxing) {
        this.wuxing = wuxing;
    }


    /**
     * Gets the xiongshen value for this Result.
     * 
     * @return xiongshen
     */
    public java.lang.String getXiongshen() {
        return xiongshen;
    }


    /**
     * Sets the xiongshen value for this Result.
     * 
     * @param xiongshen
     */
    public void setXiongshen(java.lang.String xiongshen) {
        this.xiongshen = xiongshen;
    }


    /**
     * Gets the yangli value for this Result.
     * 
     * @return yangli
     */
    public java.lang.String getYangli() {
        return yangli;
    }


    /**
     * Sets the yangli value for this Result.
     * 
     * @param yangli
     */
    public void setYangli(java.lang.String yangli) {
        this.yangli = yangli;
    }


    /**
     * Gets the yi value for this Result.
     * 
     * @return yi
     */
    public java.lang.String getYi() {
        return yi;
    }


    /**
     * Sets the yi value for this Result.
     * 
     * @param yi
     */
    public void setYi(java.lang.String yi) {
        this.yi = yi;
    }


    /**
     * Gets the yinli value for this Result.
     * 
     * @return yinli
     */
    public java.lang.String getYinli() {
        return yinli;
    }


    /**
     * Sets the yinli value for this Result.
     * 
     * @param yinli
     */
    public void setYinli(java.lang.String yinli) {
        this.yinli = yinli;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baiji==null && other.getBaiji()==null) || 
             (this.baiji!=null &&
              this.baiji.equals(other.getBaiji()))) &&
            ((this.chongsha==null && other.getChongsha()==null) || 
             (this.chongsha!=null &&
              this.chongsha.equals(other.getChongsha()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ji==null && other.getJi()==null) || 
             (this.ji!=null &&
              this.ji.equals(other.getJi()))) &&
            ((this.jishen==null && other.getJishen()==null) || 
             (this.jishen!=null &&
              this.jishen.equals(other.getJishen()))) &&
            ((this.wuxing==null && other.getWuxing()==null) || 
             (this.wuxing!=null &&
              this.wuxing.equals(other.getWuxing()))) &&
            ((this.xiongshen==null && other.getXiongshen()==null) || 
             (this.xiongshen!=null &&
              this.xiongshen.equals(other.getXiongshen()))) &&
            ((this.yangli==null && other.getYangli()==null) || 
             (this.yangli!=null &&
              this.yangli.equals(other.getYangli()))) &&
            ((this.yi==null && other.getYi()==null) || 
             (this.yi!=null &&
              this.yi.equals(other.getYi()))) &&
            ((this.yinli==null && other.getYinli()==null) || 
             (this.yinli!=null &&
              this.yinli.equals(other.getYinli())));
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
        if (getBaiji() != null) {
            _hashCode += getBaiji().hashCode();
        }
        if (getChongsha() != null) {
            _hashCode += getChongsha().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getJi() != null) {
            _hashCode += getJi().hashCode();
        }
        if (getJishen() != null) {
            _hashCode += getJishen().hashCode();
        }
        if (getWuxing() != null) {
            _hashCode += getWuxing().hashCode();
        }
        if (getXiongshen() != null) {
            _hashCode += getXiongshen().hashCode();
        }
        if (getYangli() != null) {
            _hashCode += getYangli().hashCode();
        }
        if (getYi() != null) {
            _hashCode += getYi().hashCode();
        }
        if (getYinli() != null) {
            _hashCode += getYinli().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://entity/xsd", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baiji");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "baiji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chongsha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "chongsha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ji");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "ji"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jishen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "jishen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuxing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "wuxing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xiongshen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "xiongshen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yangli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "yangli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "yi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yinli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://entity/xsd", "yinli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
