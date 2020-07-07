package com.start.examples.test37Generic.cars;

public class Cell<T> {
    public static void main(String[] args) {

        Cell<? super Toyota> cell = new Cell<>();
    }

    T t;

    <X extends Toyota> X getX(X x) {
        return x;
    }
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void customOutput(T t){
        System.out.println(t);
    }

}