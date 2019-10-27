import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ConstructXML {

    private static final String BOOKSTORE_XML = "./bookstore-jaxb.xml";

    public static void main(String args[]) throws JAXBException {
        List<Attribute> attributes = new ArrayList<>();

        Attribute a1 = new Attribute();
        a1.setName("urn:ehealth:names:idm:attribute:PrincipalFedKey");
        AttributeValue v1 = new AttributeValue();
        v1.setValue("92F2D5AB406761A1E05400505692000F@oneidfed.on.ca");
        a1.setAttributeValue(v1);

        Attribute a2 = new Attribute();
        a2.setName("urn:ehealth:names:idm:attribute:firstName");
        AttributeValue v2 = new AttributeValue();
        v2.setValue("Delia");
        a2.setAttributeValue(v2);

        Attribute a3 = new Attribute();
        a3.setName("urn:ehealth:names:idm:attribute:lastName");
        AttributeValue v3 = new AttributeValue();
        v3.setValue("DelAVA");
        a3.setAttributeValue(v3);

        Attribute a4 = new Attribute();
        a4.setName("urn:ehealth:names:idm:attribute:grantByDelegateMeritOnly");
        AttributeValue v4 = new AttributeValue();
        v4.setValue("false");
        a4.setAttributeValue(v4);

        Attribute a5 = new Attribute();
        a5.setName("urn:ehealth:names:idm:attribute:AuthenticationToken");
        AttributeValue v5 = new AttributeValue();
        v5.setValue("CYCEpQyrIGj6fB5u4VMXbLj+e9uEB08M0PzKHuzZ35yFoNpVg9jDP0aDOm2uo5oX9EtNfUaUObk6W8zZA7mGN7FRE7+wcjpMzXXvULSI5g8lzehKnoZRoVQU71WogjJNjaATUniebexR3TpxaUIfaCFSTDoxMduRJDQphSpF4MkZfClTeVWuqDK9nFHdqAYON2SEG+IQhMFk9HyC5fz3jEzD5JWBCqvZTP65+HKx0KM0lSvgENuicqtcp9FGiOwN6+2i8M6eDVPB0bjZvRjcaPPCTq79IR4Z2GY7Mvace/8i5YBkwkNcYPW3rfiF4FxOPW/tw4cQWiL6FKD6GW2OZXAYRTVqU2fkATgJBFcZZQhyeSQL1Z3w1JIG+TAojKjB0hKclW8odAURetWbY9BDXnJztiL5xnBAHjM5R7UPoVNWG9uUumyYOvIkdgVaObLgpFcfloB1Rq9uBJK6jdv+xNNAzIbn4K1uHlAtYg68HD5/bKGdYqcUr57PwPYX9xqYHL3BMDJiUCRBqtPEVW8gLQ0P4DS25+PpFBVCAwzbvJjf54YcThVRNG87PS79BW3c0ZDtnAgGmvijRMcigaPBDCzVNNTF4JRAGco3I6nMflaQLCWZ8ZmjOJ/KA1B8Gt/WVzkTRZQIgxtnfYdEZQtvrF25GjuyazChK6GKZrxNoRE0sC5WlnzRTmFdrNuM8veBKkBhF9b8qazkiw+fV4pIdmRoACWKqMpboeHUbSISDJe3UiprhOfCk37RquIcXgcH3aLLjzQyu0CuCOd7c2X0KSWHeUxEsb5sNBibFqFZ7Aaa4DCWbs01+pPPGlM2dlzKliYJrvQr+vlFxgpDgVENk/SeVG93uhS0QpAxrHRhcrpM4a6oDeIFPkdCfe8XTmfX4fJK6XtjpdtPEJwEM2tzPXLLKHnVHnlZ21QUW1fTs/3MDNBHECHNVwI1DMu5ncgTMZxvlJeWL+oR/ylQTXeAtGaiFTMIcl9u9eBsnfyw1LTBEjEOU5+Ulg/TWYL3FJLbxW7VL7jhSWZfiy/i7E8OQJYGOdjiD2mWWGlub5iJ5TBQEuhfGtlmwxul6qWdpCbK7LvS6hvNrIrZHwcKCBH/PJkbgoV+aWYY39Cg87+HmECRQzweMIE4Q941mmCLCbzuH1v2u4iXvXHLkQyH+DTC99GPcwJ8tk3upjTN1dLXnLcgBlZoTROHjYlhkwBmAJdG+KtViblDG5DulpkaIUnzJmuH9vRWKVLA2UnwA6tz2MUmijyhzqhvX0N3ZlPuilYzl0uZbbCV6PRbsTTqZNsHYZqCaZIslCuGvZ4Gsvpnagl3AkZtOkkiX1E3ShrqF1QhYJ9+mYKMt0cYpPQk9N85GsnGUbsBpWb+z4FHFgcjkVcYG9MbLNhyWhY1df0KsMzLM63At3O65Qs1xlCps/uJypJSa8xN99nz7iFg8gFl5LMrAw+gk4+FF+Nmw+Lw1FsITpLdjRUtr7bozPwvgGiBMHqUuJRnXwVaFVKp6tAkhFBlD1eGcMmgQYvTYzYceoLt6dnBdoQcqtCIMJVJ2XhPUg==");
        a5.setAttributeValue(v5);

        Attribute a6 = new Attribute();
        a6.setName("urn:ehealth:names:idm:attribute:uao");
        AttributeValue v6 = new AttributeValue();
        v6.setValue("org");
        a6.setAttributeValue(v6);

        attributes.add(a1);
        attributes.add(a2);
        attributes.add(a3);
        attributes.add(a4);
        attributes.add(a5);
        attributes.add(a6);

        AttributeStatement attributeStatement = new AttributeStatement();
        attributeStatement.setAttributes(attributes);

        AuthenticationStatement authenticationStatement = new AuthenticationStatement();
        authenticationStatement.setAuthnInstant("2019-10-18T13:53:31-04:00");

        SubjectLocality subjectLocality = new SubjectLocality();
        subjectLocality.setAddress("99.242.215.129");
        authenticationStatement.setSubjectLocality(subjectLocality);

        Conditions conditions = new Conditions();
        conditions.setNotBefore("2019-10-18T13:53:31-04:00");
        conditions.setNotOnOrAfter("2019-10-18T13:54:29-04:00");

        Audience audience = new Audience();
        audience.setValue("http://www.ehealthontario.on.ca/UserRegistry");

        AudienceRestriction audienceRestriction = new AudienceRestriction();
        audienceRestriction.setAudience(audience);

        conditions.setAudienceRestriction(audienceRestriction);


        Subject subject = new Subject();
        NameID nameID = new NameID();
        nameID.setFormat("urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified");
        nameID.setNameQualifier("https://federationbroker.ehealthontario.ca/fed/idp");
        nameID.setValue("92F2D5AB406761A1E05400505692000F@oneidfed.on.ca");

        SubjectConfirmation subjectConfirmation = new SubjectConfirmation();
        subjectConfirmation.setMethod("urn:oasis:names:tc:SAML:2.0:cm:sender-vouches");

        subject.setNameId(nameID);
        subject.setSubjectConfirmation(subjectConfirmation);

        Issuer issuer = new Issuer();
        issuer.setFormat("urn:oasis:names:tc:SAML:2.0:nameid-format:entity");
        issuer.setValue("CN=AVAROS.PST.EMR, OU=Applications, OU=eHealthUsers, OU=Subscribers, DC=subscribers, DC=ssh");

        Signature signature = new Signature();
        SignedInfo signedInfo = new SignedInfo();

        CanonicalizationMethod canonicalizationMethod = new CanonicalizationMethod();
        canonicalizationMethod.setAlgorithm("http://www.w3.org/2001/10/xml-exc-c14n#");

        Reference reference = new Reference();
        DigestMethod digestMethod = new DigestMethod();
        digestMethod.setAlgorithm("http://www.w3.org/2000/09/xmldsig#sha1");

        DigestValue digestValue = new DigestValue();
        digestValue.setValue("IbeRCge5kbEysZfKtN1lpDxuObg=");

        List<Transform> transforms = new ArrayList<>();

        Transform transform1 = new Transform();
        transform1.setAlgorithm("http://www.w3.org/2000/09/xmldsig#enveloped-signature");

        Transform transform2 = new Transform();
        transform2.setAlgorithm("http://www.w3.org/2001/10/xml-exc-c14n#");

        transforms.add(transform1);
        transforms.add(transform2);
        reference.setDigestMethod(digestMethod);
        reference.setDigestValue(digestValue);
        reference.setTransformList(transforms);
        reference.setUri("#e4f3515d-74eb-44a5-b8bd-a2256dc7b0b5");

        SignatureMethod signatureMethod = new SignatureMethod();
        signatureMethod.setAlgorithm("http://www.w3.org/2000/09/xmldsig#rsa-sha1");

        signedInfo.setCanonicalizationMethod(canonicalizationMethod);
        signedInfo.setReference(reference);
        signedInfo.setSignatureMethod(signatureMethod);

        KeyInfo keyInfo = new KeyInfo();
        X509Data x509Data = new X509Data();
        X509SubjectName x509SubjectName = new X509SubjectName();
        x509SubjectName.setValue("CN=AVAROS.PST.EMR,OU=Applications,OU=eHealthUsers,OU=Subscribers,DC=subscribers,DC=ssh");

        X509Certificate x509Certificate = new X509Certificate();
        x509Certificate.setValue("MIIGQjCCBSqgAwIBAgIEWC1vmDANBgkqhkiG9w0BAQsFADB6MQswCQYDVQQGEwJD");

        X509SKI x509SKI = new X509SKI();
        x509SKI.setValue("cq+RjTlW9CB63PHLXnFGM81cOiw=");

        X509IssuerSerial x509IssuerSerial = new X509IssuerSerial();
        X509SerialNumber x509SerialNumber = new X509SerialNumber();
        x509SerialNumber.setValue("1");

        x509Data.setX509SubjectName(x509SubjectName);
        x509Data.setX509Certificate(x509Certificate);
        x509Data.setX509SKI(x509SKI);
        x509Data.setX509IssuerSerial(x509IssuerSerial);
        keyInfo.setX509Data(x509Data);


        SignatureValue signatureValue = new SignatureValue();
        signatureValue.setValue("f63SN352j/evWYXpWPJuX/wricTfj3GbV+aBewlTpptNDuWsLOIyIElbtRc3bQgK\n" +
                "\tSuDDhvl69JbW/SMMWROZbP/VkMCU61OoVlFKQZPD3b/p1xeI0JH6uxsMopDWMSOk\n" +
                "\tSFfOGo9nLV+05n1f0u0jxzcSlsQlnCGd5oK5lYm5ghG1MTA71poZ8QnMmunIQwPr\n" +
                "\tI1BN9G6dtBakiMRADpYzjsehyHPYy3NiMDyET6TkQT2X2YBXjXJPa8Gq0fW88uDn\n" +
                "\t9CIlJdWXuKKEi2Ew/SEakDPbuM+2VODH/1h/TAC05eXcx6Q6YJUR+ZXf+V4YdhaB\n" +
                "\tfB4Zh15zZa+F0Mu69jSJ1Q==");


        signature.setKeyInfo(keyInfo);
        signature.setSignatureValue(signatureValue);
        signature.setSignedInfo(signedInfo);

        Assertion assertion = new Assertion();
        assertion.setAttributeStatement(attributeStatement);
        assertion.setAuthStmt(authenticationStatement);
        assertion.setConditions(conditions);
        assertion.setSubject(subject);
        assertion.setIssuer(issuer);
        assertion.setSignature(signature);
        assertion.setId("e4f3515d-74eb-44a5-b8bd-a2256dc7b0b5");
        assertion.setIssueInstant("2019-10-18T13:53:31-04:00");
        assertion.setVersion("2.0");

        JAXBContext context = JAXBContext.newInstance(Assertion.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        try {
            m.setProperty("com.sun.xml.internal.bind.namespacePrefixMapper", new AttributeNamespaceMapper());
        } catch(PropertyException e) {
            // In case another JAXB implementation is used
        }
        // Write to System.out
        m.marshal(assertion, System.out);

        // Write to File
        m.marshal(assertion, new File("Token.xml"));
    }
}
