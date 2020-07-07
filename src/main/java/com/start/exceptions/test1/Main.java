package com.start.exceptions.test1;

import com.start.examples.test20ExceptionUtf.Exc;

import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        user1.setAge(10);
        user1.setName("Kolya");
        Status status1 = null;
        //status1.setName("kek");
        user1.setStatus(status1);

        User user2 = new User();
        user2.setAge(10);
        user2.setName("Kolya");
        Status status2 = null;
        user2.setStatus(status2);

        System.out.println(user1.equals(user2));

    }
}
