package com.start.examples.test34PDF_Parsing.textParsing.textExtractor;

import com.start.examples.test34PDF_Parsing.textParsing.textProperties.TextProperties;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import java.io.*;
import java.util.List;

public class TextPropertiesExtractor extends PDFTextStripper {

    //src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf
    //src/main/java/com/start/examples/test34PDF_Parsing/Test.pdf
    private final String fileName;
    private TextProperties textProperties = new TextProperties();
/*    private static StringBuilder htmlText = new StringBuilder();*/

    public TextPropertiesExtractor(String fileName) throws IOException {
        this.fileName = fileName;
    }

    @Override
    protected void writeString(String string, List<TextPosition> textPositions) throws IOException {

        for (TextPosition currentText : textPositions) {
            textProperties.setTextCoordinates(currentText);
            textProperties.setFontSize(currentText);
        }

    }

    public TextProperties getTextProperties(int pageValue){

        try (Writer dummy = new OutputStreamWriter(new FileOutputStream("C:\\Users\\anduser\\Desktop\\a.txt"))) {
            PDDocument pdDocument =  PDDocument.load(new File(fileName));

            //this.setAddMoreFormatting(true);
            this.setSortByPosition(true);
            this.setStartPage(pageValue);
            this.setEndPage(pageValue);

            this.writeText(pdDocument, dummy);
        } catch (IOException e) {

        }

        return this.textProperties;
    }


}



/*       System.out.println(
                            "Unicode=" + currentText.getUnicode() + "|   " +
                            "[(X= " +currentText.getXDirAdj() + "|  " +
                            "Y= " + currentText.getYDirAdj()+ "|   " +
                            "FontSize= " + currentText.getFontSize() + "|   " +
                            "XScale= " + currentText.getXScale() + "|   " +
                            "HeightDir=" + currentText.getHeightDir() + "|   " +
                            "WidthOfSpace=" + currentText.getWidthOfSpace() + "|   " +
                            "getWidthDirAdj=" + currentText.getWidthDirAdj() + "|   "
                            );*/