package com.start.examples.leetCode;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class MainSort {
    public static void main(String[] args) {
        String s = "AAAABBBCCCXYZPPPK";

        System.out.println(change(s));
    }

    private static String change(String str) {
        StringBuilder result = new StringBuilder();

        int counter = 1;
        char previous = str.toCharArray()[0];
        for (int i =1; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == previous) {
                counter++;
            } else {
                result.append(previous);
                if (counter>1) {
                    result.append(counter);
                }
                counter = 1;
                previous = str.toCharArray()[i];
            }
        }

        result.append(previous);
        if (counter>1) {
            result.append(counter);
        }

        return result.toString();
    }


}
