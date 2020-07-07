package com.start.examples.test39Equal;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("item1", 2.2f);
        Jpo jpo1 = new Jpo("Jack",20);
        jpo1.setItem(item1);

        Item item2 = new Item("item1", 2.2f);
        Jpo jpo2 = new Jpo("Jack",20);
        jpo2.setItem(item2);

        System.out.println(jpo1.equals(jpo2));

    }
}
