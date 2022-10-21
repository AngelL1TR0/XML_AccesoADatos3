package app;

import service.JAXBService;

public class Actividad2 {
    private static final String PATH_XML = "src/main/resources/xml/actividad2.xml";
    private static final String PATH_XSD = "src/main/resources/xsd/actividad2.xsd";

    public static void main(String[] args) {
        JAXBService jaxbService = new JAXBService();
        jaxbService.unmarshall(PATH_XML, PATH_XSD);
    }
}