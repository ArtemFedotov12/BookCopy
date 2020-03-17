package com.start.examples.test11Immutable;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Cat implements Cloneable{

    @NonNull
    String name;
    @NonNull
    String weight;

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return (Cat)super.clone();
    }


    int s(int name) {
        return 2;
    }

    void s(int name,int e) {

    }

    static int s (int name,String k) {

        return 2;
    }

}
