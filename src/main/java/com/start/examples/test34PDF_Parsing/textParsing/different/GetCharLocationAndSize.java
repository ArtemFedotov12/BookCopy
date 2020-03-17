package com.start.examples.test34PDF_Parsing.textParsing.different;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import java.io.*;
import java.util.List;
/**
 * This is an example on how to get the x/y coordinates and size of each character in PDF
 */
public class GetCharLocationAndSize extends PDFTextStripper {

    public GetCharLocationAndSize() throws IOException {
    }
    /**
     * @throws IOException If there is an error parsing the document.
     */
    public static void main( String[] args ) throws IOException {
        PDDocument document = null;
        // src/main/java/com/start/examples/test34PDF_Parsing/textParsing/PDF_TWO_PAGES_VERSION2.pdf
        // src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf
        // src/main/java/com/start/examples/test34PDF_Parsing/PDF_TWO_PAGES_VERSION3.pdf
        String fileName = "src/main/java/com/start/examples/test34PDF_Parsing/textParsing/pdf/PAGE_SIZE_VERSION_8_Color.pdf";
        try {
            document = PDDocument.load( new File(fileName) );
            PDFTextStripper stripper = new GetCharLocationAndSize();

        /*    PDPageContentStream contentStream = new PDPageContentStream(document, document.getPage(0));
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 100);
            contentStream.showText("this is line third");
            contentStream.drawString("sss");
            contentStream.endText();*/


            stripper.setSortByPosition( true );
            stripper.setStartPage(1);
            stripper.setEndPage( 1);
            Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
            stripper.writeText(document, dummy);
        }
        finally {
            if( document != null ) {
                document.close();
            }
        }
    }

    /**
     * Override the default functionality of PDFTextStripper.writeString()
     */
    @Override
    protected void writeString(String string, List<TextPosition> textPositions) throws IOException {

        for (TextPosition text : textPositions) {
            System.out.println(text.getUnicode()+ " [(X=" + text.getXDirAdj() + ",Y=" +
                    text.getYDirAdj() + ") height=" + text.getHeightDir() + " width=" +
                    text.getWidthDirAdj() + "]");

        }


    }
 }