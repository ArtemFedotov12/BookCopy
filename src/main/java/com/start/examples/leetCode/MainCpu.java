package com.start.examples.leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainCpu {
    public static void main(String[] args) {
        // A B C  n = 1   [A,A,A,A,A,B,C,B,C,B,B]  i = 3  5A 4B 2C
        // 3A 1B 0C
        // 2A 0B 0C
        // 6 + 3 + 3 + 3


        //A B C A B C A B idle A B idle A

        // int interval = 2;
        // int add  = 0;
        // int result = 0;

        // A B C
        // 5A 4B 2C
        // min = 2
        // elementNumber = 3
        // (if elementNumber - interval <= 1) {
        //   add = module(elementNumber - interval) + 1;      first time skip
        // }
        // result + = (min + add)  * elementNumber  result=6

        // 3A 2B 0C
        // min = 2
        // elementNumber = 2
        // (if elementNumber - interval <= 1) { 0
        //   add = module(elementNumber - interval) + 1;      add = 1
        // }
        // result + = (min + add)  * elementNumber  6 + 6 = 12

        // 4A 0B 0C
        // min = 1
        // elementNumber = 1
        // if(min == elementNumber)  result + = 1
        //


        char[] arr = {'A','A','A','A','A','A','A','B','B','B','B','C','C'};
        int n = 2;
        cpu(arr,n);


    }

    public static int cpu(char[] arr, int n) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {

            if (map.containsKey(c)) {
                int value = map.get(c) + 1;
                map.put(c,value);
            } else {
                map.put(c, 1);
            }

        }
        Set<Character> characters = map.keySet();
        char[] distinct = new char[characters.size()];
        int counter = 0;

        for (Character character : characters) {
            distinct[counter++] = character;

        }


        return result;
    }
}
