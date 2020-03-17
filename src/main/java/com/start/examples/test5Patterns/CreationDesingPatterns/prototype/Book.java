package com.start.examples.test5Patterns.CreationDesingPatterns.prototype;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Book implements Cloneable{

    @NonNull
    private String name;
    @NonNull
    private int age;


    @Override
    protected Book clone() throws CloneNotSupportedException {
            return (Book) super.clone();
    }


}
