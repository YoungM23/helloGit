
package com.atguigu.webservice.zsdf020;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>DT_ZSDF_020_Res complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_ZSDF_020_Res">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="E_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="E_MESG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_DATA" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VBELN_VA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ERDAT_VA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VBELN_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WADAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DMBTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZSDF_020_Res", propOrder = {
    "etype",
    "emesg",
    "tdata"
})
public class DTZSDF020Res {

    @XmlElement(name = "E_TYPE", required = true)
    protected String etype;
    @XmlElement(name = "E_MESG", required = true)
    protected String emesg;
    @XmlElement(name = "T_DATA")
    protected List<TDATA> tdata;

    /**
     * ��ȡetype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETYPE() {
        return etype;
    }

    /**
     * ����etype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETYPE(String value) {
        this.etype = value;
    }

    /**
     * ��ȡemesg���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMESG() {
        return emesg;
    }

    /**
     * ����emesg���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMESG(String value) {
        this.emesg = value;
    }

    /**
     * Gets the value of the tdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDATA }
     * 
     * 
     */
    public List<TDATA> getTDATA() {
        if (tdata == null) {
            tdata = new ArrayList<TDATA>();
        }
        return this.tdata;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VBELN_VA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ERDAT_VA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VBELN_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WADAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DMBTR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vbelnva",
        "erdatva",
        "vbelnvl",
        "wadat",
        "dmbtr"
    })
    public static class TDATA {

        @XmlElement(name = "VBELN_VA")
        protected String vbelnva;
        @XmlElement(name = "ERDAT_VA")
        protected String erdatva;
        @XmlElement(name = "VBELN_VL")
        protected String vbelnvl;
        @XmlElement(name = "WADAT")
        protected String wadat;
        @XmlElement(name = "DMBTR")
        protected String dmbtr;

        /**
         * ��ȡvbelnva���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBELNVA() {
            return vbelnva;
        }

        /**
         * ����vbelnva���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBELNVA(String value) {
            this.vbelnva = value;
        }

        /**
         * ��ȡerdatva���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getERDATVA() {
            return erdatva;
        }

        /**
         * ����erdatva���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setERDATVA(String value) {
            this.erdatva = value;
        }

        /**
         * ��ȡvbelnvl���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBELNVL() {
            return vbelnvl;
        }

        /**
         * ����vbelnvl���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBELNVL(String value) {
            this.vbelnvl = value;
        }

        /**
         * ��ȡwadat���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWADAT() {
            return wadat;
        }

        /**
         * ����wadat���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWADAT(String value) {
            this.wadat = value;
        }

        /**
         * ��ȡdmbtr���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDMBTR() {
            return dmbtr;
        }

        /**
         * ����dmbtr���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDMBTR(String value) {
            this.dmbtr = value;
        }

    }

}
