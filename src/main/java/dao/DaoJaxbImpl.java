package dao;


import handler.ValidationHandler;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class DaoJaxbImpl implements DaoJaxb {
    @Override
    public Paises getPaises(String pathXml, String pathXsd) throws JAXBException, SAXException {
        File xml = new File(pathXml);
        File xsd = new File(pathXsd);
        JAXBContext jaxbContext = JAXBContext.newInstance(Paises.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        unmarshaller.setSchema(SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(xsd));
        unmarshaller.setEventHandler(new ValidationHandler());
        return (Paises) unmarshaller.unmarshal(xml);
    }
}