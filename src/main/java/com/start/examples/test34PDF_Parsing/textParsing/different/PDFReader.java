package com.start.examples.test34PDF_Parsing.textParsing.different;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdfparser.PDFStreamParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class PDFReader{
    public static void main(String args[]) throws IOException {

        String fileName = "src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf";
        PDDocument document = PDDocument.load( new File(fileName) );



        PDFTextStripper textStripper=new PDFTextStripper();
        PDPageTree pdPages =  document.getDocumentCatalog().getPages();
// just parsing page 2 here, as it's only a sample
        PDPage page = (PDPage) pdPages.get(1);
        PDDocument my = new PDDocument();
        PDStream pdStream = new PDStream(my,pdPages.get(1).getContents());
        PDFStreamParser parser = new PDFStreamParser(pdStream.getStream());

        parser.parse();
        List tokens = parser.getTokens();

        boolean concatStringPhase = false;
        String polName = "";
        String lastText = "";

        for (int index = 0; index < tokens.size(); index++) {
            Object obj = tokens.get(index);


           if (concatStringPhase && obj instanceof COSString) {
                COSString cosString = (COSString) obj;
                lastText += " " + cosString.getString();
                lastText = lastText.trim();
            }

        }
    }
}