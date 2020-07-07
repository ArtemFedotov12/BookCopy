package com.start.examples.test37Generic.wildcardExtends;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        processElements(listA);

        List<B> listB = new ArrayList<>();
        processElements(listB);

        List<C> listC = new ArrayList<>();
        processElements(listC);
    }

    public static void processElements(List<? extends A> elements){
        for(A a : elements){
            System.out.println(a.getValue());

            A a2 = a;
        }

        // we can't do this, because if List<C> will come here
        // we can add "A" and "B" elements,
        // there we can't insert anything here.
        //elements.add(new A());
    }


}
