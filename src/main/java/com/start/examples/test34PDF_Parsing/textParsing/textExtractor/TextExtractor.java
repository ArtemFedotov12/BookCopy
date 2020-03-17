package com.start.examples.test34PDF_Parsing.textParsing.textExtractor;

import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.tools.PDFText2HTML;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TextExtractor {

    // tem file C:\\Users\\anduser\\Desktop\\a.txt"
    private final String fileNamePath;
    private final String tempFilePath;

    public TextExtractor(String fileNamePath, String tempFilePath) {
        this.fileNamePath = fileNamePath;
        this.tempFilePath = tempFilePath;
    }

    public String getText(int pageValue) {
        String htmlText = "default text";

        try (Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(tempFilePath))) {
            PDDocument pdDocument =  PDDocument.load(new File(fileNamePath));
            PDFText2HTML pdfText2HTML = new PDFText2HTML();

            pdfText2HTML.setAddMoreFormatting(true);
            pdfText2HTML.setSortByPosition(true);
            pdfText2HTML.setStartPage(pageValue);
            pdfText2HTML.setEndPage(pageValue);

            pdfText2HTML.writeText(pdDocument, outputStreamWriter);
        } catch (IOException e) {

        }

        try(InputStream inStream = new FileInputStream(this.tempFilePath)) {
            htmlText = IOUtils.toString(inStream, StandardCharsets.UTF_8.name());
        } catch (IOException e) {

        }

        return htmlText;
    }


}
