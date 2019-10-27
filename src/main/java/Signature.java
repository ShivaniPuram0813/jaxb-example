import javax.xml.bind.annotation.*;

@XmlType(propOrder = { "signedInfo", "signatureValue", "keyInfo" })
public class Signature {

    private SignedInfo signedInfo;
    private SignatureValue signatureValue;
    private KeyInfo keyInfo;

    @XmlElement(name = "SignedInfo", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public SignedInfo getSignedInfo() {
        return signedInfo;
    }

    public void setSignedInfo(SignedInfo signedInfo) {
        this.signedInfo = signedInfo;
    }

    @XmlElement(name = "SignatureValue", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public SignatureValue getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(SignatureValue signatureValue) {
        this.signatureValue = signatureValue;
    }

    @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public KeyInfo getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(KeyInfo keyInfo) {
        this.keyInfo = keyInfo;
    }
}






