import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ConstructObjectFromXML {

    public static void main(String args[]) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Assertion.class);

        Unmarshaller um = context.createUnmarshaller();
        Assertion assertion = (Assertion) um.unmarshal(new FileReader("Token.xml"));
        System.out.println(assertion);
    }
}
