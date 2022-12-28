import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    public static void main(String[] args) throws ParseException, JAXBException {
        Operations op = new Operations(new Date(2021,01,01), new Date(2021,01,30));
        op.getOperation().add(new Operation("CR", new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"), 7000.01, "ver"));
        op.getOperation().add(new Operation("DB", new SimpleDateFormat("dd/MM/yyyy").parse("15/11/2022"), 7000.01, "ver"));
        Releve releve = new Releve("123456789", new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"), 1200.00f, op);

        // Serialization
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(releve, new File("releve.xml"));




    }
}
