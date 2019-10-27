import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AuthnStatement")
public class AuthenticationStatement {

    private String AuthnInstant;
    private SubjectLocality subjectLocality;

    @XmlAttribute(name = "AuthnInstant")
    public String getAuthnInstant() {
        return AuthnInstant;
    }

    public void setAuthnInstant(String authnInstant) {
        AuthnInstant = authnInstant;
    }

    @XmlElement(name = "SubjectLocality", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public SubjectLocality getSubjectLocality() {
        return subjectLocality;
    }

    public void setSubjectLocality(SubjectLocality subjectLocality) {
        this.subjectLocality = subjectLocality;
    }
}

class SubjectLocality {

    private String address;

    @XmlAttribute(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

