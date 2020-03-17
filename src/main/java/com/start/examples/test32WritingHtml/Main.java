package com.start.examples.test32WritingHtml;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File htmlTemplateFile = new File("src/main/java/com/start/examples/test32WritingHtml/template.html");
        String htmlString = FileUtils.readFileToString(htmlTemplateFile);
        String sap_path = "sssssssssss";
        String tCode = "tCOdeeeeeeeeeee";
        htmlString = htmlString.replace("$sap_path", sap_path);
        htmlString = htmlString.replace("$tcode", tCode);
        File newHtmlFile = new File("src/main/java/com/start/examples/test32WritingHtml/dest.html");
        FileUtils.writeStringToFile(newHtmlFile, htmlString);
    }
}
