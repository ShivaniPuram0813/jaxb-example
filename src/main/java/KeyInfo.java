import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class KeyInfo{

    private X509Data x509Data;

    @XmlElement(name = "X509Data", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public X509Data getX509Data() {
        return x509Data;
    }

    public void setX509Data(X509Data x509Data) {
        this.x509Data = x509Data;
    }


}

class X509Data{

    private X509SubjectName x509SubjectName;
    private X509Certificate x509Certificate;
    private X509SKI x509SKI;
    private X509IssuerSerial x509IssuerSerial;


    @XmlElement(name = "X509SubjectName", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public X509SubjectName getX509SubjectName() {
        return x509SubjectName;
    }

    public void setX509SubjectName(X509SubjectName x509SubjectName) {
        this.x509SubjectName = x509SubjectName;
    }

    @XmlElement(name = "X509Certificate", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public X509Certificate getX509Certificate() {
        return x509Certificate;
    }

    public void setX509Certificate(X509Certificate x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    @XmlElement(name = "X509SKI", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public X509SKI getX509SKI() {
        return x509SKI;
    }

    public void setX509SKI(X509SKI x509SKI) {
        this.x509SKI = x509SKI;
    }

    @XmlElement(name = "X509IssuerSerial", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public X509IssuerSerial getX509IssuerSerial() {
        return x509IssuerSerial;
    }

    public void setX509IssuerSerial(X509IssuerSerial x509IssuerSerial) {
        this.x509IssuerSerial = x509IssuerSerial;
    }

}

class X509SubjectName{

    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class X509Certificate{

    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class X509SKI{

    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class X509IssuerSerial{
    private X509SerialNumber x509SerialNumber;

    @XmlElement(name = "X509SerialNumber", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public X509SerialNumber getX509SerialNumber() {
        return x509SerialNumber;
    }

    public void setX509SerialNumber(X509SerialNumber x509SerialNumber) {
        this.x509SerialNumber = x509SerialNumber;
    }

}

class X509SerialNumber{
    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}