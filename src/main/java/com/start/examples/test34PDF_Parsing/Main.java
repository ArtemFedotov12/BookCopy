package com.start.examples.test34PDF_Parsing;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/java/com/start/examples/test34PDF_Parsing/datango 3.2.2 System Requirements.pdf");
        PDDocument pdDocument = PDDocument.load(file);

        PDDocumentInformation info = pdDocument.getDocumentInformation();
        System.out.println( "Page Count=" + pdDocument.getNumberOfPages() );
        System.out.println( "Title=" + info.getTitle() );
        System.out.println( "Author=" + info.getAuthor() );
        System.out.println( "Subject=" + info.getSubject() );
        System.out.println( "Keywords=" + info.getKeywords() );
        System.out.println( "Creator=" + info.getCreator() );
        System.out.println( "Producer=" + info.getProducer() );
        System.out.println( "Creation Date=" + info.getCreationDate() );
        System.out.println( "Modification Date=" + info.getModificationDate());
        System.out.println( "Trapped=" + info.getTrapped() );

    }
}
