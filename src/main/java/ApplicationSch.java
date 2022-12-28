import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ApplicationSch {
    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {
                File file=new File("releve.xsd");
                StreamResult streamResult=new StreamResult(file);
                streamResult.setSystemId(file.getName());
                return streamResult;
            }
        });
    }
}
