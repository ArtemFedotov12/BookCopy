package com.start.examples.test34PDF_Parsing;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.common.PDMetadata;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MetaDate {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf");
        PDDocument doc = PDDocument.load(file);

        PDDocumentCatalog catalog = doc.getDocumentCatalog();
        PDMetadata metadata = catalog.getMetadata();

        // To read the XML metadata
        InputStream xmlInputStream = metadata.createInputStream();


    }
}
