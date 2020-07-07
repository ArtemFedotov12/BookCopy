package com.start.examples.test43;

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
/*        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
// Создается дерево DOM документа из файла
        Document document = documentBuilder.parse("https://drive.google.com/file/d/1NrVCjIRxGk5UC0QEH3qqsgPBMWCo8KUk/view?usp=sharing");
// Получаем корневой элемент
        Node root = document.getDocumentElement();

        System.out.println();*/

        List<Error> errors = new ArrayList<>();
        final List<SAXParseException> exceptions = new LinkedList<SAXParseException>();
        // Получить фабрику для схемы
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        // Загрузить схему из XSD
        Schema schema = factory.newSchema(new File("src/main/java/com/start/examples/test43/check2.xsd"));
        // Создать валидатор (проверялбщик)
        Validator validator = schema.newValidator();
        validator.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) throws SAXException {
                exceptions.add(exception);
            }

            @Override
            public void fatalError(SAXParseException exception) throws SAXException {
                exceptions.add(exception);
            }

            @Override
            public void error(SAXParseException exception) throws SAXException {
                exceptions.add(exception);
            }
        });
        // Запусить проверку - если будет исключение, значит есть ошибки.
        // Если нет - все заполнено правильно
        validator.validate(new StreamSource(new File("src/main/java/com/start/examples/test43/scheme2.xml")));
        System.out.println();

        for (int i = 0; i < exceptions.size(); i += 2) {
            Error error = new Error();
            error.setElement(getElementFromException(exceptions.get(i + 1)));
            error.setCurrentValue(getCurrentValueFromException(exceptions.get(i + 1)));
            error.setErrorMessage(getErrorMessageFromException(exceptions.get(i)));
            errors.add(error);
        }

        System.out.println();

    }

    private static String getElementFromException(SAXParseException e) {
        String detailMessage = e.getMessage();
        return StringUtils.substringBetween(detailMessage, "element '", "'");
    }

    private static String getCurrentValueFromException(SAXParseException e) {
        String detailMessage = e.getMessage().toLowerCase();
        String result = StringUtils.substringBetween(detailMessage, "value '", "'");
        if (result == null) {
            result = StringUtils.substringBetween(detailMessage, "Value '", "'");
        }
        return result;
    }

    private static String getErrorMessageFromException(SAXParseException e) {
        String detailMessage = e.getMessage();
        String result = "not " + StringUtils.substringBetween(detailMessage, "not ", "'") + "'";
        result += StringUtils.substringBetween(detailMessage, result, "'") + "'";
        return result;
    }

}
