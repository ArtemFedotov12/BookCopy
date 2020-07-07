package com.start.examples.leetCode;

import java.util.Optional;

public class MainStringConverter {
    public static void main(String[] args) {

        String userLine = " Kekk vasya Lol ";
        String userLine2 = " kke";
        String userLine3 = "  kke AA";
        String userLine4 = "  kKKKKEEr AA";
        String userLine5 = "  kKKKKEEr j h AA  Dffj";
        String userLine6 = "RRR";

        String test = "ab";
        System.out.println(test.substring(1,test.length()));
        System.out.println(convert(userLine));
        System.out.println(convert(userLine2));
        System.out.println(convert(userLine3));
        System.out.println(convert(userLine4));
        System.out.println(convert(userLine5));
        System.out.println(convert(userLine6));
    }


    private static String convert(String userLine) {
        StringBuilder result = new StringBuilder();
        String[] arr = userLine.trim().replaceAll(" +", " ").split(" ");
        result.append(arr[0].toLowerCase());
        for (int i = 1; i < arr.length-1; i++) {
            result.append(Character.toString(arr[i].charAt(0)).toUpperCase());
            if(arr[i].length()>1) {
                result.append(arr[i].substring(1).toLowerCase());
            }
        }

        return result.toString();
    }

}
