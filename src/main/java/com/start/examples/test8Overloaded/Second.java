package com.start.examples.test8Overloaded;

class Second extends First {

    @Override
    int m(int n1, int n2) {
        return super.m(n1, n2);
    }

    @Override
    double m(double n1) {
        return super.m(n1);
    }



}
