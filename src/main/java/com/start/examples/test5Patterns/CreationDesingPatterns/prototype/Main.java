package com.start.examples.test5Patterns.CreationDesingPatterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book1 = new Book("book1",10);

        Pupil pupil1 = new Pupil(book1,"pupil1",20);
        Pupil pupil3 = pupil1;
        Pupil pulil2 = pupil1.clone();

        book1.setAge(20);

        System.out.println(book1);
        System.out.println(pupil1);
        System.out.println(pupil3);
        System.out.println(pulil2);

        int[] arr = null;


    }
}
