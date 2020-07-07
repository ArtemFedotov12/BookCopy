package com.start.examples.test37Generic.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Just {
    public static void main(String[] args) {

        String stringElement = "stringElement";
        List<String> stringList = new ArrayList<String>();
        String theElement1 = addAndReturn(stringElement, stringList);


        Integer integerElement = new Integer(123);
        List<Integer> integerList = new ArrayList<Integer>();
        Integer theElement2 = addAndReturn(integerElement, integerList);

        String str = "stringElement";
        List<Object> objectList = new ArrayList<>();
        Object theElement3 = addAndReturn(stringElement, objectList);
        System.out.println(theElement3);

        Child child = new Child();
        List<Parent> parentArrayList = new ArrayList<>();
        Object child2 = addAndReturn(child, parentArrayList);
        System.out.println(child2);
    }

    public static <T> T addAndReturn(T element, Collection<T> collection){
        collection.add(element);
        return element;
    }

}
