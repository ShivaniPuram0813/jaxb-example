import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class AttributeNamespaceMapper extends NamespacePrefixMapper {

    private  static final String SAML_URL = "urn:oasis:names:tc:SAML:2.0:assertion";
    private static final String DSGI_URL = "http://www.w3.org/2000/09/xmldsig#";

    private static final String SAML_PREFIX = "saml";
    private static final String DSGI_PREFIX = "dsig";

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if(SAML_URL.equals(namespaceUri)) {
            return SAML_PREFIX;
        } else if(DSGI_URL.equals(namespaceUri)) {
            return DSGI_PREFIX;
        }
        return suggestion;
    }
}
