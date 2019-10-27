import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Assertion", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
@XmlType(propOrder = { "signature", "issuer", "subject", "conditions", "authStmt", "attributeStatement" })
public class Assertion {

    private AuthenticationStatement authStmt;
    private AttributeStatement attributeStatement;
    private Conditions conditions;
    private Subject subject;
    private Issuer issuer;
    private Signature signature;
    private String id;
    private String issueInstant;
    private String version;

    @XmlAttribute(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute(name = "IssueInstant")
    public String getIssueInstant() {
        return issueInstant;
    }

    public void setIssueInstant(String issueInstant) {
        this.issueInstant = issueInstant;
    }

    @XmlAttribute(name = "Version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @XmlElement(name = "Issuer", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public Issuer getIssuer() {
        return issuer;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    @XmlElement(name = "Subject", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @XmlElement(name = "AuthnStatement", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public AuthenticationStatement getAuthStmt() {
        return authStmt;
    }

    public void setAuthStmt(AuthenticationStatement authStmt) {
        this.authStmt = authStmt;
    }

    @XmlElement(name = "AttributeStatement", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public AttributeStatement getAttributeStatement() {
        return attributeStatement;
    }

    public void setAttributeStatement(AttributeStatement attributeStatement) {
        this.attributeStatement = attributeStatement;
    }

    @XmlElement(name = "Conditions", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }
}
