package dao;

import jakarta.xml.bind.JAXBException;
import org.xml.sax.SAXException;

public interface DaoJaxb {
    Paises getPaises(String pathXml, String pathXsd) throws JAXBException, SAXException;
}