package com.start.examples.test34PDF_Parsing.textParsing.textExtractor;

import com.start.examples.test34PDF_Parsing.textParsing.textProperties.TextProperties;

import java.io.IOException;

public class MainPropertiesExtractor {
    public static void main(String[] args) {

        String fileName = "src/main/java/com/start/examples/test34PDF_Parsing/textParsing/pdf/PAGE_SIZE_VERSION_12_Color.pdf";
        TextPropertiesExtractor textPropertiesExtractor;
        TextProperties textProperties = null;
        try {
             textPropertiesExtractor = new TextPropertiesExtractor(fileName);
             textProperties = textPropertiesExtractor.getTextProperties(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(textProperties.getFontSize());
        System.out.println(textProperties.getTextBoxHeight());
        System.out.println(textProperties.getTextBoxWidth());

    }
}
