package com.start.examples.test37Generic;

import java.util.ArrayList;
import java.util.List;

public class MainPureWildCard {
    public static void main(String[] args) {
    List rawList = new ArrayList();
    List<String> stringList = new ArrayList<>();

    rawList=stringList;
    rawList.add(new Integer(5));

    for (String s:stringList) {
        System.out.println(s);
    }

    }


    private  static void po(List<?> list) {
        Object clone = list.get(0).hashCode();
    }
}
