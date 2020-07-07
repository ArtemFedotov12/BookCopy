package com.start.examples.test37Generic.rq;

public class MainRq {
    public static void main(String[] args) {

    }

    <RQ extends AbstractRq> RQ me(RQ r) {
        r.setName("kek");
        System.out.println(r.getName());
        return r;
    }

}
