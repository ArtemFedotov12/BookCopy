package com.start.examples.test27Regex;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloWorld {
    public static void main(String[] args) throws IOException {


       String s = "/aaa/bb/c.txt";
       String s1 = "/sss/b/c.txt";
        String s2 = ".ssss/c/k/r";
        String s3 = ".ssss/c/k/r";
        String s4 = "/a/b/c";
        System.out.println(s.matches(".*\\..*"));
        System.out.println(s1.matches(".*\\..*"));
        System.out.println(s2.matches(".*\\..*"));
        System.out.println(s3.matches(".*\\..*"));
        System.out.println(s4.matches(".*\\..*"));





    }
    static void allFunctions() {
        System.out.println(function1() + " " + function2() + " " + function3());
    }
    static String function1() {
        return "function1";
    }
    static String function2() {
        return "function2";
    }
    static String function3() {
        return "function3";
    }
}