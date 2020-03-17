package com.start.examples.test34PDF_Parsing;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExtractText {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf");
        //PDDocument pdDocument = PDDocument.load(file);

        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;
        PDFParser parser = new PDFParser(new RandomAccessFile(file,"rws"));
        parser.parse();
        try (COSDocument cosDoc = parser.getDocument()) {

            pdfStripper = new PDFTextStripper();
            pdDoc = new PDDocument(cosDoc);

            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(1);

            String text = pdfStripper.getText(pdDoc);
            String[] docxLines = text.split(System.lineSeparator());

            for (String s : docxLines) {
                System.out.println(s);
            }
     /*       pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(5);
            String parsedText = pdfStripper.getText(pdDoc);
            System.out.println(parsedText);
            System.out.println("********************");*/
        }

    }
}
