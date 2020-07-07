package com.start.examples.test37Generic.wildcardSuper;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> objectList = new ArrayList<>();
        List<One> oneList = new ArrayList<>();
        List<Three> threeList = new ArrayList<>();

        insertElements(objectList);
        insertElements(oneList);
        //insertElements(threeList);

    }

    public static void insertElements(List<? super One> list){
        list.add(new One());
        list.add(new Two());
        list.add(new Three());
        //Best o = list.get(0);
    }

}
