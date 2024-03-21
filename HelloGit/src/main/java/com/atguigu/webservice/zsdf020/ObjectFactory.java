
package com.atguigu.webservice.zsdf020;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dms.core.s4.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTZSDF020Req_QNAME = new QName("http://www.lingong..com/ZSDF_020", "MT_ZSDF_020_Req");
    private final static QName _MTZSDF020Res_QNAME = new QName("http://www.lingong..com/ZSDF_020", "MT_ZSDF_020_Res");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dms.core.s4.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DTZSDF020Res }
     * 
     */
    public DTZSDF020Res createDTZSDF020Res() {
        return new DTZSDF020Res();
    }

    /**
     * Create an instance of {@link DTZSDF020Req }
     * 
     */
    public DTZSDF020Req createDTZSDF020Req() {
        return new DTZSDF020Req();
    }

    /**
     * Create an instance of {@link DTZSDF020Res.TDATA }
     * 
     */
    public DTZSDF020Res.TDATA createDTZSDF020ResTDATA() {
        return new DTZSDF020Res.TDATA();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZSDF020Req }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.lingong..com/ZSDF_020", name = "MT_ZSDF_020_Req")
    public JAXBElement<DTZSDF020Req> createMTZSDF020Req(DTZSDF020Req value) {
        return new JAXBElement<DTZSDF020Req>(_MTZSDF020Req_QNAME, DTZSDF020Req.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTZSDF020Res }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.lingong..com/ZSDF_020", name = "MT_ZSDF_020_Res")
    public JAXBElement<DTZSDF020Res> createMTZSDF020Res(DTZSDF020Res value) {
        return new JAXBElement<DTZSDF020Res>(_MTZSDF020Res_QNAME, DTZSDF020Res.class, null, value);
    }

}
