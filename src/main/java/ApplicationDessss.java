import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ApplicationDessss {
    public static void main(String[] args) throws JAXBException {

        // Serialization
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));

        System.out.println(releve.toString());

//        for (Operation opera : releve.getOp().getOperation()){
//            System.out.println(opera.toString());
//        }
    }
}
