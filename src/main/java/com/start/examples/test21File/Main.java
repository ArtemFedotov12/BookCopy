package com.start.examples.test21File;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 14.11.2019
 */
public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {
        //File file =new File(new File(".").getCanonicalPath()+"\\file.txt");
      //  System.out.println(file.exists());
        //File file =new File("../t.txt");
         // System.out.println(file.exists());

        URL url = Main.class.getResource(".\\file.txt");
        File file = new File(url.getPath());
        System.out.println(file.exists());
    }
}
