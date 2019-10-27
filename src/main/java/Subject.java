import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class Subject {

    private NameID nameId;
    private SubjectConfirmation subjectConfirmation;

    @XmlElement(name = "NameID", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public NameID getNameId() {
        return nameId;
    }

    public void setNameId(NameID nameId) {
        this.nameId = nameId;
    }

    @XmlElement(name = "SubjectConfirmation", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public SubjectConfirmation getSubjectConfirmation() {
        return subjectConfirmation;
    }

    public void setSubjectConfirmation(SubjectConfirmation subjectConfirmation) {
        this.subjectConfirmation = subjectConfirmation;
    }
}

class NameID{

    private String value;
    private String format;
    private String nameQualifier;

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name = "Format")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @XmlAttribute(name = "NameQualifier")
    public String getNameQualifier() {
        return nameQualifier;
    }

    public void setNameQualifier(String nameQualifier) {
        this.nameQualifier = nameQualifier;
    }
}

class SubjectConfirmation{

    private String method;

    @XmlAttribute(name = "Method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}