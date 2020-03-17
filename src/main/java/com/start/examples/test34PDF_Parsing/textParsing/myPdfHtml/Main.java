package com.start.examples.test34PDF_Parsing.textParsing.myPdfHtml;

import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final String FILE_NAME = "src/main/java/com/start/examples/test34PDF_Parsing/textParsing/pdf/PAGE_SIZE_VERSION_16_Color.pdf";
    public static void main(String[] args) throws IOException {
        String htmlText;

        PDDocument document = PDDocument.load(new File(FILE_NAME));
        PDFText2HTML pdfText2HTML = new PDFText2HTML();
        pdfText2HTML.setSortByPosition(true);
        pdfText2HTML.setStartPage(1);
        pdfText2HTML.setEndPage(2);

        try (Writer dummy = new OutputStreamWriter(new FileOutputStream("C:\\Users\\anduser\\Desktop\\a.txt"))) {
            pdfText2HTML.writeText(document, dummy);
        }

        try (InputStream inStream = new FileInputStream("C:\\Users\\anduser\\Desktop\\a.txt")) {
            htmlText = IOUtils.toString(inStream, StandardCharsets.UTF_8.name());
        }

       // htmlText = htmlText.replaceAll("&lt;", "<");
        //htmlText = htmlText.replaceAll("&gt;", ">");

        System.out.println(htmlText);

    }
}
