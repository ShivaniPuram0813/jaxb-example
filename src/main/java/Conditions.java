import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class Conditions {

    private String notBefore;
    private String notOnOrAfter;
    private AudienceRestriction audienceRestriction;

    @XmlElement(name = "AudienceRestriction", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public AudienceRestriction getAudienceRestriction() {
        return audienceRestriction;
    }

    public void setAudienceRestriction(AudienceRestriction audienceRestriction) {
        this.audienceRestriction = audienceRestriction;
    }

    @XmlAttribute(name = "NotBefore")
    public String getNotBefore() {
        return notBefore;
    }

    @XmlAttribute(name = "NotOnOrAfter")
    public String getNotOnOrAfter() {
        return notOnOrAfter;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public void setNotOnOrAfter(String notOnOrAfter) {
        this.notOnOrAfter = notOnOrAfter;
    }
}

class AudienceRestriction {

    private Audience audience;

    @XmlElement(name = "Audience", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }
}

class Audience {

    private String value;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
