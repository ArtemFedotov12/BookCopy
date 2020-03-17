package com.start.examples.test34PDF_Parsing.textParsing.different;

import com.start.examples.test34PDF_Parsing.textParsing.textExtractor.MyPDFText2HTML;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.tools.PDFText2HTML;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestHtml {
    // src/main/java/com/start/examples/test34PDF_Parsing/PDF_TWO_PAGES_VERSION3.pdf
    // src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf
    // src/main/java/com/start/examples/test34PDF_Parsing/textParsing/PAGE_SIZE_VERSION_6.pdf
    // src/main/java/com/start/examples/test34PDF_Parsing/textParsing/textColor/PAGE_SIZE_VERSION_7_Color.pdf
    // src/main/java/com/start/examples/test34PDF_Parsing/textParsing/textColor/PAGE_SIZE_VERSION_8_Color.pdf
    // src/main/java/com/start/examples/test34PDF_Parsing/textParsing/pdf/PAGE_SIZE_VERSION_6.pdf
    // src/main/java/com/start/examples/test34PDF_Parsing/textParsing/pdf/PAGE_SIZE_VERSION_9_Color.pdf
    private static final String FILE_NAME = "src/main/java/com/start/examples/test34PDF_Parsing/textParsing/pdf/PAGE_SIZE_VERSION_9_Color.pdf";
    public static void main(String[] args) throws IOException {
        String htmlText;

        PDDocument document = PDDocument.load(new File(FILE_NAME));
        PDFText2HTML pdfText2HTML = new MyPDFText2HTML();
        pdfText2HTML.setAddMoreFormatting(true);
        pdfText2HTML.setSortByPosition(true);
        pdfText2HTML.setStartPage(1);
        pdfText2HTML.setEndPage(1);

        try (Writer dummy = new OutputStreamWriter(new FileOutputStream("C:\\Users\\anduser\\Desktop\\a.txt"))) {
            pdfText2HTML.writeText(document, dummy);
        }

        try (InputStream inStream = new FileInputStream("C:\\Users\\anduser\\Desktop\\a.txt")) {
            htmlText = IOUtils.toString(inStream, StandardCharsets.UTF_8.name());
        }

        htmlText = htmlText.replaceAll("&lt;", "<");
        htmlText = htmlText.replaceAll("&gt;", ">");

        System.out.println(htmlText);

    }
}
