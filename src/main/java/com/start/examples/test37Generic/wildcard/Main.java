package com.start.examples.test37Generic.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();
        listA.add(new B());

        //List<B> listB = listA;
        //listA.add(new A());
        // listB.get(0) // A() --- this break contract. In listB reside A() element.
        // so we can't do in this way List<B> listB = listA


        //listA = listB; then we can insert A() element in listB, it breaks contract
        //listB = listA;




    }

    public static void processElements(List<? extends A> elements){
        for(A a : elements){
            System.out.println(a.getValue());
        }
    }
}
