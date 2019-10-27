import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement(name = "AttributeStatement")
public class AttributeStatement {

    private List<Attribute> attributes;

    public AttributeStatement() {

    }

    @XmlElement(name = "Attribute", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String toString() {
        return attributes.toString();
    }

}

class Attribute {

    private AttributeValue attributeValue;
    private String name;

    @XmlElement(name = "AttributeValue", namespace = "urn:oasis:names:tc:SAML:2.0:assertion")
    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @XmlAttribute(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name :" +name +"\n" + "AttributeValue:" + attributeValue;
    }
}

class AttributeValue {

    private String xs = "http://www.w3.org/2001/XMLSchema";
    private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
    private String type = "string";
    private String value;

    @XmlAttribute(name = "xmlns:xs")
    public String getXs() {
        return xs;
    }

    public void setXs(String xs) {
        this.xs = xs;
    }

    @XmlAttribute(name = "xmlns:xsi")
    public String getXsi() {
        return xsi;
    }

    public void setXsi(String xsi) {
        this.xsi = xsi;
    }

    @XmlAttribute(name = "xsi:type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return "Value:" + value + "\n" + "XSI" + xsi + "\n" + "XS" + xs + "\n" + "TYPE" + type;
    }
}

