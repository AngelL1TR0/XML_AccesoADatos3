package service;

import dao.DaoJaxb;
import dao.DaoJaxbImpl;
import jakarta.xml.bind.JAXBException;
import org.xml.sax.SAXException;

public class JAXBService {
    DaoJaxb daoJaxb = new DaoJaxbImpl();

    public void unmarshall(String pathXml, String pathXsd) {
        try {
            Paises paises = daoJaxb.getPaises(pathXml, pathXsd);
            for (Pais pais : paises.getPais()) {
                System.out.println("Nombre: " + pais.getNombre());
                System.out.println("Capital: " + pais.getCapital());
                System.out.println("Poblacion: " + pais.getPoblacion());
                System.out.println("==========================================");
            }
        } catch (JAXBException | SAXException e) {
            throw new RuntimeException(e);
        }

    }
}