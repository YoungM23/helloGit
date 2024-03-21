
package com.atguigu.webservice.zsdf020;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_ZSDF_020_Req complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_ZSDF_020_Req">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I_BUKRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="I_AUART" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="I_VBELN_VA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_VBELN_VL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_WADAT_FROM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I_WADAT_TO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZSDF_020_Req", propOrder = {
    "ibukrs",
    "iauart",
    "ivbelnva",
    "ivbelnvl",
    "iwadatfrom",
    "iwadatto"
})
public class DTZSDF020Req {

    @XmlElement(name = "I_BUKRS", required = true)
    protected String ibukrs;
    @XmlElement(name = "I_AUART", required = true)
    protected String iauart;
    @XmlElement(name = "I_VBELN_VA")
    protected String ivbelnva;
    @XmlElement(name = "I_VBELN_VL")
    protected String ivbelnvl;
    @XmlElement(name = "I_WADAT_FROM")
    protected String iwadatfrom;
    @XmlElement(name = "I_WADAT_TO")
    protected String iwadatto;

    /**
     * ��ȡibukrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBUKRS() {
        return ibukrs;
    }

    /**
     * ����ibukrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBUKRS(String value) {
        this.ibukrs = value;
    }

    /**
     * ��ȡiauart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIAUART() {
        return iauart;
    }

    /**
     * ����iauart���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIAUART(String value) {
        this.iauart = value;
    }

    /**
     * ��ȡivbelnva���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVBELNVA() {
        return ivbelnva;
    }

    /**
     * ����ivbelnva���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVBELNVA(String value) {
        this.ivbelnva = value;
    }

    /**
     * ��ȡivbelnvl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVBELNVL() {
        return ivbelnvl;
    }

    /**
     * ����ivbelnvl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVBELNVL(String value) {
        this.ivbelnvl = value;
    }

    /**
     * ��ȡiwadatfrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIWADATFROM() {
        return iwadatfrom;
    }

    /**
     * ����iwadatfrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIWADATFROM(String value) {
        this.iwadatfrom = value;
    }

    /**
     * ��ȡiwadatto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIWADATTO() {
        return iwadatto;
    }

    /**
     * ����iwadatto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIWADATTO(String value) {
        this.iwadatto = value;
    }

}
