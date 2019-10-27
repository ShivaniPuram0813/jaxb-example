import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

public class SignedInfo{

    private CanonicalizationMethod canonicalizationMethod;
    private SignatureMethod signatureMethod;
    private Reference reference;

    @XmlElement(name = "CanonicalizationMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public CanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    public void setCanonicalizationMethod(CanonicalizationMethod canonicalizationMethod) {
        this.canonicalizationMethod = canonicalizationMethod;
    }

    @XmlElement(name = "SignatureMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public SignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethod signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    @XmlElement(name = "Reference", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public Reference getReference() {
        return reference;
    }

    public void setReference(Reference reference) {
        this.reference = reference;
    }


}

class CanonicalizationMethod{
    private String algorithm;

    @XmlAttribute(name = "Algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
class SignatureMethod{

    private String algorithm;

    @XmlAttribute(name = "Algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
class Reference{

    private DigestMethod digestMethod;
    private DigestValue digestValue;
    private List<Transform> transformList;
    private String uri;

    @XmlAttribute(name = "URI")
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @XmlElement(name = "DigestMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public DigestMethod getDigestMethod() {
        return digestMethod;
    }

    public void setDigestMethod(DigestMethod digestMethod) {
        this.digestMethod = digestMethod;
    }

    @XmlElement(name = "DigestValue", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public DigestValue getDigestValue() {
        return digestValue;
    }

    public void setDigestValue(DigestValue digestValue) {
        this.digestValue = digestValue;
    }

    @XmlElementWrapper(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    @XmlElement(name = "Transform", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public List<Transform> getTransformList() {
        return transformList;
    }

    public void setTransformList(List<Transform> transformList) {
        this.transformList = transformList;
    }
}
class Transform {
    private String algorithm;

    @XmlAttribute(name = "Algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
class DigestMethod{

    private String algorithm;

    @XmlAttribute(name = "Algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
class DigestValue{

    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}